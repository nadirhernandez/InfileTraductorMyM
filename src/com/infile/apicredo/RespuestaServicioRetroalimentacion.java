/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.apicredo;


public class RespuestaServicioRetroalimentacion {

    private boolean resultado;
    private String descripcion;
    private int codigo_http;

    public int getCodigo_http() {
        return codigo_http;
    }

    public void setCodigo_http(int codigo_http) {
        this.codigo_http = codigo_http;
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

}
