package com.infile.traductor;

import com.clases.fel153.xsd.GTDocumento;
import com.clases.fel153.xsd.GTDocumento.SAT;
import com.clases.fel153.xsd.ReferenciasNota;
import com.clases.fel_anulacion.xsd.GTAnulacionDocumento;
import com.clases.fel_anulacion.xsd.GTAnulacionDocumento.SAT_ANULACION;
import com.fel.validaciones.documento.AbonosFacturaCambiaria;
import com.fel.validaciones.documento.Adendas;
import com.fel.validaciones.documento.AnulacionFel;
import com.fel.validaciones.documento.ComplementoCambiaria;
import com.fel.validaciones.documento.ComplementoExportacion;
import com.fel.validaciones.documento.ComplementoFacturaEspecial;
import com.fel.validaciones.documento.ComplementoNotas;
import com.fel.validaciones.documento.DatosEmisor;
import com.fel.validaciones.documento.DatosGenerales;
import com.fel.validaciones.documento.DatosReceptor;
import com.fel.validaciones.documento.DocumentoFel;
import com.fel.validaciones.documento.Frases;
import com.fel.validaciones.documento.ImpuestosDetalle;
import com.fel.validaciones.documento.Items;
import com.fel.validaciones.documento.TotalImpuestos;
import com.fel.validaciones.documento.Totales;
import com.infile.logic.LogicomToFel;
import com.infile.logic.Order;
import com.infile.principal.principal;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Parseo {

    //Objetos para formar el XMLS
    DocumentoFel documento_fel = new DocumentoFel();
    DatosGenerales datos_generales = new DatosGenerales();
    ResultadoParse resultado_parse = new ResultadoParse();
    DatosEmisor datos_emisor = new DatosEmisor();
    DatosReceptor datos_receptor = new DatosReceptor();
    Totales total_documento = new Totales();

    ComplementoCambiaria cambiaria = new ComplementoCambiaria();
    ComplementoExportacion exportacion = new ComplementoExportacion();
    ComplementoNotas notas = new ComplementoNotas();
    ComplementoFacturaEspecial especial = new ComplementoFacturaEspecial();

    AnulacionFel documento_anulacion = new AnulacionFel();

    Adendas adenda = new Adendas();
    List<String> errores_parseo = new ArrayList<>();

    boolean comp_cambiaria = false;
    boolean comp_especial = false;
    boolean comp_notas = false;
    boolean comp_exportacion = false;
    boolean certificacion = false;
    boolean anulacion = false;

    public ResultadoParse procesar(InputStream fileStream, String codificacion) {

        try {

            InputStreamReader input = new InputStreamReader(fileStream, codificacion);
            //InputStreamReader input = new InputStreamReader(fileStream, "ISO-8859-1");
            //InputStreamReader input = new InputStreamReader(fileStream, "UTF-8");

            BufferedReader reader = new BufferedReader(input);

            String linea;

            // Leer linea por linea
            // Durante la lectura se quitan las lineas de los encabezados adicional las etiquetas 
            // donde inicia y termina el detalle Para no recorrer esas lineas.
            // Segun el analisis los detalles comienzan desde la posicion 1, la posicion 0 esta en blanco por default.
            while ((linea = reader.readLine()) != null) {

                //System.out.println(linea + " - " + linea.length());
                linea = linea.replace("#DATOS_GENERALES", "");
                linea = linea.replace("#CERTIFICACION", "");
                linea = linea.replace("#ANULACION", "");
                linea = linea.replace("#DATOS_EMISOR", "");
                linea = linea.replace("#DATOS_RECEPTOR", "");
                linea = linea.replace("#FRASES", "");
                linea = linea.replace("#ITEMS", "");
                linea = linea.replace("#TOTAL IMPUESTOS", "");
                linea = linea.replace("#TOTAL_IMPUESTOS", "");
                linea = linea.replace("#TOTAL_DOCUMENTO", "");
                linea = linea.replace("#ADENDAS", "");
                linea = linea.replace("#COMPLEMENTO_EXPORTACION", "");
                linea = linea.replace("#COMPLEMENTO_FACTURA_ESPECIAL", "");
                linea = linea.replace("#COMPLEMENTO_NOTAS", "");
                linea = linea.replace("#COMPLEMENTO_FACTURA_CAMBIARIA", "");

                // Mientras exista una linea siempre obtendra sus valores palabra por palabra.
                // usando como delimitador el espacio, pero para este fin se usara el delimitador
                // compuesto por dos espacios.
                if (!(linea.equals(""))) {

                    if (!(linea.length() == 1)) {

                        String[] contenido = linea.split("\\|");

                        int cantidad_campos = contenido.length;

                        String respuesta = to_obj(contenido, linea, linea.length());
                        if (!"".equals(respuesta)) {

                            errores_parseo.add(respuesta);
                        }
                    }

                }

            }

            documento_fel.setDatos_generales(datos_generales);
            documento_fel.setDatos_emisor(datos_emisor);
            documento_fel.setDatos_receptor(datos_receptor);
            documento_fel.setTotales(total_documento);

            if (adenda == null) {
            } else {
                documento_fel.setAdenda(adenda);
            }

            if (comp_cambiaria) {

                documento_fel.setComplementos(cambiaria);

            }

            if (comp_exportacion) {

                documento_fel.setComplementos(exportacion);

            }

            if (comp_notas) {

                documento_fel.setComplementos(notas);

            }

            if (comp_especial) {

                documento_fel.setComplementos(especial);

            }

        } catch (IOException ex) {
            resultado_parse.setResultado(false);
            resultado_parse.setDescripcion("No ha sido posible interpretar el archivo de texto");
            resultado_parse.setDocumento_fel(null);
            resultado_parse.setLista_errores(ex.getMessage());
            return resultado_parse;
        }

        if (errores_parseo.size() >= 1) {
            resultado_parse.setResultado(false);
            resultado_parse.setDescripcion("No ha sido posible interpretar el archivo de texto");
            resultado_parse.setDocumento_fel(null);
            for (int i = 0; i < errores_parseo.size(); i++) {
                resultado_parse.setLista_errores(errores_parseo.get(i));
            }

            return resultado_parse;
        } else {

            if (certificacion == true) {
                resultado_parse.setResultado(true);
                resultado_parse.setDescripcion("Traduccion correcta");
                resultado_parse.setDocumento_fel(documento_fel);
                resultado_parse.setLista_errores(null);
                resultado_parse.setUuid("");
                resultado_parse.setTipo_transaccion("CERTIFICACION");
                resultado_parse.setTipo_documento(documento_fel.getDatos_generales().getTipo());
                resultado_parse.setNit_empresa(documento_fel.getDatos_emisor().getNITEmisor());
                resultado_parse.setCodigo_establecimiento(documento_fel.getDatos_emisor().getCodigoEstablecimiento().toString());
                resultado_parse.setNumero_acceso(String.valueOf(datos_generales.getNumeroAcceso()));
                resultado_parse.setId_receptor(String.valueOf(datos_receptor.getIDReceptor()));
                DecimalFormat df = new DecimalFormat("#####0.########");
                resultado_parse.setGran_total(df.format(total_documento.getGranTotal()));

            }

            if (anulacion == true) {
                resultado_parse.setResultado(true);
                resultado_parse.setDescripcion("Traduccion correcta");
                resultado_parse.setDocumento_fel(documento_anulacion);
                resultado_parse.setLista_errores(null);
                resultado_parse.setUuid("");
                resultado_parse.setTipo_transaccion("ANULACION");
                resultado_parse.setTipo_documento("ANULACION");
                resultado_parse.setNit_empresa(documento_anulacion.getNITEmisor());
            }

        }

        return resultado_parse;
    }

    public ResultadoParse procesar_xml_formato_fel(InputStream fileStream, String codificacion, File file, String tipo_transaccion) {

        System.out.println("\n--> 1.1 FASE DE VALIDACION XML CONTRA XSD");

        DocumentoFel documento_fel_brc = new DocumentoFel();
        Adendas adenda_fel = new Adendas();

        if (tipo_transaccion.equals("CERTIFICACION")) {

            //File schemaFile = new File("esquemas_fel/GT_Documento-0.1.2.xsd");
            File schemaFile = new File("esquemas_fel/GT_Documento-0.2.0.xsd");
            Source xmlFile = new StreamSource(fileStream);
            SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            try {
                Schema schema = schemaFactory.newSchema(schemaFile);
                Validator validator = schema.newValidator();
                validator.validate(xmlFile);

                System.out.println("--> Resultado: " + "true");
                System.out.println("--> Descripcion: " + "(1) Validacion de XML contra XSD");
                System.out.println("--> Pasando a la siguiente fase ...\n");

                // Si es valido contra el esquema entonces se procede a pasarlo a la clase que se encarga
                // de las equivalencias entre logicom y fel
                JAXBContext jaxbContext = JAXBContext.newInstance(GTDocumento.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                GTDocumento xml_fel = (GTDocumento) unmarshaller.unmarshal(file);

                // Se obtiene una lista de los elementos que tiene GTDocumento
                List<JAXBElement<?>> datos = xml_fel.getContent();

                // Se crea un objeto del tipo SAT
                SAT sat = null;

                // Se parsea el JAXBElement a un objeto tipo SAT
                // Este es el Objeto Principal
                sat = (SAT) datos.get(0).getValue();

                String uuid_documento_origen = "";

                int cantidad_adendas = sat.getAdenda().getAny().size();

                for (int i = 0; i < cantidad_adendas; i++) {

                    ElementNSImpl element = (ElementNSImpl) sat.getAdenda().getAny().get(i);

                    //System.out.println(element.getNodeName() + " - ?????????????" + element.getChildNodes().item(0));
                    String valor = "";

                    Optional<Node> valor_nodo = Optional.ofNullable(element.getChildNodes().item(0));

                    if (valor_nodo.isPresent()) {
                        valor = element.getChildNodes().item(0).toString().replace("[", "").replace("]", "").replace("#text: ", "");
                    } else {
                        valor = "";
                    }

                    adenda_fel.setAdenda(element.getNodeName(), valor);

                }

                if ((sat.getDTE().getDatosEmision().getDatosGenerales().getTipo().equals("NCRE")) || (sat.getDTE().getDatosEmision().getDatosGenerales().getTipo().equals("NDEB"))) {

                    ReferenciasNota notasCreditoDebito = null;

                    System.out.println("--> Leyendo complemento de NOTAS");

                    Optional<Object> complemento_notas = Optional.ofNullable(sat.getDTE().getDatosEmision().getComplementos());

                    if (complemento_notas.isPresent()) {

                        notasCreditoDebito = (ReferenciasNota) sat.getDTE().getDatosEmision().getComplementos().getComplemento().get(0).getAny();

                        System.out.println(notasCreditoDebito);

                        System.out.println("--> MODULO NOTAS DE CREDITO/DEBIDO | Numero Documento Origen: " + notasCreditoDebito.getNumeroDocumentoOrigen());

                        uuid_documento_origen = notasCreditoDebito.getNumeroDocumentoOrigen();
                    }

                }

                documento_fel_brc.setAdenda(adenda_fel);

                resultado_parse.setResultado(true);
                resultado_parse.setDescripcion("Traduccion correcta");
                resultado_parse.setDocumento_fel(documento_fel_brc);
                resultado_parse.setLista_errores(null);
                resultado_parse.setUuid("");
                resultado_parse.setTipo_transaccion("CERTIFICACION");
                resultado_parse.setTipo_documento(sat.getDTE().getDatosEmision().getEmisor().getNITEmisor());
                resultado_parse.setNit_empresa(sat.getDTE().getDatosEmision().getEmisor().getNITEmisor());
                resultado_parse.setCodigo_establecimiento(String.valueOf(sat.getDTE().getDatosEmision().getEmisor().getCodigoEstablecimiento()));
                resultado_parse.setUuid_documento_origen(uuid_documento_origen);
                resultado_parse.setNumero_acceso(String.valueOf(sat.getDTE().getDatosEmision().getDatosGenerales().getNumeroAcceso()));
                resultado_parse.setId_receptor(String.valueOf(sat.getDTE().getDatosEmision().getReceptor().getIDReceptor()));
                DecimalFormat df = new DecimalFormat("#####0.########");
                resultado_parse.setGran_total(df.format(sat.getDTE().getDatosEmision().getTotales().getGranTotal()));

                documento_fel_brc = null;

            } catch (SAXException | IOException e) {

                xmlFile = null;

                System.out.println("--> Resultado: " + "FALSE");
                System.out.println("--> Origen: " + "Validacion de XML contra XSD");
                System.out.println("--> Descripcion: " + e.getMessage());
                System.out.println("--> Cantidad Errores: " + "1");

                resultado_parse.setResultado(false);
                resultado_parse.setDescripcion("(3) Validacion de XML contra XSD");
                String errores_traduccion = e.getMessage();
                resultado_parse.setLista_errores(errores_traduccion);

            } catch (JAXBException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (tipo_transaccion.equals("ANULACION")) {

            File schemaFile = new File("esquemas_fel/GTAnulacionDocumento-0.1.2.xsd");
            Source xmlFile = new StreamSource(fileStream);
            SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            try {
                Schema schema = schemaFactory.newSchema(schemaFile);
                Validator validator = schema.newValidator();
                validator.validate(xmlFile);

                System.out.println("--> Resultado: " + "true");
                System.out.println("--> Descripcion: " + "Validacion de XML contra XSD");
                System.out.println("--> Pasando a la siguiente fase ...\n");

                // Si es valido contra el esquema entonces se procede a pasarlo a la clase que se encarga
                // de las equivalencias entre logicom y fel
                JAXBContext jaxbContext = JAXBContext.newInstance(GTAnulacionDocumento.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                GTAnulacionDocumento xml_anulacion_fel = (GTAnulacionDocumento) unmarshaller.unmarshal(file);

                // Se obtiene una lista de los elementos que tiene GTDocumento
                List<JAXBElement<?>> datos = xml_anulacion_fel.getContent();

                // Se crea un objeto del tipo SAT
                SAT_ANULACION sat_anulacion = null;

                // Se parsea el JAXBElement a un objeto tipo SAT
                // Este es el Objeto Principal
                sat_anulacion = (SAT_ANULACION) datos.get(0).getValue();

                resultado_parse.setResultado(true);
                resultado_parse.setDescripcion("Traduccion correcta");
                resultado_parse.setDocumento_fel(null);
                resultado_parse.setLista_errores(null);
                resultado_parse.setUuid(sat_anulacion.getAnulacionDTE().getDatosGenerales().getNumeroDocumentoAAnular());
                resultado_parse.setTipo_transaccion("ANULACION");
                resultado_parse.setTipo_documento("ANULACION");
                resultado_parse.setNit_empresa(sat_anulacion.getAnulacionDTE().getDatosGenerales().getNITEmisor());

            } catch (SAXException | IOException e) {

                xmlFile = null;

                System.out.println("--> Resultado: " + "FALSE");
                System.out.println("--> Origen: " + "Validacion de XML contra XSD");
                System.out.println("--> Descripcion: " + e.getMessage());
                System.out.println("--> Cantidad Errores: " + "1");

                resultado_parse.setResultado(false);
                resultado_parse.setDescripcion("Validacion de XML contra XSD");
                String errores_traduccion = e.getMessage();
                resultado_parse.setLista_errores(errores_traduccion);

            } catch (JAXBException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            System.out.println("--> Resultado: " + "FALSE");
            System.out.println("--> Origen: " + "Validaciones de Contenido del documento");
            System.out.println("--> Descripcion: " + "Documento no reconocido para FEL");
            System.out.println("--> Cantidad Errores: " + "1");

            resultado_parse.setResultado(false);
            resultado_parse.setDescripcion("VValidaciones de Contenido del documento");
            String errores_traduccion = "Documento no reconocido para FEL";
            resultado_parse.setLista_errores(errores_traduccion);

        }

        return resultado_parse;

    }

    public String to_obj(String[] contenido, String linea, int longitud) {

        String respuesta = "";

        switch (contenido[0]) {

            case "DG":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_generales(contenido);
                break;

            case "DE":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_emisor(contenido);
                break;

            case "DR":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_receptor(contenido);
                break;

            case "FR":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_frases(contenido);
                break;

            case "IT":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_items(contenido);
                break;

            case "TI":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_total_impuestos(contenido);
                break;

            case "TD":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_datos_total_documento(contenido);
                break;

            case "AD":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_adendas(contenido);
                break;

            case "FAC":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_comp_cambiaria(contenido);
                break;

            case "ESP":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_comp_factura_especial(contenido);
                break;

            case "EXP":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_comp_exportacion(contenido);
                break;

            case "NOT":
                certificacion = true;
                anulacion = false;
                respuesta = llenar_comp_notas(contenido);

                break;

            case "AN":
                certificacion = false;
                anulacion = true;
                respuesta = llenar_documento_anulacion(contenido);

                break;

            default:
                respuesta = "Existen prefijos de linea: [" + contenido[0] + "] que no corresponden a la estructura del documento. en la linea siguiente: [" + linea + "]" + " Longitud [" + longitud + "]";
                break;

        }

        return respuesta;
    }

    public String llenar_documento_anulacion(String[] contenido) {

        String respuesta = "";

        try {
            switch (contenido[1]) {

                case "1": //FECHA_HORA_ANULACION

                    documento_anulacion.setFechaHoraAnulacion(contenido[3].replace("\"", ""));
                    break;

                case "2": //NIT_EMISOR
                    documento_anulacion.setNITEmisor(contenido[3].replace("\"", ""));

                    break;

                case "3": //ID_RECEPTOR
                    documento_anulacion.setIDReceptor(contenido[3].replace("\"", ""));
                    break;

                case "4": //FECHA_HORA_EMISION_DOC_ANULAR
                    documento_anulacion.setFechaEmisionDocumentoAnular(contenido[3].replace("\"", ""));
                    break;

                case "5": //NUMERO_DOCUMENTO_ANULAR
                    documento_anulacion.setNumeroDocumentoAAnular(contenido[3].replace("\"", ""));
                    break;

                case "6": //MOTIVO_ANULACION
                    documento_anulacion.setMotivoAnulacion(contenido[3].replace("\"", ""));
                    break;
                default:

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los datos de la anulacion " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_datos_generales(String[] contenido) {

        String respuesta = "";

        try {
            switch (contenido[1]) {

                case "1": //FECHA_HORA_EMISION

                    datos_generales.setFechaHoraEmision(contenido[3].replace("\"", ""));
                    // System.out.println("FECHA_HORA_EMISION [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //NUMERO_ACCESO
                    datos_generales.setNumeroAcceso(Integer.parseInt(contenido[3].replace("\"", "")));

                    // System.out.println("NUMERO_ACCESO [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "3": //CODIGO_MONEDA
                    datos_generales.setCodigoMoneda(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_MONEDA [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //TIPO
                    datos_generales.setTipo(contenido[3].replace("\"", ""));
                    // System.out.println("TIPO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //EXPORTACION
                    datos_generales.setExportacion(contenido[3].replace("\"", ""));
                    // System.out.println("EXPORTACION [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //TIPO PERSONERIA
                    datos_generales.setTipoPersoneria(contenido[3].replace("\"", ""));
                    // System.out.println("TIPO PERSONERIA [" + contenido[3].replace("\"", "") + "]");
                    break;

                default:

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los datos generales " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_datos_emisor(String[] contenido) {

        String respuesta = "";

        try {
            switch (contenido[1]) {

                case "1": //CORREO_EMISOR

                    datos_emisor.setCorreoEmisor(contenido[3].replace("\"", ""));
                    // System.out.println("CORREO_EMISOR [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //CODIGO_ESTABLECIMIENTO
                    datos_emisor.setCodigoEstablecimiento(Integer.parseInt(contenido[3].replace("\"", "")));
                    // System.out.println("CODIGO_ESTABLECIMIENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //NIT_EMISOR
                    datos_emisor.setNITEmisor(contenido[3].replace("\"", ""));
                    // System.out.println("NIT_EMISOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //NOMBRE_COMERCIAL
                    datos_emisor.setNombreComercial(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMERCIAL [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //AFILIACION_IVA
                    datos_emisor.setAfiliacionIVA(contenido[3].replace("\"", ""));
                    // System.out.println("AFILIACION_IVA [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //NOMBRE_EMISOR
                    datos_emisor.setNombreEmisor(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_EMISOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "7": //DIRECCION
                    datos_emisor.setDireccion(contenido[3].replace("\"", ""));
                    // System.out.println("DIRECCION [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "8": //CODIGO_POSTAL
                    datos_emisor.setCodigoPostal(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_POSTAL [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "9": //MUNICIPIO
                    datos_emisor.setMunicipio(contenido[3].replace("\"", ""));
                    // System.out.println("MUNICIPIO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "10": //DEPARTAMENTO
                    datos_emisor.setDepartamento(contenido[3].replace("\"", ""));
                    // System.out.println("DEPARTAMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "11": //PAIS
                    datos_emisor.setPais(contenido[3].replace("\"", ""));
                    // System.out.println("PAIS [" + contenido[3].replace("\"", "") + "]");

                    break;

                default:

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los datos del emisor: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_datos_receptor(String[] contenido) {

        String respuesta = "";

        try {

            switch (contenido[1]) {

                case "1": //ID_RECEPTOR

                    datos_receptor.setIDReceptor(contenido[3].replace("\"", ""));
                    // System.out.println("ID_RECEPTOR [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //CORREO_RECEPTOR
                    datos_receptor.setCorreoReceptor(contenido[3].replace("\"", ""));
                    // System.out.println("CORREO_RECEPTOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //NOMBRE_RECEPTOR
                    datos_receptor.setNombreReceptor(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_RECEPTOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //DIRECCION
                    datos_receptor.setDireccion(contenido[3].replace("\"", ""));
                    // System.out.println("DIRECCION [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //CODIGO_POSTAL
                    datos_receptor.setCodigoPostal(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_POSTAL [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //MUNICIPIO
                    datos_receptor.setMunicipio(contenido[3].replace("\"", ""));
                    // System.out.println("MUNICIPIO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "7": //DEPARTAMENTO
                    datos_receptor.setDepartamento(contenido[3].replace("\"", ""));
                    // System.out.println("DEPARTAMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "8": //PAIS
                    datos_receptor.setPais(contenido[3].replace("\"", ""));
                    // System.out.println("PAIS [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "9": //TIPO_ESPECIAL
                    datos_receptor.setTipoEspecial(contenido[3].replace("\"", ""));
                    // System.out.println("TIPO_ESPECIAL [" + contenido[3].replace("\"", "") + "]");

                    break;

                default:

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los datos del receptor: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_datos_frases(String[] contenido) {

        String respuesta = "";

        try {

            Frases frase = new Frases();

            switch (contenido.length) {

                case 6:

                    if ("FR".equals(contenido[0].replace("\"", "")) && "FRASE".equals(contenido[2].replace("\"", "")) && "ESCENARIO".equals(contenido[4].replace("\"", ""))) {
                        frase.setTipoFrase(Integer.parseInt(contenido[3].replace("\"", "")));
                        frase.setCodigoEscenario(Integer.parseInt(contenido[5].replace("\"", "")));
                    } else {
                        respuesta = "La frase No. [" + contenido[1].replace("\"", "") + "] no tiene la estructura requerida.";
                    }

                    documento_fel.setFrases(frase);
                    frase = null;
                    break;

                default:
                    respuesta = "La frase No. [" + contenido[1].replace("\"", "") + "] no tiene la cantidad de campos requeridos";
                    break;

                case 10:

                    if ("FR".equals(contenido[0].replace("\"", "")) && "FRASE".equals(contenido[2].replace("\"", "")) && "ESCENARIO".equals(contenido[4].replace("\"", "")) && "NUMERO_RESOLUCION".equals(contenido[6].replace("\"", "")) && "FECHA_RESOLUCION".equals(contenido[8].replace("\"", ""))) {
                        frase.setTipoFrase(Integer.parseInt(contenido[3].replace("\"", "")));
                        frase.setCodigoEscenario(Integer.parseInt(contenido[5].replace("\"", "")));
                        frase.setNumeroResolucion(contenido[7].replace("\"", ""));
                        frase.setFechaResolucion(contenido[9].replace("\"", ""));
                    } else {
                        respuesta = "La frase No. [" + contenido[1].replace("\"", "") + "] no tiene la estructura requerida.";
                    }

                    documento_fel.setFrases(frase);
                    frase = null;
                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de las frases: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_items(String[] contenido) {

        String respuesta = "";
        int secuencia = 0;
        String dato_sencuencia = "";
        int linea_de_detalle = 0;

        try {

            Items item = new Items();

            switch (contenido.length) {

                case 25:

                    secuencia = 10;
                    linea_de_detalle = Integer.parseInt(contenido[2].replace("\"", ""));
                    item.setNumeroLinea(Integer.parseInt(contenido[2].replace("\"", "")));
                    item.setBienOServicio(contenido[3].replace("\"", ""));
                    item.setCantidad(Double.parseDouble(contenido[4].replace("\"", "")));
                    item.setUnidadMedida(contenido[5].replace("\"", ""));
                    item.setDescripcion(contenido[6].replace("\"", ""));
                    item.setPrecioUnitario(Double.parseDouble(contenido[7].replace("\"", "")));
                    item.setPrecio(Double.parseDouble(contenido[8].replace("\"", "")));
                    item.setDescuento(Double.parseDouble(contenido[9].replace("\"", "")));
                    item.setTotal(Double.parseDouble(contenido[10].replace("\"", "")));
                    secuencia = 11;

                    if (("IM".equals(contenido[11].replace("\"", "")) && "1".equals(contenido[12].replace("\"", ""))) && ("IM".equals(contenido[18].replace("\"", "")) && "2".equals(contenido[19].replace("\"", "")))) {
                        secuencia = 12;

                        ImpuestosDetalle impuesto1 = new ImpuestosDetalle();
                        impuesto1.setNombreCorto(contenido[13].replace("\"", ""));
                        impuesto1.setCodigoUnidadGravable(Integer.parseInt(contenido[14].replace("\"", "")));
                        secuencia = 13;

                        if (!contenido[15].isEmpty()) {
                            impuesto1.setMontoGravable(Double.parseDouble(contenido[15].replace("\"", "")));
                        }
                        secuencia = 14;

                        if (!contenido[16].isEmpty()) {
                            impuesto1.setCantidadUnidadesGravables(Double.parseDouble(contenido[16].replace("\"", "")));
                        }

                        impuesto1.setMontoImpuesto(Double.parseDouble(contenido[17].replace("\"", "")));
                        item.setImpuestos_detalle(impuesto1);
                        impuesto1 = null;
                        secuencia = 15;

                        ImpuestosDetalle impuesto2 = new ImpuestosDetalle();
                        impuesto2.setNombreCorto(contenido[20].replace("\"", ""));
                        impuesto2.setCodigoUnidadGravable(Integer.parseInt(contenido[21].replace("\"", "")));
                        secuencia = 16;

                        if (!contenido[22].isEmpty()) {
                            impuesto2.setMontoGravable(Double.parseDouble(contenido[22].replace("\"", "")));
                            secuencia = 17;

                        }

                        if (!contenido[23].isEmpty()) {
                            impuesto2.setCantidadUnidadesGravables(Double.parseDouble(contenido[23].replace("\"", "")));
                            secuencia = 18;

                        }
                        impuesto2.setMontoImpuesto(Double.parseDouble(contenido[24].replace("\"", "")));
                        secuencia = 19;

                        item.setImpuestos_detalle(impuesto2);
                        impuesto2 = null;

                    } else {
                        respuesta = "Uno de los impuestos del detalle No. [" + contenido[1].replace("\"", "") + "] no tiene la estructura requerida.";
                    }

                    documento_fel.setItems(item);

                    break;

                case 18:
                    secuencia = 2;
                    linea_de_detalle = Integer.parseInt(contenido[2].replace("\"", ""));

                    item.setNumeroLinea(Integer.parseInt(contenido[2].replace("\"", "")));
                    item.setBienOServicio(contenido[3].replace("\"", ""));
                    item.setCantidad(Double.parseDouble(contenido[4].replace("\"", "")));
                    item.setUnidadMedida(contenido[5].replace("\"", ""));
                    item.setDescripcion(contenido[6].replace("\"", ""));
                    item.setPrecioUnitario(Double.parseDouble(contenido[7].replace("\"", "")));
                    item.setPrecio(Double.parseDouble(contenido[8].replace("\"", "")));
                    item.setDescuento(Double.parseDouble(contenido[9].replace("\"", "")));
                    item.setTotal(Double.parseDouble(contenido[10].replace("\"", "")));
                    secuencia = 22;
                    if ("IM".equals(contenido[11].replace("\"", "")) && "1".equals(contenido[12].replace("\"", ""))) {

                        ImpuestosDetalle impuesto = new ImpuestosDetalle();
                        impuesto.setNombreCorto(contenido[13].replace("\"", ""));
                        impuesto.setCodigoUnidadGravable(Integer.parseInt(contenido[14].replace("\"", "")));
                        secuencia = 23;
                        if (!contenido[15].isEmpty()) {
                            impuesto.setMontoGravable(Double.parseDouble(contenido[15].replace("\"", "")));
                        }
                        secuencia = 24;
                        if (!contenido[16].isEmpty()) {
                            impuesto.setCantidadUnidadesGravables(Double.parseDouble(contenido[16].replace("\"", "")));
                        }
                        secuencia = 25;
                        impuesto.setMontoImpuesto(Double.parseDouble(contenido[17].replace("\"", "")));
                        item.setImpuestos_detalle(impuesto);
                        impuesto = null;

                    } else {
                        respuesta = "El impuesto del detalle No. [" + contenido[1].replace("\"", "") + "] no tiene la estructura requerida.";

                    }

                    documento_fel.setItems(item);
                    item = null;

                    break;

                case 11:
                    secuencia = 3;
                    linea_de_detalle = Integer.parseInt(contenido[2].replace("\"", ""));

                    item.setNumeroLinea(Integer.parseInt(contenido[2].replace("\"", "")));
                    item.setBienOServicio(contenido[3].replace("\"", ""));
                    item.setCantidad(Double.parseDouble(contenido[4].replace("\"", "")));
                    item.setUnidadMedida(contenido[5].replace("\"", ""));
                    item.setDescripcion(contenido[6].replace("\"", ""));
                    item.setPrecioUnitario(Double.parseDouble(contenido[7].replace("\"", "")));
                    item.setPrecio(Double.parseDouble(contenido[8].replace("\"", "")));
                    item.setDescuento(Double.parseDouble(contenido[9].replace("\"", "")));
                    item.setTotal(Double.parseDouble(contenido[10].replace("\"", "")));

                    documento_fel.setItems(item);
                    item = null;

                    break;

                default:
                    respuesta = "La linea [" + contenido[1].replace("\"", "") + "] del detalle no tiene la cantidad de campos requeridos";
                    break;
            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los Items, seccion No. " + linea_de_detalle + " " + ex.getMessage() + "Secuencia " + secuencia;
        }

        return respuesta;
    }

    public String llenar_datos_total_impuestos(String[] contenido) {

        String respuesta = "";

        try {

            TotalImpuestos total_impuestos = new TotalImpuestos();

            switch (contenido.length) {

                case 6:

                    if ("TI".equals(contenido[0].replace("\"", "")) && "NOMBRE_CORTO".equals(contenido[2].replace("\"", "")) && "TOTAL_IMPUESTO".equals(contenido[4].replace("\"", ""))) {
                        total_impuestos.setNombreCorto(contenido[3].replace("\"", ""));
                        total_impuestos.setTotalMontoImpuesto(Double.parseDouble(contenido[5].replace("\"", "")));
                    } else {
                        respuesta = "El Total de Impuesto No. [" + contenido[1].replace("\"", "") + "] no tiene la estructura requerida.";
                    }

                    documento_fel.setImpuestos_resumen(total_impuestos);
                    total_impuestos = null;
                    break;

                default:
                    respuesta = "El Total de Impuesto No. [" + contenido[1].replace("\"", "") + "] no tiene la cantidad de campos requeridos";
                    break;
            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de los totales de impuestos: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_datos_total_documento(String[] contenido) {

        String respuesta = "";

        try {
            switch (contenido[1]) {

                case "1": //GRAN_TOTAL

                    total_documento.setGranTotal(Double.parseDouble(contenido[3].replace("\"", "")));
                    // System.out.println("GRAN_TOTAL [" + contenido[3].replace("\"", "") + "]");
                    break;

                default:

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion del gran total: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_adendas(String[] contenido) {

        String respuesta = "";

        try {
            switch (contenido.length) {

                case 4: //ADENDAS

                    adenda.setAdenda(contenido[2].replace("\"", ""), contenido[3].replace("\"", ""));

                    break;

                default:
                    respuesta = "La adenda No. [" + contenido[1].replace("\"", "") + "] no tiene la cantidad de campos requeridos";
                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion de las adendas: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_comp_cambiaria(String[] contenido) {

        String respuesta = "";
        comp_cambiaria = true;

        try {
            switch (contenido[1]) {

                case "1": //ID_COMPLEMENTO

                    cambiaria.setIDComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("ID_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //NOMBRE_COMPLEMENTO
                    cambiaria.setNombreComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //URI_COMPLEMENTO
                    cambiaria.setURIComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("URI_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "AB": //ABONOS

                    AbonosFacturaCambiaria abonos = new AbonosFacturaCambiaria();

                    abonos.setFechaVencimiento(contenido[4].replace("\"", ""));
                    abonos.setNumeroAbono(Integer.parseInt(contenido[6].replace("\"", "")));
                    abonos.setMontoAbono(Double.parseDouble(contenido[8].replace("\"", "")));

                    cambiaria.setAbono(abonos);

                    break;

                default:

                    respuesta = "Error existen prefijos que no corresponden en el complemento de Factura Cambiaria ";

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion del complemento de Factura Cambiaria: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_comp_exportacion(String[] contenido) {

        String respuesta = "";
        comp_exportacion = true;

        try {
            switch (contenido[1]) {

                case "1": //ID_COMPLEMENTO

                    exportacion.setIDComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("ID_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //NOMBRE_COMPLEMENTO
                    exportacion.setNombreComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //URI_COMPLEMENTO
                    exportacion.setURIComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("URI_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //NOMBRE_CONSIGNATARIO_O_DESTINATARIO
                    exportacion.setNombreConsignatarioODestinatario(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_CONSIGNATARIO_O_DESTINATARIO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //DIRECCION_CONSIGNATARIO_O_DESTINATARIO
                    exportacion.setDireccionConsignatarioODestinatario(contenido[3].replace("\"", ""));
                    // System.out.println("DIRECCION_CONSIGNATARIO_O_DESTINATARIO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //CODIGO_CONSIGNATARIO_O_DESTINATARIO
                    exportacion.setCodigoConsignatarioODestinatario(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_CONSIGNATARIO_O_DESTINATARIO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "7": //NOMBRE_COMPRADOR
                    exportacion.setNombreComprador(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMPRADOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "8": //DIRECCION_COMPRADOR
                    exportacion.setDireccionComprador(contenido[3].replace("\"", ""));
                    // System.out.println("DIRECCION_COMPRADOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "9": //CODIGO_COMPRADOR
                    exportacion.setCodigoComprador(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_COMPRADOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "10": //OTRA_REFERENCIA
                    exportacion.setOtraReferencia(contenido[3].replace("\"", ""));
                    // System.out.println("OTRA_REFERENCIA [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "11": //INCOTERM
                    exportacion.setIncoterm(contenido[3].replace("\"", ""));
                    // System.out.println("INCOTERM [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "12": //NOMBRE_EXPORTADOR
                    exportacion.setNombreExportador(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_EXPORTADOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "13": //CODIGO_EXPORTADOR
                    exportacion.setCodigoExportador(contenido[3].replace("\"", ""));
                    // System.out.println("CODIGO_EXPORTADOR [" + contenido[3].replace("\"", "") + "]");

                    break;

                default:

                    respuesta = "Error existen prefijos que no corresponden en el complemento de Factura de Exportacion. ";

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion del complemento de Factura de Exportacion: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_comp_notas(String[] contenido) {

        String respuesta = "";
        comp_notas = true;

        try {
            switch (contenido[1]) {

                case "1": //ID_COMPLEMENTO

                    notas.setIDComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("ID_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //NOMBRE_COMPLEMENTO
                    notas.setNombreComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //URI_COMPLEMENTO
                    notas.setURIComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("URI_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //REGIMEN_ANTIGUO
                    notas.setRegimenAntiguo(contenido[3].replace("\"", ""));
                    // System.out.println("REGIMEN_ANTIGUO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //NUMERO_AUTORIZACION_DOCUMENTO_ORIGEN
                    notas.setNumeroAutorizacionDocumentoOrigen(contenido[3].replace("\"", ""));
                    // System.out.println("NUMERO_AUTORIZACION_DOCUMENTO_ORIGEN [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //FECHA_EMISION_DOCUMENTO_ORIGEN
                    notas.setFechaEmisionDocumentoOrigen(contenido[3].replace("\"", ""));
                    // System.out.println("FECHA_EMISION_DOCUMENTO_ORIGEN [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "7": //MOTIVO_AJUSTE
                    notas.setMotivoAjuste(contenido[3].replace("\"", ""));
                    // System.out.println("MOTIVO_AJUSTE [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "8": //SERIE_DOCUMENTO_ORIGEN
                    notas.setSerieDocumentoOrigen(contenido[3].replace("\"", ""));
                    // System.out.println("SERIE_DOCUMENTO_ORIGEN [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "9": //NUMERO_DOCUMENTO_ORIGEN
                    notas.setNumeroDocumentoOrigen(contenido[3].replace("\"", ""));
                    // System.out.println("NUMERO_DOCUMENTO_ORIGEN [" + contenido[3].replace("\"", "") + "]");

                    break;

                default:

                    respuesta = "Error existen prefijos que no corresponden en el complemento de Notas. ";

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion del complemento de Notas: " + ex.getMessage();
        }

        return respuesta;
    }

    public String llenar_comp_factura_especial(String[] contenido) {

        String respuesta = "";
        comp_especial = true;

        try {
            switch (contenido[1]) {

                case "1": //ID_COMPLEMENTO

                    especial.setIDComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("ID_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");
                    break;

                case "2": //NOMBRE_COMPLEMENTO
                    especial.setNombreComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("NOMBRE_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "3": //URI_COMPLEMENTO
                    especial.setURIComplemento(contenido[3].replace("\"", ""));
                    // System.out.println("URI_COMPLEMENTO [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "4": //RETENCION_ISR
                    especial.setRetencionISR(Double.parseDouble(contenido[3].replace("\"", "")));
                    // System.out.println("RETENCION_ISR [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "5": //RETENCION_IVA
                    especial.setRetencionIVA(Double.parseDouble(contenido[3].replace("\"", "")));
                    // System.out.println("RETENCION_IVA [" + contenido[3].replace("\"", "") + "]");

                    break;

                case "6": //TOTAL_MENOS_RETENCIONES
                    especial.setTotalMenosRetenciones(Double.parseDouble(contenido[3].replace("\"", "")));
                    // System.out.println("TOTAL_MENOS_RETENCIONES [" + contenido[3].replace("\"", "") + "]");

                    break;

                default:

                    respuesta = "Error existen prefijos que no corresponden en el complemento de Factura Especial. ";

                    break;

            }

        } catch (NumberFormatException ex) {

            respuesta = "Error en la traduccion del complemento de Factura Especial: " + ex.getMessage();
        }

        return respuesta;
    }

    public String identificador_contenido(String prefijo_linea) {

        String respuesta = "";

        switch (prefijo_linea) {

            case "DG":

                respuesta = "Datos Generales";

                break;

            case "DE":
                respuesta = "Datos Emisor";

                break;

            case "DR":
                respuesta = "Datos Receptor";

                break;

            case "FR":
                respuesta = "Frases";

                break;

            case "IT":
                respuesta = "Items";

                break;

            case "TI":
                respuesta = "Total Impuestos";

                break;

            case "TD":
                respuesta = "Total Documento";

                break;

            case "AD":
                respuesta = "Adendas";

                break;

            default:

                respuesta = "Desconocido";

                break;

        }

        return respuesta;
    }

}
