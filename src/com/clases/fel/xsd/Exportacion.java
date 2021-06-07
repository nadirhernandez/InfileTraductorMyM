

package com.clases.fel.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="NombreConsignatarioODestinatario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DireccionConsignatarioODestinatario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodigoConsignatarioODestinatario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NombreComprador" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DireccionComprador" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodigoComprador" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtraReferencia" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INCOTERM" type="{http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0}INCOTERMType"/>
 *         &lt;element name="NombreExportador" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodigoExportador" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0}VersionType" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombreConsignatarioODestinatario",
    "direccionConsignatarioODestinatario",
    "codigoConsignatarioODestinatario",
    "nombreComprador",
    "direccionComprador",
    "codigoComprador",
    "otraReferencia",
    "incoterm",
    "nombreExportador",
    "codigoExportador"
})
@XmlRootElement(name = "Exportacion", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
public class Exportacion {

    @XmlElement(name = "NombreConsignatarioODestinatario", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0", required = true)
    protected String nombreConsignatarioODestinatario;
    @XmlElement(name = "DireccionConsignatarioODestinatario", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0", required = true)
    protected String direccionConsignatarioODestinatario;
    @XmlElement(name = "CodigoConsignatarioODestinatario", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String codigoConsignatarioODestinatario;
    @XmlElement(name = "NombreComprador", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String nombreComprador;
    @XmlElement(name = "DireccionComprador", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String direccionComprador;
    @XmlElement(name = "CodigoComprador", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String codigoComprador;
    @XmlElement(name = "OtraReferencia", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String otraReferencia;
    @XmlElement(name = "INCOTERM", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0", required = true)
    @XmlSchemaType(name = "token")
    protected INCOTERMType incoterm;
    @XmlElement(name = "NombreExportador", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String nombreExportador;
    @XmlElement(name = "CodigoExportador", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
    protected String codigoExportador;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad nombreConsignatarioODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConsignatarioODestinatario() {
        return nombreConsignatarioODestinatario;
    }

    /**
     * Define el valor de la propiedad nombreConsignatarioODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConsignatarioODestinatario(String value) {
        this.nombreConsignatarioODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionConsignatarioODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionConsignatarioODestinatario() {
        return direccionConsignatarioODestinatario;
    }

    /**
     * Define el valor de la propiedad direccionConsignatarioODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionConsignatarioODestinatario(String value) {
        this.direccionConsignatarioODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConsignatarioODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConsignatarioODestinatario() {
        return codigoConsignatarioODestinatario;
    }

    /**
     * Define el valor de la propiedad codigoConsignatarioODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConsignatarioODestinatario(String value) {
        this.codigoConsignatarioODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComprador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComprador() {
        return nombreComprador;
    }

    /**
     * Define el valor de la propiedad nombreComprador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComprador(String value) {
        this.nombreComprador = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionComprador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionComprador() {
        return direccionComprador;
    }

    /**
     * Define el valor de la propiedad direccionComprador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionComprador(String value) {
        this.direccionComprador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoComprador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComprador() {
        return codigoComprador;
    }

    /**
     * Define el valor de la propiedad codigoComprador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComprador(String value) {
        this.codigoComprador = value;
    }

    /**
     * Obtiene el valor de la propiedad otraReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtraReferencia() {
        return otraReferencia;
    }

    /**
     * Define el valor de la propiedad otraReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtraReferencia(String value) {
        this.otraReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad incoterm.
     * 
     * @return
     *     possible object is
     *     {@link INCOTERMType }
     *     
     */
    public INCOTERMType getINCOTERM() {
        return incoterm;
    }

    /**
     * Define el valor de la propiedad incoterm.
     * 
     * @param value
     *     allowed object is
     *     {@link INCOTERMType }
     *     
     */
    public void setINCOTERM(INCOTERMType value) {
        this.incoterm = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreExportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreExportador() {
        return nombreExportador;
    }

    /**
     * Define el valor de la propiedad nombreExportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreExportador(String value) {
        this.nombreExportador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoExportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExportador() {
        return codigoExportador;
    }

    /**
     * Define el valor de la propiedad codigoExportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExportador(String value) {
        this.codigoExportador = value;
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
