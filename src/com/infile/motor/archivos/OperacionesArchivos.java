package com.infile.motor.archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class OperacionesArchivos {

    public static void mover_archivo(String origen, String destino, String cliente) {

        try {

            //cliente = "mms8754169711";
            FileOutputStream fos;
            
            //System.out.println("ORIGEN " + origen);
            String[] ruta_destino = destino.split("/");
            //System.out.println("DESTINO " + ruta_destino[ruta_destino.length-1] );
            
             if (cliente.equals("mms8754169711")) {
                    destino = destino.replace(ruta_destino[ruta_destino.length-1], ruta_destino[ruta_destino.length-1].replace(".txt","") + "_ORIGINAL.txt");
                }
             
           //System.out.println("DESTINO NUEVO " + destino );

             
            try (FileInputStream fis = new FileInputStream(origen)) {
                fos = new FileOutputStream(destino);
                FileChannel channel = fis.getChannel();
                FileChannel channel_destino = fos.getChannel();
                channel.transferTo(0L, channel.size(), channel_destino);
            }
            fos.close();

        } catch (IOException ex) {
            System.out.println("Error al procesar el archivo: [" + ex.getMessage()+"]");
        }
    }
    
    
    
    
    
}
