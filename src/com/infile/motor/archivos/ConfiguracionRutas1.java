package com.infile.motor.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracionRutas1 {

    // Ruta de carpetas para la lectura de archivos.
    private String entrada = "";
    private String errores_traduccion = "";
    private String errores_esquema = "";
    private String errores_servicio = "";
    private String errores_lectura = "";
    private String errores_internos = "";
    private String correctos = "";
    private String archivos_pdf = "";
    private String archivos_xml = "";
    private String tiempo_espera = "";

    private String modalidad_archivos= "";

    //Configuraciones adicionales
    private String identificador_cliente = "";
    private String copias_activas = "";
    private String codificacion = "";
    private String path_nosql_db = "";
    private String respuesta_agrupada = "";
    private String identificador_en_respuesta = "";

    //Archivos de respuesta 
    private String xml = "";
    private String pdf = "";
    private String txt = "";
    

    
    public String getTiempo_espera() {
        return tiempo_espera;
    }

    public void setTiempo_espera(String tiempo_espera) {
        this.tiempo_espera = tiempo_espera;
    }

    
    public String getModalidad_archivos() {
        return modalidad_archivos;
    }

    public void setModalidad_archivos(String modalidad_archivos) {
        this.modalidad_archivos = modalidad_archivos;
    }
    
    public String getIdentificador_en_respuesta() {
        return identificador_en_respuesta;
    }

    public void setIdentificador_en_respuesta(String identificador_en_respuesta) {
        this.identificador_en_respuesta = identificador_en_respuesta;
    }

    public String getRespuesta_agrupada() {
        return respuesta_agrupada;
    }

    public void setRespuesta_agrupada(String respuesta_agrupada) {
        this.respuesta_agrupada = respuesta_agrupada;
    }

    public String getPath_nosql_db() {
        return path_nosql_db;
    }

    public void setPath_nosql_db(String path_nosql_db) {
        this.path_nosql_db = path_nosql_db;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getCodificacion() {
        return codificacion;
    }

    public void setCodificacion(String codificacion) {
        this.codificacion = codificacion;
    }

    public String getIdentificador_cliente() {
        return identificador_cliente;
    }

    public void setIdentificador_cliente(String identificador_cliente) {
        this.identificador_cliente = identificador_cliente;
    }

    public String getCopias_activas() {
        return copias_activas;
    }

    public void setCopias_activas(String copias_activas) {
        this.copias_activas = copias_activas;
    }

    public String getArchivos_pdf() {
        return archivos_pdf;
    }

    public void setArchivos_pdf(String archivos_pdf) {
        this.archivos_pdf = archivos_pdf;
    }

    public String getArchivos_xml() {
        return archivos_xml;
    }

    public void setArchivos_xml(String archivos_xml) {
        this.archivos_xml = archivos_xml;
    }

    public String getErrores_lectura() {
        return errores_lectura;
    }

    public void setErrores_lectura(String errores_lectura) {
        this.errores_lectura = errores_lectura;
    }

    public String getErrores_internos() {
        return errores_internos;
    }

    public void setErrores_internos(String errores_internos) {
        this.errores_internos = errores_internos;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getErrores_traduccion() {
        return errores_traduccion;
    }

    public void setErrores_traduccion(String errores_traduccion) {
        this.errores_traduccion = errores_traduccion;
    }

    public String getErrores_esquema() {
        return errores_esquema;
    }

    public void setErrores_esquema(String errores_esquema) {
        this.errores_esquema = errores_esquema;
    }

    public String getErrores_servicio() {
        return errores_servicio;
    }

    public void setErrores_servicio(String errores_servicio) {
        this.errores_servicio = errores_servicio;
    }

    public String getCorrectos() {
        return correctos;
    }

    public void setCorrectos(String correctos) {
        this.correctos = correctos;
    }

    Properties configuracion = new Properties();

    public ConfiguracionRutas1() throws FileNotFoundException, IOException {

        configuracion.load(new FileInputStream("Settings.properties"));

        // Ruta de carpetas para la lectura de archivos.
        entrada = configuracion.getProperty("carpeta_entrada");
        errores_traduccion = configuracion.getProperty("carpeta_error_traduccion");
        errores_esquema = configuracion.getProperty("carpeta_error_esquema");
        errores_servicio = configuracion.getProperty("carpeta_error_servicio");
        errores_lectura = configuracion.getProperty("carpeta_error_lectura");
        correctos = configuracion.getProperty("carpeta_correctos");
        archivos_pdf = configuracion.getProperty("carpeta_archivos_pdf");
        archivos_xml = configuracion.getProperty("carpeta_archivos_xml");
               
    }

    public void settings() {

        // Archivos de Respuesta
        xml = configuracion.getProperty("XML_JSON");
        if (xml == null) {
            xml = "SI";
        }
        pdf = configuracion.getProperty("PDF");
        if (pdf == null) {
            pdf = "SI";
        }
        txt = configuracion.getProperty("TXT");
        if (txt == null) {
            txt = "SI";
        }
        
        //Configuraciones adicionales
        copias_activas = configuracion.getProperty("copias_activas");
        if ((copias_activas == null) || (copias_activas.isEmpty())) {
            copias_activas = "NO";
        }
        identificador_cliente = configuracion.getProperty("identificador_cliente");
        if ((identificador_cliente == null) || (identificador_cliente.isEmpty())) {
            identificador_cliente = "relouh3o59678";
        }

        codificacion = configuracion.getProperty("codificacion");
        if ((codificacion == null) || (codificacion.isEmpty())) {
            codificacion = "UTF-8";
        }

        path_nosql_db = configuracion.getProperty("no_sql_db");
        if ((path_nosql_db == null) || (path_nosql_db.isEmpty())) {
            path_nosql_db = "localhost";
        }

        respuesta_agrupada = configuracion.getProperty("respuesta_agrupada");
        if ((respuesta_agrupada == null) || (respuesta_agrupada.isEmpty())) {
            respuesta_agrupada = "NO";
        }
        
        identificador_en_respuesta = configuracion.getProperty("identificador_en_respuesta");
        if ((identificador_en_respuesta == null) || (identificador_en_respuesta.isEmpty())) {
            identificador_en_respuesta = "NO";
        }
        
        
         modalidad_archivos = configuracion.getProperty("modalidad_archivos");
        if ((modalidad_archivos == null) || (modalidad_archivos.isEmpty())) {
            modalidad_archivos = "TXT";
        }
        
         tiempo_espera = configuracion.getProperty("tiempo_espera");
        if ((tiempo_espera == null) || (tiempo_espera.isEmpty())) {
            tiempo_espera = "0";
        }
        

    }

}
