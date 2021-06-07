/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.firmaxml;


public class RespuestaServicioFirma {

    private boolean resultado;
    private String descripcion;
    private String archivo;
    private String json_respuesta = "";

    public String getJson_respuesta() {
        return json_respuesta;
    }

    public void setJson_respuesta(String json_respuesta) {
        this.json_respuesta = json_respuesta;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
