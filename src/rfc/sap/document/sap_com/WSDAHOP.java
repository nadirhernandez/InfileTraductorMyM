/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc.sap.document.sap_com;

import java.io.FileInputStream;
import java.util.Properties;


public class WSDAHOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RespuestaApiSap resultado = new RespuestaApiSap();
        RetroalimentacionSap datos = new RetroalimentacionSap();
                
        try {
            
            Properties configuracion = new Properties();

            configuracion.load(new FileInputStream("C:\\FEL\\configuracion_servicio_dp.properties"));

            String urlStr = configuracion.getProperty("url");
            String username = configuracion.getProperty("usuario");
            String acceso = configuracion.getProperty("acceso");

            datos.setERROR("");
            datos.setNDOC("");
            datos.setSERIE("");
            datos.setUUID("");
            datos.setVBELN("");
            
            WsFeel ws = new WsFeel(username,acceso, urlStr,datos);

            resultado = ws.consumirFeel();

            System.out.println("Estado: " + resultado.getCantidad_registros());
            
            System.out.println("Mensaje: " + resultado.getMensaje_retorno());

        } catch (Exception e) {

            System.out.println("Ocurrio un error por favor revise lo siguiente: " + e.getMessage());
        }

    }

}
