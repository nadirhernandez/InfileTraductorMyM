//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.08 a las 11:40:21 AM CST 
//


package com.clases.fel.xsd;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RegimenAntiguo">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Antiguo"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NumeroAutorizacionDocumentoOrigen" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;pattern value="[0-9A-F]{8}-([0-9A-F]{4}-){3}[0-9A-F]{12}|([2]{1}[0-9]{3}-[1-9]{1}[0-9]{0,2}-[1-9]{1}[0-9]{0,6}-[1-9]{1}[0-9]{0,6})"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FechaEmisionDocumentoOrigen" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="MotivoAjuste">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="200"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SerieDocumentoOrigen">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="20"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NumeroDocumentoOrigen" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ReferenciasNota", namespace = "http://www.sat.gob.gt/face2/ComplementoReferenciaNota/0.1.0")
public class ReferenciasNota {

    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "RegimenAntiguo")
    protected String regimenAntiguo;
    @XmlAttribute(name = "NumeroAutorizacionDocumentoOrigen", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numeroAutorizacionDocumentoOrigen;
    @XmlAttribute(name = "FechaEmisionDocumentoOrigen", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmisionDocumentoOrigen;
    @XmlAttribute(name = "MotivoAjuste")
    protected String motivoAjuste;
    @XmlAttribute(name = "SerieDocumentoOrigen")
    protected String serieDocumentoOrigen;
    @XmlAttribute(name = "NumeroDocumentoOrigen")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroDocumentoOrigen;

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenAntiguo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenAntiguo() {
        return regimenAntiguo;
    }

    /**
     * Define el valor de la propiedad regimenAntiguo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenAntiguo(String value) {
        this.regimenAntiguo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAutorizacionDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacionDocumentoOrigen() {
        return numeroAutorizacionDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad numeroAutorizacionDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacionDocumentoOrigen(String value) {
        this.numeroAutorizacionDocumentoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionDocumentoOrigen() {
        return fechaEmisionDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad fechaEmisionDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionDocumentoOrigen(XMLGregorianCalendar value) {
        this.fechaEmisionDocumentoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoAjuste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoAjuste() {
        return motivoAjuste;
    }

    /**
     * Define el valor de la propiedad motivoAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoAjuste(String value) {
        this.motivoAjuste = value;
    }

    /**
     * Obtiene el valor de la propiedad serieDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieDocumentoOrigen() {
        return serieDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad serieDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieDocumentoOrigen(String value) {
        this.serieDocumentoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumentoOrigen() {
        return numeroDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad numeroDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumentoOrigen(String value) {
        this.numeroDocumentoOrigen = value;
    }

}
