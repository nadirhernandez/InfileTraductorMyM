

package com.clases.fel.xsd;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


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
 *                   &lt;element name="DTE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DatosEmision">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DatosGenerales">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Tipo" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                     &lt;enumeration value="FACT"/>
 *                                                     &lt;enumeration value="FCAM"/>
 *                                                     &lt;enumeration value="FPEQ"/>
 *                                                     &lt;enumeration value="FCAP"/>
 *                                                     &lt;enumeration value="FESP"/>
 *                                                     &lt;enumeration value="NABN"/>
 *                                                     &lt;enumeration value="RDON"/>
 *                                                     &lt;enumeration value="RECI"/>
 *                                                     &lt;enumeration value="NDEB"/>
 *                                                     &lt;enumeration value="NCRE"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Exp">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="SI"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="FechaHoraEmision" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                                     &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CodigoMoneda" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoMoneda" />
 *                                               &lt;attribute name="NumeroAcceso">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                     &lt;minInclusive value="100000000"/>
 *                                                     &lt;maxInclusive value="999999999"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Emisor">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DireccionEmisor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NITEmisor" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE" />
 *                                               &lt;attribute name="NombreEmisor" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="255"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CodigoEstablecimiento" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                                     &lt;minInclusive value="1"/>
 *                                                     &lt;maxInclusive value="9999"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="NombreComercial" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CorreoEmisor">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="AfiliacionIVA" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;enumeration value="GEN"/>
 *                                                     &lt;enumeration value="EXE"/>
 *                                                     &lt;enumeration value="PEQ"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Receptor">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DireccionReceptor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="IDReceptor" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
 *                                                     &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)|^([A-Z0-9]{3,18})$"/>
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="TipoEspecial">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                     &lt;enumeration value="CUI"/>
 *                                                     &lt;enumeration value="EXT"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="NombreReceptor" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CorreoReceptor">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Frases" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Frase" maxOccurs="100">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TipoFrase" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                                               &lt;whiteSpace value="collapse"/>
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="5"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="CodigoEscenario" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="99"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Items">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Item" maxOccurs="9999">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Cantidad">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="UnidadMedida" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="3"/>
 *                                                                 &lt;whiteSpace value="collapse"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Descripcion">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="10000"/>
 *                                                                 &lt;whiteSpace value="collapse"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PrecioUnitario">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
 *                                                           &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
 *                                                           &lt;element name="Impuestos" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Impuesto" maxOccurs="20">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="NombreCorto">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
 *                                                                                     &lt;whiteSpace value="collapse"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="CodigoUnidadGravable">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                                                     &lt;minInclusive value="1"/>
 *                                                                                     &lt;totalDigits value="7"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
 *                                                                               &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
 *                                                                               &lt;element name="MontoImpuesto">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
 *                                                           &lt;element name="ComplementosItem" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence maxOccurs="unbounded">
 *                                                                     &lt;element name="ComplementoItem">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;any/>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                             &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                             &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="NumeroLinea" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                                               &lt;minInclusive value="1"/>
 *                                                               &lt;maxInclusive value="9999"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="BienOServicio" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="1"/>
 *                                                               &lt;enumeration value="B"/>
 *                                                               &lt;enumeration value="S"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Totales">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TotalImpuestos" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TotalImpuesto" maxOccurs="20">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="NombreCorto" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
 *                                                                         &lt;whiteSpace value="collapse"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                   &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="GranTotal" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Complementos" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence maxOccurs="unbounded">
 *                                                 &lt;element name="Complemento">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;any/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosEmision" />
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
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *                                       &lt;element name="NumeroAutorizacion">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>tipoUUID">
 *                                               &lt;attribute name="Serie" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;whiteSpace value="collapse"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="20"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Numero" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                                     &lt;minInclusive value="1"/>
 *                                                     &lt;maxInclusive value="999999999999999"/>
 *                                                     &lt;totalDigits value="15"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FechaHoraCertificacion">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                             &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="Adenda" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ClaseDocumento" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;whiteSpace value="collapse"/>
 *                       &lt;enumeration value="dte"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="0.4" />
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
@XmlRootElement(name = "GTDocumento", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
public class GTDocumento {

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
     * línea 716 de file:/home/rene/Software/JDK/jdk1.8.0_91/bin/esquemas_fel/GT_Documento-0.1.2.xsd
     * línea 715 de file:/home/rene/Software/JDK/jdk1.8.0_91/bin/esquemas_fel/GT_Documento-0.1.2.xsd
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
     * {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link GTDocumento.SAT }{@code >}
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
            return new BigDecimal("0.4");
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
     *         &lt;element name="DTE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DatosEmision">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DatosGenerales">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Tipo" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                           &lt;enumeration value="FACT"/>
     *                                           &lt;enumeration value="FCAM"/>
     *                                           &lt;enumeration value="FPEQ"/>
     *                                           &lt;enumeration value="FCAP"/>
     *                                           &lt;enumeration value="FESP"/>
     *                                           &lt;enumeration value="NABN"/>
     *                                           &lt;enumeration value="RDON"/>
     *                                           &lt;enumeration value="RECI"/>
     *                                           &lt;enumeration value="NDEB"/>
     *                                           &lt;enumeration value="NCRE"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Exp">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="SI"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="FechaHoraEmision" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                                           &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CodigoMoneda" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoMoneda" />
     *                                     &lt;attribute name="NumeroAcceso">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                           &lt;minInclusive value="100000000"/>
     *                                           &lt;maxInclusive value="999999999"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Emisor">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DireccionEmisor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NITEmisor" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE" />
     *                                     &lt;attribute name="NombreEmisor" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="255"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CodigoEstablecimiento" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                           &lt;minInclusive value="1"/>
     *                                           &lt;maxInclusive value="9999"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="NombreComercial" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CorreoEmisor">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="AfiliacionIVA" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;enumeration value="GEN"/>
     *                                           &lt;enumeration value="EXE"/>
     *                                           &lt;enumeration value="PEQ"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Receptor">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DireccionReceptor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="IDReceptor" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
     *                                           &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)|^([A-Z0-9]{3,18})$"/>
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="TipoEspecial">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                           &lt;enumeration value="CUI"/>
     *                                           &lt;enumeration value="EXT"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="NombreReceptor" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="255"/>
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CorreoReceptor">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Frases" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Frase" maxOccurs="100">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TipoFrase" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                                     &lt;whiteSpace value="collapse"/>
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="5"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="CodigoEscenario" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="99"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Items">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Item" maxOccurs="9999">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Cantidad">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="UnidadMedida" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="3"/>
     *                                                       &lt;whiteSpace value="collapse"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Descripcion">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="10000"/>
     *                                                       &lt;whiteSpace value="collapse"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PrecioUnitario">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
     *                                                 &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
     *                                                 &lt;element name="Impuestos" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Impuesto" maxOccurs="20">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="NombreCorto">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
     *                                                                           &lt;whiteSpace value="collapse"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="CodigoUnidadGravable">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                                           &lt;minInclusive value="1"/>
     *                                                                           &lt;totalDigits value="7"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
     *                                                                     &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
     *                                                                     &lt;element name="MontoImpuesto">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
     *                                                 &lt;element name="ComplementosItem" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence maxOccurs="unbounded">
     *                                                           &lt;element name="ComplementoItem">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;any/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                   &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                   &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="NumeroLinea" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                                     &lt;minInclusive value="1"/>
     *                                                     &lt;maxInclusive value="9999"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="BienOServicio" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="1"/>
     *                                                     &lt;enumeration value="B"/>
     *                                                     &lt;enumeration value="S"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Totales">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TotalImpuestos" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TotalImpuesto" maxOccurs="20">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="NombreCorto" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
     *                                                               &lt;whiteSpace value="collapse"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                         &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="GranTotal" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Complementos" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence maxOccurs="unbounded">
     *                                       &lt;element name="Complemento">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;any/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosEmision" />
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
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
     *                             &lt;element name="NumeroAutorizacion">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>tipoUUID">
     *                                     &lt;attribute name="Serie" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;whiteSpace value="collapse"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="20"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="Numero" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                                           &lt;minInclusive value="1"/>
     *                                           &lt;maxInclusive value="999999999999999"/>
     *                                           &lt;totalDigits value="15"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FechaHoraCertificacion">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                                   &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *         &lt;element name="Adenda" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ClaseDocumento" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;whiteSpace value="collapse"/>
     *             &lt;enumeration value="dte"/>
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
    @XmlType(name = "", propOrder = {
        "dte",
        "adenda"
    })
    public static class SAT {

        @XmlElement(name = "DTE", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
        protected GTDocumento.SAT.DTE dte;
        @XmlElement(name = "Adenda", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
        protected GTDocumento.SAT.Adenda adenda;
        @XmlAttribute(name = "ClaseDocumento", required = true)
        protected String claseDocumento;

        /**
         * Obtiene el valor de la propiedad dte.
         * 
         * @return
         *     possible object is
         *     {@link GTDocumento.SAT.DTE }
         *     
         */
        public GTDocumento.SAT.DTE getDTE() {
            return dte;
        }

        /**
         * Define el valor de la propiedad dte.
         * 
         * @param value
         *     allowed object is
         *     {@link GTDocumento.SAT.DTE }
         *     
         */
        public void setDTE(GTDocumento.SAT.DTE value) {
            this.dte = value;
        }

        /**
         * Obtiene el valor de la propiedad adenda.
         * 
         * @return
         *     possible object is
         *     {@link GTDocumento.SAT.Adenda }
         *     
         */
        public GTDocumento.SAT.Adenda getAdenda() {
            return adenda;
        }

        /**
         * Define el valor de la propiedad adenda.
         * 
         * @param value
         *     allowed object is
         *     {@link GTDocumento.SAT.Adenda }
         *     
         */
        public void setAdenda(GTDocumento.SAT.Adenda value) {
            this.adenda = value;
        }

        /**
         * Obtiene el valor de la propiedad claseDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaseDocumento() {
            return claseDocumento;
        }

        /**
         * Define el valor de la propiedad claseDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaseDocumento(String value) {
            this.claseDocumento = value;
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
         *         &lt;any processContents='lax' maxOccurs="unbounded"/>
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
            "any"
        })
        public static class Adenda {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link Element }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
         *       &lt;sequence>
         *         &lt;element name="DatosEmision">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DatosGenerales">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Tipo" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;whiteSpace value="collapse"/>
         *                                 &lt;enumeration value="FACT"/>
         *                                 &lt;enumeration value="FCAM"/>
         *                                 &lt;enumeration value="FPEQ"/>
         *                                 &lt;enumeration value="FCAP"/>
         *                                 &lt;enumeration value="FESP"/>
         *                                 &lt;enumeration value="NABN"/>
         *                                 &lt;enumeration value="RDON"/>
         *                                 &lt;enumeration value="RECI"/>
         *                                 &lt;enumeration value="NDEB"/>
         *                                 &lt;enumeration value="NCRE"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Exp">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="SI"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="FechaHoraEmision" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *                                 &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CodigoMoneda" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoMoneda" />
         *                           &lt;attribute name="NumeroAcceso">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                                 &lt;whiteSpace value="collapse"/>
         *                                 &lt;minInclusive value="100000000"/>
         *                                 &lt;maxInclusive value="999999999"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Emisor">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DireccionEmisor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NITEmisor" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE" />
         *                           &lt;attribute name="NombreEmisor" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="255"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CodigoEstablecimiento" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                                 &lt;minInclusive value="1"/>
         *                                 &lt;maxInclusive value="9999"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="NombreComercial" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CorreoEmisor">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="AfiliacionIVA" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;enumeration value="GEN"/>
         *                                 &lt;enumeration value="EXE"/>
         *                                 &lt;enumeration value="PEQ"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Receptor">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DireccionReceptor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="IDReceptor" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
         *                                 &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)|^([A-Z0-9]{3,18})$"/>
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="TipoEspecial">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;whiteSpace value="collapse"/>
         *                                 &lt;enumeration value="CUI"/>
         *                                 &lt;enumeration value="EXT"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="NombreReceptor" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="255"/>
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CorreoReceptor">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
         *                                 &lt;whiteSpace value="collapse"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Frases" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Frase" maxOccurs="100">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TipoFrase" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                                           &lt;whiteSpace value="collapse"/>
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="5"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="CodigoEscenario" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="99"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Items">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Item" maxOccurs="9999">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Cantidad">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="UnidadMedida" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="3"/>
         *                                             &lt;whiteSpace value="collapse"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="Descripcion">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="10000"/>
         *                                             &lt;whiteSpace value="collapse"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="PrecioUnitario">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
         *                                       &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
         *                                       &lt;element name="Impuestos" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Impuesto" maxOccurs="20">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="NombreCorto">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
         *                                                                 &lt;whiteSpace value="collapse"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="CodigoUnidadGravable">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                                                 &lt;minInclusive value="1"/>
         *                                                                 &lt;totalDigits value="7"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
         *                                                           &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
         *                                                           &lt;element name="MontoImpuesto">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
         *                                       &lt;element name="ComplementosItem" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence maxOccurs="unbounded">
         *                                                 &lt;element name="ComplementoItem">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;any/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                         &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                         &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="NumeroLinea" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                                           &lt;minInclusive value="1"/>
         *                                           &lt;maxInclusive value="9999"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="BienOServicio" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="1"/>
         *                                           &lt;enumeration value="B"/>
         *                                           &lt;enumeration value="S"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Totales">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TotalImpuestos" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TotalImpuesto" maxOccurs="20">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="NombreCorto" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
         *                                                     &lt;whiteSpace value="collapse"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                               &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="GranTotal" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Complementos" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence maxOccurs="unbounded">
         *                             &lt;element name="Complemento">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;any/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosEmision" />
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
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
         *                   &lt;element name="NumeroAutorizacion">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>tipoUUID">
         *                           &lt;attribute name="Serie" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;whiteSpace value="collapse"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="20"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="Numero" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *                                 &lt;minInclusive value="1"/>
         *                                 &lt;maxInclusive value="999999999999999"/>
         *                                 &lt;totalDigits value="15"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FechaHoraCertificacion">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *                         &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
            "datosEmision",
            "certificacion"
        })
        public static class DTE {

            @XmlElement(name = "DatosEmision", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
            protected GTDocumento.SAT.DTE.DatosEmision datosEmision;
            @XmlElement(name = "Certificacion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
            protected GTDocumento.SAT.DTE.Certificacion certificacion;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String id;

            /**
             * Obtiene el valor de la propiedad datosEmision.
             * 
             * @return
             *     possible object is
             *     {@link GTDocumento.SAT.DTE.DatosEmision }
             *     
             */
            public GTDocumento.SAT.DTE.DatosEmision getDatosEmision() {
                return datosEmision;
            }

            /**
             * Define el valor de la propiedad datosEmision.
             * 
             * @param value
             *     allowed object is
             *     {@link GTDocumento.SAT.DTE.DatosEmision }
             *     
             */
            public void setDatosEmision(GTDocumento.SAT.DTE.DatosEmision value) {
                this.datosEmision = value;
            }

            /**
             * Obtiene el valor de la propiedad certificacion.
             * 
             * @return
             *     possible object is
             *     {@link GTDocumento.SAT.DTE.Certificacion }
             *     
             */
            public GTDocumento.SAT.DTE.Certificacion getCertificacion() {
                return certificacion;
            }

            /**
             * Define el valor de la propiedad certificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link GTDocumento.SAT.DTE.Certificacion }
             *     
             */
            public void setCertificacion(GTDocumento.SAT.DTE.Certificacion value) {
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
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
             *         &lt;element name="NumeroAutorizacion">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>tipoUUID">
             *                 &lt;attribute name="Serie" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;whiteSpace value="collapse"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="20"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Numero" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *                       &lt;minInclusive value="1"/>
             *                       &lt;maxInclusive value="999999999999999"/>
             *                       &lt;totalDigits value="15"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FechaHoraCertificacion">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
             *               &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "nitCertificador",
                "nombreCertificador",
                "numeroAutorizacion",
                "fechaHoraCertificacion"
            })
            public static class Certificacion {

                @XmlElement(name = "NITCertificador", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected String nitCertificador;
                @XmlElement(name = "NombreCertificador", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected String nombreCertificador;
                @XmlElement(name = "NumeroAutorizacion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.Certificacion.NumeroAutorizacion numeroAutorizacion;
                @XmlElement(name = "FechaHoraCertificacion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
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
                 * Obtiene el valor de la propiedad numeroAutorizacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.Certificacion.NumeroAutorizacion }
                 *     
                 */
                public GTDocumento.SAT.DTE.Certificacion.NumeroAutorizacion getNumeroAutorizacion() {
                    return numeroAutorizacion;
                }

                /**
                 * Define el valor de la propiedad numeroAutorizacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.Certificacion.NumeroAutorizacion }
                 *     
                 */
                public void setNumeroAutorizacion(GTDocumento.SAT.DTE.Certificacion.NumeroAutorizacion value) {
                    this.numeroAutorizacion = value;
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


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>tipoUUID">
                 *       &lt;attribute name="Serie" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;whiteSpace value="collapse"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="20"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Numero" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                 *             &lt;minInclusive value="1"/>
                 *             &lt;maxInclusive value="999999999999999"/>
                 *             &lt;totalDigits value="15"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class NumeroAutorizacion {

                    @XmlValue
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String value;
                    @XmlAttribute(name = "Serie", required = true)
                    protected String serie;
                    @XmlAttribute(name = "Numero", required = true)
                    protected long numero;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad serie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSerie() {
                        return serie;
                    }

                    /**
                     * Define el valor de la propiedad serie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSerie(String value) {
                        this.serie = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numero.
                     * 
                     */
                    public long getNumero() {
                        return numero;
                    }

                    /**
                     * Define el valor de la propiedad numero.
                     * 
                     */
                    public void setNumero(long value) {
                        this.numero = value;
                    }

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
             *       &lt;sequence>
             *         &lt;element name="DatosGenerales">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Tipo" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;whiteSpace value="collapse"/>
             *                       &lt;enumeration value="FACT"/>
             *                       &lt;enumeration value="FCAM"/>
             *                       &lt;enumeration value="FPEQ"/>
             *                       &lt;enumeration value="FCAP"/>
             *                       &lt;enumeration value="FESP"/>
             *                       &lt;enumeration value="NABN"/>
             *                       &lt;enumeration value="RDON"/>
             *                       &lt;enumeration value="RECI"/>
             *                       &lt;enumeration value="NDEB"/>
             *                       &lt;enumeration value="NCRE"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="Exp">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="SI"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="FechaHoraEmision" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
             *                       &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CodigoMoneda" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoMoneda" />
             *                 &lt;attribute name="NumeroAcceso">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *                       &lt;whiteSpace value="collapse"/>
             *                       &lt;minInclusive value="100000000"/>
             *                       &lt;maxInclusive value="999999999"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Emisor">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DireccionEmisor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NITEmisor" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE" />
             *                 &lt;attribute name="NombreEmisor" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="255"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CodigoEstablecimiento" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *                       &lt;minInclusive value="1"/>
             *                       &lt;maxInclusive value="9999"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="NombreComercial" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CorreoEmisor">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="AfiliacionIVA" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;enumeration value="GEN"/>
             *                       &lt;enumeration value="EXE"/>
             *                       &lt;enumeration value="PEQ"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Receptor">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DireccionReceptor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="IDReceptor" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
             *                       &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)|^([A-Z0-9]{3,18})$"/>
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="TipoEspecial">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;whiteSpace value="collapse"/>
             *                       &lt;enumeration value="CUI"/>
             *                       &lt;enumeration value="EXT"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="NombreReceptor" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="255"/>
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CorreoReceptor">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
             *                       &lt;whiteSpace value="collapse"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Frases" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Frase" maxOccurs="100">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TipoFrase" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *                                 &lt;whiteSpace value="collapse"/>
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="5"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="CodigoEscenario" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="99"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Items">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Item" maxOccurs="9999">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Cantidad">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="UnidadMedida" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="3"/>
             *                                   &lt;whiteSpace value="collapse"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="Descripcion">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="10000"/>
             *                                   &lt;whiteSpace value="collapse"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="PrecioUnitario">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
             *                             &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
             *                             &lt;element name="Impuestos" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Impuesto" maxOccurs="20">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="NombreCorto">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
             *                                                       &lt;whiteSpace value="collapse"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="CodigoUnidadGravable">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                                       &lt;minInclusive value="1"/>
             *                                                       &lt;totalDigits value="7"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
             *                                                 &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
             *                                                 &lt;element name="MontoImpuesto">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
             *                             &lt;element name="ComplementosItem" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence maxOccurs="unbounded">
             *                                       &lt;element name="ComplementoItem">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;any/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                               &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                               &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="NumeroLinea" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
             *                                 &lt;minInclusive value="1"/>
             *                                 &lt;maxInclusive value="9999"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="BienOServicio" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="1"/>
             *                                 &lt;enumeration value="B"/>
             *                                 &lt;enumeration value="S"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Totales">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TotalImpuestos" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TotalImpuesto" maxOccurs="20">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="NombreCorto" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
             *                                           &lt;whiteSpace value="collapse"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                     &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="GranTotal" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Complementos" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence maxOccurs="unbounded">
             *                   &lt;element name="Complemento">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;any/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="DatosEmision" />
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
                "emisor",
                "receptor",
                "frases",
                "items",
                "totales",
                "complementos"
            })
            public static class DatosEmision {

                @XmlElement(name = "DatosGenerales", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.DatosEmision.DatosGenerales datosGenerales;
                @XmlElement(name = "Emisor", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.DatosEmision.Emisor emisor;
                @XmlElement(name = "Receptor", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.DatosEmision.Receptor receptor;
                @XmlElement(name = "Frases", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                protected GTDocumento.SAT.DTE.DatosEmision.Frases frases;
                @XmlElement(name = "Items", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.DatosEmision.Items items;
                @XmlElement(name = "Totales", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                protected GTDocumento.SAT.DTE.DatosEmision.Totales totales;
                @XmlElement(name = "Complementos", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                protected GTDocumento.SAT.DTE.DatosEmision.Complementos complementos;
                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String id;

                /**
                 * Obtiene el valor de la propiedad datosGenerales.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.DatosGenerales }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.DatosGenerales getDatosGenerales() {
                    return datosGenerales;
                }

                /**
                 * Define el valor de la propiedad datosGenerales.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.DatosGenerales }
                 *     
                 */
                public void setDatosGenerales(GTDocumento.SAT.DTE.DatosEmision.DatosGenerales value) {
                    this.datosGenerales = value;
                }

                /**
                 * Obtiene el valor de la propiedad emisor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Emisor }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Emisor getEmisor() {
                    return emisor;
                }

                /**
                 * Define el valor de la propiedad emisor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Emisor }
                 *     
                 */
                public void setEmisor(GTDocumento.SAT.DTE.DatosEmision.Emisor value) {
                    this.emisor = value;
                }

                /**
                 * Obtiene el valor de la propiedad receptor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Receptor }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Receptor getReceptor() {
                    return receptor;
                }

                /**
                 * Define el valor de la propiedad receptor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Receptor }
                 *     
                 */
                public void setReceptor(GTDocumento.SAT.DTE.DatosEmision.Receptor value) {
                    this.receptor = value;
                }

                /**
                 * Obtiene el valor de la propiedad frases.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Frases }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Frases getFrases() {
                    return frases;
                }

                /**
                 * Define el valor de la propiedad frases.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Frases }
                 *     
                 */
                public void setFrases(GTDocumento.SAT.DTE.DatosEmision.Frases value) {
                    this.frases = value;
                }

                /**
                 * Obtiene el valor de la propiedad items.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Items }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Items getItems() {
                    return items;
                }

                /**
                 * Define el valor de la propiedad items.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Items }
                 *     
                 */
                public void setItems(GTDocumento.SAT.DTE.DatosEmision.Items value) {
                    this.items = value;
                }

                /**
                 * Obtiene el valor de la propiedad totales.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Totales }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Totales getTotales() {
                    return totales;
                }

                /**
                 * Define el valor de la propiedad totales.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Totales }
                 *     
                 */
                public void setTotales(GTDocumento.SAT.DTE.DatosEmision.Totales value) {
                    this.totales = value;
                }

                /**
                 * Obtiene el valor de la propiedad complementos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Complementos }
                 *     
                 */
                public GTDocumento.SAT.DTE.DatosEmision.Complementos getComplementos() {
                    return complementos;
                }

                /**
                 * Define el valor de la propiedad complementos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Complementos }
                 *     
                 */
                public void setComplementos(GTDocumento.SAT.DTE.DatosEmision.Complementos value) {
                    this.complementos = value;
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
                        return "DatosEmision";
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
                 *       &lt;sequence maxOccurs="unbounded">
                 *         &lt;element name="Complemento">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;any/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                    "complemento"
                })
                public static class Complementos {

                    @XmlElement(name = "Complemento", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                    protected List<GTDocumento.SAT.DTE.DatosEmision.Complementos.Complemento> complemento;

                    /**
                     * Gets the value of the complemento property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the complemento property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getComplemento().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GTDocumento.SAT.DTE.DatosEmision.Complementos.Complemento }
                     * 
                     * 
                     */
                    public List<GTDocumento.SAT.DTE.DatosEmision.Complementos.Complemento> getComplemento() {
                        if (complemento == null) {
                            complemento = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Complementos.Complemento>();
                        }
                        return this.complemento;
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
                     *         &lt;any/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="IDComplemento" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="NombreComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="URIComplemento" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "any"
                    })
                    public static class Complemento {

                        @XmlAnyElement(lax = true)
                        protected Object any;
                        @XmlAttribute(name = "IDComplemento")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String idComplemento;
                        @XmlAttribute(name = "NombreComplemento", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String nombreComplemento;
                        @XmlAttribute(name = "URIComplemento", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String uriComplemento;

                        /**
                         * Obtiene el valor de la propiedad any.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getAny() {
                            return any;
                        }

                        /**
                         * Define el valor de la propiedad any.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setAny(Object value) {
                            this.any = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad idComplemento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIDComplemento() {
                            return idComplemento;
                        }

                        /**
                         * Define el valor de la propiedad idComplemento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIDComplemento(String value) {
                            this.idComplemento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad nombreComplemento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNombreComplemento() {
                            return nombreComplemento;
                        }

                        /**
                         * Define el valor de la propiedad nombreComplemento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNombreComplemento(String value) {
                            this.nombreComplemento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad uriComplemento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getURIComplemento() {
                            return uriComplemento;
                        }

                        /**
                         * Define el valor de la propiedad uriComplemento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setURIComplemento(String value) {
                            this.uriComplemento = value;
                        }

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
                 *       &lt;attribute name="Tipo" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;whiteSpace value="collapse"/>
                 *             &lt;enumeration value="FACT"/>
                 *             &lt;enumeration value="FCAM"/>
                 *             &lt;enumeration value="FPEQ"/>
                 *             &lt;enumeration value="FCAP"/>
                 *             &lt;enumeration value="FESP"/>
                 *             &lt;enumeration value="NABN"/>
                 *             &lt;enumeration value="RDON"/>
                 *             &lt;enumeration value="RECI"/>
                 *             &lt;enumeration value="NDEB"/>
                 *             &lt;enumeration value="NCRE"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="Exp">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="SI"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="FechaHoraEmision" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
                 *             &lt;pattern value="((\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2})(.(\d{3}))?(-06:00)?)"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CodigoMoneda" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoMoneda" />
                 *       &lt;attribute name="NumeroAcceso">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                 *             &lt;whiteSpace value="collapse"/>
                 *             &lt;minInclusive value="100000000"/>
                 *             &lt;maxInclusive value="999999999"/>
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

                    @XmlAttribute(name = "Tipo", required = true)
                    protected String tipo;
                    @XmlAttribute(name = "Exp")
                    protected String exp;
                    @XmlAttribute(name = "FechaHoraEmision", required = true)
                    protected XMLGregorianCalendar fechaHoraEmision;
                    @XmlAttribute(name = "CodigoMoneda", required = true)
                    protected TipoMoneda codigoMoneda;
                    @XmlAttribute(name = "NumeroAcceso")
                    protected Integer numeroAcceso;

                    /**
                     * Obtiene el valor de la propiedad tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipo() {
                        return tipo;
                    }

                    /**
                     * Define el valor de la propiedad tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipo(String value) {
                        this.tipo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad exp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExp() {
                        return exp;
                    }

                    /**
                     * Define el valor de la propiedad exp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExp(String value) {
                        this.exp = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad fechaHoraEmision.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getFechaHoraEmision() {
                        return fechaHoraEmision;
                    }

                    /**
                     * Define el valor de la propiedad fechaHoraEmision.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setFechaHoraEmision(XMLGregorianCalendar value) {
                        this.fechaHoraEmision = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad codigoMoneda.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TipoMoneda }
                     *     
                     */
                    public TipoMoneda getCodigoMoneda() {
                        return codigoMoneda;
                    }

                    /**
                     * Define el valor de la propiedad codigoMoneda.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TipoMoneda }
                     *     
                     */
                    public void setCodigoMoneda(TipoMoneda value) {
                        this.codigoMoneda = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad numeroAcceso.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getNumeroAcceso() {
                        return numeroAcceso;
                    }

                    /**
                     * Define el valor de la propiedad numeroAcceso.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setNumeroAcceso(Integer value) {
                        this.numeroAcceso = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="DireccionEmisor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NITEmisor" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITDelEFACE" />
                 *       &lt;attribute name="NombreEmisor" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="255"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;whiteSpace value="collapse"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CodigoEstablecimiento" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                 *             &lt;minInclusive value="1"/>
                 *             &lt;maxInclusive value="9999"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="NombreComercial" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *             &lt;whiteSpace value="collapse"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CorreoEmisor">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
                 *             &lt;whiteSpace value="collapse"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="AfiliacionIVA" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;enumeration value="GEN"/>
                 *             &lt;enumeration value="EXE"/>
                 *             &lt;enumeration value="PEQ"/>
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
                @XmlType(name = "", propOrder = {
                    "direccionEmisor"
                })
                public static class Emisor {

                    @XmlElement(name = "DireccionEmisor", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                    protected TipoDireccion direccionEmisor;
                    @XmlAttribute(name = "NITEmisor", required = true)
                    protected String nitEmisor;
                    @XmlAttribute(name = "NombreEmisor", required = true)
                    protected String nombreEmisor;
                    @XmlAttribute(name = "CodigoEstablecimiento", required = true)
                    protected int codigoEstablecimiento;
                    @XmlAttribute(name = "NombreComercial", required = true)
                    protected String nombreComercial;
                    @XmlAttribute(name = "CorreoEmisor")
                    protected String correoEmisor;
                    @XmlAttribute(name = "AfiliacionIVA", required = true)
                    protected String afiliacionIVA;

                    /**
                     * Obtiene el valor de la propiedad direccionEmisor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TipoDireccion }
                     *     
                     */
                    public TipoDireccion getDireccionEmisor() {
                        return direccionEmisor;
                    }

                    /**
                     * Define el valor de la propiedad direccionEmisor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TipoDireccion }
                     *     
                     */
                    public void setDireccionEmisor(TipoDireccion value) {
                        this.direccionEmisor = value;
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
                     * Obtiene el valor de la propiedad nombreEmisor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreEmisor() {
                        return nombreEmisor;
                    }

                    /**
                     * Define el valor de la propiedad nombreEmisor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreEmisor(String value) {
                        this.nombreEmisor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad codigoEstablecimiento.
                     * 
                     */
                    public int getCodigoEstablecimiento() {
                        return codigoEstablecimiento;
                    }

                    /**
                     * Define el valor de la propiedad codigoEstablecimiento.
                     * 
                     */
                    public void setCodigoEstablecimiento(int value) {
                        this.codigoEstablecimiento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nombreComercial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreComercial() {
                        return nombreComercial;
                    }

                    /**
                     * Define el valor de la propiedad nombreComercial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreComercial(String value) {
                        this.nombreComercial = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad correoEmisor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCorreoEmisor() {
                        return correoEmisor;
                    }

                    /**
                     * Define el valor de la propiedad correoEmisor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCorreoEmisor(String value) {
                        this.correoEmisor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad afiliacionIVA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAfiliacionIVA() {
                        return afiliacionIVA;
                    }

                    /**
                     * Define el valor de la propiedad afiliacionIVA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAfiliacionIVA(String value) {
                        this.afiliacionIVA = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="Frase" maxOccurs="100">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TipoFrase" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                 *                       &lt;whiteSpace value="collapse"/>
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="5"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="CodigoEscenario" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="99"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
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
                    "frase"
                })
                public static class Frases {

                    @XmlElement(name = "Frase", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                    protected List<GTDocumento.SAT.DTE.DatosEmision.Frases.Frase> frase;

                    /**
                     * Gets the value of the frase property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the frase property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFrase().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GTDocumento.SAT.DTE.DatosEmision.Frases.Frase }
                     * 
                     * 
                     */
                    public List<GTDocumento.SAT.DTE.DatosEmision.Frases.Frase> getFrase() {
                        if (frase == null) {
                            frase = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Frases.Frase>();
                        }
                        return this.frase;
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
                     *       &lt;attribute name="TipoFrase" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                     *             &lt;whiteSpace value="collapse"/>
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="5"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="CodigoEscenario" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="99"/>
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
                    public static class Frase {

                        @XmlAttribute(name = "TipoFrase", required = true)
                        protected int tipoFrase;
                        @XmlAttribute(name = "CodigoEscenario", required = true)
                        protected int codigoEscenario;

                        /**
                         * Obtiene el valor de la propiedad tipoFrase.
                         * 
                         */
                        public int getTipoFrase() {
                            return tipoFrase;
                        }

                        /**
                         * Define el valor de la propiedad tipoFrase.
                         * 
                         */
                        public void setTipoFrase(int value) {
                            this.tipoFrase = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad codigoEscenario.
                         * 
                         */
                        public int getCodigoEscenario() {
                            return codigoEscenario;
                        }

                        /**
                         * Define el valor de la propiedad codigoEscenario.
                         * 
                         */
                        public void setCodigoEscenario(int value) {
                            this.codigoEscenario = value;
                        }

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
                 *       &lt;sequence>
                 *         &lt;element name="Item" maxOccurs="9999">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Cantidad">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="UnidadMedida" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="3"/>
                 *                         &lt;whiteSpace value="collapse"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="Descripcion">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="10000"/>
                 *                         &lt;whiteSpace value="collapse"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="PrecioUnitario">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                 *                   &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                 *                   &lt;element name="Impuestos" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Impuesto" maxOccurs="20">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="NombreCorto">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                 *                                             &lt;whiteSpace value="collapse"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="CodigoUnidadGravable">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                                             &lt;minInclusive value="1"/>
                 *                                             &lt;totalDigits value="7"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                 *                                       &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                 *                                       &lt;element name="MontoImpuesto">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                 *                   &lt;element name="ComplementosItem" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence maxOccurs="unbounded">
                 *                             &lt;element name="ComplementoItem">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;any/>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                     &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                     &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="NumeroLinea" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                 *                       &lt;minInclusive value="1"/>
                 *                       &lt;maxInclusive value="9999"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="BienOServicio" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="1"/>
                 *                       &lt;enumeration value="B"/>
                 *                       &lt;enumeration value="S"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
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
                    "item"
                })
                public static class Items {

                    @XmlElement(name = "Item", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                    protected List<GTDocumento.SAT.DTE.DatosEmision.Items.Item> item;

                    /**
                     * Gets the value of the item property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the item property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getItem().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item }
                     * 
                     * 
                     */
                    public List<GTDocumento.SAT.DTE.DatosEmision.Items.Item> getItem() {
                        if (item == null) {
                            item = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Items.Item>();
                        }
                        return this.item;
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
                     *         &lt;element name="Cantidad">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="UnidadMedida" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="3"/>
                     *               &lt;whiteSpace value="collapse"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="Descripcion">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="10000"/>
                     *               &lt;whiteSpace value="collapse"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="PrecioUnitario">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="Precio" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                     *         &lt;element name="Descuento" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                     *         &lt;element name="Impuestos" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Impuesto" maxOccurs="20">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="NombreCorto">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                     *                                   &lt;whiteSpace value="collapse"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="CodigoUnidadGravable">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *                                   &lt;minInclusive value="1"/>
                     *                                   &lt;totalDigits value="7"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                     *                             &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                     *                             &lt;element name="MontoImpuesto">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Total" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
                     *         &lt;element name="ComplementosItem" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence maxOccurs="unbounded">
                     *                   &lt;element name="ComplementoItem">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;any/>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                           &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                           &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="NumeroLinea" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
                     *             &lt;minInclusive value="1"/>
                     *             &lt;maxInclusive value="9999"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="BienOServicio" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="1"/>
                     *             &lt;enumeration value="B"/>
                     *             &lt;enumeration value="S"/>
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
                    @XmlType(name = "", propOrder = {
                        "cantidad",
                        "unidadMedida",
                        "descripcion",
                        "precioUnitario",
                        "precio",
                        "descuento",
                        "impuestos",
                        "total",
                        "complementosItem"
                    })
                    public static class Item {

                        @XmlElement(name = "Cantidad", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected GTDocumento.SAT.DTE.DatosEmision.Items.Item.Cantidad cantidad;
                        @XmlElement(name = "UnidadMedida", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                        protected String unidadMedida;
                        @XmlElement(name = "Descripcion", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected String descripcion;
                        @XmlElement(name = "PrecioUnitario", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected BigDecimal precioUnitario;
                        @XmlElement(name = "Precio", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected BigDecimal precio;
                        @XmlElement(name = "Descuento", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected BigDecimal descuento;
                        @XmlElement(name = "Impuestos", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                        protected GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos impuestos;
                        @XmlElement(name = "Total", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected BigDecimal total;
                        @XmlElement(name = "ComplementosItem", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                        protected GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem complementosItem;
                        @XmlAttribute(name = "NumeroLinea", required = true)
                        protected int numeroLinea;
                        @XmlAttribute(name = "BienOServicio", required = true)
                        protected String bienOServicio;

                        /**
                         * Obtiene el valor de la propiedad cantidad.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Cantidad }
                         *     
                         */
                        public GTDocumento.SAT.DTE.DatosEmision.Items.Item.Cantidad getCantidad() {
                            return cantidad;
                        }

                        /**
                         * Define el valor de la propiedad cantidad.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Cantidad }
                         *     
                         */
                        public void setCantidad(GTDocumento.SAT.DTE.DatosEmision.Items.Item.Cantidad value) {
                            this.cantidad = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad unidadMedida.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnidadMedida() {
                            return unidadMedida;
                        }

                        /**
                         * Define el valor de la propiedad unidadMedida.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnidadMedida(String value) {
                            this.unidadMedida = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad descripcion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDescripcion() {
                            return descripcion;
                        }

                        /**
                         * Define el valor de la propiedad descripcion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDescripcion(String value) {
                            this.descripcion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precioUnitario.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPrecioUnitario() {
                            return precioUnitario;
                        }

                        /**
                         * Define el valor de la propiedad precioUnitario.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPrecioUnitario(BigDecimal value) {
                            this.precioUnitario = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precio.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPrecio() {
                            return precio;
                        }

                        /**
                         * Define el valor de la propiedad precio.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPrecio(BigDecimal value) {
                            this.precio = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad descuento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getDescuento() {
                            return descuento;
                        }

                        /**
                         * Define el valor de la propiedad descuento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setDescuento(BigDecimal value) {
                            this.descuento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad impuestos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos }
                         *     
                         */
                        public GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos getImpuestos() {
                            return impuestos;
                        }

                        /**
                         * Define el valor de la propiedad impuestos.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos }
                         *     
                         */
                        public void setImpuestos(GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos value) {
                            this.impuestos = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad total.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getTotal() {
                            return total;
                        }

                        /**
                         * Define el valor de la propiedad total.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setTotal(BigDecimal value) {
                            this.total = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad complementosItem.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem }
                         *     
                         */
                        public GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem getComplementosItem() {
                            return complementosItem;
                        }

                        /**
                         * Define el valor de la propiedad complementosItem.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem }
                         *     
                         */
                        public void setComplementosItem(GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem value) {
                            this.complementosItem = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad numeroLinea.
                         * 
                         */
                        public int getNumeroLinea() {
                            return numeroLinea;
                        }

                        /**
                         * Define el valor de la propiedad numeroLinea.
                         * 
                         */
                        public void setNumeroLinea(int value) {
                            this.numeroLinea = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad bienOServicio.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBienOServicio() {
                            return bienOServicio;
                        }

                        /**
                         * Define el valor de la propiedad bienOServicio.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBienOServicio(String value) {
                            this.bienOServicio = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Cantidad {

                            @XmlValue
                            protected BigDecimal value;

                            /**
                             * Acepta cantidades mayores a 0
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setValue(BigDecimal value) {
                                this.value = value;
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
                         *       &lt;sequence maxOccurs="unbounded">
                         *         &lt;element name="ComplementoItem">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;any/>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *                 &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *                 &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                            "complementoItem"
                        })
                        public static class ComplementosItem {

                            @XmlElement(name = "ComplementoItem", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                            protected List<GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem.ComplementoItem> complementoItem;

                            /**
                             * Gets the value of the complementoItem property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the complementoItem property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getComplementoItem().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem.ComplementoItem }
                             * 
                             * 
                             */
                            public List<GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem.ComplementoItem> getComplementoItem() {
                                if (complementoItem == null) {
                                    complementoItem = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Items.Item.ComplementosItem.ComplementoItem>();
                                }
                                return this.complementoItem;
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
                             *         &lt;any/>
                             *       &lt;/sequence>
                             *       &lt;attribute name="IDComplementoItem" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                             *       &lt;attribute name="NombreComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                             *       &lt;attribute name="URIComplementoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "any"
                            })
                            public static class ComplementoItem {

                                @XmlAnyElement(lax = true)
                                protected Object any;
                                @XmlAttribute(name = "IDComplementoItem")
                                @XmlSchemaType(name = "anySimpleType")
                                protected String idComplementoItem;
                                @XmlAttribute(name = "NombreComplementoItem", required = true)
                                @XmlSchemaType(name = "anySimpleType")
                                protected String nombreComplementoItem;
                                @XmlAttribute(name = "URIComplementoItem", required = true)
                                @XmlSchemaType(name = "anySimpleType")
                                protected String uriComplementoItem;

                                /**
                                 * Obtiene el valor de la propiedad any.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Object }
                                 *     
                                 */
                                public Object getAny() {
                                    return any;
                                }

                                /**
                                 * Define el valor de la propiedad any.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Object }
                                 *     
                                 */
                                public void setAny(Object value) {
                                    this.any = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad idComplementoItem.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getIDComplementoItem() {
                                    return idComplementoItem;
                                }

                                /**
                                 * Define el valor de la propiedad idComplementoItem.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setIDComplementoItem(String value) {
                                    this.idComplementoItem = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad nombreComplementoItem.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getNombreComplementoItem() {
                                    return nombreComplementoItem;
                                }

                                /**
                                 * Define el valor de la propiedad nombreComplementoItem.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setNombreComplementoItem(String value) {
                                    this.nombreComplementoItem = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad uriComplementoItem.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getURIComplementoItem() {
                                    return uriComplementoItem;
                                }

                                /**
                                 * Define el valor de la propiedad uriComplementoItem.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setURIComplementoItem(String value) {
                                    this.uriComplementoItem = value;
                                }

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
                         *       &lt;sequence>
                         *         &lt;element name="Impuesto" maxOccurs="20">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="NombreCorto">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                         *                         &lt;whiteSpace value="collapse"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="CodigoUnidadGravable">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                         *                         &lt;minInclusive value="1"/>
                         *                         &lt;totalDigits value="7"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                         *                   &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                         *                   &lt;element name="MontoImpuesto">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
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
                            "impuesto"
                        })
                        public static class Impuestos {

                            @XmlElement(name = "Impuesto", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                            protected List<GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto> impuesto;

                            /**
                             * Gets the value of the impuesto property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the impuesto property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getImpuesto().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto }
                             * 
                             * 
                             */
                            public List<GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto> getImpuesto() {
                                if (impuesto == null) {
                                    impuesto = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto>();
                                }
                                return this.impuesto;
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
                             *         &lt;element name="NombreCorto">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                             *               &lt;whiteSpace value="collapse"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="CodigoUnidadGravable">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                             *               &lt;minInclusive value="1"/>
                             *               &lt;totalDigits value="7"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="MontoGravable" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                             *         &lt;element name="CantidadUnidadesGravables" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" minOccurs="0"/>
                             *         &lt;element name="MontoImpuesto">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
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
                                "nombreCorto",
                                "codigoUnidadGravable",
                                "montoGravable",
                                "cantidadUnidadesGravables",
                                "montoImpuesto"
                            })
                            public static class Impuesto {

                                @XmlElement(name = "NombreCorto", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                                protected TipoImpuesto nombreCorto;
                                @XmlElement(name = "CodigoUnidadGravable", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                                protected BigInteger codigoUnidadGravable;
                                @XmlElement(name = "MontoGravable", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                                protected BigDecimal montoGravable;
                                @XmlElement(name = "CantidadUnidadesGravables", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                                protected BigDecimal cantidadUnidadesGravables;
                                @XmlElement(name = "MontoImpuesto", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                                protected GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto.MontoImpuesto montoImpuesto;

                                /**
                                 * Obtiene el valor de la propiedad nombreCorto.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link TipoImpuesto }
                                 *     
                                 */
                                public TipoImpuesto getNombreCorto() {
                                    return nombreCorto;
                                }

                                /**
                                 * Define el valor de la propiedad nombreCorto.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link TipoImpuesto }
                                 *     
                                 */
                                public void setNombreCorto(TipoImpuesto value) {
                                    this.nombreCorto = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad codigoUnidadGravable.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getCodigoUnidadGravable() {
                                    return codigoUnidadGravable;
                                }

                                /**
                                 * Define el valor de la propiedad codigoUnidadGravable.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setCodigoUnidadGravable(BigInteger value) {
                                    this.codigoUnidadGravable = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad montoGravable.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getMontoGravable() {
                                    return montoGravable;
                                }

                                /**
                                 * Define el valor de la propiedad montoGravable.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setMontoGravable(BigDecimal value) {
                                    this.montoGravable = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad cantidadUnidadesGravables.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getCantidadUnidadesGravables() {
                                    return cantidadUnidadesGravables;
                                }

                                /**
                                 * Define el valor de la propiedad cantidadUnidadesGravables.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setCantidadUnidadesGravables(BigDecimal value) {
                                    this.cantidadUnidadesGravables = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad montoImpuesto.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto.MontoImpuesto }
                                 *     
                                 */
                                public GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto.MontoImpuesto getMontoImpuesto() {
                                    return montoImpuesto;
                                }

                                /**
                                 * Define el valor de la propiedad montoImpuesto.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto.MontoImpuesto }
                                 *     
                                 */
                                public void setMontoImpuesto(GTDocumento.SAT.DTE.DatosEmision.Items.Item.Impuestos.Impuesto.MontoImpuesto value) {
                                    this.montoImpuesto = value;
                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.sat.gob.gt/dte/fel/0.1.0>NumeroNDecimales">
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class MontoImpuesto {

                                    @XmlValue
                                    protected BigDecimal value;

                                    /**
                                     * Acepta cantidades mayores a 0
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getValue() {
                                        return value;
                                    }

                                    /**
                                     * Define el valor de la propiedad value.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setValue(BigDecimal value) {
                                        this.value = value;
                                    }

                                }

                            }

                        }

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
                 *       &lt;sequence>
                 *         &lt;element name="DireccionReceptor" type="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoDireccion" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="IDReceptor" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}tipoNITReceptor">
                 *             &lt;pattern value="(([1-9])+([0-9])*([0-9]|K))|(([1-9]+[0-9]){12,13})|(CF)|^([A-Z0-9]{3,18})$"/>
                 *             &lt;whiteSpace value="collapse"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="TipoEspecial">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;whiteSpace value="collapse"/>
                 *             &lt;enumeration value="CUI"/>
                 *             &lt;enumeration value="EXT"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="NombreReceptor" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="255"/>
                 *             &lt;whiteSpace value="collapse"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CorreoReceptor">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoCorreoElectronico">
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
                @XmlType(name = "", propOrder = {
                    "direccionReceptor"
                })
                public static class Receptor {

                    @XmlElement(name = "DireccionReceptor", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                    protected TipoDireccion direccionReceptor;
                    @XmlAttribute(name = "IDReceptor", required = true)
                    protected String idReceptor;
                    @XmlAttribute(name = "TipoEspecial")
                    protected String tipoEspecial;
                    @XmlAttribute(name = "NombreReceptor", required = true)
                    protected String nombreReceptor;
                    @XmlAttribute(name = "CorreoReceptor")
                    protected String correoReceptor;

                    /**
                     * Obtiene el valor de la propiedad direccionReceptor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TipoDireccion }
                     *     
                     */
                    public TipoDireccion getDireccionReceptor() {
                        return direccionReceptor;
                    }

                    /**
                     * Define el valor de la propiedad direccionReceptor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TipoDireccion }
                     *     
                     */
                    public void setDireccionReceptor(TipoDireccion value) {
                        this.direccionReceptor = value;
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
                     * Obtiene el valor de la propiedad tipoEspecial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoEspecial() {
                        return tipoEspecial;
                    }

                    /**
                     * Define el valor de la propiedad tipoEspecial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoEspecial(String value) {
                        this.tipoEspecial = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad nombreReceptor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreReceptor() {
                        return nombreReceptor;
                    }

                    /**
                     * Define el valor de la propiedad nombreReceptor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreReceptor(String value) {
                        this.nombreReceptor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad correoReceptor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCorreoReceptor() {
                        return correoReceptor;
                    }

                    /**
                     * Define el valor de la propiedad correoReceptor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCorreoReceptor(String value) {
                        this.correoReceptor = value;
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
                 *       &lt;sequence>
                 *         &lt;element name="TotalImpuestos" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TotalImpuesto" maxOccurs="20">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="NombreCorto" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                 *                                 &lt;whiteSpace value="collapse"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                           &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="GranTotal" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales"/>
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
                    "totalImpuestos",
                    "granTotal"
                })
                public static class Totales {

                    @XmlElement(name = "TotalImpuestos", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0")
                    protected GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos totalImpuestos;
                    @XmlElement(name = "GranTotal", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                    protected BigDecimal granTotal;

                    /**
                     * Obtiene el valor de la propiedad totalImpuestos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos }
                     *     
                     */
                    public GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos getTotalImpuestos() {
                        return totalImpuestos;
                    }

                    /**
                     * Define el valor de la propiedad totalImpuestos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos }
                     *     
                     */
                    public void setTotalImpuestos(GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos value) {
                        this.totalImpuestos = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad granTotal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getGranTotal() {
                        return granTotal;
                    }

                    /**
                     * Define el valor de la propiedad granTotal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setGranTotal(BigDecimal value) {
                        this.granTotal = value;
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
                     *         &lt;element name="TotalImpuesto" maxOccurs="20">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="NombreCorto" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                     *                       &lt;whiteSpace value="collapse"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *                 &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
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
                        "totalImpuesto"
                    })
                    public static class TotalImpuestos {

                        @XmlElement(name = "TotalImpuesto", namespace = "http://www.sat.gob.gt/dte/fel/0.1.0", required = true)
                        protected List<GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos.TotalImpuesto> totalImpuesto;

                        /**
                         * Gets the value of the totalImpuesto property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the totalImpuesto property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getTotalImpuesto().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos.TotalImpuesto }
                         * 
                         * 
                         */
                        public List<GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos.TotalImpuesto> getTotalImpuesto() {
                            if (totalImpuesto == null) {
                                totalImpuesto = new ArrayList<GTDocumento.SAT.DTE.DatosEmision.Totales.TotalImpuestos.TotalImpuesto>();
                            }
                            return this.totalImpuesto;
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
                         *       &lt;attribute name="NombreCorto" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.sat.gob.gt/dte/fel/0.1.0}TipoImpuesto">
                         *             &lt;whiteSpace value="collapse"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *       &lt;attribute name="TotalMontoImpuesto" use="required" type="{http://www.sat.gob.gt/dte/fel/0.1.0}NumeroNDecimales" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class TotalImpuesto {

                            @XmlAttribute(name = "NombreCorto", required = true)
                            protected TipoImpuesto nombreCorto;
                            @XmlAttribute(name = "TotalMontoImpuesto", required = true)
                            protected BigDecimal totalMontoImpuesto;

                            /**
                             * Obtiene el valor de la propiedad nombreCorto.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TipoImpuesto }
                             *     
                             */
                            public TipoImpuesto getNombreCorto() {
                                return nombreCorto;
                            }

                            /**
                             * Define el valor de la propiedad nombreCorto.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TipoImpuesto }
                             *     
                             */
                            public void setNombreCorto(TipoImpuesto value) {
                                this.nombreCorto = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad totalMontoImpuesto.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getTotalMontoImpuesto() {
                                return totalMontoImpuesto;
                            }

                            /**
                             * Define el valor de la propiedad totalMontoImpuesto.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setTotalMontoImpuesto(BigDecimal value) {
                                this.totalMontoImpuesto = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
