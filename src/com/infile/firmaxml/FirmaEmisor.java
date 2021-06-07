/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.firmaxml;

import com.fel.validaciones.documento.ConexionServicioFel;
import com.fel.validaciones.documento.RequestServicioFel;
import com.fel.validaciones.documento.RespuestaServicioFel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


public class FirmaEmisor {

    public RespuestaServicioFirma Firmar(String xml, String aliaspfx, String llave_pfx) throws UnsupportedEncodingException, KeyManagementException, NoSuchAlgorithmException {

        RespuestaServicioFirma respuesta = new RespuestaServicioFirma();

        //String url_servicio_firma = "http://10.27.172.8:8083/sign_solicitud_firmas/firma_xml";
        String url_servicio_firma = "https://signer-emisores.feel.com.gt/sign_solicitud_firmas/firma_xml";

        String es_anulacion = "N";

        if (xml.contains("GTAnulacionDocumento")) {

            es_anulacion = "S";
        }

        // Se codifica el xml en base64
        String encoded_xml = Base64.getEncoder().encodeToString(xml.getBytes("UTF-8"));

        // Se setean los datos para el json de request
        RequestServicioFirma request_firma = new RequestServicioFirma();
        request_firma.setAlias(aliaspfx);
        request_firma.setArchivo(encoded_xml);
        request_firma.setCodigo("");
        request_firma.setEs_anulacion(es_anulacion);
        request_firma.setLlave(llave_pfx);

        // Se arma el json para la comunicacion con el api de INFILE
        Gson gson_request_fel = new GsonBuilder().create();
        String json_fel = gson_request_fel.toJson(request_firma);
        //System.out.println("\n");
        //System.out.println(json_fel);

        
        
         try {
             
             
         /*
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        
        
        // Install the all-trusting trust manager
        final SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = (String hostname, SSLSession session) -> true;

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

       */

            URL url = new URL(url_servicio_firma);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

            String input = json_fel;

            OutputStream os = conn.getOutputStream();

            os.write(input.getBytes("UTF-8"));
            os.flush();

            int codigo_http = conn.getResponseCode();
            System.out.println("--> Codigo HTTP: " + codigo_http);

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            String json = "";

            while ((output = br.readLine()) != null) {

                json = output;

            }

            conn.disconnect();

            JsonParser jsonParser = new JsonParser();
            JsonObject respuesta_servicio_fel = (JsonObject) jsonParser.parse(json);
            JsonElement resultado = respuesta_servicio_fel.get("resultado");

            if (resultado != null) {

                Gson gson = new GsonBuilder().create();

                try {
                    respuesta = gson.fromJson(json, RespuestaServicioFirma.class);
                    respuesta.setJson_respuesta(json);

                    return respuesta;

                } catch (JsonSyntaxException e) {

                    RespuestaServicioFel respuesta_error = new RespuestaServicioFel();
                    respuesta_error.setInfo("1. Error de entrada de datos. " + e.getMessage());
                    respuesta.setJson_respuesta("1. Error de entrada de datos. " + e.getMessage());
                    respuesta.setResultado(false);
                    return respuesta;

                } catch (JsonParseException e) {

                    RespuestaServicioFel respuesta_error = new RespuestaServicioFel();
                    respuesta_error.setInfo("2. Error de entrada de datos. " + e.getMessage());
                    respuesta.setJson_respuesta("2. Error de entrada de datos. " + e.getMessage());
                    respuesta.setResultado(false);
                    return respuesta;
                }

            } else {

                RespuestaServicioFel respuesta_error = new RespuestaServicioFel();
                respuesta_error.setInfo("1. Error al intentar invocar el servicio Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + codigo_http);
                respuesta.setJson_respuesta(json);
                respuesta.setResultado(false);
                return respuesta;

            }

        } catch (MalformedURLException e) {
            RespuestaServicioFel respuesta_error = new RespuestaServicioFel();
            respuesta_error.setInfo("2.  Error al intentar invocar el servicio de Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + e.getMessage());
            respuesta.setJson_respuesta("");
            respuesta.setResultado(false);
            return respuesta;

        } catch (IOException e) {
            RespuestaServicioFel respuesta_error = new RespuestaServicioFel();
            respuesta_error.setInfo("3.  Error al intentar invocar el servicio Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + e.getMessage());
            respuesta.setJson_respuesta("");
            respuesta.setResultado(false);
            return respuesta;

        }

    }

}
