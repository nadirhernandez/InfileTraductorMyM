/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.motor.archivos;

import com.fel.validaciones.documento.DescripcionErrores;
import com.fel.validaciones.documento.DocumentoFel;
import com.google.gson.Gson;
import com.infile.apicredo.CuerpoCarga;
import com.infile.apicredo.RegistraCarga;
import com.infile.apicredo.RespuestaServicioRetroalimentacion;
import com.infile.apicredo.RetroalimentacionCredo;
import static com.infile.principal.principal.conexion;
import com.infile.traductor.ResultadoParse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;
import redis.clients.jedis.Jedis;
import rfc.sap.document.sap_com.RespuestaApiSap;
import rfc.sap.document.sap_com.RetroalimentacionSap;
import rfc.sap.document.sap_com.WsFeel;

/**
 *
 * @author rene
 */
public class RespuestasApiFel {

    private String identificador_cliente;
    private String identificador_unico;
    private String numero_acceso;
    private boolean resultado;
    private String tipo_transaccion;
    private boolean informacion_adiciona_respuesta;

    private ResultadoParse parse_txt;

    private String anio;

    private String descripcion;
    private String uuid;
    private String uuid_documento_origen;

    private String serie;
    private String numero;
    private String fecha_certificacion;

    private String nit_emisor;
    private String codigo_establecimiento;
    private String tipo_documento;
    private String ruta;
    private String nombre;
    private String resource;
    private List errores;

    // Datos para Dahopozos
    private String nosap;
    private String url_api_sap;
    private String usuario_sap;
    private String llave_sap;

    // Datos para Credomatic
    private String lote;
    private boolean guardar_en_bdi;
    private boolean descargar_xml;

    public ResultadoParse getParse_txt() {
        return parse_txt;
    }

    public void setParse_txt(ResultadoParse parse_txt) {
        this.parse_txt = parse_txt;
    }

    public boolean getDescargar_xml() {
        return descargar_xml;
    }

    public void setDescargar_xml(boolean descarga_xml) {
        this.descargar_xml = descarga_xml;
    }

    public String getNumero_acceso() {
        return numero_acceso;
    }

    public void setNumero_acceso(String numero_acceso) {
        this.numero_acceso = numero_acceso;
    }

    public String getUuid_documento_origen() {
        return uuid_documento_origen;
    }

    public void setUuid_documento_origen(String uuid_documento_origen) {
        this.uuid_documento_origen = uuid_documento_origen;
    }

    public String getFecha_certificacion() {
        return fecha_certificacion;
    }

    public void setFecha_certificacion(String fecha_certificacion) {
        this.fecha_certificacion = fecha_certificacion;
    }

    public boolean isInformacion_adiciona_respuesta() {
        return informacion_adiciona_respuesta;
    }

    public void setInformacion_adiciona_respuesta(boolean informacion_adiciona_respuesta) {
        this.informacion_adiciona_respuesta = informacion_adiciona_respuesta;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public boolean isGuardar_en_bdi() {
        return guardar_en_bdi;
    }

    public void setGuardar_en_bdi(boolean guardar_en_bdi) {
        this.guardar_en_bdi = guardar_en_bdi;
    }

    public Jedis getConx() {
        return conx;
    }

    // Conexion para redis
    public void setConx(Jedis conx) {
        this.conx = conx;
    }
    private Jedis conx;

    public String getNosap() {
        return nosap;
    }

    public void setNosap(String nosap) {
        this.nosap = nosap;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getUrl_api_sap() {
        return url_api_sap;
    }

    public void setUrl_api_sap(String url_api_sap) {
        this.url_api_sap = url_api_sap;
    }

    public String getUsuario_sap() {
        return usuario_sap;
    }

    public void setUsuario_sap(String usuario_sap) {
        this.usuario_sap = usuario_sap;
    }

    public String getLlave_sap() {
        return llave_sap;
    }

    public void setLlave_sap(String llave_sap) {
        this.llave_sap = llave_sap;
    }

    public String getIdentificador_cliente() {
        return identificador_cliente;
    }

    public void setIdentificador_cliente(String identificador_cliente) {
        this.identificador_cliente = identificador_cliente;
    }

    public String getIdentificador_unico() {
        return identificador_unico;
    }

    public void setIdentificador_unico(String identificador_unico) {
        this.identificador_unico = identificador_unico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNit_emisor() {
        return nit_emisor;
    }

    public void setNit_emisor(String nit_emisor) {
        this.nit_emisor = nit_emisor;
    }

    public String getCodigo_establecimiento() {
        return codigo_establecimiento;
    }

    public void setCodigo_establecimiento(String codigo_establecimiento) {
        this.codigo_establecimiento = codigo_establecimiento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public List getErrores() {
        return errores;
    }

    public void setErrores(List errores) {
        this.errores = errores;
    }

    public String getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(String timeLog) {
        this.timeLog = timeLog;
    }

    public String getTimeLogParaApi() {
        return timeLogParaApi;
    }

    public void setTimeLogParaApi(String timeLogParaApi) {
        this.timeLogParaApi = timeLogParaApi;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    String timeLog;
    String timeLogParaApi;

    public RespuestasApiFel() {
        timeLog = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        timeLogParaApi = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    }

    public boolean escribir_respuestas(String identificador_cliente, boolean escribe_archivo_disco, boolean proceso_sin_errores) {

        //Barcelo
        if (identificador_cliente.equals("barc344887877")) {
            System.out.println("\n--> Respuesta personalizada");
            respuesta_personalizada_barc(escribe_archivo_disco, proceso_sin_errores);
            return true;
        }

        //Credomatic
        if (identificador_cliente.equals("ggf5890098765")) {
            System.out.println("\n--> Respuesta personalizada");
            respuesta_estandar(escribe_archivo_disco, proceso_sin_errores);
            respuesta_personalizada_credo(escribe_archivo_disco, proceso_sin_errores, lote);
            return true;
        }

        //Almacen MYM
        if (identificador_cliente.equals("mym6741985698")) {
            System.out.println("\n--> Respuesta personalizada");
            respuesta_estandar(escribe_archivo_disco, proceso_sin_errores);
            return true;
        }

        //Dahopozos
        if (identificador_cliente.equals("dahop42924545")) {
            System.out.println("--> Respuesta personalizada");
            respuesta_estandar(escribe_archivo_disco, proceso_sin_errores);
            respuesta_personalizada_dahop(escribe_archivo_disco, proceso_sin_errores, nosap, usuario_sap, llave_sap, url_api_sap);
            return true;
        }

        //respuesta_general
        System.out.println("--> Respuesta Estandar");
        respuesta_estandar(escribe_archivo_disco, proceso_sin_errores);

        return true;

    }

    public boolean respuesta_estandar(boolean escribe_archivo_disco, boolean proceso_sin_errores) {

        if (escribe_archivo_disco) {

            try {
                if (identificador_cliente.equals("mms8754169711")) {
                    ruta = ruta.replace("_RESPUESTA", "");
                }

                String path_bitacora_respuestas = ruta;

                File logFile = new File(ruta);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {

                    writer.write("#DATOS_GENERALES" + "\n");
                    writer.write("DG|FECHA|" + timeLog + "\n");
                    writer.write("DG|RESULTADO|" + resultado + "\n");
                    writer.write("DG|DESCRIPCION|" + descripcion + "\n");
                    writer.write("DG|IDENTIFICADOR_UNICO|" + identificador_unico + "\n");

                    if (!identificador_cliente.equals("away754541226")) {
                        writer.write("AU|NUMERO_ACCESO|" + numero_acceso + "\n");
                    }

                    if (proceso_sin_errores) {
                        writer.write("#AUTORIZACION" + "\n");
                        writer.write("AU|UUID|" + uuid + "\n");
                        writer.write("AU|SERIE|" + serie + "\n");
                        writer.write("AU|NUMERO|" + numero + "\n");

                        writer.write("AU|ID_RECEPTOR|" + parse_txt.getId_receptor() + "\n");
                        writer.write("AU|GRAN_TOTAL|" + parse_txt.getGran_total() + "\n");

                        if (identificador_cliente.equals("away754541226")) {
                            writer.write("AU|IDENTIFICADOR_UNICO|" + identificador_unico + "\n");
                        }

                        if (identificador_cliente.equals("mym6741985698")) {

                            String codigo_compuesto = respuesta_personalizada_mym(uuid, parse_txt);

                            String[] folder_respuestas = path_bitacora_respuestas.split("/");
                            String archivo_respuestas = path_bitacora_respuestas.replace(folder_respuestas[folder_respuestas.length - 1], "") + "Factura_efel.txt";
                            System.out.println("--> Bitacora de Respuestas = " + archivo_respuestas);

                            try (FileWriter fw = new FileWriter(archivo_respuestas, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    PrintWriter out = new PrintWriter(bw)) {
                                out.println(codigo_compuesto);
                            } catch (IOException e) {
                                System.out.println("--> No ha sido posible escribir en la bitacora de respuestas = " + e.getMessage());
                            }

                        }

                    } else {

                        writer.write("#ERRORES" + "\n");

                        for (int i = 0; i < errores.size(); i++) {

                            if (resource.equals("SERVICIO_ERR")) {

                                DescripcionErrores errores_servicio = (DescripcionErrores) errores.get(i);
                                writer.write("ERR|" + (i + 1) + "|" + errores_servicio.getMensaje_error() + "\n");

                            } else {
                                writer.write("ERR|" + (i + 1) + "|" + errores.get(i) + "\n");
                            }
                        }
                    }

                    //Close writer
                    writer.close();
                }

            } catch (IOException ex) {
                System.out.println("--> 1. Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
            }

        } else {
            System.out.println("--> La escritura de archivos TXT de respuesta esta desactivada.");
        }

        return true;
    }

    public boolean respuesta_personalizada_barc(boolean escribe_archivo_disco, boolean proceso_sin_errores) {

        if (escribe_archivo_disco) {

            // Escritura de XML a disco previo a certificar
            String xml_respuesta = "";
            String identificador_unico_segun_txt = "";

            Optional<String> i_unico = Optional.ofNullable(identificador_unico);

            if (i_unico.isPresent()) {
                identificador_unico_segun_txt = identificador_unico;
            } else {
                identificador_unico_segun_txt = "NA";
            }

            System.out.println("--> Identificador Unico segun TXT: " + identificador_unico_segun_txt);

            try {

                File xml_respuesta_personalizada = new File(ruta.replace(".xml", "") + "/" + nombre.replace(".xml", "") + "_" + identificador_unico_segun_txt + ".xml");

                if (proceso_sin_errores) {

                    xml_respuesta = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<MT_FACTELECT>\n"
                            + "	<SOCPMS>GTH1</SOCPMS>\n"
                            + "	<BUKRS>H800</BUKRS>	\n"
                            + "	<GJAHR>2019</GJAHR>\n"
                            + "	<XBLNR>" + identificador_unico_segun_txt + "</XBLNR>\n"
                            + "	<UUID>" + uuid + "</UUID>\n"
                            //+ "	<URL>https://report.feel.com.gt/ingfacereport/ingfacereport_documento?uuid=" + uuid + "&formato=pdf&tipo_operacion=" + tipo_transaccion + "</URL>\n"
                            + "	<URL>https://report.feel.com.gt/ingfacereport/ingfacereport_documento?uuid=" + uuid + "</URL>\n"
                            + "	<ESTADO>OK</ESTADO>\n"
                            + "	<MENSAJE>" + descripcion + "</MENSAJE>\n"
                            + "	<UUIDREF>" + uuid_documento_origen + "</UUIDREF>\n"
                            + "	<SERIE>" + serie + "</SERIE>\n"
                            + "	<NUMERO>" + numero + "</NUMERO>\n"
                            + "	<FECHA_CERT>" + fecha_certificacion + "</FECHA_CERT>\n"
                            + "</MT_FACTELECT>";

                } else {

                    String errores_proceso = "";

                    for (int i = 0; i < errores.size(); i++) {

                        if (resource.equals("SERVICIO_ERR")) {

                            DescripcionErrores errores_servicio = (DescripcionErrores) errores.get(i);
                            errores_proceso = errores_proceso + "ERR|" + (i + 1) + "|" + errores_servicio.getMensaje_error() + ", ";

                        } else {
                            errores_proceso = errores_proceso + "ERR|" + (i + 1) + "|" + errores.get(i) + ", ";
                        }
                    }

                    xml_respuesta = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                            + "<MT_FACTELECT>\n"
                            + "	<SOCPMS>GTH1</SOCPMS>\n"
                            + "	<BUKRS>H800</BUKRS>	\n"
                            + "	<GJAHR>2019</GJAHR>\n"
                            + "	<XBLNR>" + identificador_unico_segun_txt + "</XBLNR>\n"
                            + "	<UUID></UUID>\n"
                            + "	<URL></URL>\n"
                            + "	<ESTADO>KO</ESTADO>\n"
                            + "	<MENSAJE>" + descripcion + ": " + errores_proceso + "</MENSAJE>\n"
                            + "	<UUIDREF></UUIDREF>\n"
                            + "	<SERIE></SERIE>\n"
                            + "	<NUMERO></NUMERO>\n"
                            + "	<FECHA_CERT></FECHA_CERT>\n"
                            + "</MT_FACTELECT>";

                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(xml_respuesta_personalizada))) {
                    writer.write(xml_respuesta);
                    writer.close();
                }

                System.out.println("--> Archivo Guardado");

            } catch (IOException ex) {

                System.out.println("--> Error : " + ex.getMessage());
            }

        } else {
            System.out.println("--> La escritura de archivos XML de respuesta esta desactivada.");
        }

        return true;
    }

    public boolean respuesta_personalizada_credo(boolean escribe_archivo_disco, boolean proceso_sin_errores, String lote) {

        System.out.println("--> Retroalimentacion API CREDOMATIC");

        // Objetos para el api de credomatic
        RegistraCarga api_carga = new RegistraCarga();
        CuerpoCarga resultado_carga = new CuerpoCarga();
        resultado_carga.setFecha(timeLogParaApi);
        resultado_carga.setDocumento(identificador_unico);
        resultado_carga.setLote(lote);

        if (proceso_sin_errores) {

            // API de Carga de Credomatic|
            /*resultado_carga.setEstado("Correcto");
            resultado_carga.setUuid(uuid);
            resultado_carga.setSerie(serie);
            resultado_carga.setNumero(numero);
            resultado_carga.setNit_emisor(nit_emisor);
            resultado_carga.setEstablecimiento(codigo_establecimiento);
            resultado_carga.setTipo_documento(tipo_documento);
            api_carga.setResultado_carga(resultado_carga);*/
            if (guardar_en_bdi) {
                if (conx == null) {
                    System.out.println("--> La transaccion no se registrara en base de datos de identificadores unicos, no hay conexion");
                } else {
                    if (conx.ping().equals("PONG")) {

                        System.out.println("--> Registrando la transaccion en la base de datos de identificadores unicos...");

                        lote = (lote == null) ? "---" : lote;

                        identificador_unico = (identificador_unico == null) ? "SIN_IDENTIFICADOR" : identificador_unico;

                        TreeMap<String, String> hash = new TreeMap<>();

                        hash.put("FECHA_REGISTRO", timeLog);
                        hash.put("LOTE", lote);
                        hash.put("UUID", uuid);
                        hash.put("SERIE", serie);
                        hash.put("NUMERO", numero);
                        hash.put("NIT_EMISOR", nit_emisor);
                        hash.put("ESTABLECIMIENTO", codigo_establecimiento);
                        hash.put("TIPO_DOCUMENTO", tipo_documento);

                        //Guardando valor 
                        System.out.println("--> " + conx.hmset(identificador_unico, hash));

                        System.out.println("--> Transaccion registrada correctamente.");
                    } else {
                        System.out.println("--> No hay conexion con la bd de identificadores unicos.");
                    }
                }

            }

        } else {

            String descripcion_errores = "";

            for (int i = 0; i < errores.size(); i++) {

                if (resource.equals("SERVICIO_ERR")) {

                    DescripcionErrores errores_servicio = (DescripcionErrores) errores.get(i);
                    descripcion_errores = descripcion_errores + ", " + "ERR|" + (i + 1) + "|" + errores_servicio.getMensaje_error();

                } else {
                    descripcion_errores = descripcion_errores + ", " + "ERR|" + (i + 1) + "|" + "ERR|" + (i + 1) + "|" + errores.get(i);
                }

            }

            // API de Carga de Credomatic|
            resultado_carga.setEstado("Incorrecto");
            resultado_carga.setUuid("---");
            resultado_carga.setSerie("---");
            resultado_carga.setNumero("---");
            resultado_carga.setNit_emisor(nit_emisor);
            resultado_carga.setEstablecimiento(codigo_establecimiento);
            resultado_carga.setTipo_documento(tipo_documento);

            // API de Carga de Credomatic|
            resultado_carga.setDescripcion_errores("Seccion: " + resource + " Descripcion: [" + descripcion + "]  " + descripcion_errores);

            api_carga.setResultado_carga(resultado_carga);

            System.out.println("\n--> FASE RETROALIMENTACION API CONSULTAS");

            try {

                Gson gson = new Gson();
                String jsonInString = gson.toJson(api_carga);
                //System.out.println("\n" + jsonInString);
                RetroalimentacionCredo retroalimentacion_api = new RetroalimentacionCredo();
                RespuestaServicioRetroalimentacion respuesta_servicio_retroalimentacion = retroalimentacion_api.guardar(jsonInString, lote);
                System.out.println("--> Request: " + jsonInString);
                System.out.println("--> Resultado: " + respuesta_servicio_retroalimentacion.isResultado());
                System.out.println("--> Descripcion: " + respuesta_servicio_retroalimentacion.getDescripcion() + "\n");

                if (escribe_archivo_disco) {

                    try {

                        File logFile = new File(ruta.replace("RESPUESTA", "RESPUESTA_API_RETROALIMENTACION"));

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {

                            writer.write("#API RETROALIMENTACION" + "\n");
                            writer.write("RES|RESPUESTA API|" + respuesta_servicio_retroalimentacion.isResultado() + "\n");
                            writer.write("RES|DESCRIPCION|" + respuesta_servicio_retroalimentacion.getDescripcion() + "\n");
                            writer.write("RES|CODIGO HTTP|" + respuesta_servicio_retroalimentacion.getCodigo_http() + "\n");

                            writer.write(jsonInString + "\n");

                            //Close writer
                            writer.close();
                        }

                    } catch (IOException ex) {
                        System.out.println("--> 1. Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
                    }

                } else {
                    System.out.println("--> La escritura de archivos TXT de respuesta esta desactivada.");
                }

            } catch (IOException | NoSuchAlgorithmException | KeyManagementException ex) {

                System.out.println("\n--> 3.Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());

                if (escribe_archivo_disco) {

                    try {

                        File logFile = new File(ruta.replace("RESPUESTA", "RESPUESTA_API_RETROALIMENTACION"));

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
                            writer.write("#API RETROALIMENTACION" + "\n");
                            writer.write("#DATOS_GENERALES" + "\n");
                            writer.write("DG|FECHA|" + timeLogParaApi + "\n");
                            writer.write("DG|IDENTIFICADOR_UNICO|" + identificador_unico + "\n");
                            writer.write("DG|NIT EMISOR|" + nit_emisor + "\n");
                            writer.write("DG|ESTABLECIMIENTO|" + codigo_establecimiento + "\n");
                            writer.write("DG|TIPO DOCUMENTO|" + tipo_documento + "\n");
                            writer.write("#RESULTADO" + "\n");
                            writer.write("RES|EXCEPCION|" + ex.getMessage() + "\n");
                            //Close writer
                        }
                    } catch (IOException ex1) {
                        System.out.println("--> 3. Ocurrio un error, por favor revise lo siguiente: " + ex1.getMessage());
                    }

                } else {
                    System.out.println("--> La escritura de archivos TXT de respuesta esta desactivada.");
                }

            }

        }

        return true;
    }

    public String respuesta_personalizada_mym(String uuid, ResultadoParse parse_txt) {

        String codigo_compuesto = "";

        try {

            DocumentoFel documento_fel = new DocumentoFel();
            documento_fel = (DocumentoFel) parse_txt.getDocumento_fel();
            String codigo_sucursal_mym = "00";

            try {
                //int codigo_sucursal = Integer.valueOf(parse_txt.getCodigo_establecimiento());
                int codigo_sucursal = Integer.valueOf(documento_fel.getAdenda().getAdenda().get("EMPRESA"));
                codigo_sucursal_mym = String.format("%02d", codigo_sucursal);

            } catch (NumberFormatException e) {
                System.out.println("--> Ocurrio un error al obtener el codigo de empresa en la adenda correspondiente: " + e.getMessage());
                codigo_sucursal_mym = String.format("%02d", 0);
            }
            

            String numero_interno_segun_adenda = documento_fel.getAdenda().getAdenda().get("NO.FACTURA");

            Optional<String> v_numero_interno = Optional.ofNullable(numero_interno_segun_adenda);

            if (v_numero_interno.isPresent()) {
                
                //boolean comprobacion_numero_interno = isNumeric(numero_interno_segun_adenda);

                //if (comprobacion_numero_interno) {

                    numero_interno_segun_adenda = StringUtils.leftPad(numero_interno_segun_adenda, 7, "0");

                //}

            } else {
                numero_interno_segun_adenda = "NO ENVIO ADENDA [NO.FACTURA]";
            }

            System.out.println("--> Retroalimentacion Personalizada Almacen MYM");
            System.out.println("--> Codigo de Establecimiento: [" + codigo_sucursal_mym + "]");
            System.out.println("--> Numero Interno: " + numero_interno_segun_adenda);
            System.out.println("--> UUID: [" + uuid + "]");
            //System.out.println("--> CODIGO COMPUESTO: [" + codigo_sucursal_mym + numero_interno_segun_adenda + uuid.replace("-", "") + "]");
            System.out.println("--> CODIGO COMPUESTO: [" + codigo_sucursal_mym + numero_interno_segun_adenda + uuid + "]");

            //codigo_compuesto = codigo_sucursal_mym +  numero_interno_segun_adenda +  uuid.replace("-", "");
            codigo_compuesto = codigo_sucursal_mym +  numero_interno_segun_adenda +  uuid;
        } catch (NumberFormatException e) {
            codigo_compuesto = "";
        }
        return codigo_compuesto;
    }

    public boolean respuesta_personalizada_dahop(boolean escribe_archivo_disco, boolean proceso_sin_errores, String nosap, String usuario_sap, String llave_sap, String url_api_sap) {

        System.out.println("--> Retroalimentacion API DAHOP");

        // Objetos para DahoPozos        
        RespuestaApiSap resultado_dahop = new RespuestaApiSap();
        RetroalimentacionSap datos = new RetroalimentacionSap();

        if (proceso_sin_errores) {

            datos.setERROR("");
            datos.setNDOC(numero);
            datos.setSERIE(serie);
            datos.setUUID(uuid);
            datos.setVBELN(nosap);

        } else {

            String descripcion_errores = "";

            for (int i = 0; i < errores.size(); i++) {

                if (resource.equals("SERVICIO_ERR")) {
                    DescripcionErrores errores_servicio = (DescripcionErrores) errores.get(i);
                    descripcion_errores = descripcion_errores + ", " + "ERR|" + (i + 1) + "|" + errores_servicio.getMensaje_error();
                } else {
                    descripcion_errores = descripcion_errores + ", " + "ERR|" + (i + 1) + "|" + "ERR|" + (i + 1) + "|" + errores.get(i);
                }

            }

            datos.setERROR(resource + " " + descripcion_errores);
            datos.setNDOC("---");
            datos.setSERIE("---");
            datos.setUUID("---");
            datos.setVBELN(nosap);

        }

        try {

            WsFeel ws = new WsFeel(usuario_sap, llave_sap, url_api_sap, datos);
            resultado_dahop = ws.consumirFeel();
            System.out.println("Estado: " + resultado_dahop.getCantidad_registros());
            System.out.println("Mensaje: " + resultado_dahop.getMensaje_retorno());

        } catch (IOException ex) {
            System.out.println("\n--> 4.Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("\n--> 5.Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
        }

        if (escribe_archivo_disco) {

            File logFile = new File("logs/registro_dahop_" + nosap + ".txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
                writer.write("#DATOS PARA RETROALIMENTAR AL API" + "\n");
                writer.write("NOSAP: " + datos.getVBELN() + "\n");
                writer.write("SERIE: " + datos.getSERIE() + "\n");
                writer.write("NUMERO: " + datos.getNDOC() + "\n");
                writer.write("UUID: " + datos.getUUID() + "\n");
                writer.write("ERROR: " + datos.getERROR() + "\n");
                writer.write("ESTADO SEGUN API" + resultado_dahop.getCantidad_registros() + "\n");
                writer.write("MENSAJE SEGUN API" + resultado_dahop.getMensaje_retorno() + "\n");
                writer.close();
            } catch (IOException ex) {
                System.out.println("\n--> 6.Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
            }

        } else {
            System.out.println("--> La escritura de archivos TXT de respuesta esta desactivada.");
        }

        return true;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

}
