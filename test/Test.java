/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fel.validaciones.documento.ComplementoCambiaria;
import com.fel.validaciones.documento.DocumentoFel;
import com.infile.traductor.Parseo;
import com.infile.traductor.ResultadoParse;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class Test {

    public static void main(final String[] arguments) throws FileNotFoundException {
     /*   try {
           /* File file = new File("C:\\PruebasFuncionales/test_csv_2.txt");
            FileInputStream fileStream = new FileInputStream(file);

            Parseo parseo = new Parseo();

            ResultadoParse resultado_parse = parseo.procesar(fileStream);

            DocumentoFel doc_fel = new DocumentoFel();
            doc_fel = (DocumentoFel) resultado_parse.getDocumento_fel();
            
            System.out.println(resultado_parse.getResultado());

            if (resultado_parse.getResultado()) {
                System.out.println(resultado_parse.getDescripcion());

                //System.out.println(resultado_parse.getDocumento_fel().getItems().size());
                for (int i = 0; i < doc_fel.getItems().size(); i++) {
                    System.out.println("--> Detalle No " + resultado_parse.getDocumento_fel().getItems().get(i).getNumeroLinea());

                    System.out.println("   --> Impuestos encontrados " + resultado_parse.getDocumento_fel().getItems().get(i).getImpuestos_detalle().size());

                    for (int j = 0; j < resultado_parse.getDocumento_fel().getItems().get(i).getImpuestos_detalle().size(); j++) {
                        System.out.println("   --> Descripcion " + resultado_parse.getDocumento_fel().getItems().get(i).getImpuestos_detalle().get(j).getNombreCorto());

                    }

                }

                System.out.println("   --> Frases encontradas " + resultado_parse.getDocumento_fel().getFrases().size());

                for (int f = 0; f < resultado_parse.getDocumento_fel().getFrases().size(); f++) {
                    System.out.println("   --> Frase: " + resultado_parse.getDocumento_fel().getFrases().get(f).getTipoFrase());
                    System.out.println("   --> Escenario: " + resultado_parse.getDocumento_fel().getFrases().get(f).getCodigoEscenario());

                }

                System.out.println("   --> Cantidad de Adendas Encontradas " + resultado_parse.getDocumento_fel().getAdenda().getAdenda().size());

                resultado_parse.getDocumento_fel().getAdenda().getAdenda().entrySet().forEach((m) -> {
                    System.out.println("Adenda --> Nombre: " + m.getKey().toLowerCase() + " Valor: " + m.getValue());
                });

                System.out.println("   --> Complementos: " + resultado_parse.getDocumento_fel().getComplementos().size());

                System.out.println(resultado_parse.getDocumento_fel().getComplementos().get(0).getClass().getSimpleName());

                ComplementoCambiaria cambiaria_obj = (ComplementoCambiaria) resultado_parse.getDocumento_fel().getComplementos().get(0);
                System.out.println("   --> Nombre: " + cambiaria_obj.getNombreComplemento());

                if ("ComplementoCambiaria".equals(resultado_parse.getDocumento_fel().getComplementos().get(0).getClass().getSimpleName())) {
                    ComplementoCambiaria cambiaria = (ComplementoCambiaria) resultado_parse.getDocumento_fel().getComplementos().get(0);
                    int cantidad_abonos = cambiaria.getAbono().size();
                    System.out.println("Abonos: " + cantidad_abonos);
                }

            } else {
                System.out.println(resultado_parse.getDescripcion());

                for (int i = 0; i < resultado_parse.getLista_errores().size(); i++) {
                    System.out.println(resultado_parse.getLista_errores().get(i));
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error : " + ex.getMessage());

        }*/
    }
}
