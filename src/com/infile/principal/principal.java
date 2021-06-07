package com.infile.principal;

import cl.getsoftware.jdirmonitor.DirectoryMonitor;
import cl.getsoftware.jdirmonitor.MonitorBuilder;
import cl.getsoftware.jdirmonitor.exception.DirectoryMonitorException;
import cl.getsoftware.jdirmonitor.filter.RegexNameFileFilter;
import cl.getsoftware.jdirmonitor.listener.FileListener;
import cl.getsoftware.jdirmonitor.task.NormalTaskMonitor;
import com.fel.validaciones.documento.AnulacionFel;
import com.fel.validaciones.documento.ConexionServicioFel;
import com.fel.validaciones.documento.DescripcionErrores;
import com.fel.validaciones.documento.DocumentoFel;
import com.fel.validaciones.documento.GenerarXml;
import com.fel.validaciones.documento.Respuesta;
import com.fel.validaciones.documento.RespuestaServicioFel;
import com.fel.validaciones.documento.ServicioFel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.infile.firmaxml.FirmaEmisor;
import com.infile.firmaxml.RespuestaServicioFirma;
import com.infile.motor.archivos.EliminarArchivo;
import com.infile.motor.archivos.OperacionesArchivos;
import com.infile.motor.archivos.Instancia;
import com.infile.apicredo.RegistraCarga;
import com.infile.apicredo.CuerpoCarga;
import com.infile.apicredo.RespuestaServicioRetroalimentacion;
import com.infile.apicredo.RetroalimentacionCredo;
import com.infile.logic.LogicomToFel;
import com.infile.logic.Order;
import com.infile.motor.archivos.ConfiguracionRutas1;
import com.infile.motor.archivos.RespuestasApiFel;
import com.infile.redis.conexionRedis;
import com.infile.traductor.Parseo;
import com.infile.traductor.ResultadoParse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.apache.commons.io.IOUtils;
import org.xml.sax.SAXException;
import redis.clients.jedis.Jedis;
import rfc.sap.document.sap_com.RespuestaApiSap;
import rfc.sap.document.sap_com.RetroalimentacionSap;
import rfc.sap.document.sap_com.WsFeel;

public final class principal {

    public principal() {

    }

    static Jedis conx;

    static ConfiguracionRutas1 ruta;
    static String carpeta_entrada = "";
    static String carpeta_correctos = "";
    static EliminarArchivo eliminar_archivo = new EliminarArchivo();
    static String uuid_para_anulacion = "";
    static String nosap = "";
    static String tipo_transaccion = "";
    static String nit_empresa = "";
    static String tipo_de_documento = "";
    static String identificador_unico = "";
    static String identificador_tienda = "";
    static String lote = "---";
    static HashMap empresas = new HashMap();

    //Credenciales para la autenticacion del servicio de firma y api de FEL
    static String usuario_firma = "";
    static String llave_firma = "";
    static String usuario_api = "";
    static String llave_api = "";
    static String nit_api = "";
    static String cliente = "";

    // Credenciales para la autenticacion con los servicios del api de SAP de Daho Pozos
    static String url_api_sap = "";
    static String usuario_sap = "";
    static String llave_sap = "";

    static boolean guarda_respuesta_txt = true;
    static boolean escribir_archivos_disco = true;

    static String anio = "";

    //IDENTIFICADORES PARA LOS CLIENTES
    //Clientes Antiguos
    //static String cliente = "ggf5890098765"; // CRE
    //static String cliente = "sus7633hgh246"; // INDU
    //static String cliente = "dahop42924545"; // DAHOP
    //static String cliente = "logic74164312"  // LOGIC
    //static String cliente = "relouh3o59678"; // OTROS
    //Clientes Nuevos
    static final String BARC = "barc344887877";
    static final String AWAY = "away754541226";
    static final String MMS = "mms8754169711";
    static final String MYM = "mym6741985698";

    // Variables auxiliares para la escritura de respuestas:
    static String carpeta_correctos_aux = "";
    static String carpeta_error_traduccion_aux = "";
    static String carpeta_error_servicio_aux = "";
    static String carpeta_error_esquema_aux = "";
    static String carpeta_pdf_aux = "";
    static String carpeta_xml_aux = "";
    static String codigo_http_api_retro = "";

    static int tiempo_espera = 0;

    public static void main(String[] args) throws IOException {

        // VERSION DEL 10/05/2020
        // Lectura del archivo de configuracion de las empresas.
        lectura_de_empresas();
        // Lectura del archivode configuracion
        ruta = new ConfiguracionRutas1();
        // Lectura del archivo de ajustes
        ruta.settings();
        // obtener los datos para el idenficador cliente.
        cliente = ruta.getIdentificador_cliente();
        // Bandera para saber si se guardan los archivos txt de respuesta
        guarda_respuesta_txt = ruta.getTxt().equals("SI");
        // Se guardan las rutas  originales en las variables auxiliares
        carpeta_correctos_aux = principal.ruta.getCorrectos();
        carpeta_error_traduccion_aux = principal.ruta.getErrores_traduccion();
        carpeta_error_servicio_aux = principal.ruta.getErrores_servicio();
        carpeta_error_esquema_aux = principal.ruta.getErrores_esquema();
        carpeta_pdf_aux = principal.ruta.getArchivos_pdf();
        carpeta_xml_aux = principal.ruta.getArchivos_xml();

        switch (cliente) {
            case "dahop42924545":
                //Lectura de Datos para la autenticacion API SAP
                lectura_credenciales_api_dahop();
                break;
            case "logic74164312":
                System.out.println("\nSERVICIO DE TRADUCCION DE ARCHIVOS XML LOGICOM A XML PARA API FEL INFILE v. 30.01.2020");
                break;
            case "barc344887877":
                System.out.println("\nSERVICIO DE ENVIO DE ARCHIVOS XML SAT AL API FEL INFILE V2 (FEL 1.5.3)");
                break;
            case "mym6741985698":
                System.out.println("\nSERVICIO DE TRADUCCION DE ARCHIVOS DE TEXTO A XML PARA API FEL INFILE V2 (FEL 1.5.3) / MYM");
                break;
            default:
                System.out.println("\nSERVICIO DE TRADUCCION DE ARCHIVOS DE TEXTO A XML PARA API FEL INFILE V2 (FEL 1.5.3)");
                break;
        }

        Instancia inicio_traductor = new Instancia(cliente);
        inicio_traductor.start();

        if (cliente.equals("ggf5890098765")) {
            System.out.println("          [V. 15.03.18 Credomatic]\n");
            conx = conexionRedis.conexion(ruta.getPath_nosql_db());

        } else {
            System.out.println("          [V. 30.01.20]\n");

        }

        //Rutas de carpetas
        System.out.println("Rutas para el procesamiento de archivos:");

        System.out.println(" - Carpeta de Entrada: [" + ruta.getEntrada() + "]");
        System.out.println(" - Carpeta de Error de Lectura: [" + ruta.getErrores_lectura() + "]");
        System.out.println(" - Carpeta de Error de Traduccion: [" + ruta.getErrores_traduccion() + "]");
        System.out.println(" - Carpeta de Error de XML: [" + ruta.getErrores_esquema() + "]");
        System.out.println(" - Carpeta de Error de Servicio: [" + ruta.getErrores_servicio() + "]");
        System.out.println(" - Carpeta de Correctos: [" + ruta.getCorrectos() + "]");
        System.out.println(" - Carpeta de Generacion de Archivos PDF: [" + ruta.getArchivos_pdf() + "]");
        System.out.println(" - Carpeta de Generacion de Archivos XML: [" + ruta.getArchivos_xml() + "]");

        System.out.println("\nConfiguraciones Generales:");
        System.out.println(" - Identificador Cliente: [" + ruta.getIdentificador_cliente() + "]");
        System.out.println(" - Charset: [" + ruta.getCodificacion() + "]");
        System.out.println(" - Guarda Archivos TXT: [" + ruta.getTxt() + "]");
        System.out.println(" - Guarda Archivos PDF: [" + ruta.getPdf() + "]");
        System.out.println(" - Guarda Archivos XML/JSON: [" + ruta.getXml() + "]");

        System.out.println("\nConfiguraciones Adicionales:");
        System.out.println(" - Copias Activas: [" + ruta.getCopias_activas() + "]");
        System.out.println(" - Tiempo de Espera: [" + ruta.getTiempo_espera() + "] segundo(s)");

        tiempo_espera = Integer.valueOf(ruta.getTiempo_espera());
        tiempo_espera = tiempo_espera * 1000;

        if (tiempo_espera < 0) {
            System.out.println(" --> Error, la aplicación no puede continuar. El tiempo de espera establecido debe de ser mayor o igual a cero.");
            System.exit(0);
        }

        if (cliente.equals("dahop42924545")) {
            System.out.println("\nDatos Auntenticacion Dahop:");
            System.out.println(" - URL API: [" + url_api_sap + "]");
            System.out.println(" - Usuario: [" + usuario_sap + "]");
            System.out.println(" - Acceso: [" + llave_sap + "]");
        }

        if (cliente.equals("ggf5890098765")) {
            System.out.println("\nDatos NoSqlDB:");
            System.out.println(" - HOST: [" + ruta.getPath_nosql_db() + "]");
        }

        //Cada Cuantos Segundos verificara la carpeta de entrada.
        comprobar_ejecucion(ruta.getEntrada(), "1");

    }

    public static FileListener fileListener = new FileListener() {
        @Override
        public void fileDeleted(File file) {
            identificador_unico = "";
            identificador_tienda = "";
            nosap = "";
            anio = "";
            codigo_http_api_retro = "";
            //System.out.println("\nArchivo Procesado [" + file.getAbsolutePath() + "]");
        }

        @Override
        public void fileCreated(File file) {

            System.out.println("Nuevo Archivo detectado...");
            System.out.println("Esperando " + (tiempo_espera / 1000) + " segundo(s) antes de leer el contenido del archivo ...");

            try {
                Thread.sleep(tiempo_espera);
            } catch (InterruptedException ex) {
            }

            identificador_unico = "";
            identificador_tienda = "";
            nosap = "";
            anio = "";
            codigo_http_api_retro = "";

            String xml_sin_firmar = "";
            escribir_archivos_disco = true;
            carpeta_correctos = principal.ruta.getCorrectos();
            RespuestasApiFel respuesta_general = new RespuestasApiFel();
            respuesta_general.setDescargar_xml(true);

            String tipo_operacion = "";
            String content = "";

            try {

                System.out.println("\n--> 1. INICO DE TRANSACCION");
                System.out.println("--> Nombre: [" + file.getAbsolutePath() + "]");
                System.out.println("--> Fecha transaccion: " + new Date());

                ResultadoParse resultado_parse = new ResultadoParse();
                FileInputStream fileStream = new FileInputStream(file);
                Parseo parseo = new Parseo();
                String nit_emisor_segun_xml = "";

                if (cliente.equals("logic74164312")) {

                    System.out.println("\n--> 1.1 FASE DE VALIDACION XML CONTRA XSD");

                    File schemaFile = new File("Order.xsd"); // etc.
                    Source xmlFile = new StreamSource(fileStream);
                    SchemaFactory schemaFactory = SchemaFactory
                            .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                    try {
                        Schema schema = schemaFactory.newSchema(schemaFile);
                        Validator validator = schema.newValidator();
                        validator.validate(xmlFile);

                        System.out.println("--> Resultado: " + "true");
                        System.out.println("--> Descripcion: " + "(2) Validacion de XML contra XSD");
                        System.out.println("--> Pasando a la siguiente fase ...\n");

                        // Si es valido contra el esquema entonces se procede a pasarlo a la clase que se encarga
                        // de las equivalencias entre logicom y fel
                        JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
                        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                        Order order = (Order) unmarshaller.unmarshal(file);

                        // PARA XML LOGICOM
                        LogicomToFel logicom_to_fel = new LogicomToFel();
                        resultado_parse = logicom_to_fel.convertir(order, file.getName());
                        //System.out.println("--> Resultado: " + resultado_parse.getResultado());
                        //System.out.println("--> Descripcion: " + resultado_parse.getDescripcion());

                        //System.out.println(xmlFile.getSystemId() + "--> Es valido");
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

                } else if (cliente.equals(BARC)) {

                    content = readFile(file.getAbsolutePath(), StandardCharsets.UTF_8);

                    if (content.contains("GTDocumento")) {
                        tipo_transaccion = "CERTIFICACION";
                    } else if (content.contains("GTAnulacionDocumento")) {
                        tipo_transaccion = "ANULACION";
                    } else {
                        tipo_transaccion = "ERROR";
                    }

                    resultado_parse = parseo.procesar_xml_formato_fel(fileStream, ruta.getCodificacion(), file, tipo_transaccion);

                    nit_emisor_segun_xml = resultado_parse.getNit_empresa();

                } else {
                    // PARA EL TXT ESTANDAR
                    resultado_parse = parseo.procesar(fileStream, ruta.getCodificacion());
                }

                fileStream.close();

                DocumentoFel documento_fel = new DocumentoFel();

                AnulacionFel anulacion_fel = new AnulacionFel();

                System.out.println("\n--> 2. FASE DE TRADUCCION");

                if (resultado_parse.getResultado()) {

                    uuid_para_anulacion = resultado_parse.getUuid();
                    tipo_transaccion = resultado_parse.getTipo_transaccion();
                    nit_empresa = resultado_parse.getNit_empresa();
                    tipo_de_documento = resultado_parse.getTipo_documento();

                    if (resultado_parse.getTipo_transaccion().equals("CERTIFICACION")) {

                        documento_fel = (DocumentoFel) resultado_parse.getDocumento_fel();

                        // Seccion de identificadores unicos por cada cliente
                        switch (cliente) {
                            case "dahop42924545":
                                System.out.println("--> No SAP segun adenda: [" + documento_fel.getAdenda().getAdenda().get("NOSAP") + "]\n");
                                nosap = documento_fel.getAdenda().getAdenda().get("NOSAP");
                                break;

                            case "ggf5890098765":
                                System.out.println("--> Lote segun adenda: [" + documento_fel.getAdenda().getAdenda().get("LOTE") + "]\n");
                                lote = documento_fel.getAdenda().getAdenda().get("LOTE");

                                System.out.println("--> IdentificadorUnico segun adenda: [" + documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO") + "]");
                                identificador_unico = documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO");
                                break;

                            case BARC:
                                System.out.println("--> IdentificadorUnico segun adenda:: [" + documento_fel.getAdenda().getAdenda().get("FACTURAPMS") + "]\n");
                                identificador_unico = documento_fel.getAdenda().getAdenda().get("FACTURAPMS");
                                break;

                            case AWAY:
                                System.out.println("--> Identificador de Tienda segun adenda: [" + documento_fel.getAdenda().getAdenda().get("AGENCIAWAY") + "]");
                                identificador_tienda = documento_fel.getAdenda().getAdenda().get("AGENCIAWAY");

                                Optional<String> i_tienda = Optional.ofNullable(identificador_tienda);

                                if (!i_tienda.isPresent()) {
                                    identificador_tienda = "SIN_IDENTIFICADOR_TIENDA";
                                }

                                System.out.println("--> IdentificadorUnico segun adenda: [" + documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO") + "]");
                                identificador_unico = documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO");

                                break;

                            default:
                                System.out.println("--> IdentificadorUnico segun adenda: [" + documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO") + "]");
                                identificador_unico = documento_fel.getAdenda().getAdenda().get("IDENTIFICADOR_UNICO");
                                break;
                        }

                    } else {

                        if (cliente.equals(AWAY)) {
                            identificador_tienda = "SIN_IDENTIFICADOR_TIENDA";
                        }

                        anulacion_fel = (AnulacionFel) resultado_parse.getDocumento_fel();
                    }

                    // Si todo sale bien entonces
                    System.out.println("--> Resultado: " + resultado_parse.getResultado());
                    System.out.println("--> Descripcion: " + resultado_parse.getDescripcion());
                    System.out.println("--> Pasando a la siguiente fase ...\n");

                    System.out.println("--> 3. FASE DE CONSTRUCCION");

                    tipo_operacion = resultado_parse.getTipo_transaccion();
                    nit_emisor_segun_xml = resultado_parse.getNit_empresa();

                    if (resultado_parse.getTipo_transaccion().equals("CERTIFICACION")) {
                        tipo_transaccion = "CERTIFICACION";
                        //nit_emisor_segun_xml = documento_fel.getDatos_emisor().getNITEmisor();
                    } else {
                        tipo_transaccion = "ANULACION";
                        //nit_emisor_segun_xml = anulacion_fel.getNITEmisor();
                    }

                    System.out.println("--> NIT Emisor: " + nit_emisor_segun_xml); // Linea Nueva

                    // Obtener credenciales para los servicios de firma y de certificacion
                    if (empresas.containsKey(nit_emisor_segun_xml)) {
                        Object o = empresas.get(nit_emisor_segun_xml);
                        usuario_api = o.toString().split(",")[1];
                        llave_api = o.toString().split(",")[2];
                        usuario_firma = o.toString().split(",")[3];
                        llave_firma = o.toString().split(",")[4];
                        nit_api = o.toString().split(",")[0];

                    }

                    System.out.println("--> UsuarioAPI: [" + usuario_api + "]");
                    System.out.println("--> LlaveAPI: [" + llave_api + "]");
                    System.out.println("--> UsuarioFirma: [" + usuario_firma + "]");
                    System.out.println("--> LlaveFirma: [" + llave_firma + "]");

                    // ===================================================================
                    // Variable para capturar la respuesta recibida del proceso de formacion del XML.
                    Respuesta respuesta = null;

                    // Objeto para enviar los datos para generacion del XML
                    GenerarXml generar_xml = new GenerarXml();

                    if (!cliente.equals(BARC)) {
                        respuesta = generar_xml.ToXml(resultado_parse.getDocumento_fel());

                    }

                    if (cliente.equals(BARC)) {

                        System.out.println("--> El cliente es barcelo");

                        respuesta = generar_xml.to_xml_brc(content);

                    }

                    System.out.println("--> Resultado: " + respuesta.getResultado());
                    System.out.println("--> Descripcion: " + respuesta.getDescripcion());

                    //System.out.println(respuesta.getXml());
                    // System.out.println("--> xml: " + respuesta.getXml());
                    if (respuesta.getResultado()) {

                        //Se captura el xml antes de la firma
                        xml_sin_firmar = respuesta.getXml();

                        // Si el xml se genera bien entonces pasa a la siguiente fase que es la firma del documento.                    
                        System.out.println("--> Pasando a la siguiente fase ...\n");

                        System.out.println("--> 4. FASE DE FIRMA POR PARTE DEL EMISOR ");

                        FirmaEmisor firma_emisor = new FirmaEmisor();
                        RespuestaServicioFirma respuesta_firma_emisor = new RespuestaServicioFirma();

                        System.out.println("--> Enviando Documento al Servicio de Firma del Emisor...");

                        respuesta_firma_emisor = firma_emisor.Firmar(respuesta.getXml(), usuario_firma, llave_firma);

                        System.out.println("--> Resultado: " + respuesta_firma_emisor.isResultado());
                        System.out.println("--> Descripcion: " + respuesta_firma_emisor.getDescripcion());

                        if (respuesta_firma_emisor.isResultado()) {
                            // Si se logra firmar correctamente entonces pasa a la siguiente fase que es la certificacion en el API de INFILE.

                            System.out.println("--> Pasando a la siguiente fase ...\n");

                            // Fase intermedia de consulta en la base de datos de identificadores unicos
                            // solo para credomatic
                            RespuestaServicioFel respuesta_servicio = new RespuestaServicioFel();

                            if (cliente.equals("ggf5890098765")) {

                                if (!conexion()) {
                                    System.out.println("--> No es posible continuar procesando documentos, no hay conexion con el API de consulta de identificadores.\n");

                                    respuesta_servicio.setResultado(false);
                                    respuesta_servicio.setOrigen("Comprobacion de Conexion con BD de Indentificadores Unicos");
                                    respuesta_servicio.setDescripcion("No existe conexion con la BD de identificadores  unicos (" + ruta.getPath_nosql_db() + ")");
                                    respuesta_servicio.setCantidad_errores(1);

                                } else {

                                    Optional<String> i_unico = Optional.ofNullable(identificador_unico);

                                    if (i_unico.isPresent()) {

                                        Map<String, String> datos_redis = conx.hgetAll(identificador_unico);

                                        if (datos_redis.get("UUID") == null) {

                                            respuesta_general.setGuardar_en_bdi(true);

                                            System.out.println("--> 5. FASE DE ENVIO AL API DE INFILE | CREDOMATIC");

                                            ConexionServicioFel conexion = new ConexionServicioFel();
                                            conexion.setUrl("");
                                            conexion.setMetodo("POST");
                                            conexion.setContent_type("application/json");
                                            conexion.setUsuario(usuario_api);
                                            conexion.setLlave(llave_api);
                                            conexion.setIdentificador(identificador_unico);

                                            System.out.println("--> Enviando Documento al Servicio FEL...");

                                            ServicioFel servicio = new ServicioFel();

                                            respuesta_servicio = servicio.Certificar(conexion, respuesta_firma_emisor.getArchivo(), nit_empresa, "", tipo_transaccion);

                                        } else {

                                            System.out.println("--> 4.5 FASE DE CONSULTA EN LA BD DE IDENTIFICADORES UNICOS");

                                            escribir_archivos_disco = false;

                                            respuesta_general.setGuardar_en_bdi(false);
                                            respuesta_general.setDescargar_xml(false);
                                            respuesta_servicio.setOrigen("Servicio de Autoconsulta de documentos por su identificador unico");
                                            respuesta_servicio.setResultado(true);
                                            respuesta_servicio.setDescripcion("Autoconsulta de Documentos. Certificado Previamente." + datos_redis.get("FECHA_REGISTRO"));
                                            respuesta_servicio.setUuid(datos_redis.get("UUID"));
                                            respuesta_servicio.setSerie(datos_redis.get("SERIE"));
                                            respuesta_servicio.setNumero(datos_redis.get("NUMERO"));
                                            respuesta_servicio.setCantidad_errores(0);
                                            respuesta_servicio.setDescripcion_errores(null);
                                            Date fecha = new Date();
                                            respuesta_servicio.setFecha(fecha.toString());
                                            respuesta_servicio.setInfo("CONSULTA_BD_IDENTIFICADORES_UNICOS");
                                            respuesta_servicio.setInformacion_adicional("");

                                            String json = "";

                                            respuesta_servicio.setJson_respuesta("");

                                        }

                                    } else {

                                        respuesta_servicio.setResultado(false);
                                        respuesta_servicio.setOrigen("Comprobacion de Identificador Unico");
                                        respuesta_servicio.setDescripcion("No existe identificador unico, es nulo o vacio, debe de incluir uno de forma obligatoria.");
                                        respuesta_servicio.setCantidad_errores(1);

                                        System.out.println("--> Identificador nulo o vacio, debe de usar un identificador unico.\n");
                                    }

                                }

                            } else {

                                System.out.println("--> 5. FASE DE ENVIO AL API DE INFILE");

                                ConexionServicioFel conexion = new ConexionServicioFel();
                                conexion.setUrl("");
                                conexion.setMetodo("POST");
                                conexion.setContent_type("application/json");
                                conexion.setUsuario(usuario_api);
                                conexion.setLlave(llave_api);
                                conexion.setIdentificador(identificador_unico);

                                System.out.println("--> Enviando Documento al Servicio FEL...");

                                ServicioFel servicio = new ServicioFel();

                                respuesta_servicio = servicio.Certificar(conexion, respuesta_firma_emisor.getArchivo(), nit_empresa, "", resultado_parse.getTipo_transaccion());

                            }

                            if (respuesta_servicio.getResultado()) {

                                // RESPUESTA DE SERVICIO OK
                                //========================================================================
                                //========================================================================
                                System.out.println("--> Resultado: " + respuesta_servicio.getResultado());
                                System.out.println("--> Origen: " + respuesta_servicio.getOrigen());
                                System.out.println("--> Descripcion: " + respuesta_servicio.getDescripcion());
                                System.out.println("--> Cantidad Errores: " + respuesta_servicio.getCantidad_errores());
                                System.out.println("--> INFO: " + respuesta_servicio.getInfo());
                                //System.out.println("--> JSON: " + respuesta_servicio.getJson_respuesta());
                                // Procedimiento para copiar el archivo de la carpeta entrada a la carpeta que corresponda.
                                switch (cliente) {
                                    case BARC: {
                                        String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getCorrectos(), "Correctos");
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);
                                        if (respuesta_metodo) {
                                            OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                            System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                        } else {
                                            System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                                        }
                                        break;
                                    }
                                    case AWAY: {
                                        String ruta_personalizada = ruta_personalizada_away(principal.ruta.getCorrectos(), "Correctos", identificador_tienda);
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);
                                        if (respuesta_metodo) {
                                            OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                            System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                        } else {
                                            System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada.");
                                        }
                                        break;
                                    }
                                    default:
                                        // Para cualquier otro cliente que no sea Barcelo

                                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getCorrectos() + "/" + file.getName(), cliente);
                                        System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getCorrectos());
                                        break;
                                }

                                // Procedimiento para eliminar el archivo de la carpeta de entrada
                                Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                                System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                                principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                                // Procedimiento para generar el archivo de respuesta segun corresponda.
                                // Esta linea es para saber si la extension del archivo a reemplazar es txt para el resto de clientes
                                // o xml para barcelo 
                                // RUTA RESPUESTA 1                                
                                String ruta_respuesta = cliente.equals(BARC) ? principal.ruta.getCorrectos() + "/" + file.getName().replace(".xml", "") + "_RESPUESTA.txt" : principal.ruta.getCorrectos() + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt";

                                System.out.println("--> Generando archivo txt de respuesta: " + principal.ruta.getEntrada());

                                // Respuestas API FEL | Cuando es OK
                                // Datos Generales
                                respuesta_general.setNit_emisor(resultado_parse.getNit_empresa());
                                respuesta_general.setCodigo_establecimiento(resultado_parse.getCodigo_establecimiento());
                                respuesta_general.setTipo_documento(resultado_parse.getTipo_documento());
                                respuesta_general.setIdentificador_unico(identificador_unico);
                                respuesta_general.setTipo_transaccion(tipo_transaccion);
                                respuesta_general.setAnio(anio);
                                respuesta_general.setNumero_acceso(resultado_parse.getNumero_acceso());
                                respuesta_general.setParse_txt(resultado_parse);
                                respuesta_general.setIdentificador_cliente(cliente);

                                // Datos para la escritura de archivos en la respuesta
                                switch (cliente) {
                                    case BARC:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_personalizada_barc(principal.ruta.getCorrectos(), "Correctos"));
                                        respuesta_general.setInformacion_adiciona_respuesta(true);
                                        respuesta_general.setUuid_documento_origen(resultado_parse.getUuid_documento_origen());
                                        break;
                                    case AWAY:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_personalizada_away(principal.ruta.getCorrectos(), "Correctos", identificador_tienda) + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt");
                                        respuesta_general.setInformacion_adiciona_respuesta(true);
                                        respuesta_general.setUuid_documento_origen(resultado_parse.getUuid_documento_origen());
                                        break;
                                    default:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_respuesta);
                                        break;
                                }

                                respuesta_general.setResource("SERVICIO_OK");

                                // Datos de Certificacion
                                respuesta_general.setResultado(respuesta_servicio.getResultado());
                                respuesta_general.setDescripcion(respuesta_servicio.getDescripcion());
                                respuesta_general.setErrores(null);
                                respuesta_general.setUuid(respuesta_servicio.getUuid());
                                respuesta_general.setSerie(respuesta_servicio.getSerie());
                                respuesta_general.setNumero(respuesta_servicio.getNumero());
                                respuesta_general.setFecha_certificacion(respuesta_servicio.getFecha());

                                // Datos para Credomatic
                                if (cliente.equals("ggf5890098765")) {
                                    respuesta_general.setLote(lote);
                                    //conexion redis
                                    if (conexion()) {
                                        respuesta_general.setConx(conx);

                                    }

                                }

                                // Datos para Dahopozos
                                if (cliente.equals("dahop42924545")) {
                                    respuesta_general.setNosap(nosap);
                                    respuesta_general.setUsuario_sap(usuario_sap);
                                    respuesta_general.setLlave_sap(llave_sap);
                                    respuesta_general.setUrl_api_sap(url_api_sap);
                                }

                                respuesta_general.escribir_respuestas(cliente, guarda_respuesta_txt, true);

                                String url_descarga_pdf = "";
                                String url_descarga_copia = "";

                                System.out.println("\n--> 6. DESCARGA DE DOCUMENTOS");

                                String ruta_pdf = "";

                                if ((cliente.equals(BARC)) && ruta.getPdf().equals("SI")) {

                                    //Arma la ruta personalizada
                                    String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getArchivos_pdf(), "PDF");

                                    // crea el arbol de carpetas sino existe
                                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                    // Si el metodo anterior es true entonces se procede con la accion    
                                    if (respuesta_metodo) {
                                        ruta_pdf = ruta_personalizada + "/" + file.getName().replace(".xml", "") + ".pdf";
                                    } else {
                                        System.out.println("--> Hubieron errores al mapear la ruta para los archivos PDF");
                                    }
                                } else if (cliente.equals(AWAY) && ruta.getPdf().equals("SI")) {
                                    //Arma la ruta personalizada
                                    String ruta_personalizada = ruta_personalizada_away(principal.ruta.getArchivos_pdf(), "PDF", identificador_tienda);

                                    // crea el arbol de carpetas sino existe
                                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                    // Si el metodo anterior es true entonces se procede con la accion    
                                    if (respuesta_metodo) {
                                        ruta_pdf = ruta_personalizada + "/" + file.getName().replace(".txt", "") + ".pdf";
                                    } else {
                                        System.out.println("--> Hubieron errores al mapear la ruta para los archivos PDF");
                                    }
                                } else {

                                    ruta_pdf = principal.ruta.getArchivos_pdf() + "/" + file.getName().replace(".txt", "") + ".pdf";
                                }

                                if (ruta.getPdf().equals("SI")) {

                                    // URL para Descarga de PDF
                                    if (tipo_transaccion.equals("CERTIFICACION")) {
                                        url_descarga_pdf = "https://report.feel.com.gt/ingfacereport/ingfacereport_documento?uuid=" + respuesta_servicio.getUuid() + "&formato=pdf&tipo_operacion=CERTIFICACION";
                                        System.out.println("--> El UUID para la descarga es: [" + respuesta_servicio.getUuid() + "] ");
                                    }

                                    if (tipo_transaccion.equals("ANULACION")) {
                                        url_descarga_pdf = "https://report.feel.com.gt/ingfacereport/ingfacereport_documento?uuid=" + uuid_para_anulacion + "&formato=pdf&tipo_operacion=ANULACION";
                                        System.out.println("--> El UUID para la descarga es: [" + uuid_para_anulacion + "] ");

                                    }

                                    // Funcion para la descarga del PDF
                                    System.out.println("--> Generando archivo PDF: [" + tipo_transaccion + "] " + ruta_pdf);
                                    escribir_pdf(url_descarga_pdf, ruta_pdf, resultado_parse.getCodigo_establecimiento());

                                } else {

                                    System.out.println("--> La descarga de archivos PDF esta desactivada.");

                                }

                                if (cliente.equals("sus7633hgh246")) {

                                    // Descarga de las copias
                                    if ("SI".equals(ruta.getCopias_activas().toUpperCase()) && tipo_transaccion.equals("CERTIFICACION") && ruta.getPdf().equals("SI")) {

                                        System.out.println("--> Impresion de copias activada! ");
                                        System.out.println("--> Comprobando tipo de documento para la impresion de las 3 copias ... ");
                                        System.out.println("--> Tipo de documento: [" + tipo_de_documento + "]");

                                        if ("FCAM".equals(tipo_de_documento)) {

                                            System.out.println("--> El tipo de documento: [" + tipo_de_documento + "] Aplica para impresion de copias");

                                            url_descarga_copia = url_descarga_pdf + "&modelo=COPIA_COBRANZA";
                                            escribir_pdf(url_descarga_copia, ruta_pdf.replace(".pdf", "_COPIA_COBRANZA.pdf"), resultado_parse.getCodigo_establecimiento());
                                            System.out.println("--> Copia Cobranza: " + url_descarga_copia);

                                            url_descarga_copia = url_descarga_pdf + "&modelo=COPIA_ENTREGA";
                                            escribir_pdf(url_descarga_copia, ruta_pdf.replace(".pdf", "_COPIA_ENTREGA.pdf"), resultado_parse.getCodigo_establecimiento());
                                            System.out.println("--> Copia Entrega: " + url_descarga_copia);

                                            url_descarga_copia = url_descarga_pdf + "&modelo=COPIA_TRANSPORTISTA";
                                            escribir_pdf(url_descarga_copia, ruta_pdf.replace(".pdf", "_COPIA_TRANSPORTISTA.pdf"), resultado_parse.getCodigo_establecimiento());
                                            System.out.println("--> Copia Transportista: " + url_descarga_copia);

                                        } else {
                                            System.out.println("--> El tipo de documento:" + tipo_de_documento + " No aplica para impresion de copias");

                                        }

                                    }

                                }

                                if (ruta.getXml().equals("SI")) {
                                    // Funcion para la descarga del XML
                                    String ruta_xml = "";
                                    String ruta_json = "";

                                    if (cliente.equals(BARC)) {

                                        //Arma la ruta personalizada
                                        String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getArchivos_xml(), "XML");

                                        // crea el arbol de carpetas sino existe
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                        // Si el metodo anterior es true entonces se procede con la accion    
                                        if (respuesta_metodo) {
                                            System.out.println("--> Generando archivo XML: [" + tipo_transaccion + "] " + ruta_personalizada);
                                            ruta_xml = ruta_personalizada + "/" + file.getName().replace(".xml", "") + ".xml";
                                            ruta_json = ruta_personalizada + "/" + file.getName().replace(".xml", "") + ".json";

                                        } else {
                                            System.out.println("--> Hubieron errores al mapear la ruta para los archivos XML");
                                        }
                                    } else if (cliente.equals(AWAY)) {
                                        //Arma la ruta personalizada
                                        String ruta_personalizada = ruta_personalizada_away(principal.ruta.getArchivos_xml(), "XML", identificador_tienda);

                                        // crea el arbol de carpetas sino existe
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                        // Si el metodo anterior es true entonces se procede con la accion    
                                        if (respuesta_metodo) {
                                            System.out.println("--> Generando archivo XML: [" + tipo_transaccion + "] " + ruta_personalizada);
                                            ruta_xml = ruta_personalizada + "/" + file.getName().replace(".txt", "") + ".xml";
                                            ruta_json = ruta_personalizada + "/" + file.getName().replace(".txt", "") + ".json";

                                        } else {
                                            System.out.println("--> Hubieron errores al mapear la ruta para los archivos XML");
                                        }
                                    } else {
                                        System.out.println("--> Generando archivo XML: [" + tipo_transaccion + "] " + principal.ruta.getArchivos_xml());
                                        ruta_xml = principal.ruta.getArchivos_xml() + "/" + file.getName().replace(".txt", "") + ".xml";
                                        ruta_json = principal.ruta.getArchivos_xml() + "/" + file.getName().replace(".txt", "") + ".json";
                                    }

                                    escribir_xml_json(respuesta_servicio.getXml_certificado(), ruta_xml, "BASE64", respuesta_general);

                                    // Funcion para la descarga del JSON del API FEL de INFILE
                                    System.out.println("--> Generando archivo JSON: [" + tipo_transaccion + "] " + principal.ruta.getArchivos_xml());

                                    escribir_xml_json(respuesta_servicio.getJson_respuesta(), ruta_json, "JSON", respuesta_general);

                                } else {
                                    System.out.println("--> La descarga de archivos JSON/XML esta desactivada.");
                                }

                            } else {

                                System.out.println("--> Resultado: " + respuesta_servicio.getResultado());
                                System.out.println("--> Origen: " + respuesta_servicio.getOrigen());
                                System.out.println("--> Descripcion: " + respuesta_servicio.getDescripcion());
                                System.out.println("--> Cantidad Errores: " + respuesta_servicio.getCantidad_errores());
                                System.out.println("--> INFO: " + respuesta_servicio.getInfo());
                                //System.out.println("--> JSON: " + respuesta_servicio.getJson_respuesta());

                                // Procedimiento para copiar el archivo de la carpeta entrada a la carpeta que corresponda.
                                if (cliente.equals(BARC)) {

                                    String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getErrores_servicio(), "Errores");

                                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                    if (respuesta_metodo) {
                                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                        System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                    } else {
                                        System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                                    }

                                } else if (cliente.equals(AWAY)) {
                                    String ruta_personalizada = ruta_personalizada_away(principal.ruta.getErrores_servicio(), "Errores", identificador_tienda);

                                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                    if (respuesta_metodo) {
                                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                        System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                    } else {
                                        System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                                    }

                                } else {

                                    OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getErrores_servicio() + "/" + file.getName(), cliente);
                                    System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getErrores_servicio());
                                }

                                // Procedimiento para eliminar el archivo de la carpeta de entrada
                                Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                                System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                                principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                                // Procedimiento para generar el archivo de respuesta segun corresponda.
                                // RUTA RESPUESTA 2                               
                                String ruta_respuesta = cliente.equals(BARC) ? principal.ruta.getErrores_servicio() + "/" + file.getName().replace(".xml", "") + "_RESPUESTA.txt" : principal.ruta.getErrores_servicio() + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt";

                                // Respuestas API FEL | Cuando el api de certificacion retorna errores
                                // Datos Generales
                                respuesta_general.setNit_emisor(resultado_parse.getNit_empresa());
                                respuesta_general.setCodigo_establecimiento(resultado_parse.getCodigo_establecimiento());
                                respuesta_general.setTipo_documento(resultado_parse.getTipo_documento());
                                respuesta_general.setIdentificador_unico(identificador_unico);
                                respuesta_general.setAnio(anio);
                                respuesta_general.setIdentificador_cliente(cliente);

                                // Datos para la escritura de archivos en la respuesta
                                switch (cliente) {
                                    case BARC:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_personalizada_barc(principal.ruta.getErrores_servicio(), "Errores"));
                                        respuesta_general.setInformacion_adiciona_respuesta(true);
                                        break;
                                    case AWAY:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_personalizada_away(principal.ruta.getErrores_servicio(), "Errores", identificador_tienda) + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt");
                                        respuesta_general.setInformacion_adiciona_respuesta(true);
                                        break;
                                    default:
                                        respuesta_general.setNombre(file.getName());
                                        respuesta_general.setRuta(ruta_respuesta);
                                        break;
                                }

                                respuesta_general.setResource("SERVICIO_ERR");
                                // Datos de Certificacion
                                respuesta_general.setResultado(respuesta_servicio.getResultado());
                                respuesta_general.setDescripcion(respuesta_servicio.getDescripcion());
                                respuesta_general.setErrores(respuesta_servicio.getDescripcion_errores());
                                respuesta_general.setUuid("");
                                respuesta_general.setSerie("");
                                respuesta_general.setNumero("");

                                // Datos para Credomatic
                                if (cliente.equals("ggf5890098765")) {
                                    respuesta_general.setLote(lote);
                                }

                                // Datos para Dahopozos
                                if (cliente.equals("dahop42924545")) {
                                    respuesta_general.setNosap(nosap);
                                    respuesta_general.setUsuario_sap(usuario_sap);
                                    respuesta_general.setLlave_sap(llave_sap);
                                    respuesta_general.setUrl_api_sap(url_api_sap);
                                }

                                respuesta_general.escribir_respuestas(cliente, guarda_respuesta_txt, false);

                                // Para credomatic no se imprime ningun archivo.
                                if (ruta.getXml().equals("SI")) {

                                    String ruta_json = "";

                                    // Funcion para la descarga del JSON del API FEL de INFILE
                                    if (cliente.equals(BARC)) {

                                        //Arma la ruta personalizada
                                        String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getArchivos_xml(), "XML");

                                        // crea el arbol de carpetas sino existe
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                        // Si el metodo anterior es true entonces se procede con la accion    
                                        if (respuesta_metodo) {
                                            System.out.println("--> Generando archivo JSON: [" + tipo_transaccion + "] " + ruta_personalizada);
                                            ruta_json = ruta_personalizada + "/" + file.getName().replace(".xml", "") + ".json";

                                            System.out.println("--> 1 " + ruta_json);

                                        } else {
                                            System.out.println("--> Hubieron errores al mapear la ruta para los archivos JSON");
                                        }

                                    } else if (cliente.equals(AWAY)) {

                                        //Arma la ruta personalizada
                                        String ruta_personalizada = ruta_personalizada_away(principal.ruta.getArchivos_xml(), "XML", identificador_tienda);

                                        // crea el arbol de carpetas sino existe
                                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                        // Si el metodo anterior es true entonces se procede con la accion    
                                        if (respuesta_metodo) {
                                            System.out.println("--> Generando archivo JSON: [" + tipo_transaccion + "] " + ruta_personalizada);
                                            ruta_json = ruta_personalizada + "/" + file.getName().replace(".txt", "").replace(".TXT", "") + ".json";

                                            System.out.println("--> 1 " + ruta_json);

                                        } else {
                                            System.out.println("--> Hubieron errores al mapear la ruta para los archivos JSON");
                                        }

                                    } else {

                                        System.out.println("--> Generando archivo JSON: [" + tipo_transaccion + "] " + principal.ruta.getArchivos_xml());

                                        ruta_json = (!cliente.equals(BARC)) ? principal.ruta.getArchivos_xml() + "/" + file.getName().replace(".xml", "") + ".json" : principal.ruta.getArchivos_xml() + "/" + file.getName().replace(".xml", "") + ".json";

                                        System.out.println("--> 2 " + ruta_json);

                                    }

                                    if (escribir_archivos_disco) {
                                        System.out.println("--> 3 " + ruta_json);

                                        escribir_xml_json(respuesta_servicio.getJson_respuesta(), ruta_json, "JSON", respuesta_general);
                                    }

                                } else {
                                    System.out.println("--> La descarga de archivos JSON/XML esta desactivada.");
                                }

                            }

                        } else {

                            // Sino se logra firmar por parte del emisor
                            // ...
                            // Procedimiento para copiar el archivo de la carpeta entrada a la carpeta que corresponda.
                            if (cliente.equals(BARC)) {

                                //Arma la ruta personalizada
                                String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getErrores_servicio(), "Errores");

                                // crea el arbol de carpetas sino existe
                                boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                // Si el metodo anterior es true entonces se procede con la accion    
                                if (respuesta_metodo) {
                                    OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                    System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                } else {
                                    System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                                }

                            } else if (cliente.equals(AWAY)) {
                                //Arma la ruta personalizada
                                String ruta_personalizada = ruta_personalizada_away(principal.ruta.getErrores_servicio(), "Errores", identificador_tienda);

                                // crea el arbol de carpetas sino existe
                                boolean respuesta_metodo = createDirTree(ruta_personalizada);

                                // Si el metodo anterior es true entonces se procede con la accion    
                                if (respuesta_metodo) {
                                    OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                    System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                                } else {
                                    System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                                }
                            } else {
                                OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getErrores_servicio() + "/" + file.getName(), cliente);
                                System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getErrores_servicio());
                            }

                            // Procedimiento para eliminar el archivo de la carpeta de entrada
                            Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                            System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                            principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                            // Procedimiento para generar el archivo de respuesta segun corresponda.
                            // RUTA RESPUESTA 3                               
                            String ruta_respuesta = cliente.equals(BARC) ? principal.ruta.getErrores_servicio() + "/" + file.getName().replace(".xml", "") + "_RESPUESTA.xml" : principal.ruta.getErrores_servicio() + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt";

                            List<String> respuesta_servicio_firma = new ArrayList<>();
                            respuesta_servicio_firma.add(respuesta_firma_emisor.getDescripcion());

                            // Respuestas API FEL | Cuando el api de firma retorna errores
                            // Datos Generales
                            respuesta_general.setNit_emisor(resultado_parse.getNit_empresa());
                            respuesta_general.setCodigo_establecimiento(resultado_parse.getCodigo_establecimiento());
                            respuesta_general.setTipo_documento(resultado_parse.getTipo_documento());
                            respuesta_general.setIdentificador_unico(identificador_unico);
                            respuesta_general.setAnio(anio);
                            respuesta_general.setIdentificador_cliente(cliente);

                            // Datos para la escritura de archivos en la respuesta
                            if (cliente.equals(BARC)) {
                                respuesta_general.setNombre(file.getName());
                                respuesta_general.setRuta(ruta_personalizada_barc(principal.ruta.getErrores_servicio(), "Errores"));
                                respuesta_general.setInformacion_adiciona_respuesta(true);

                            } else if (cliente.equals(AWAY)) {
                                respuesta_general.setNombre(file.getName());
                                respuesta_general.setRuta(ruta_personalizada_away(principal.ruta.getErrores_servicio(), "Errores", identificador_tienda) + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt");
                                respuesta_general.setInformacion_adiciona_respuesta(true);
                            } else {
                                respuesta_general.setNombre(file.getName());
                                respuesta_general.setRuta(ruta_respuesta);

                            }

                            respuesta_general.setResource("FIRMA_ERR");
                            // Datos de Certificacion
                            respuesta_general.setResultado(respuesta_firma_emisor.isResultado());
                            respuesta_general.setDescripcion(respuesta_firma_emisor.getDescripcion());
                            respuesta_general.setErrores(respuesta_servicio_firma);
                            respuesta_general.setUuid("");
                            respuesta_general.setSerie("");
                            respuesta_general.setNumero("");

                            // Datos para Credomatic
                            if (cliente.equals("ggf5890098765")) {
                                respuesta_general.setLote(lote);
                            }

                            // Datos para Dahopozos
                            if (cliente.equals("dahop42924545")) {
                                respuesta_general.setNosap(nosap);
                                respuesta_general.setUsuario_sap(usuario_sap);
                                respuesta_general.setLlave_sap(llave_sap);
                                respuesta_general.setUrl_api_sap(url_api_sap);
                            }

                            respuesta_general.escribir_respuestas(cliente, guarda_respuesta_txt, false);

                        }

                    } else {

                        // Caso contrario, si existen errores de esquema
                        System.out.println("--> Resultado: " + respuesta.getResultado());
                        System.out.println("--> Descripcion: " + respuesta.getDescripcion());
                        //System.out.println("--> Errores: ");

                        // Ciclo para recorrer los errores.    
                        /*respuesta.getErrores().forEach((error) -> {
                            System.out.println(error);
                        });*/
                        // Procedimiento para copiar el archivo de la carpeta entrada a la carpeta que corresponda.
                        if (cliente.equals(BARC)) {

                            String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getErrores_esquema(), "Errores");

                            boolean respuesta_metodo = createDirTree(ruta_personalizada);

                            if (respuesta_metodo) {
                                OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                            } else {
                                System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                            }

                        } else if (cliente.equals(AWAY)) {

                            String ruta_personalizada = ruta_personalizada_away(principal.ruta.getErrores_esquema(), "Errores", identificador_tienda);

                            boolean respuesta_metodo = createDirTree(ruta_personalizada);

                            if (respuesta_metodo) {
                                OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                                System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                            } else {
                                System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                            }

                        } else {
                            OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getErrores_esquema() + "/" + file.getName(), cliente);
                            System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getErrores_esquema());
                        }

                        // Procedimiento para eliminar el archivo de la carpeta de entrada
                        Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                        System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                        principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                        // Procedimiento para generar el archivo de respuesta segun corresponda.
                        // RUTA RESPUESTA 4                                
                        String ruta_respuesta = cliente.equals(BARC) ? principal.ruta.getErrores_esquema() + "/" + file.getName().replace(".xml", "") + "_RESPUESTA.txt" : principal.ruta.getErrores_esquema() + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt";

                        // Respuestas API FEL | Cuando el api de firma retorna errores de esquema
                        // Datos Generales
                        respuesta_general.setNit_emisor(resultado_parse.getNit_empresa());
                        respuesta_general.setCodigo_establecimiento(resultado_parse.getCodigo_establecimiento());
                        respuesta_general.setTipo_documento(resultado_parse.getTipo_documento());
                        respuesta_general.setIdentificador_unico(identificador_unico);
                        respuesta_general.setAnio(anio);
                        respuesta_general.setIdentificador_cliente(cliente);

                        // Datos para la escritura de archivos en la respuesta
                        if (cliente.equals(BARC)) {
                            respuesta_general.setNombre(file.getName());
                            respuesta_general.setRuta(ruta_personalizada_barc(principal.ruta.getErrores_esquema(), "Errores"));
                            respuesta_general.setInformacion_adiciona_respuesta(true);

                        } else if (cliente.equals(AWAY)) {
                            respuesta_general.setNombre(file.getName());
                            respuesta_general.setRuta(ruta_personalizada_away(principal.ruta.getErrores_esquema(), "Errores", identificador_tienda) + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt");
                            respuesta_general.setInformacion_adiciona_respuesta(true);
                        } else {
                            respuesta_general.setNombre(file.getName());
                            respuesta_general.setRuta(ruta_respuesta);

                        }

                        respuesta_general.setResource("ESQUEMA");

                        // Datos de Certificacion
                        respuesta_general.setResultado(respuesta.getResultado());
                        respuesta_general.setDescripcion(respuesta.getDescripcion());
                        respuesta_general.setErrores(respuesta.getErrores());
                        respuesta_general.setUuid("");
                        respuesta_general.setSerie("");
                        respuesta_general.setNumero("");

                        // Datos para Credomatic
                        if (cliente.equals("ggf5890098765")) {
                            respuesta_general.setLote(lote);
                        }

                        // Datos para Dahopozos
                        if (cliente.equals("dahop42924545")) {
                            respuesta_general.setNosap(nosap);
                            respuesta_general.setUsuario_sap(usuario_sap);
                            respuesta_general.setLlave_sap(llave_sap);
                            respuesta_general.setUrl_api_sap(url_api_sap);
                        }

                        respuesta_general.escribir_respuestas(cliente, guarda_respuesta_txt, false);

                    }

                } else {
                    // Caso contrario, si existen errores de traduccion entonces:

                    System.out.println("--> Resultado: " + resultado_parse.getResultado());
                    System.out.println("--> Descripcion: " + resultado_parse.getDescripcion());

                    if (cliente.equals(BARC)) {

                        String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getErrores_traduccion(), "Errores");

                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                        if (respuesta_metodo) {
                            OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                            System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                        } else {
                            System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                        }

                    } else if (cliente.equals(AWAY)) {
                        String ruta_personalizada = ruta_personalizada_away(principal.ruta.getErrores_traduccion(), "Errores", identificador_tienda);

                        boolean respuesta_metodo = createDirTree(ruta_personalizada);

                        if (respuesta_metodo) {
                            OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                            System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                        } else {
                            System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                        }

                    } else {
                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getErrores_traduccion() + "/" + file.getName(), cliente);
                        System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getErrores_traduccion());
                    }
                    // Procedimiento para eliminar el archivo de la carpeta de entrada
                    Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                    System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                    principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                    // Procedimiento para generar el archivo de respuesta segun corresponda.
                    // RUTA RESPUESTA 5                            
                    String ruta_respuesta = cliente.equals(BARC) ? principal.ruta.getErrores_traduccion() + "/" + file.getName().replace(".xml", "") + "_RESPUESTA.txt" : principal.ruta.getErrores_traduccion() + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt";

                    // Respuestas API FEL | Cuando el api de firma retorna errores de traduccion
                    // Datos Generales
                    respuesta_general.setNit_emisor(resultado_parse.getNit_empresa());
                    respuesta_general.setCodigo_establecimiento(resultado_parse.getCodigo_establecimiento());
                    respuesta_general.setTipo_documento(resultado_parse.getTipo_documento());
                    respuesta_general.setIdentificador_unico(identificador_unico);
                    respuesta_general.setAnio(anio);
                    respuesta_general.setIdentificador_cliente(cliente);

                    // Datos para la escritura de archivos en la respuesta
                    if (cliente.equals(BARC)) {
                        respuesta_general.setNombre(file.getName());
                        respuesta_general.setRuta(ruta_personalizada_barc(principal.ruta.getErrores_traduccion(), "Errores"));
                        respuesta_general.setInformacion_adiciona_respuesta(true);

                    } else if (cliente.equals(AWAY)) {
                        respuesta_general.setNombre(file.getName());
                        respuesta_general.setRuta(ruta_personalizada_away(principal.ruta.getErrores_traduccion(), "Errores", identificador_tienda) + "/" + file.getName().replace(".txt", "") + "_RESPUESTA.txt");
                        respuesta_general.setInformacion_adiciona_respuesta(true);
                    } else {
                        respuesta_general.setNombre(file.getName());
                        respuesta_general.setRuta(ruta_respuesta);
                    }
                    respuesta_general.setResource("TRADUCCION");
                    // Datos de Certificacion
                    respuesta_general.setResultado(resultado_parse.getResultado());
                    respuesta_general.setDescripcion(resultado_parse.getDescripcion());
                    respuesta_general.setErrores(resultado_parse.getLista_errores());
                    respuesta_general.setUuid("");
                    respuesta_general.setSerie("");
                    respuesta_general.setNumero("");

                    // Datos para Credomatic
                    if (cliente.equals("ggf5890098765")) {
                        respuesta_general.setLote(lote);
                    }

                    // Datos para Dahopozos
                    if (cliente.equals("dahop42924545")) {
                        respuesta_general.setNosap(nosap);
                        respuesta_general.setUsuario_sap(usuario_sap);
                        respuesta_general.setLlave_sap(llave_sap);
                        respuesta_general.setUrl_api_sap(url_api_sap);
                    }

                    respuesta_general.escribir_respuestas(cliente, guarda_respuesta_txt, false);

                }

                // =========================== Escritura de XML a disco previo a certificar ===========================
                if (principal.ruta.getXml().equals("SI")) {

                    // Escritura de XML a disco previo a certificar
                    System.out.println("\n--> Seccion de Descarga de Archivos Auxiliares");

                    try {

                        String ruta_xml_sin_certificar = "";

                        if (cliente.equals(BARC)) {

                            //Arma la ruta personalizada
                            String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getArchivos_xml(), "XML");

                            // crea el arbol de carpetas sino existe
                            boolean respuesta_metodo = createDirTree(ruta_personalizada);

                            // Si el metodo anterior es true entonces se procede con la accion    
                            if (respuesta_metodo) {
                                System.out.println("--> Generando archivo XML SIN CERTIFICACION: [" + tipo_transaccion + "] en " + ruta_personalizada);
                                ruta_xml_sin_certificar = ruta_personalizada + "/" + file.getName().replace(".txt", "").replace(".xml", "") + "_SIN_CERTIFICAR.xml";
                            } else {
                                System.out.println("--> Hubieron errores al mapear la ruta para los archivos JSON");
                            }

                        } else if (cliente.equals(AWAY)) {
                            //Arma la ruta personalizada
                            String ruta_personalizada = ruta_personalizada_away(principal.ruta.getArchivos_xml(), "XML", identificador_tienda);

                            // crea el arbol de carpetas sino existe
                            boolean respuesta_metodo = createDirTree(ruta_personalizada);

                            // Si el metodo anterior es true entonces se procede con la accion    
                            if (respuesta_metodo) {
                                System.out.println("--> Generando archivo XML SIN CERTIFICACION: [" + tipo_transaccion + "] en " + ruta_personalizada);
                                ruta_xml_sin_certificar = ruta_personalizada + "/" + file.getName().replace(".txt", "").replace(".TXT", "") + "_SIN_CERTIFICAR.xml";
                            } else {
                                System.out.println("--> Hubieron errores al mapear la ruta para los archivos JSON");
                            }
                        } else if (cliente.equals(MMS)) {
                            System.out.println("--> Generando archivo XML SIN CERTIFICACION: [" + tipo_transaccion + "] ");
                            ruta_xml_sin_certificar = ruta.getArchivos_xml().replace("\\", "/") + "/" + file.getName().replace(".txt", "").replace(".xml", "") + ".csv";
                        } else {
                            System.out.println("--> Generando archivo XML SIN CERTIFICACION: [" + tipo_transaccion + "] ");
                            ruta_xml_sin_certificar = ruta.getArchivos_xml().replace("\\", "/") + "/" + file.getName().replace(".txt", "").replace(".xml", "") + "_SIN_CERTIFICAR.xml";
                        }

                        File file_xml_sin_certificar = new File(ruta_xml_sin_certificar);

                        System.out.println("--> Leyendo contenido y Guardando el XML Original Previo a Firma/Certificacion");

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_xml_sin_certificar))) {
                            writer.write(xml_sin_firmar);
                            writer.close();
                        }

                        System.out.println("--> Archivo Descargado");

                    } catch (IOException ex) {

                        System.out.println("--> Error : " + ex.getMessage());

                    }

                }

                //==========================================================================================================
                System.out.println("\n--> 8. FIN DE LA TRANSACCION");

                System.out.println("\u001B[44m\u001B[37mEsperando nuevo archivo para procesar ..." + "\n");

            } catch (FileNotFoundException err) {
                System.out.println(err.getMessage());

                // Procedimiento para copiar el archivo de la carpeta entrada a la carpeta que corresponda.
                if (cliente.equals(BARC)) {

                    String ruta_personalizada = ruta_personalizada_barc(principal.ruta.getErrores_lectura(), "Errores");

                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                    if (respuesta_metodo) {
                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                        System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                    } else {
                        System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                    }

                } else if (cliente.equals(AWAY)) {
                    String ruta_personalizada = ruta_personalizada_away(principal.ruta.getErrores_lectura(), "Errores", identificador_tienda);

                    boolean respuesta_metodo = createDirTree(ruta_personalizada);

                    if (respuesta_metodo) {
                        OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), ruta_personalizada + "/" + file.getName(), cliente);
                        System.out.println("--> Mover el Archivo a la carpeta: " + ruta_personalizada);
                    } else {
                        System.out.println("--> El archivo no pudo ser movido desde la carpeta de entrada. ");
                    }

                } else {
                    OperacionesArchivos.mover_archivo(principal.ruta.getEntrada() + "/" + file.getName(), principal.ruta.getErrores_lectura() + "/" + file.getName(), cliente);
                    System.out.println("--> Mover el Archivo a la carpeta: " + principal.ruta.getErrores_lectura());
                }

                // Procedimiento para eliminar el archivo de la carpeta de entrada
                Path path_entrada = Paths.get(principal.ruta.getEntrada() + "/" + file.getName());
                System.out.println("--> Eliminar Archivo: " + path_entrada.toString());
                principal.eliminar_archivo.eliminar_archivo(path_entrada.toString());

                System.out.println("\n--> Transaccion finalizada prematuramente.");

            } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InterruptedException | KeyManagementException | NoSuchAlgorithmException ex) {
                System.out.println("--> Error: " + ex.getMessage());
            }

        }

        @Override
        public void fileChanged(File file
        ) {

        }

    };

    public static boolean escribir_pdf(String url_descarga, String ruta, String establecimiento) throws InterruptedException {

        System.out.println("\n--> DESCARGA DE PDF");

        try {

            String url = url_descarga;

            System.out.println("--> Obteniendo Conexion");

            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");

            try (FileOutputStream fos = new FileOutputStream(new File(ruta))) {

                System.out.println("--> Leyendo contenido y Guardando el Archivo");
                int length = -1;
                byte[] buffer = new byte[2048];// buffer for portion of data from connection
                while ((length = con.getInputStream().read(buffer)) > -1) {
                    fos.write(buffer, 0, length);

                }

            }

            /*byte[] bytes = IOUtils.toByteArray(con.getInputStream());
            String pdf_a_imprimir = Base64.getEncoder().encodeToString(bytes);
            enviar_a_impresion("", "", pdf_a_imprimir);*/
            System.out.println("--> Archivo PDF Descargado");

            if (principal.ruta.getCopias_activas().equals("SI")) {

                System.out.println("\n--> 7. IMPRESION DE DOCUMENTOS");
                Thread.sleep(2000);
                // Si se desea imprimir aqui es donde sucede eso
                InputStream is = new FileInputStream(ruta);
                byte[] bytes_pdf_a_imprimir = IOUtils.toByteArray(is);
                String pdf_a_imprimir = Base64.getEncoder().encodeToString(bytes_pdf_a_imprimir);
                enviar_a_impresion(nit_empresa, tipo_de_documento, pdf_a_imprimir, establecimiento);
            }

        } catch (IOException ex) {

            System.out.println("--> Error : " + ex.getMessage());

        }

        return true;
    }

    public static boolean escribir_xml_json(String xml_certificado, String ruta, String tipo, RespuestasApiFel respuesta_general) {

        if (respuesta_general.getDescargar_xml()) {

            String xml_decodificado = "";

            if (tipo.equals("BASE64")) {
                System.out.println("\n--> DESCARGA DE XML");
                byte[] decodedValue = Base64.getDecoder().decode(xml_certificado);  // Basic Base64 decoding
                xml_decodificado = new String(decodedValue, StandardCharsets.UTF_8);
            }

            if (tipo.equals("JSON")) {
                System.out.println("\n--> DESCARGA DE JSON");
                xml_decodificado = xml_certificado;
            }

            try {

                File logFile = new File(ruta.replace(".txt", ""));

                System.out.println("--> Leyendo contenido y Guardando el Archivo");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
                    writer.write(xml_decodificado);
                    writer.close();
                }

                System.out.println("--> Archivo Descargado");

            } catch (IOException ex) {

                System.out.println("--> Error : " + ex.getMessage());
                return false;

            }

            return true;

        } else {

            return false;
        }

    }

    public static boolean enviar_a_impresion(String empresa, String tipo_documento, String documento, String establecimiento) {

        System.out.println("--> Conectando con el servicio de impresion.");

        String json_impresion = "";
        if (cliente.equals("logic74164312")) {
            json_impresion = "{\n"
                    + "	\"pdf\":\"" + documento + "\",\n"
                    + "	\"empresa\":\"" + empresa + "\",\n"
                    + "	\"establecimiento\":\"" + establecimiento + "\",\n"
                    + "	\"tipo_doc\":\"" + tipo_documento + "\"\n"
                    + "}";
        } else {
            json_impresion = "{\n"
                    + "	\"pdf\":\"" + documento + "\",\n"
                    + "	\"empresa\":\"" + empresa + "\",\n"
                    + "	\"tipo_doc\":\"" + tipo_documento + "\"\n"
                    + "}";
        }

        //System.out.println(json_impresion);
        try {

            URL url = new URL("http://localhost/MonitorImpresion/api/Impresion/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = json_impresion;

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes("ISO-8859-1"));
            os.flush();

            int codigo_http = conn.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            String json = "";

            while ((output = br.readLine()) != null) {

                json = output;

            }

            conn.disconnect();

            JsonParser jsonParser = new JsonParser();
            JsonObject respuesta_servicio_impresion = (JsonObject) jsonParser.parse(json);
            JsonElement resultado = respuesta_servicio_impresion.get("resultado");

            System.out.println("--> " + respuesta_servicio_impresion.toString());

            if (resultado != null) {

                System.out.println("--> Documento recibido correctamente por el servicio de impresion.\n");

            } else {

                System.out.println("--> ¡Error! Documento rechazado por el servicio de impresion.\n");

            }

        } catch (MalformedURLException e) {

            System.out.println("--> ¡Error! " + e.getMessage());

        } catch (IOException e) {

            System.out.println("--> ¡Error! " + e.getMessage());

        }

        return true;
    }

    public static void comprobar_ejecucion(String ruta, String tiempo) {

        try {

            String pathDirectory = ruta;
            long timeTaskExecute = Integer.parseInt(tiempo);
            RegexNameFileFilter regexName = new RegexNameFileFilter();

            if (cliente.equals("logic74164312") || cliente.equals(BARC)) {
                regexName.addFileNameRegex(".*\\.xml");
                regexName.addFileNameRegex(".*\\.XML");
            } else {
                regexName.addFileNameRegex(".*\\.txt");
                regexName.addFileNameRegex(".*\\.TXT");
            }

            MonitorBuilder builder = new MonitorBuilder(pathDirectory, timeTaskExecute, new NormalTaskMonitor(), TimeUnit.SECONDS);
            builder.addListener(fileListener);
            builder.setFileFilter(regexName);
            DirectoryMonitor monitor = builder.build();
            monitor.start();
        } catch (DirectoryMonitorException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void lectura_de_empresas() {
        File file = new File("Empresas.txt");

        try {
            Scanner scanner = new Scanner(file);

            //Lectura del archivo de empresas registro por registro.
            int i = 0;
            while (scanner.hasNextLine()) {
                String empresa = scanner.nextLine();
                i++;
                String nit_emisor_fel = empresa.split(",")[0];
                empresas.put(nit_emisor_fel, empresa);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo " + e.getMessage());
        }

    }

    public static void lectura_credenciales_api_dahop() {

        try {

            Properties configuracion = new Properties();

            configuracion.load(new FileInputStream("configuracion_servicio_dp.properties"));

            url_api_sap = configuracion.getProperty("url");
            usuario_sap = configuracion.getProperty("usuario");
            llave_sap = configuracion.getProperty("acceso");

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo de datos: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("Ocurrio un error, por favor revise lo siguiente: " + ex.getMessage());
        }

    }

    // 26-04-2019
    public static boolean conexion() {

        boolean respuestaConexion = false;

        if (conx == null) {

            try {

                conx = conexionRedis.conexion(ruta.getPath_nosql_db());
                respuestaConexion = conx.ping().equals("PONG");

            } catch (IOException es) {

                System.out.println("--> ¡Hubo un error! por favor revise lo siguiente: " + es.getMessage());
                respuestaConexion = false;
            }

        } else {

            try {
                respuestaConexion = conx.ping().equals("PONG");
            } catch (Exception es) {
                respuestaConexion = false;
            }

        }

        return respuestaConexion;
    }

    public static String ruta_personalizada_barc(String ruta_raiz, String categoria) {

        Date date = new Date(); // the date instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        java.text.SimpleDateFormat obtener_mes = new java.text.SimpleDateFormat("MM");

        anio = String.valueOf(calendar.get(Calendar.YEAR));

        String mes = String.valueOf(obtener_mes.format(calendar.getTime()));//String.valueOf(calendar.get(Calendar.MONTH));

        String dia = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));

        // ruta raiz
        // nit
        // año
        // mes 
        // dia
        String ruta_personalizada = ruta_raiz + "/" + nit_api + "/" + anio + "/" + mes + "/" + dia + "/" + categoria;

        if (categoria.equals("Correctos") || categoria.equals("Errores")) {

            ruta_personalizada = ruta_raiz + "/" + "Respuestas";

        }

        return ruta_personalizada.replace("\\", "/");
    }

    public static String ruta_personalizada_away(String ruta_raiz, String categoria, String agencia_way) {
        // ruta raiz
        // agencia way
        //String ruta_personalizada = ruta_raiz + "/" + agencia_way + "/" + categoria;
        String ruta_personalizada = "";

        if (categoria.equals("Correctos") || categoria.equals("PDF")) {

            if (tipo_transaccion.equals("ANULACION")) {
                ruta_personalizada = ruta_raiz + "/";

            } else {
                ruta_personalizada = ruta_raiz + "/" + agencia_way;

            }

        } else {
            ruta_personalizada = ruta_raiz;
        }

        return ruta_personalizada.replace("\\", "/");
    }

    public static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static boolean createDirTree(String dirPath) {
        boolean respuesta_metodo = false;

        if (dirPath != null && !"".equals(dirPath.trim())) {
            File dirFile = new File(dirPath);

            if (!dirFile.exists()) {
                boolean result = dirFile.mkdirs();
                if (result) {
                    System.out.println("--> Directorio " + dirPath + " creado correctamente. ");
                    respuesta_metodo = true;
                } else {
                    System.out.println("--> Directorio " + dirPath + " no pudo ser creado. ");
                }
            } else {
                System.out.println("--> Directorio " + dirPath + " ya existe. ");
                respuesta_metodo = true;
            }
        }
        return respuesta_metodo;
    }

}
