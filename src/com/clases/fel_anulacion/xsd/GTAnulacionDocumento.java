//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.08 a las 12:01:27 PM CST 
//


package com.clases.fel_anulacion.xsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;sequence>
 *         &lt;element name="SAT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AnulacionDTE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DatosGenerales">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosAnulacion" />
 *                                     &lt;attribute name="NumeroDocumentoAAnular" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoUUID" />
 *                                     &lt;attribute name="NITEmisor" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="IDReceptor" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
 *                                           &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)"/>
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="FechaEmisionDocumentoAnular" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                           &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="FechaHoraAnulacion" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                           &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MotivoAnulacion" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="255"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Certificacion" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NITCertificador">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="13"/>
 *                                             &lt;whiteSpace value="collapse"/>
 *                                             &lt;pattern value="([1-9])+([0-9])*([0-9]|K)"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="NombreCertificador">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="255"/>
 *                                             &lt;whiteSpace value="collapse"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="FechaHoraCertificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosCertificados" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="0.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "GTAnulacionDocumento", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
public class GTAnulacionDocumento {

    @XmlElementRefs({
        @XmlElementRef(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SAT", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Signature" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 150 de file:/home/rene/Software/JDK/jdk1.8.0_91/bin/esquemas_fel/GT_AnulacionDocumento-0.1.0.xsd
     * línea 149 de file:/home/rene/Software/JDK/jdk1.8.0_91/bin/esquemas_fel/GT_AnulacionDocumento-0.1.0.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GTAnulacionDocumento.SAT }{@code >}
     * {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("0.1");
        } else {
            return version;
        }
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AnulacionDTE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DatosGenerales">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosAnulacion" />
     *                           &lt;attribute name="NumeroDocumentoAAnular" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoUUID" />
     *                           &lt;attribute name="NITEmisor" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="IDReceptor" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
     *                                 &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="FechaEmisionDocumentoAnular" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                                 &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="FechaHoraAnulacion" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                                 &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MotivoAnulacion" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="255"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Certificacion" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NITCertificador">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="13"/>
     *                                   &lt;whiteSpace value="collapse"/>
     *                                   &lt;pattern value="([1-9])+([0-9])*([0-9]|K)"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="NombreCertificador">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="255"/>
     *                                   &lt;whiteSpace value="collapse"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="FechaHoraCertificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosCertificados" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "anulacionDTE"
    })
    public static class SAT_ANULACION {

        @XmlElement(name = "AnulacionDTE", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
        protected GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE anulacionDTE;

        /**
         * Obtiene el valor de la propiedad anulacionDTE.
         * 
         * @return
         *     possible object is
         *     {@link GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE }
         *     
         */
        public GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE getAnulacionDTE() {
            return anulacionDTE;
        }

        /**
         * Define el valor de la propiedad anulacionDTE.
         * 
         * @param value
         *     allowed object is
         *     {@link GTAnulacionDocumento.SAT.AnulacionDTE }
         *     
         */
        public void setAnulacionDTE(GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE value) {
            this.anulacionDTE = value;
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
         *         &lt;element name="DatosGenerales">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosAnulacion" />
         *                 &lt;attribute name="NumeroDocumentoAAnular" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoUUID" />
         *                 &lt;attribute name="NITEmisor" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="IDReceptor" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
         *                       &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="FechaEmisionDocumentoAnular" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *                       &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="FechaHoraAnulacion" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *                       &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MotivoAnulacion" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="255"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Certificacion" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NITCertificador">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="13"/>
         *                         &lt;whiteSpace value="collapse"/>
         *                         &lt;pattern value="([1-9])+([0-9])*([0-9]|K)"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="NombreCertificador">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="255"/>
         *                         &lt;whiteSpace value="collapse"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="FechaHoraCertificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosCertificados" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "datosGenerales",
            "certificacion"
        })
        public static class AnulacionDTE {

            @XmlElement(name = "DatosGenerales", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
            protected GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.DatosGenerales datosGenerales;
            @XmlElement(name = "Certificacion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
            protected GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.Certificacion certificacion;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String id;

            /**
             * Obtiene el valor de la propiedad datosGenerales.
             * 
             * @return
             *     possible object is
             *     {@link GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.DatosGenerales }
             *     
             */
            public GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.DatosGenerales getDatosGenerales() {
                return datosGenerales;
            }

            /**
             * Define el valor de la propiedad datosGenerales.
             * 
             * @param value
             *     allowed object is
             *     {@link GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.DatosGenerales }
             *     
             */
            public void setDatosGenerales(GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.DatosGenerales value) {
                this.datosGenerales = value;
            }

            /**
             * Obtiene el valor de la propiedad certificacion.
             * 
             * @return
             *     possible object is
             *     {@link GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.Certificacion }
             *     
             */
            public GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.Certificacion getCertificacion() {
                return certificacion;
            }

            /**
             * Define el valor de la propiedad certificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.Certificacion }
             *     
             */
            public void setCertificacion(GTAnulacionDocumento.SAT_ANULACION.AnulacionDTE.Certificacion value) {
                this.certificacion = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                if (id == null) {
                    return "DatosCertificados";
                } else {
                    return id;
                }
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
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
             *         &lt;element name="NITCertificador">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="13"/>
             *               &lt;whiteSpace value="collapse"/>
             *               &lt;pattern value="([1-9])+([0-9])*([0-9]|K)"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NombreCertificador">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="255"/>
             *               &lt;whiteSpace value="collapse"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="FechaHoraCertificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
                "nitCertificador",
                "nombreCertificador",
                "fechaHoraCertificacion"
            })
            public static class Certificacion {

                @XmlElement(name = "NITCertificador", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected String nitCertificador;
                @XmlElement(name = "NombreCertificador", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected String nombreCertificador;
                @XmlElement(name = "FechaHoraCertificacion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar fechaHoraCertificacion;

                /**
                 * Obtiene el valor de la propiedad nitCertificador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNITCertificador() {
                    return nitCertificador;
                }

                /**
                 * Define el valor de la propiedad nitCertificador.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNITCertificador(String value) {
                    this.nitCertificador = value;
                }

                /**
                 * Obtiene el valor de la propiedad nombreCertificador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreCertificador() {
                    return nombreCertificador;
                }

                /**
                 * Define el valor de la propiedad nombreCertificador.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreCertificador(String value) {
                    this.nombreCertificador = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaHoraCertificacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaHoraCertificacion() {
                    return fechaHoraCertificacion;
                }

                /**
                 * Define el valor de la propiedad fechaHoraCertificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaHoraCertificacion(XMLGregorianCalendar value) {
                    this.fechaHoraCertificacion = value;
                }

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
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosAnulacion" />
             *       &lt;attribute name="NumeroDocumentoAAnular" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoUUID" />
             *       &lt;attribute name="NITEmisor" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE">
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="IDReceptor" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
             *             &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="FechaEmisionDocumentoAnular" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
             *             &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="FechaHoraAnulacion" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
             *             &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MotivoAnulacion" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="255"/>
             *             &lt;minLength value="1"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DatosGenerales {

                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String id;
                @XmlAttribute(name = "NumeroDocumentoAAnular", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String numeroDocumentoAAnular;
                @XmlAttribute(name = "NITEmisor", required = true)
                protected String nitEmisor;
                @XmlAttribute(name = "IDReceptor", required = true)
                protected String idReceptor;
                @XmlAttribute(name = "FechaEmisionDocumentoAnular", required = true)
                protected XMLGregorianCalendar fechaEmisionDocumentoAnular;
                @XmlAttribute(name = "FechaHoraAnulacion", required = true)
                protected XMLGregorianCalendar fechaHoraAnulacion;
                @XmlAttribute(name = "MotivoAnulacion", required = true)
                protected String motivoAnulacion;

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    if (id == null) {
                        return "DatosAnulacion";
                    } else {
                        return id;
                    }
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroDocumentoAAnular.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroDocumentoAAnular() {
                    return numeroDocumentoAAnular;
                }

                /**
                 * Define el valor de la propiedad numeroDocumentoAAnular.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroDocumentoAAnular(String value) {
                    this.numeroDocumentoAAnular = value;
                }

                /**
                 * Obtiene el valor de la propiedad nitEmisor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNITEmisor() {
                    return nitEmisor;
                }

                /**
                 * Define el valor de la propiedad nitEmisor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNITEmisor(String value) {
                    this.nitEmisor = value;
                }

                /**
                 * Obtiene el valor de la propiedad idReceptor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIDReceptor() {
                    return idReceptor;
                }

                /**
                 * Define el valor de la propiedad idReceptor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIDReceptor(String value) {
                    this.idReceptor = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaEmisionDocumentoAnular.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaEmisionDocumentoAnular() {
                    return fechaEmisionDocumentoAnular;
                }

                /**
                 * Define el valor de la propiedad fechaEmisionDocumentoAnular.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaEmisionDocumentoAnular(XMLGregorianCalendar value) {
                    this.fechaEmisionDocumentoAnular = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaHoraAnulacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaHoraAnulacion() {
                    return fechaHoraAnulacion;
                }

                /**
                 * Define el valor de la propiedad fechaHoraAnulacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaHoraAnulacion(XMLGregorianCalendar value) {
                    this.fechaHoraAnulacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad motivoAnulacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMotivoAnulacion() {
                    return motivoAnulacion;
                }

                /**
                 * Define el valor de la propiedad motivoAnulacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMotivoAnulacion(String value) {
                    this.motivoAnulacion = value;
                }

            }

        }

    }

}
