//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.08 a las 11:40:21 AM CST 
//


package com.clases.fel.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoImpuesto.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoImpuesto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IVA"/>
 *     &lt;enumeration value="PETROLEO"/>
 *     &lt;enumeration value="TURISMO HOSPEDAJE"/>
 *     &lt;enumeration value="TURISMO PASAJES"/>
 *     &lt;enumeration value="TIMBRE DE PRENSA"/>
 *     &lt;enumeration value="BOMBEROS"/>
 *     &lt;enumeration value="TASA MUNICIPAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoImpuesto", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
@XmlEnum
public enum TipoImpuesto {

    IVA("IVA"),
    PETROLEO("PETROLEO"),
    @XmlEnumValue("TURISMO HOSPEDAJE")
    TURISMO_HOSPEDAJE("TURISMO HOSPEDAJE"),
    @XmlEnumValue("TURISMO PASAJES")
    TURISMO_PASAJES("TURISMO PASAJES"),
    @XmlEnumValue("TIMBRE DE PRENSA")
    TIMBRE_DE_PRENSA("TIMBRE DE PRENSA"),
    BOMBEROS("BOMBEROS"),
    @XmlEnumValue("TASA MUNICIPAL")
    TASA_MUNICIPAL("TASA MUNICIPAL");
    private final String value;

    TipoImpuesto(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoImpuesto fromValue(String v) {
        for (TipoImpuesto c: TipoImpuesto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
