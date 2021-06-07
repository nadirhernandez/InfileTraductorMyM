/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.traductor;

import java.util.ArrayList;
import java.util.List;

public class ResultadoParse {

    private boolean resultado;
    private final List<String> lista_errores = new ArrayList<>();
    private Object documento_fel;
    private String descripcion;
    private String uuid;
    private String tipo_transaccion;
    private String tipo_documento;
    private String nit_empresa;
    private String codigo_establecimiento;
    private String numero_acceso;
    private String uuid_documento_origen;
    private String id_receptor;
    private String gran_total;

    
    public String getId_receptor() {
        return id_receptor;
    }

    public void setId_receptor(String id_receptor) {
        this.id_receptor = id_receptor;
    }

    public String getGran_total() {
        return gran_total;
    }

    public void setGran_total(String gran_total) {
        this.gran_total = gran_total;
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

    public String getNit_empresa() {
        return nit_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }
  

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean getResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public List<String> getLista_errores() {
        return lista_errores;
    }

    public void setLista_errores(String lista_errores) {
        this.lista_errores.add(lista_errores);
    }

    public Object getDocumento_fel() {
        return documento_fel;
    }

    public void setDocumento_fel(Object documento_fel) {
        this.documento_fel = documento_fel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
