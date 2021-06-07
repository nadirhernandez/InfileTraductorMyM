


package com.clases.fel.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;sequence>
 *         &lt;element name="Abono" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumeroAbono">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;totalDigits value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="MontoAbono" type="{http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0}NonNegativeFloat"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0}VersionType" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abono"
})
@XmlRootElement(name = "AbonosFacturaCambiaria", namespace = "http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0")
public class AbonosFacturaCambiaria {

    @XmlElement(name = "Abono", namespace = "http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0", required = true)
    protected List<AbonosFacturaCambiaria.Abono> abono;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the abono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbonosFacturaCambiaria.Abono }
     * 
     * 
     */
    public List<AbonosFacturaCambiaria.Abono> getAbono() {
        if (abono == null) {
            abono = new ArrayList<AbonosFacturaCambiaria.Abono>();
        }
        return this.abono;
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
     *         &lt;element name="NumeroAbono">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;totalDigits value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="MontoAbono" type="{http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0}NonNegativeFloat"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numeroAbono",
        "fechaVencimiento",
        "montoAbono"
    })
    public static class Abono {

        @XmlElement(name = "NumeroAbono", namespace = "http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0")
        protected int numeroAbono;
        @XmlElement(name = "FechaVencimiento", namespace = "http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaVencimiento;
        @XmlElement(name = "MontoAbono", namespace = "http://www.sat.gob.gt/dte/fel/CompCambiaria/0.1.0")
        protected float montoAbono;

        /**
         * Obtiene el valor de la propiedad numeroAbono.
         * 
         */
        public int getNumeroAbono() {
            return numeroAbono;
        }

        /**
         * Define el valor de la propiedad numeroAbono.
         * 
         */
        public void setNumeroAbono(int value) {
            this.numeroAbono = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaVencimiento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaVencimiento() {
            return fechaVencimiento;
        }

        /**
         * Define el valor de la propiedad fechaVencimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaVencimiento(XMLGregorianCalendar value) {
            this.fechaVencimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad montoAbono.
         * 
         */
        public float getMontoAbono() {
            return montoAbono;
        }

        /**
         * Define el valor de la propiedad montoAbono.
         * 
         */
        public void setMontoAbono(float value) {
            this.montoAbono = value;
        }

    }

}
