/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc.sap.document.sap_com;

import functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_BindingStub;
import functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_Service;
import functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_ServiceLocator;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class WsFeel {

    private String usuario;
    private String password;
    private String url_api_sap;
    private RetroalimentacionSap datos_para_sap;

    public RetroalimentacionSap getDatos_para_sap() {
        return datos_para_sap;
    }

    public void setDatos_para_sap(RetroalimentacionSap datos_para_sap) {
        this.datos_para_sap = datos_para_sap;
    }

    public String getUrl_api_sap() {
        return url_api_sap;
    }

    public void setUrl_api_sap(String url_api_sap) {
        this.url_api_sap = url_api_sap;
    }

    private javax.xml.rpc.holders.StringHolder estado_servicio = new javax.xml.rpc.holders.StringHolder();

    private javax.xml.rpc.holders.StringHolder mensajeRetorno = new javax.xml.rpc.holders.StringHolder();

    public WsFeel(String usuarioP, String passwordP, String url, RetroalimentacionSap datos) {

        usuario = usuarioP;
        password = passwordP;
        url_api_sap = url;
        datos_para_sap = datos;
    }

    public RespuestaApiSap consumirFeel() throws Exception {

        RespuestaApiSap respuesta = new RespuestaApiSap();
        System.out.println("--> Username " + usuario);
        System.out.println("--> Password " + password);
        System.out.println("--> URL API SAP " + url_api_sap);


        try {

            ZMF_FEL_ADDATFEL_ServiceLocator service_locator = new ZMF_FEL_ADDATFEL_ServiceLocator();

            service_locator.setUrl_servicio_web(url_api_sap);

            ZMF_FEL_ADDATFEL_Service servicio = service_locator;

            ZMF_FEL_ADDATFEL_BindingStub bind = (ZMF_FEL_ADDATFEL_BindingStub) servicio.getZMF_FEL_ADDATFEL();

            bind.setUsername(usuario);

            bind.setPassword(password);

            //bind.ZMF_FEL_ADDATFEL("", "123456", "**PRUEBAS**", "A-B-C-D", "6075000625", mensajeRetorno, estado_servicio);
            bind.ZMF_FEL_ADDATFEL(datos_para_sap.getERROR(), datos_para_sap.getNDOC(), datos_para_sap.getSERIE(), datos_para_sap.getUUID(), datos_para_sap.getVBELN(), mensajeRetorno, estado_servicio);

            respuesta.setCantidad_registros(estado_servicio.value);
            respuesta.setMensaje_retorno(mensajeRetorno.value);

        } catch (IOException e) {

            respuesta.setCantidad_registros("--> EX");
            respuesta.setMensaje_retorno("--> Ocurrio un error, por favor revise lo siguiente: " + e.getMessage());
        }

        return respuesta;
    }

    public javax.xml.rpc.holders.StringHolder getCantidadRegistros() {

        return estado_servicio;

    }

    public void setCantidadRegistros(javax.xml.rpc.holders.StringHolder cantidadRegistros) {

        this.estado_servicio = cantidadRegistros;

    }

    public javax.xml.rpc.holders.StringHolder getMensajeRetorno() {

        return mensajeRetorno;

    }

    public void setMensajeRetorno(javax.xml.rpc.holders.StringHolder mensajeRetorno) {

        this.mensajeRetorno = mensajeRetorno;

    }

}
