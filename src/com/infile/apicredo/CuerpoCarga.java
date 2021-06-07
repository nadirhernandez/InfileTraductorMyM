/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.apicredo;


public class CuerpoCarga {

    private String lote;
    private String documento;
    private String uuid;
    private String serie;
    private String numero;
    private String estado;
    private String fecha;
    private String descripcion_errores;

    private String nit_emisor;
    private String establecimiento;
    private String tipo_documento;

    public String getNit_emisor() {
        return nit_emisor;
    }

    public void setNit_emisor(String nit_emisor) {
        this.nit_emisor = nit_emisor;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion_errores() {
        return descripcion_errores;
    }

    public void setDescripcion_errores(String descripcion_errores) {
        this.descripcion_errores = descripcion_errores;
    }

}
