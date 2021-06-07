//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.08 a las 11:40:21 AM CST 
//


package com.clases.fel.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetencionISR" type="{http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0}NonNegativeFloat"/>
 *         &lt;element name="RetencionIVA" type="{http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0}NonNegativeFloat" minOccurs="0"/>
 *         &lt;element name="TotalMenosRetenciones" type="{http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0}NonNegativeFloat"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0}VersionType" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retencionISR",
    "retencionIVA",
    "totalMenosRetenciones"
})
@XmlRootElement(name = "RetencionesFacturaEspecial", namespace = "http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0")
public class RetencionesFacturaEspecial {

    @XmlElement(name = "RetencionISR", namespace = "http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0")
    protected float retencionISR;
    @XmlElement(name = "RetencionIVA", namespace = "http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0")
    protected Float retencionIVA;
    @XmlElement(name = "TotalMenosRetenciones", namespace = "http://www.sat.gob.gt/face2/ComplementoFacturaEspecial/0.1.0")
    protected float totalMenosRetenciones;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad retencionISR.
     * 
     */
    public float getRetencionISR() {
        return retencionISR;
    }

    /**
     * Define el valor de la propiedad retencionISR.
     * 
     */
    public void setRetencionISR(float value) {
        this.retencionISR = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionIVA.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetencionIVA() {
        return retencionIVA;
    }

    /**
     * Define el valor de la propiedad retencionIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetencionIVA(Float value) {
        this.retencionIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMenosRetenciones.
     * 
     */
    public float getTotalMenosRetenciones() {
        return totalMenosRetenciones;
    }

    /**
     * Define el valor de la propiedad totalMenosRetenciones.
     * 
     */
    public void setTotalMenosRetenciones(float value) {
        this.totalMenosRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
