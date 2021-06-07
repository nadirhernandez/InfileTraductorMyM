/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.logic;

import com.infile.traductor.ResultadoParse;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.net.URL;
import org.xml.sax.SAXException;
//import java.io.File; // if you use File
import java.io.IOException;
import java.net.MalformedURLException;


public class TestLogicom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, MalformedURLException {

        String nombre_xml_procesar = "";

        // ============= VALIDACION DE XML CONTRA ESQUEMA XSD =============
        //URL schemaFile = new URL("http://host:port/filename.xsd");
        // webapp example xsd: 
        // URL schemaFile = new URL("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
        // local file example:
        File schemaFile = new File("C:\\Users\\nadir\\OneDrive\\Documentos\\Proyecto Logicom\\EsquemaLogicom.xsd"); // etc.
        Source xmlFile = new StreamSource(new File("C:\\Users\\nadir\\OneDrive\\Documentos\\Proyecto Logicom\\XML\\NTS_GT3YWH_3YG2594227_1.xml"));

        nombre_xml_procesar = xmlFile.getSystemId();

        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " Es valido");
        } catch (SAXException e) {
            System.out.println(xmlFile.getSystemId() + " No cumple con el esquema:" + e);
        } catch (IOException e) {
        }
        // ================================================================

        File file = new File("C:\\Users\\nadir\\OneDrive\\Documentos\\Proyecto Logicom\\XML\\NTS_GT3YWH_3YG2594227_1.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Order order = (Order) unmarshaller.unmarshal(file);

        System.out.println(order.getOrderHeader().getOrgInformation().getOrgName());

        LogicomToFel logicom_to_fel = new LogicomToFel();
        ResultadoParse resultado_parse = new ResultadoParse();
        resultado_parse = logicom_to_fel.convertir(order, nombre_xml_procesar);

        System.out.println(resultado_parse.getDescripcion());

        // Despues de procesarlos el objeto queda en null
        logicom_to_fel = null;
        resultado_parse = null;

    }

}
