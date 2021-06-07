/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.firmaxml;


public class RequestServicioFirma {
    
    private String llave;
    private String archivo;
    private String codigo;
    private String alias;
    private String es_anulacion;

    
    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEs_anulacion() {
        return es_anulacion;
    }

    public void setEs_anulacion(String es_anulacion) {
        this.es_anulacion = es_anulacion;
    }

    
}
