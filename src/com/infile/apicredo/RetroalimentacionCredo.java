/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.apicredo;

import com.infile.firmaxml.*;
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

public class RetroalimentacionCredo {

    public RespuestaServicioRetroalimentacion guardar(String jsonApiRetroalimentacion, String lote) throws UnsupportedEncodingException, NoSuchAlgorithmException, KeyManagementException {

        RespuestaServicioRetroalimentacion respuesta = new RespuestaServicioRetroalimentacion();
        int codigo_http = 0;
        String url_servicio_firma = "http://localhost:8080/resultado_cargas/registrar";
        //String url_servicio_firma = "http://172.30.95.27:8080/resultado_cargas/registrar";

        try {

            URL url = new URL(url_servicio_firma);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

            String input = jsonApiRetroalimentacion;

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes("UTF-8"));
            os.flush();

            codigo_http = conn.getResponseCode();
            System.out.println("--> Codigo HTTP: " + codigo_http);

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            String json = "";

            while ((output = br.readLine()) != null) {

                json = output;

            }

            conn.disconnect();

            JsonParser jsonParser = new JsonParser();
            JsonObject RespuestaServicioRetroalimentacion = (JsonObject) jsonParser.parse(json);
            JsonElement resultado = RespuestaServicioRetroalimentacion.get("resultado");

            if (resultado != null) {

                Gson gson = new GsonBuilder().create();

                try {
                    respuesta = gson.fromJson(json, RespuestaServicioRetroalimentacion.class);

                    System.out.println("--> Respuesta: " + json);
                    respuesta.setCodigo_http(codigo_http);
                    return respuesta;

                } catch (JsonSyntaxException e) {

                    RespuestaServicioRetroalimentacion respuesta_error = new RespuestaServicioRetroalimentacion();
                    respuesta_error.setDescripcion("1. Error de entrada de datos. " + e.getMessage());
                    respuesta.setResultado(false);
                    respuesta.setCodigo_http(codigo_http);

                    return respuesta;

                } catch (JsonParseException e) {

                    RespuestaServicioRetroalimentacion respuesta_error = new RespuestaServicioRetroalimentacion();
                    respuesta_error.setDescripcion("2. Error de entrada de datos. " + e.getMessage());
                    respuesta.setResultado(false);
                    respuesta.setCodigo_http(codigo_http);

                    return respuesta;
                }

            } else {

                RespuestaServicioRetroalimentacion respuesta_error = new RespuestaServicioRetroalimentacion();
                respuesta_error.setDescripcion("1. Error al intentar invocar el servicio Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + codigo_http);
                respuesta.setResultado(false);
                respuesta.setCodigo_http(codigo_http);

                return respuesta;

            }

        } catch (MalformedURLException e) {
            RespuestaServicioRetroalimentacion respuesta_error = new RespuestaServicioRetroalimentacion();
            respuesta_error.setDescripcion("2.  Error al intentar invocar el servicio de Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + e.getMessage());
            respuesta.setResultado(false);
            respuesta.setCodigo_http(codigo_http);
            return respuesta;

        } catch (IOException e) {
            RespuestaServicioRetroalimentacion respuesta_error = new RespuestaServicioRetroalimentacion();
            respuesta_error.setDescripcion("3.  Error al intentar invocar el servicio Firma del Emisor. Este equipo tiene incovenientes de comunicacion. " + e.getMessage());
            respuesta.setResultado(false);
            respuesta.setCodigo_http(codigo_http);
            return respuesta;

        }

    }

}
