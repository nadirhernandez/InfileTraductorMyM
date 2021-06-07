package com.infile.motor.archivos;

import java.io.File;

public class EliminarArchivo {

    public void eliminar_archivo(String ruta_archivo_a_eliminar) {
        try {
            File eliminar_file = new File(ruta_archivo_a_eliminar);

            if (eliminar_file.delete()) {
                System.out.println("--> ["+eliminar_file.getName() + "] Eliminado de la carpeta Entrada!");
            } else {
                System.out.println("--> No ha sido posible eliminar de la carpeta Entrada.");
            }

        } catch (Exception ex) {
            System.out.println("--> Error al mover el archivo desde la carpeta de entrada:" + ex.getMessage());
        }
    }

}
