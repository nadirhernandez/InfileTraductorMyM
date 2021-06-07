//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.10 a las 07:50:30 PM CST 
//


package com.infile.logic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="Optio" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="OrderHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TownCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Loc_Information14" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Loc_Information15" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Loc_Information16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Region1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VarRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CSTNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TINNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ServiceTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="General">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HMSOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NTSStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Meaning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="OrderChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="WarehouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WarehouseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderEntryOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="InvoiceDelivery" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NTS_ACK_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VAT_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VAT_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VAT_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Factura_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QRCEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NTS_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NTS_Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="LocalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LocalPrintDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LocalPrintTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                             &lt;element name="CMInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DSMACNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PricingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SALES_CENTER_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MessageForDist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BranchPrefixforRemito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DistributorDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Dist_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CorporateDistributorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DSCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TinType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TinLines" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Primary_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BillTo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="BillToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ShipTo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Lineage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FQSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NationalIDs">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="QSNationalIDs">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="QSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="QSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FQSNationalIDs">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FQSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FQSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="ATSInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginalOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OriginalOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RequestedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="OrderLine">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Item_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QtyOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="QtyReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Past_Qty_Released" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="SplitLineWarehouse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Vat_Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitPH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitFr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitLog" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitOth" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="ExtendedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="DiscRetail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="TaxRate_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="TaxRate_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="TaxRate_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Hazardous_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NonInventory_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VolumnPoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="EarnBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AlchoholPercent" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NumberOfOrderLines" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShippingInstructions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FreightCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FreightCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ShippingInstructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tax_Breakups">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="India_Service_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Due_Before_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_PH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="PaymentDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderPricing">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_Ret" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Tax_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Due_in_Words" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Total_Payments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Total_Payments_in_words" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="TotalOrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaymentReference" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="VolumePoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Total_Earn_Base" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PickList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QuantityReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="QuantityOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Product_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Extended_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="Unit_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LinesInPickList" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CalculatedWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "optio",
    "orderHeader",
    "orderLine",
    "shippingInstructions",
    "taxBreakups",
    "paymentDetails",
    "volumePoints",
    "totalEarnBase",
    "pickList",
    "calculatedWeight"
})
@XmlRootElement(name = "Order")
public class Order {

    @XmlElement(name = "Optio", required = true)
    protected Object optio;
    @XmlElement(name = "OrderHeader", required = true)
    protected Order.OrderHeader orderHeader;
    @XmlElement(name = "OrderLine", required = true)
    protected Order.OrderLine orderLine;
    @XmlElement(name = "ShippingInstructions", required = true)
    protected Order.ShippingInstructions shippingInstructions;
    @XmlElement(name = "Tax_Breakups", required = true)
    protected Order.TaxBreakups taxBreakups;
    @XmlElement(name = "PaymentDetails", required = true)
    protected Order.PaymentDetails paymentDetails;
    @XmlElement(name = "VolumePoints", required = true)
    protected BigDecimal volumePoints;
    @XmlElement(name = "Total_Earn_Base", required = true)
    protected BigDecimal totalEarnBase;
    @XmlElement(name = "PickList", required = true)
    protected Order.PickList pickList;
    @XmlElement(name = "CalculatedWeight", required = true)
    protected BigDecimal calculatedWeight;

    /**
     * Obtiene el valor de la propiedad optio.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOptio() {
        return optio;
    }

    /**
     * Define el valor de la propiedad optio.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOptio(Object value) {
        this.optio = value;
    }

    /**
     * Obtiene el valor de la propiedad orderHeader.
     * 
     * @return
     *     possible object is
     *     {@link Order.OrderHeader }
     *     
     */
    public Order.OrderHeader getOrderHeader() {
        return orderHeader;
    }

    /**
     * Define el valor de la propiedad orderHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.OrderHeader }
     *     
     */
    public void setOrderHeader(Order.OrderHeader value) {
        this.orderHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad orderLine.
     * 
     * @return
     *     possible object is
     *     {@link Order.OrderLine }
     *     
     */
    public Order.OrderLine getOrderLine() {
        return orderLine;
    }

    /**
     * Define el valor de la propiedad orderLine.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.OrderLine }
     *     
     */
    public void setOrderLine(Order.OrderLine value) {
        this.orderLine = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Order.ShippingInstructions }
     *     
     */
    public Order.ShippingInstructions getShippingInstructions() {
        return shippingInstructions;
    }

    /**
     * Define el valor de la propiedad shippingInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.ShippingInstructions }
     *     
     */
    public void setShippingInstructions(Order.ShippingInstructions value) {
        this.shippingInstructions = value;
    }

    /**
     * Obtiene el valor de la propiedad taxBreakups.
     * 
     * @return
     *     possible object is
     *     {@link Order.TaxBreakups }
     *     
     */
    public Order.TaxBreakups getTaxBreakups() {
        return taxBreakups;
    }

    /**
     * Define el valor de la propiedad taxBreakups.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.TaxBreakups }
     *     
     */
    public void setTaxBreakups(Order.TaxBreakups value) {
        this.taxBreakups = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link Order.PaymentDetails }
     *     
     */
    public Order.PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Define el valor de la propiedad paymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.PaymentDetails }
     *     
     */
    public void setPaymentDetails(Order.PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad volumePoints.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumePoints() {
        return volumePoints;
    }

    /**
     * Define el valor de la propiedad volumePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumePoints(BigDecimal value) {
        this.volumePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEarnBase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalEarnBase() {
        return totalEarnBase;
    }

    /**
     * Define el valor de la propiedad totalEarnBase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalEarnBase(BigDecimal value) {
        this.totalEarnBase = value;
    }

    /**
     * Obtiene el valor de la propiedad pickList.
     * 
     * @return
     *     possible object is
     *     {@link Order.PickList }
     *     
     */
    public Order.PickList getPickList() {
        return pickList;
    }

    /**
     * Define el valor de la propiedad pickList.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.PickList }
     *     
     */
    public void setPickList(Order.PickList value) {
        this.pickList = value;
    }

    /**
     * Obtiene el valor de la propiedad calculatedWeight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedWeight() {
        return calculatedWeight;
    }

    /**
     * Define el valor de la propiedad calculatedWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedWeight(BigDecimal value) {
        this.calculatedWeight = value;
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
     *         &lt;element name="OrgInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TownCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Loc_Information14" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Loc_Information15" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Loc_Information16" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Region1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VarRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CSTNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TINNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ServiceTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="General">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HMSOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NTSStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Meaning" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="OrderChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="WarehouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WarehouseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderEntryOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="InvoiceDelivery" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NTS_ACK_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VAT_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VAT_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VAT_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Factura_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QRCEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NTS_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NTS_Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="LocalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LocalPrintDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LocalPrintTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                   &lt;element name="CMInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DSMACNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PricingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SALES_CENTER_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MessageForDist" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BranchPrefixforRemito" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DistributorDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Dist_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CorporateDistributorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DSCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TinType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TinLines" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Primary_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BillTo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="BillToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ShipTo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Lineage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FQSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NationalIDs">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="QSNationalIDs">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="QSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="QSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FQSNationalIDs">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FQSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FQSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *         &lt;element name="ATSInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginalOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OriginalOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RequestedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "orgInformation",
        "general",
        "distributorDetails",
        "atsInformation"
    })
    public static class OrderHeader {

        @XmlElement(name = "OrgInformation", required = true)
        protected Order.OrderHeader.OrgInformation orgInformation;
        @XmlElement(name = "General", required = true)
        protected Order.OrderHeader.General general;
        @XmlElement(name = "DistributorDetails", required = true)
        protected Order.OrderHeader.DistributorDetails distributorDetails;
        @XmlElement(name = "ATSInformation", required = true)
        protected Order.OrderHeader.ATSInformation atsInformation;

        /**
         * Obtiene el valor de la propiedad orgInformation.
         * 
         * @return
         *     possible object is
         *     {@link Order.OrderHeader.OrgInformation }
         *     
         */
        public Order.OrderHeader.OrgInformation getOrgInformation() {
            return orgInformation;
        }

        /**
         * Define el valor de la propiedad orgInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.OrderHeader.OrgInformation }
         *     
         */
        public void setOrgInformation(Order.OrderHeader.OrgInformation value) {
            this.orgInformation = value;
        }

        /**
         * Obtiene el valor de la propiedad general.
         * 
         * @return
         *     possible object is
         *     {@link Order.OrderHeader.General }
         *     
         */
        public Order.OrderHeader.General getGeneral() {
            return general;
        }

        /**
         * Define el valor de la propiedad general.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.OrderHeader.General }
         *     
         */
        public void setGeneral(Order.OrderHeader.General value) {
            this.general = value;
        }

        /**
         * Obtiene el valor de la propiedad distributorDetails.
         * 
         * @return
         *     possible object is
         *     {@link Order.OrderHeader.DistributorDetails }
         *     
         */
        public Order.OrderHeader.DistributorDetails getDistributorDetails() {
            return distributorDetails;
        }

        /**
         * Define el valor de la propiedad distributorDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.OrderHeader.DistributorDetails }
         *     
         */
        public void setDistributorDetails(Order.OrderHeader.DistributorDetails value) {
            this.distributorDetails = value;
        }

        /**
         * Obtiene el valor de la propiedad atsInformation.
         * 
         * @return
         *     possible object is
         *     {@link Order.OrderHeader.ATSInformation }
         *     
         */
        public Order.OrderHeader.ATSInformation getATSInformation() {
            return atsInformation;
        }

        /**
         * Define el valor de la propiedad atsInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.OrderHeader.ATSInformation }
         *     
         */
        public void setATSInformation(Order.OrderHeader.ATSInformation value) {
            this.atsInformation = value;
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
         *         &lt;element name="OriginalOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OriginalOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RequestedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "originalOrderNo",
            "originalOrderDate",
            "orderCode",
            "requestedBy",
            "approvedBy"
        })
        public static class ATSInformation {

            @XmlElement(name = "OriginalOrderNo", required = true)
            protected String originalOrderNo;
            @XmlElement(name = "OriginalOrderDate", required = true)
            protected String originalOrderDate;
            @XmlElement(name = "OrderCode", required = true)
            protected String orderCode;
            @XmlElement(name = "RequestedBy", required = true)
            protected String requestedBy;
            @XmlElement(name = "ApprovedBy", required = true)
            protected String approvedBy;

            /**
             * Obtiene el valor de la propiedad originalOrderNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalOrderNo() {
                return originalOrderNo;
            }

            /**
             * Define el valor de la propiedad originalOrderNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalOrderNo(String value) {
                this.originalOrderNo = value;
            }

            /**
             * Obtiene el valor de la propiedad originalOrderDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalOrderDate() {
                return originalOrderDate;
            }

            /**
             * Define el valor de la propiedad originalOrderDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalOrderDate(String value) {
                this.originalOrderDate = value;
            }

            /**
             * Obtiene el valor de la propiedad orderCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderCode() {
                return orderCode;
            }

            /**
             * Define el valor de la propiedad orderCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderCode(String value) {
                this.orderCode = value;
            }

            /**
             * Obtiene el valor de la propiedad requestedBy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestedBy() {
                return requestedBy;
            }

            /**
             * Define el valor de la propiedad requestedBy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestedBy(String value) {
                this.requestedBy = value;
            }

            /**
             * Obtiene el valor de la propiedad approvedBy.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovedBy() {
                return approvedBy;
            }

            /**
             * Define el valor de la propiedad approvedBy.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovedBy(String value) {
                this.approvedBy = value;
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
         *         &lt;element name="DSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Dist_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CorporateDistributorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DSCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TinType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TinLines" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Primary_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BillTo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="BillToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ShipTo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Lineage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FQSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NationalIDs">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="QSNationalIDs">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="QSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="QSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FQSNationalIDs">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FQSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FQSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "dsid",
            "dsName",
            "dsLocalName",
            "distType",
            "corporateDistributorName",
            "dsCompanyName",
            "tinType",
            "tinLines",
            "primaryEmailAddress",
            "billTo",
            "shipTo",
            "lineage",
            "nationalIDs",
            "qsNationalIDs",
            "fqsNationalIDs"
        })
        public static class DistributorDetails {

            @XmlElement(name = "DSID", required = true)
            protected String dsid;
            @XmlElement(name = "DSName", required = true)
            protected String dsName;
            @XmlElement(name = "DSLocalName", required = true)
            protected String dsLocalName;
            @XmlElement(name = "Dist_Type", required = true)
            protected String distType;
            @XmlElement(name = "CorporateDistributorName", required = true)
            protected String corporateDistributorName;
            @XmlElement(name = "DSCompanyName", required = true)
            protected String dsCompanyName;
            @XmlElement(name = "TinType", required = true)
            protected String tinType;
            @XmlElement(name = "TinLines", required = true)
            protected String tinLines;
            @XmlElement(name = "Primary_EmailAddress", required = true)
            protected String primaryEmailAddress;
            @XmlElement(name = "BillTo", required = true)
            protected Order.OrderHeader.DistributorDetails.BillTo billTo;
            @XmlElement(name = "ShipTo", required = true)
            protected Order.OrderHeader.DistributorDetails.ShipTo shipTo;
            @XmlElement(name = "Lineage", required = true)
            protected Order.OrderHeader.DistributorDetails.Lineage lineage;
            @XmlElement(name = "NationalIDs", required = true)
            protected Order.OrderHeader.DistributorDetails.NationalIDs nationalIDs;
            @XmlElement(name = "QSNationalIDs", required = true)
            protected Order.OrderHeader.DistributorDetails.QSNationalIDs qsNationalIDs;
            @XmlElement(name = "FQSNationalIDs", required = true)
            protected Order.OrderHeader.DistributorDetails.FQSNationalIDs fqsNationalIDs;

            /**
             * Obtiene el valor de la propiedad dsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSID() {
                return dsid;
            }

            /**
             * Define el valor de la propiedad dsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSID(String value) {
                this.dsid = value;
            }

            /**
             * Obtiene el valor de la propiedad dsName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSName() {
                return dsName;
            }

            /**
             * Define el valor de la propiedad dsName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSName(String value) {
                this.dsName = value;
            }

            /**
             * Obtiene el valor de la propiedad dsLocalName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSLocalName() {
                return dsLocalName;
            }

            /**
             * Define el valor de la propiedad dsLocalName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSLocalName(String value) {
                this.dsLocalName = value;
            }

            /**
             * Obtiene el valor de la propiedad distType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistType() {
                return distType;
            }

            /**
             * Define el valor de la propiedad distType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistType(String value) {
                this.distType = value;
            }

            /**
             * Obtiene el valor de la propiedad corporateDistributorName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorporateDistributorName() {
                return corporateDistributorName;
            }

            /**
             * Define el valor de la propiedad corporateDistributorName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorporateDistributorName(String value) {
                this.corporateDistributorName = value;
            }

            /**
             * Obtiene el valor de la propiedad dsCompanyName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSCompanyName() {
                return dsCompanyName;
            }

            /**
             * Define el valor de la propiedad dsCompanyName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSCompanyName(String value) {
                this.dsCompanyName = value;
            }

            /**
             * Obtiene el valor de la propiedad tinType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTinType() {
                return tinType;
            }

            /**
             * Define el valor de la propiedad tinType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTinType(String value) {
                this.tinType = value;
            }

            /**
             * Obtiene el valor de la propiedad tinLines.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTinLines() {
                return tinLines;
            }

            /**
             * Define el valor de la propiedad tinLines.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTinLines(String value) {
                this.tinLines = value;
            }

            /**
             * Obtiene el valor de la propiedad primaryEmailAddress.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryEmailAddress() {
                return primaryEmailAddress;
            }

            /**
             * Define el valor de la propiedad primaryEmailAddress.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryEmailAddress(String value) {
                this.primaryEmailAddress = value;
            }

            /**
             * Obtiene el valor de la propiedad billTo.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.BillTo }
             *     
             */
            public Order.OrderHeader.DistributorDetails.BillTo getBillTo() {
                return billTo;
            }

            /**
             * Define el valor de la propiedad billTo.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.BillTo }
             *     
             */
            public void setBillTo(Order.OrderHeader.DistributorDetails.BillTo value) {
                this.billTo = value;
            }

            /**
             * Obtiene el valor de la propiedad shipTo.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.ShipTo }
             *     
             */
            public Order.OrderHeader.DistributorDetails.ShipTo getShipTo() {
                return shipTo;
            }

            /**
             * Define el valor de la propiedad shipTo.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.ShipTo }
             *     
             */
            public void setShipTo(Order.OrderHeader.DistributorDetails.ShipTo value) {
                this.shipTo = value;
            }

            /**
             * Obtiene el valor de la propiedad lineage.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.Lineage }
             *     
             */
            public Order.OrderHeader.DistributorDetails.Lineage getLineage() {
                return lineage;
            }

            /**
             * Define el valor de la propiedad lineage.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.Lineage }
             *     
             */
            public void setLineage(Order.OrderHeader.DistributorDetails.Lineage value) {
                this.lineage = value;
            }

            /**
             * Obtiene el valor de la propiedad nationalIDs.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.NationalIDs }
             *     
             */
            public Order.OrderHeader.DistributorDetails.NationalIDs getNationalIDs() {
                return nationalIDs;
            }

            /**
             * Define el valor de la propiedad nationalIDs.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.NationalIDs }
             *     
             */
            public void setNationalIDs(Order.OrderHeader.DistributorDetails.NationalIDs value) {
                this.nationalIDs = value;
            }

            /**
             * Obtiene el valor de la propiedad qsNationalIDs.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.QSNationalIDs }
             *     
             */
            public Order.OrderHeader.DistributorDetails.QSNationalIDs getQSNationalIDs() {
                return qsNationalIDs;
            }

            /**
             * Define el valor de la propiedad qsNationalIDs.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.QSNationalIDs }
             *     
             */
            public void setQSNationalIDs(Order.OrderHeader.DistributorDetails.QSNationalIDs value) {
                this.qsNationalIDs = value;
            }

            /**
             * Obtiene el valor de la propiedad fqsNationalIDs.
             * 
             * @return
             *     possible object is
             *     {@link Order.OrderHeader.DistributorDetails.FQSNationalIDs }
             *     
             */
            public Order.OrderHeader.DistributorDetails.FQSNationalIDs getFQSNationalIDs() {
                return fqsNationalIDs;
            }

            /**
             * Define el valor de la propiedad fqsNationalIDs.
             * 
             * @param value
             *     allowed object is
             *     {@link Order.OrderHeader.DistributorDetails.FQSNationalIDs }
             *     
             */
            public void setFQSNationalIDs(Order.OrderHeader.DistributorDetails.FQSNationalIDs value) {
                this.fqsNationalIDs = value;
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
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="BillToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                "name",
                "dsLastName",
                "dsMiddleName",
                "dsFirstName",
                "address1",
                "address2",
                "address3",
                "zipcode",
                "state",
                "city",
                "county",
                "billToAddress",
                "country",
                "phone"
            })
            public static class BillTo {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "DSLastName", required = true)
                protected String dsLastName;
                @XmlElement(name = "DSMiddleName", required = true)
                protected String dsMiddleName;
                @XmlElement(name = "DSFirstName", required = true)
                protected String dsFirstName;
                @XmlElement(name = "Address1", required = true)
                protected String address1;
                @XmlElement(name = "Address2", required = true)
                protected String address2;
                @XmlElement(name = "Address3", required = true)
                protected String address3;
                @XmlElement(name = "Zipcode", required = true)
                protected String zipcode;
                @XmlElement(name = "State", required = true)
                protected String state;
                @XmlElement(name = "City", required = true)
                protected String city;
                @XmlElement(name = "County", required = true)
                protected String county;
                @XmlElement(name = "BillToAddress", required = true)
                protected String billToAddress;
                @XmlElement(name = "Country", required = true)
                protected String country;
                @XmlElement(name = "Phone", required = true)
                protected String phone;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad dsLastName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSLastName() {
                    return dsLastName;
                }

                /**
                 * Define el valor de la propiedad dsLastName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSLastName(String value) {
                    this.dsLastName = value;
                }

                /**
                 * Obtiene el valor de la propiedad dsMiddleName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSMiddleName() {
                    return dsMiddleName;
                }

                /**
                 * Define el valor de la propiedad dsMiddleName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSMiddleName(String value) {
                    this.dsMiddleName = value;
                }

                /**
                 * Obtiene el valor de la propiedad dsFirstName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSFirstName() {
                    return dsFirstName;
                }

                /**
                 * Define el valor de la propiedad dsFirstName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSFirstName(String value) {
                    this.dsFirstName = value;
                }

                /**
                 * Obtiene el valor de la propiedad address1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress1() {
                    return address1;
                }

                /**
                 * Define el valor de la propiedad address1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress1(String value) {
                    this.address1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad address2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress2() {
                    return address2;
                }

                /**
                 * Define el valor de la propiedad address2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress2(String value) {
                    this.address2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad address3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress3() {
                    return address3;
                }

                /**
                 * Define el valor de la propiedad address3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress3(String value) {
                    this.address3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad zipcode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZipcode() {
                    return zipcode;
                }

                /**
                 * Define el valor de la propiedad zipcode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZipcode(String value) {
                    this.zipcode = value;
                }

                /**
                 * Obtiene el valor de la propiedad state.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Define el valor de la propiedad state.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                /**
                 * Obtiene el valor de la propiedad city.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Define el valor de la propiedad city.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Obtiene el valor de la propiedad county.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCounty() {
                    return county;
                }

                /**
                 * Define el valor de la propiedad county.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCounty(String value) {
                    this.county = value;
                }

                /**
                 * Obtiene el valor de la propiedad billToAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBillToAddress() {
                    return billToAddress;
                }

                /**
                 * Define el valor de la propiedad billToAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBillToAddress(String value) {
                    this.billToAddress = value;
                }

                /**
                 * Obtiene el valor de la propiedad country.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Define el valor de la propiedad country.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Obtiene el valor de la propiedad phone.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public String getPhone() {
                    return phone;
                }

                /**
                 * Define el valor de la propiedad phone.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPhone(String value) {
                    this.phone = value;
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
             *         &lt;element name="FQSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "fqsNationalIDCode1",
                "fqsNationalID1",
                "fqsNationalIDCode2",
                "fqsNationalID2",
                "fqsNationalIDCode3",
                "fqsNationalID3",
                "fqsNationalIDCode4",
                "fqsNationalID4",
                "fqsNationalIDCode5",
                "fqsNationalID5"
            })
            public static class FQSNationalIDs {

                @XmlElement(name = "FQSNationalID_Code1", required = true)
                protected String fqsNationalIDCode1;
                @XmlElement(name = "FQSNationalID1", required = true)
                protected String fqsNationalID1;
                @XmlElement(name = "FQSNationalID_Code2", required = true)
                protected String fqsNationalIDCode2;
                @XmlElement(name = "FQSNationalID2", required = true)
                protected String fqsNationalID2;
                @XmlElement(name = "FQSNationalID_Code3", required = true)
                protected String fqsNationalIDCode3;
                @XmlElement(name = "FQSNationalID3", required = true)
                protected String fqsNationalID3;
                @XmlElement(name = "FQSNationalID_Code4", required = true)
                protected String fqsNationalIDCode4;
                @XmlElement(name = "FQSNationalID4", required = true)
                protected String fqsNationalID4;
                @XmlElement(name = "FQSNationalID_Code5", required = true)
                protected String fqsNationalIDCode5;
                @XmlElement(name = "FQSNationalID5", required = true)
                protected String fqsNationalID5;

                /**
                 * Obtiene el valor de la propiedad fqsNationalIDCode1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalIDCode1() {
                    return fqsNationalIDCode1;
                }

                /**
                 * Define el valor de la propiedad fqsNationalIDCode1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalIDCode1(String value) {
                    this.fqsNationalIDCode1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalID1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalID1() {
                    return fqsNationalID1;
                }

                /**
                 * Define el valor de la propiedad fqsNationalID1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalID1(String value) {
                    this.fqsNationalID1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalIDCode2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalIDCode2() {
                    return fqsNationalIDCode2;
                }

                /**
                 * Define el valor de la propiedad fqsNationalIDCode2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalIDCode2(String value) {
                    this.fqsNationalIDCode2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalID2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalID2() {
                    return fqsNationalID2;
                }

                /**
                 * Define el valor de la propiedad fqsNationalID2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalID2(String value) {
                    this.fqsNationalID2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalIDCode3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalIDCode3() {
                    return fqsNationalIDCode3;
                }

                /**
                 * Define el valor de la propiedad fqsNationalIDCode3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalIDCode3(String value) {
                    this.fqsNationalIDCode3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalID3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalID3() {
                    return fqsNationalID3;
                }

                /**
                 * Define el valor de la propiedad fqsNationalID3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalID3(String value) {
                    this.fqsNationalID3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalIDCode4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalIDCode4() {
                    return fqsNationalIDCode4;
                }

                /**
                 * Define el valor de la propiedad fqsNationalIDCode4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalIDCode4(String value) {
                    this.fqsNationalIDCode4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalID4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalID4() {
                    return fqsNationalID4;
                }

                /**
                 * Define el valor de la propiedad fqsNationalID4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalID4(String value) {
                    this.fqsNationalID4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalIDCode5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalIDCode5() {
                    return fqsNationalIDCode5;
                }

                /**
                 * Define el valor de la propiedad fqsNationalIDCode5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalIDCode5(String value) {
                    this.fqsNationalIDCode5 = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsNationalID5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSNationalID5() {
                    return fqsNationalID5;
                }

                /**
                 * Define el valor de la propiedad fqsNationalID5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSNationalID5(String value) {
                    this.fqsNationalID5 = value;
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
             *         &lt;element name="FQSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FQSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSLocalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSMiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "fqsName",
                "fqsLocalName",
                "fqsLastName",
                "fqsMiddleName",
                "fqsFirstName",
                "fqsid",
                "qsName",
                "qsLocalName",
                "qsLastName",
                "qsMiddleName",
                "qsFirstName",
                "qsid"
            })
            public static class Lineage {

                @XmlElement(name = "FQSName", required = true)
                protected String fqsName;
                @XmlElement(name = "FQSLocalName", required = true)
                protected String fqsLocalName;
                @XmlElement(name = "FQSLastName", required = true)
                protected String fqsLastName;
                @XmlElement(name = "FQSMiddleName", required = true)
                protected String fqsMiddleName;
                @XmlElement(name = "FQSFirstName", required = true)
                protected String fqsFirstName;
                @XmlElement(name = "FQSID", required = true)
                protected String fqsid;
                @XmlElement(name = "QSName", required = true)
                protected String qsName;
                @XmlElement(name = "QSLocalName", required = true)
                protected String qsLocalName;
                @XmlElement(name = "QSLastName", required = true)
                protected String qsLastName;
                @XmlElement(name = "QSMiddleName", required = true)
                protected String qsMiddleName;
                @XmlElement(name = "QSFirstName", required = true)
                protected String qsFirstName;
                @XmlElement(name = "QSID", required = true)
                protected String qsid;

                /**
                 * Obtiene el valor de la propiedad fqsName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSName() {
                    return fqsName;
                }

                /**
                 * Define el valor de la propiedad fqsName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSName(String value) {
                    this.fqsName = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsLocalName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSLocalName() {
                    return fqsLocalName;
                }

                /**
                 * Define el valor de la propiedad fqsLocalName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSLocalName(String value) {
                    this.fqsLocalName = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsLastName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSLastName() {
                    return fqsLastName;
                }

                /**
                 * Define el valor de la propiedad fqsLastName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSLastName(String value) {
                    this.fqsLastName = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsMiddleName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSMiddleName() {
                    return fqsMiddleName;
                }

                /**
                 * Define el valor de la propiedad fqsMiddleName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSMiddleName(String value) {
                    this.fqsMiddleName = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsFirstName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSFirstName() {
                    return fqsFirstName;
                }

                /**
                 * Define el valor de la propiedad fqsFirstName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSFirstName(String value) {
                    this.fqsFirstName = value;
                }

                /**
                 * Obtiene el valor de la propiedad fqsid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFQSID() {
                    return fqsid;
                }

                /**
                 * Define el valor de la propiedad fqsid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFQSID(String value) {
                    this.fqsid = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSName() {
                    return qsName;
                }

                /**
                 * Define el valor de la propiedad qsName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSName(String value) {
                    this.qsName = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsLocalName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSLocalName() {
                    return qsLocalName;
                }

                /**
                 * Define el valor de la propiedad qsLocalName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSLocalName(String value) {
                    this.qsLocalName = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsLastName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSLastName() {
                    return qsLastName;
                }

                /**
                 * Define el valor de la propiedad qsLastName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSLastName(String value) {
                    this.qsLastName = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsMiddleName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSMiddleName() {
                    return qsMiddleName;
                }

                /**
                 * Define el valor de la propiedad qsMiddleName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSMiddleName(String value) {
                    this.qsMiddleName = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsFirstName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSFirstName() {
                    return qsFirstName;
                }

                /**
                 * Define el valor de la propiedad qsFirstName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSFirstName(String value) {
                    this.qsFirstName = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSID() {
                    return qsid;
                }

                /**
                 * Define el valor de la propiedad qsid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSID(String value) {
                    this.qsid = value;
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
             *         &lt;element name="NationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "nationalIDCode1",
                "nationalID1",
                "nationalIDCode2",
                "nationalID2",
                "nationalIDCode3",
                "nationalID3",
                "nationalIDCode4",
                "nationalID4",
                "nationalIDCode5",
                "nationalID5"
            })
            public static class NationalIDs {

                @XmlElement(name = "NationalID_Code1", required = true)
                protected String nationalIDCode1;
                @XmlElement(name = "NationalID1", required = true)
                protected String nationalID1;
                @XmlElement(name = "NationalID_Code2", required = true)
                protected String nationalIDCode2;
                @XmlElement(name = "NationalID2", required = true)
                protected String nationalID2;
                @XmlElement(name = "NationalID_Code3", required = true)
                protected String nationalIDCode3;
                @XmlElement(name = "NationalID3", required = true)
                protected String nationalID3;
                @XmlElement(name = "NationalID_Code4", required = true)
                protected String nationalIDCode4;
                @XmlElement(name = "NationalID4", required = true)
                protected String nationalID4;
                @XmlElement(name = "NationalID_Code5", required = true)
                protected String nationalIDCode5;
                @XmlElement(name = "NationalID5", required = true)
                protected String nationalID5;

                /**
                 * Obtiene el valor de la propiedad nationalIDCode1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalIDCode1() {
                    return nationalIDCode1;
                }

                /**
                 * Define el valor de la propiedad nationalIDCode1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalIDCode1(String value) {
                    this.nationalIDCode1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalID1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalID1() {
                    return nationalID1;
                }

                /**
                 * Define el valor de la propiedad nationalID1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalID1(String value) {
                    this.nationalID1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalIDCode2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalIDCode2() {
                    return nationalIDCode2;
                }

                /**
                 * Define el valor de la propiedad nationalIDCode2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalIDCode2(String value) {
                    this.nationalIDCode2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalID2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalID2() {
                    return nationalID2;
                }

                /**
                 * Define el valor de la propiedad nationalID2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalID2(String value) {
                    this.nationalID2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalIDCode3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalIDCode3() {
                    return nationalIDCode3;
                }

                /**
                 * Define el valor de la propiedad nationalIDCode3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalIDCode3(String value) {
                    this.nationalIDCode3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalID3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalID3() {
                    return nationalID3;
                }

                /**
                 * Define el valor de la propiedad nationalID3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalID3(String value) {
                    this.nationalID3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalIDCode4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalIDCode4() {
                    return nationalIDCode4;
                }

                /**
                 * Define el valor de la propiedad nationalIDCode4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalIDCode4(String value) {
                    this.nationalIDCode4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalID4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalID4() {
                    return nationalID4;
                }

                /**
                 * Define el valor de la propiedad nationalID4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalID4(String value) {
                    this.nationalID4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalIDCode5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalIDCode5() {
                    return nationalIDCode5;
                }

                /**
                 * Define el valor de la propiedad nationalIDCode5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalIDCode5(String value) {
                    this.nationalIDCode5 = value;
                }

                /**
                 * Obtiene el valor de la propiedad nationalID5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNationalID5() {
                    return nationalID5;
                }

                /**
                 * Define el valor de la propiedad nationalID5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNationalID5(String value) {
                    this.nationalID5 = value;
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
             *         &lt;element name="QSNationalID_Code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID_Code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID_Code3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID_Code4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID_Code5" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="QSNationalID5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "qsNationalIDCode1",
                "qsNationalID1",
                "qsNationalIDCode2",
                "qsNationalID2",
                "qsNationalIDCode3",
                "qsNationalID3",
                "qsNationalIDCode4",
                "qsNationalID4",
                "qsNationalIDCode5",
                "qsNationalID5"
            })
            public static class QSNationalIDs {

                @XmlElement(name = "QSNationalID_Code1", required = true)
                protected String qsNationalIDCode1;
                @XmlElement(name = "QSNationalID1", required = true)
                protected String qsNationalID1;
                @XmlElement(name = "QSNationalID_Code2", required = true)
                protected String qsNationalIDCode2;
                @XmlElement(name = "QSNationalID2", required = true)
                protected String qsNationalID2;
                @XmlElement(name = "QSNationalID_Code3", required = true)
                protected String qsNationalIDCode3;
                @XmlElement(name = "QSNationalID3", required = true)
                protected String qsNationalID3;
                @XmlElement(name = "QSNationalID_Code4", required = true)
                protected String qsNationalIDCode4;
                @XmlElement(name = "QSNationalID4", required = true)
                protected String qsNationalID4;
                @XmlElement(name = "QSNationalID_Code5", required = true)
                protected String qsNationalIDCode5;
                @XmlElement(name = "QSNationalID5", required = true)
                protected String qsNationalID5;

                /**
                 * Obtiene el valor de la propiedad qsNationalIDCode1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalIDCode1() {
                    return qsNationalIDCode1;
                }

                /**
                 * Define el valor de la propiedad qsNationalIDCode1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalIDCode1(String value) {
                    this.qsNationalIDCode1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalID1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalID1() {
                    return qsNationalID1;
                }

                /**
                 * Define el valor de la propiedad qsNationalID1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalID1(String value) {
                    this.qsNationalID1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalIDCode2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalIDCode2() {
                    return qsNationalIDCode2;
                }

                /**
                 * Define el valor de la propiedad qsNationalIDCode2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalIDCode2(String value) {
                    this.qsNationalIDCode2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalID2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalID2() {
                    return qsNationalID2;
                }

                /**
                 * Define el valor de la propiedad qsNationalID2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalID2(String value) {
                    this.qsNationalID2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalIDCode3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalIDCode3() {
                    return qsNationalIDCode3;
                }

                /**
                 * Define el valor de la propiedad qsNationalIDCode3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalIDCode3(String value) {
                    this.qsNationalIDCode3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalID3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalID3() {
                    return qsNationalID3;
                }

                /**
                 * Define el valor de la propiedad qsNationalID3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalID3(String value) {
                    this.qsNationalID3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalIDCode4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalIDCode4() {
                    return qsNationalIDCode4;
                }

                /**
                 * Define el valor de la propiedad qsNationalIDCode4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalIDCode4(String value) {
                    this.qsNationalIDCode4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalID4.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalID4() {
                    return qsNationalID4;
                }

                /**
                 * Define el valor de la propiedad qsNationalID4.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalID4(String value) {
                    this.qsNationalID4 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalIDCode5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalIDCode5() {
                    return qsNationalIDCode5;
                }

                /**
                 * Define el valor de la propiedad qsNationalIDCode5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalIDCode5(String value) {
                    this.qsNationalIDCode5 = value;
                }

                /**
                 * Obtiene el valor de la propiedad qsNationalID5.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQSNationalID5() {
                    return qsNationalID5;
                }

                /**
                 * Define el valor de la propiedad qsNationalID5.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQSNationalID5(String value) {
                    this.qsNationalID5 = value;
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
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "name",
                "address1",
                "address2",
                "address3",
                "shipToState",
                "city",
                "zipcode",
                "county",
                "shipToAddress",
                "country",
                "phone"
            })
            public static class ShipTo {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "Address1", required = true)
                protected String address1;
                @XmlElement(name = "Address2", required = true)
                protected String address2;
                @XmlElement(name = "Address3", required = true)
                protected String address3;
                @XmlElement(name = "ShipToState", required = true)
                protected String shipToState;
                @XmlElement(name = "City", required = true)
                protected String city;
                @XmlElement(name = "Zipcode", required = true)
                protected String zipcode;
                @XmlElement(name = "County", required = true)
                protected String county;
                @XmlElement(name = "ShipToAddress", required = true)
                protected String shipToAddress;
                @XmlElement(name = "Country", required = true)
                protected String country;
                @XmlElement(name = "Phone", required = true)
                protected String phone;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad address1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress1() {
                    return address1;
                }

                /**
                 * Define el valor de la propiedad address1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress1(String value) {
                    this.address1 = value;
                }

                /**
                 * Obtiene el valor de la propiedad address2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress2() {
                    return address2;
                }

                /**
                 * Define el valor de la propiedad address2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress2(String value) {
                    this.address2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad address3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddress3() {
                    return address3;
                }

                /**
                 * Define el valor de la propiedad address3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddress3(String value) {
                    this.address3 = value;
                }

                /**
                 * Obtiene el valor de la propiedad shipToState.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToState() {
                    return shipToState;
                }

                /**
                 * Define el valor de la propiedad shipToState.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToState(String value) {
                    this.shipToState = value;
                }

                /**
                 * Obtiene el valor de la propiedad city.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Define el valor de la propiedad city.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Obtiene el valor de la propiedad zipcode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZipcode() {
                    return zipcode;
                }

                /**
                 * Define el valor de la propiedad zipcode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZipcode(String value) {
                    this.zipcode = value;
                }

                /**
                 * Obtiene el valor de la propiedad county.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCounty() {
                    return county;
                }

                /**
                 * Define el valor de la propiedad county.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCounty(String value) {
                    this.county = value;
                }

                /**
                 * Obtiene el valor de la propiedad shipToAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToAddress() {
                    return shipToAddress;
                }

                /**
                 * Define el valor de la propiedad shipToAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToAddress(String value) {
                    this.shipToAddress = value;
                }

                /**
                 * Obtiene el valor de la propiedad country.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Define el valor de la propiedad country.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Obtiene el valor de la propiedad phone.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhone() {
                    return phone;
                }

                /**
                 * Define el valor de la propiedad phone.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhone(String value) {
                    this.phone = value;
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
         *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HMSOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NTSStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Meaning" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="OrderChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Attribute16" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="WarehouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WarehouseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OrderEntryOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="InvoiceDelivery" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NTS_ACK_EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VAT_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VAT_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VAT_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Factura_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="QRCEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NTS_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NTS_Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="LocalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LocalPrintDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LocalPrintTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *         &lt;element name="CMInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DSMACNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PricingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SALES_CENTER_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MessageForDist" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BranchPrefixforRemito" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "orderType",
            "orderNumber",
            "hmsOrderNumber",
            "orderMonth",
            "ntsStatus",
            "meaning",
            "note",
            "exchangerate",
            "orderDate",
            "orderTime",
            "orderChannel",
            "attribute16",
            "orderSubType",
            "discount",
            "warehouseNumber",
            "warehouseDescription",
            "orderEntryOperator",
            "invoiceDelivery",
            "command",
            "ntsackEmailAddress",
            "vatCode",
            "vatFlag",
            "vatNumber",
            "facturaNumber",
            "qrcEmail",
            "authorizationNumber",
            "ntsDate",
            "ntsTime",
            "localTime",
            "localPrintDate",
            "localPrintTime",
            "paidDate",
            "paidTime",
            "cmInvoiceNumber",
            "dsmacNo",
            "pricingDate",
            "salescentercharge",
            "messageForDist",
            "branchPrefixforRemito"
        })
        public static class General {

            @XmlElement(name = "OrderType", required = true)
            protected String orderType;
            @XmlElement(name = "OrderNumber", required = true)
            protected String orderNumber;
            @XmlElement(name = "HMSOrderNumber", required = true)
            protected String hmsOrderNumber;
            @XmlElement(name = "OrderMonth", required = true)
            protected String orderMonth;
            @XmlElement(name = "NTSStatus", required = true)
            protected String ntsStatus;
            @XmlElement(name = "Meaning", required = true)
            protected String meaning;
            @XmlElement(name = "Note", required = true)
            protected String note;
            @XmlElement(name = "EXCHANGERATE", required = true)
            protected BigDecimal exchangerate;
            @XmlElement(name = "OrderDate", required = true)
            protected String orderDate;
            @XmlElement(name = "OrderTime", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar orderTime;
            @XmlElement(name = "OrderChannel", required = true)
            protected String orderChannel;
            @XmlElement(name = "Attribute16", required = true)
            protected String attribute16;
            @XmlElement(name = "OrderSubType", required = true)
            protected String orderSubType;
            @XmlElement(name = "Discount", required = true)
            protected BigInteger discount;
            @XmlElement(name = "WarehouseNumber", required = true)
            protected String warehouseNumber;
            @XmlElement(name = "WarehouseDescription", required = true)
            protected String warehouseDescription;
            @XmlElement(name = "OrderEntryOperator", required = true)
            protected String orderEntryOperator;
            @XmlElement(name = "InvoiceDelivery", required = true)
            protected BigInteger invoiceDelivery;
            @XmlElement(name = "Command", required = true)
            protected String command;
            @XmlElement(name = "NTS_ACK_EmailAddress", required = true)
            protected String ntsackEmailAddress;
            @XmlElement(name = "VAT_Code", required = true)
            protected String vatCode;
            @XmlElement(name = "VAT_Flag", required = true)
            protected String vatFlag;
            @XmlElement(name = "VAT_Number", required = true)
            protected String vatNumber;
            @XmlElement(name = "Factura_Number", required = true)
            protected String facturaNumber;
            @XmlElement(name = "QRCEmail", required = true)
            protected String qrcEmail;
            @XmlElement(name = "AuthorizationNumber", required = true)
            protected String authorizationNumber;
            @XmlElement(name = "NTS_Date", required = true)
            protected String ntsDate;
            @XmlElement(name = "NTS_Time", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar ntsTime;
            @XmlElement(name = "LocalTime", required = true)
            protected String localTime;
            @XmlElement(name = "LocalPrintDate", required = true)
            protected String localPrintDate;
            @XmlElement(name = "LocalPrintTime", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar localPrintTime;
            @XmlElement(name = "PaidDate", required = true)
            protected String paidDate;
            @XmlElement(name = "PaidTime", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar paidTime;
            @XmlElement(name = "CMInvoiceNumber", required = true)
            protected String cmInvoiceNumber;
            @XmlElement(name = "DSMACNo", required = true)
            protected String dsmacNo;
            @XmlElement(name = "PricingDate", required = true)
            protected String pricingDate;
            @XmlElement(name = "SALES_CENTER_CHARGE", required = true)
            protected String salescentercharge;
            @XmlElement(name = "MessageForDist", required = true)
            protected String messageForDist;
            @XmlElement(name = "BranchPrefixforRemito", required = true)
            protected String branchPrefixforRemito;

            /**
             * Obtiene el valor de la propiedad orderType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderType() {
                return orderType;
            }

            /**
             * Define el valor de la propiedad orderType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderType(String value) {
                this.orderType = value;
            }

            /**
             * Obtiene el valor de la propiedad orderNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderNumber() {
                return orderNumber;
            }

            /**
             * Define el valor de la propiedad orderNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderNumber(String value) {
                this.orderNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad hmsOrderNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHMSOrderNumber() {
                return hmsOrderNumber;
            }

            /**
             * Define el valor de la propiedad hmsOrderNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHMSOrderNumber(String value) {
                this.hmsOrderNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad orderMonth.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderMonth() {
                return orderMonth;
            }

            /**
             * Define el valor de la propiedad orderMonth.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderMonth(String value) {
                this.orderMonth = value;
            }

            /**
             * Obtiene el valor de la propiedad ntsStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNTSStatus() {
                return ntsStatus;
            }

            /**
             * Define el valor de la propiedad ntsStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNTSStatus(String value) {
                this.ntsStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad meaning.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeaning() {
                return meaning;
            }

            /**
             * Define el valor de la propiedad meaning.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeaning(String value) {
                this.meaning = value;
            }

            /**
             * Obtiene el valor de la propiedad note.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Define el valor de la propiedad note.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
            }

            /**
             * Obtiene el valor de la propiedad exchangerate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEXCHANGERATE() {
                return exchangerate;
            }

            /**
             * Define el valor de la propiedad exchangerate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEXCHANGERATE(BigDecimal value) {
                this.exchangerate = value;
            }

            /**
             * Obtiene el valor de la propiedad orderDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderDate() {
                return orderDate;
            }

            /**
             * Define el valor de la propiedad orderDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderDate(String value) {
                this.orderDate = value;
            }

            /**
             * Obtiene el valor de la propiedad orderTime.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getOrderTime() {
                return orderTime;
            }

            /**
             * Define el valor de la propiedad orderTime.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setOrderTime(XMLGregorianCalendar value) {
                this.orderTime = value;
            }

            /**
             * Obtiene el valor de la propiedad orderChannel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderChannel() {
                return orderChannel;
            }

            /**
             * Define el valor de la propiedad orderChannel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderChannel(String value) {
                this.orderChannel = value;
            }

            /**
             * Obtiene el valor de la propiedad attribute16.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttribute16() {
                return attribute16;
            }

            /**
             * Define el valor de la propiedad attribute16.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttribute16(String value) {
                this.attribute16 = value;
            }

            /**
             * Obtiene el valor de la propiedad orderSubType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderSubType() {
                return orderSubType;
            }

            /**
             * Define el valor de la propiedad orderSubType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderSubType(String value) {
                this.orderSubType = value;
            }

            /**
             * Obtiene el valor de la propiedad discount.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDiscount() {
                return discount;
            }

            /**
             * Define el valor de la propiedad discount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDiscount(BigInteger value) {
                this.discount = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWarehouseNumber() {
                return warehouseNumber;
            }

            /**
             * Define el valor de la propiedad warehouseNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWarehouseNumber(String value) {
                this.warehouseNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWarehouseDescription() {
                return warehouseDescription;
            }

            /**
             * Define el valor de la propiedad warehouseDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWarehouseDescription(String value) {
                this.warehouseDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad orderEntryOperator.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderEntryOperator() {
                return orderEntryOperator;
            }

            /**
             * Define el valor de la propiedad orderEntryOperator.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderEntryOperator(String value) {
                this.orderEntryOperator = value;
            }

            /**
             * Obtiene el valor de la propiedad invoiceDelivery.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getInvoiceDelivery() {
                return invoiceDelivery;
            }

            /**
             * Define el valor de la propiedad invoiceDelivery.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setInvoiceDelivery(BigInteger value) {
                this.invoiceDelivery = value;
            }

            /**
             * Obtiene el valor de la propiedad command.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommand() {
                return command;
            }

            /**
             * Define el valor de la propiedad command.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommand(String value) {
                this.command = value;
            }

            /**
             * Obtiene el valor de la propiedad ntsackEmailAddress.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNTSACKEmailAddress() {
                return ntsackEmailAddress;
            }

            /**
             * Define el valor de la propiedad ntsackEmailAddress.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNTSACKEmailAddress(String value) {
                this.ntsackEmailAddress = value;
            }

            /**
             * Obtiene el valor de la propiedad vatCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVATCode() {
                return vatCode;
            }

            /**
             * Define el valor de la propiedad vatCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVATCode(String value) {
                this.vatCode = value;
            }

            /**
             * Obtiene el valor de la propiedad vatFlag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVATFlag() {
                return vatFlag;
            }

            /**
             * Define el valor de la propiedad vatFlag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVATFlag(String value) {
                this.vatFlag = value;
            }

            /**
             * Obtiene el valor de la propiedad vatNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVATNumber() {
                return vatNumber;
            }

            /**
             * Define el valor de la propiedad vatNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVATNumber(String value) {
                this.vatNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad facturaNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacturaNumber() {
                return facturaNumber;
            }

            /**
             * Define el valor de la propiedad facturaNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacturaNumber(String value) {
                this.facturaNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad qrcEmail.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQRCEmail() {
                return qrcEmail;
            }

            /**
             * Define el valor de la propiedad qrcEmail.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQRCEmail(String value) {
                this.qrcEmail = value;
            }

            /**
             * Obtiene el valor de la propiedad authorizationNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorizationNumber() {
                return authorizationNumber;
            }

            /**
             * Define el valor de la propiedad authorizationNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorizationNumber(String value) {
                this.authorizationNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad ntsDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNTSDate() {
                return ntsDate;
            }

            /**
             * Define el valor de la propiedad ntsDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNTSDate(String value) {
                this.ntsDate = value;
            }

            /**
             * Obtiene el valor de la propiedad ntsTime.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNTSTime() {
                return ntsTime;
            }

            /**
             * Define el valor de la propiedad ntsTime.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNTSTime(XMLGregorianCalendar value) {
                this.ntsTime = value;
            }

            /**
             * Obtiene el valor de la propiedad localTime.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalTime() {
                return localTime;
            }

            /**
             * Define el valor de la propiedad localTime.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalTime(String value) {
                this.localTime = value;
            }

            /**
             * Obtiene el valor de la propiedad localPrintDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalPrintDate() {
                return localPrintDate;
            }

            /**
             * Define el valor de la propiedad localPrintDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalPrintDate(String value) {
                this.localPrintDate = value;
            }

            /**
             * Obtiene el valor de la propiedad localPrintTime.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLocalPrintTime() {
                return localPrintTime;
            }

            /**
             * Define el valor de la propiedad localPrintTime.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLocalPrintTime(XMLGregorianCalendar value) {
                this.localPrintTime = value;
            }

            /**
             * Obtiene el valor de la propiedad paidDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaidDate() {
                return paidDate;
            }

            /**
             * Define el valor de la propiedad paidDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaidDate(String value) {
                this.paidDate = value;
            }

            /**
             * Obtiene el valor de la propiedad paidTime.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPaidTime() {
                return paidTime;
            }

            /**
             * Define el valor de la propiedad paidTime.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPaidTime(XMLGregorianCalendar value) {
                this.paidTime = value;
            }

            /**
             * Obtiene el valor de la propiedad cmInvoiceNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMInvoiceNumber() {
                return cmInvoiceNumber;
            }

            /**
             * Define el valor de la propiedad cmInvoiceNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMInvoiceNumber(String value) {
                this.cmInvoiceNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad dsmacNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSMACNo() {
                return dsmacNo;
            }

            /**
             * Define el valor de la propiedad dsmacNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSMACNo(String value) {
                this.dsmacNo = value;
            }

            /**
             * Obtiene el valor de la propiedad pricingDate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricingDate() {
                return pricingDate;
            }

            /**
             * Define el valor de la propiedad pricingDate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricingDate(String value) {
                this.pricingDate = value;
            }

            /**
             * Obtiene el valor de la propiedad salescentercharge.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSALESCENTERCHARGE() {
                return salescentercharge;
            }

            /**
             * Define el valor de la propiedad salescentercharge.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSALESCENTERCHARGE(String value) {
                this.salescentercharge = value;
            }

            /**
             * Obtiene el valor de la propiedad messageForDist.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageForDist() {
                return messageForDist;
            }

            /**
             * Define el valor de la propiedad messageForDist.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageForDist(String value) {
                this.messageForDist = value;
            }

            /**
             * Obtiene el valor de la propiedad branchPrefixforRemito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchPrefixforRemito() {
                return branchPrefixforRemito;
            }

            /**
             * Define el valor de la propiedad branchPrefixforRemito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchPrefixforRemito(String value) {
                this.branchPrefixforRemito = value;
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
         *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Address3" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TownCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Loc_Information14" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Loc_Information15" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Loc_Information16" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Region1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VarRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CSTNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TINNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ServiceTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "orgName",
            "address1",
            "address2",
            "address3",
            "townCity",
            "locInformation14",
            "locInformation15",
            "locInformation16",
            "region1",
            "country",
            "postalCode",
            "phone",
            "fax",
            "varRegistrationNo",
            "cstNumber",
            "tinNumber",
            "serviceTaxNumber"
        })
        public static class OrgInformation {

            @XmlElement(name = "OrgName", required = true)
            protected String orgName;
            @XmlElement(name = "Address1", required = true)
            protected String address1;
            @XmlElement(name = "Address2", required = true)
            protected String address2;
            @XmlElement(name = "Address3", required = true)
            protected String address3;
            @XmlElement(name = "TownCity", required = true)
            protected String townCity;
            @XmlElement(name = "Loc_Information14", required = true)
            protected String locInformation14;
            @XmlElement(name = "Loc_Information15", required = true)
            protected String locInformation15;
            @XmlElement(name = "Loc_Information16", required = true)
            protected String locInformation16;
            @XmlElement(name = "Region1", required = true)
            protected String region1;
            @XmlElement(name = "Country", required = true)
            protected String country;
            @XmlElement(name = "PostalCode", required = true)
            protected BigInteger postalCode;
            @XmlElement(name = "Phone", required = true)
            protected String phone;
            @XmlElement(name = "Fax", required = true)
            protected String fax;
            @XmlElement(name = "VarRegistrationNo", required = true)
            protected String varRegistrationNo;
            @XmlElement(name = "CSTNumber", required = true)
            protected String cstNumber;
            @XmlElement(name = "TINNumber", required = true)
            protected String tinNumber;
            @XmlElement(name = "ServiceTaxNumber", required = true)
            protected String serviceTaxNumber;

            /**
             * Obtiene el valor de la propiedad orgName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgName() {
                return orgName;
            }

            /**
             * Define el valor de la propiedad orgName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrgName(String value) {
                this.orgName = value;
            }

            /**
             * Obtiene el valor de la propiedad address1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress1() {
                return address1;
            }

            /**
             * Define el valor de la propiedad address1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress1(String value) {
                this.address1 = value;
            }

            /**
             * Obtiene el valor de la propiedad address2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress2() {
                return address2;
            }

            /**
             * Define el valor de la propiedad address2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress2(String value) {
                this.address2 = value;
            }

            /**
             * Obtiene el valor de la propiedad address3.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress3() {
                return address3;
            }

            /**
             * Define el valor de la propiedad address3.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress3(String value) {
                this.address3 = value;
            }

            /**
             * Obtiene el valor de la propiedad townCity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTownCity() {
                return townCity;
            }

            /**
             * Define el valor de la propiedad townCity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTownCity(String value) {
                this.townCity = value;
            }

            /**
             * Obtiene el valor de la propiedad locInformation14.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocInformation14() {
                return locInformation14;
            }

            /**
             * Define el valor de la propiedad locInformation14.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocInformation14(String value) {
                this.locInformation14 = value;
            }

            /**
             * Obtiene el valor de la propiedad locInformation15.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocInformation15() {
                return locInformation15;
            }

            /**
             * Define el valor de la propiedad locInformation15.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocInformation15(String value) {
                this.locInformation15 = value;
            }

            /**
             * Obtiene el valor de la propiedad locInformation16.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocInformation16() {
                return locInformation16;
            }

            /**
             * Define el valor de la propiedad locInformation16.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocInformation16(String value) {
                this.locInformation16 = value;
            }

            /**
             * Obtiene el valor de la propiedad region1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion1() {
                return region1;
            }

            /**
             * Define el valor de la propiedad region1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion1(String value) {
                this.region1 = value;
            }

            /**
             * Obtiene el valor de la propiedad country.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * Define el valor de la propiedad country.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * Obtiene el valor de la propiedad postalCode.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPostalCode() {
                return postalCode;
            }

            /**
             * Define el valor de la propiedad postalCode.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPostalCode(BigInteger value) {
                this.postalCode = value;
            }

            /**
             * Obtiene el valor de la propiedad phone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Define el valor de la propiedad phone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Obtiene el valor de la propiedad fax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFax() {
                return fax;
            }

            /**
             * Define el valor de la propiedad fax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFax(String value) {
                this.fax = value;
            }

            /**
             * Obtiene el valor de la propiedad varRegistrationNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVarRegistrationNo() {
                return varRegistrationNo;
            }

            /**
             * Define el valor de la propiedad varRegistrationNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVarRegistrationNo(String value) {
                this.varRegistrationNo = value;
            }

            /**
             * Obtiene el valor de la propiedad cstNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCSTNumber() {
                return cstNumber;
            }

            /**
             * Define el valor de la propiedad cstNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCSTNumber(String value) {
                this.cstNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad tinNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTINNumber() {
                return tinNumber;
            }

            /**
             * Define el valor de la propiedad tinNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTINNumber(String value) {
                this.tinNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad serviceTaxNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceTaxNumber() {
                return serviceTaxNumber;
            }

            /**
             * Define el valor de la propiedad serviceTaxNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceTaxNumber(String value) {
                this.serviceTaxNumber = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Item_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QtyOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="QtyReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Past_Qty_Released" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="SplitLineWarehouse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Vat_Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitPH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitFr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitLog" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitOth" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="ExtendedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="DiscRetail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="TaxRate_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="TaxRate_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="TaxRate_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Hazardous_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NonInventory_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VolumnPoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="EarnBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="AlchoholPercent" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NumberOfOrderLines" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "item",
        "numberOfOrderLines"
    })
    public static class OrderLine {

        @XmlElement(name = "Item", required = true)
        protected List<Order.OrderLine.Item> item;
        @XmlElement(name = "NumberOfOrderLines", required = true)
        protected BigInteger numberOfOrderLines;

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
         * {@link Order.OrderLine.Item }
         * 
         * 
         */
        public List<Order.OrderLine.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Order.OrderLine.Item>();
            }
            return this.item;
        }

        /**
         * Obtiene el valor de la propiedad numberOfOrderLines.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfOrderLines() {
            return numberOfOrderLines;
        }

        /**
         * Define el valor de la propiedad numberOfOrderLines.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfOrderLines(BigInteger value) {
            this.numberOfOrderLines = value;
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
         *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Item_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="QtyOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="QtyReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Past_Qty_Released" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="SplitLineWarehouse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Vat_Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Line_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitPH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitFr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitLog" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitOth" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="ExtendedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="DiscRetail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="TaxRate_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="TaxRate_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="TaxRate_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Hazardous_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NonInventory_Item_Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VolumnPoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="EarnBase" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="AlchoholPercent" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="CountryOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "productCode",
            "stockingSKU",
            "location",
            "productType",
            "itemDescription",
            "itemLocalDescription",
            "uom",
            "itemTypeCode",
            "lotNumber",
            "qtyOrdered",
            "qtyReleased",
            "pastQtyReleased",
            "splitLineWarehouse",
            "vatLineTax",
            "lineTax",
            "unitTax",
            "unitPrice",
            "unitDisc",
            "unitPH",
            "unitFr",
            "unitLog",
            "unitOth",
            "extendedPrice",
            "discountAmt",
            "discRetail",
            "taxRate1",
            "taxRate2",
            "taxRate3",
            "unitWeight",
            "hazardousItemFlag",
            "nonInventoryItemFlag",
            "volumnPoints",
            "earnBase",
            "alchoholPercent",
            "countryOfOrigin"
        })
        public static class Item {

            @XmlElement(name = "ProductCode", required = true)
            protected String productCode;
            @XmlElement(name = "StockingSKU", required = true)
            protected String stockingSKU;
            @XmlElement(name = "Location", required = true)
            protected String location;
            @XmlElement(name = "ProductType", required = true)
            protected String productType;
            @XmlElement(name = "ItemDescription", required = true)
            protected String itemDescription;
            @XmlElement(name = "ItemLocalDescription", required = true)
            protected String itemLocalDescription;
            @XmlElement(name = "UOM", required = true)
            protected String uom;
            @XmlElement(name = "Item_Type_Code", required = true)
            protected String itemTypeCode;
            @XmlElement(name = "Lot_Number", required = true)
            protected String lotNumber;
            @XmlElement(name = "QtyOrdered", required = true)
            protected BigInteger qtyOrdered;
            @XmlElement(name = "QtyReleased", required = true)
            protected BigInteger qtyReleased;
            @XmlElement(name = "Past_Qty_Released", required = true)
            protected BigInteger pastQtyReleased;
            @XmlElement(name = "SplitLineWarehouse", required = true)
            protected String splitLineWarehouse;
            @XmlElement(name = "Vat_Line_Tax", required = true)
            protected BigDecimal vatLineTax;
            @XmlElement(name = "Line_Tax", required = true)
            protected BigDecimal lineTax;
            @XmlElement(name = "UnitTax", required = true)
            protected BigDecimal unitTax;
            @XmlElement(name = "UnitPrice", required = true)
            protected BigDecimal unitPrice;
            @XmlElement(name = "UnitDisc", required = true)
            protected BigDecimal unitDisc;
            @XmlElement(name = "UnitPH", required = true)
            protected BigDecimal unitPH;
            @XmlElement(name = "UnitFr", required = true)
            protected BigDecimal unitFr;
            @XmlElement(name = "UnitLog", required = true)
            protected BigDecimal unitLog;
            @XmlElement(name = "UnitOth", required = true)
            protected BigDecimal unitOth;
            @XmlElement(name = "ExtendedPrice", required = true)
            protected BigDecimal extendedPrice;
            @XmlElement(name = "DiscountAmt", required = true)
            protected BigDecimal discountAmt;
            @XmlElement(name = "DiscRetail", required = true)
            protected BigDecimal discRetail;
            @XmlElement(name = "TaxRate_1", required = true)
            protected BigDecimal taxRate1;
            @XmlElement(name = "TaxRate_2", required = true)
            protected BigDecimal taxRate2;
            @XmlElement(name = "TaxRate_3", required = true)
            protected BigDecimal taxRate3;
            @XmlElement(name = "UnitWeight", required = true)
            protected BigDecimal unitWeight;
            @XmlElement(name = "Hazardous_Item_Flag", required = true)
            protected String hazardousItemFlag;
            @XmlElement(name = "NonInventory_Item_Flag", required = true)
            protected String nonInventoryItemFlag;
            @XmlElement(name = "VolumnPoints", required = true)
            protected BigDecimal volumnPoints;
            @XmlElement(name = "EarnBase", required = true)
            protected BigDecimal earnBase;
            @XmlElement(name = "AlchoholPercent", required = true)
            protected BigInteger alchoholPercent;
            @XmlElement(name = "CountryOfOrigin", required = true)
            protected String countryOfOrigin;

            /**
             * Obtiene el valor de la propiedad productCode.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public String getProductCode() {
                return productCode;
            }

            /**
             * Define el valor de la propiedad productCode.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setProductCode(String value) {
                this.productCode = value;
            }

            /**
             * Obtiene el valor de la propiedad stockingSKU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockingSKU() {
                return stockingSKU;
            }

            /**
             * Define el valor de la propiedad stockingSKU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockingSKU(String value) {
                this.stockingSKU = value;
            }

            /**
             * Obtiene el valor de la propiedad location.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * Define el valor de la propiedad location.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

            /**
             * Obtiene el valor de la propiedad productType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductType() {
                return productType;
            }

            /**
             * Define el valor de la propiedad productType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductType(String value) {
                this.productType = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Define el valor de la propiedad itemDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad itemLocalDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemLocalDescription() {
                return itemLocalDescription;
            }

            /**
             * Define el valor de la propiedad itemLocalDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemLocalDescription(String value) {
                this.itemLocalDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad uom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOM() {
                return uom;
            }

            /**
             * Define el valor de la propiedad uom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOM(String value) {
                this.uom = value;
            }

            /**
             * Obtiene el valor de la propiedad itemTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemTypeCode() {
                return itemTypeCode;
            }

            /**
             * Define el valor de la propiedad itemTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemTypeCode(String value) {
                this.itemTypeCode = value;
            }

            /**
             * Obtiene el valor de la propiedad lotNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLotNumber() {
                return lotNumber;
            }

            /**
             * Define el valor de la propiedad lotNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLotNumber(String value) {
                this.lotNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad qtyOrdered.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQtyOrdered() {
                return qtyOrdered;
            }

            /**
             * Define el valor de la propiedad qtyOrdered.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQtyOrdered(BigInteger value) {
                this.qtyOrdered = value;
            }

            /**
             * Obtiene el valor de la propiedad qtyReleased.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQtyReleased() {
                return qtyReleased;
            }

            /**
             * Define el valor de la propiedad qtyReleased.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQtyReleased(BigInteger value) {
                this.qtyReleased = value;
            }

            /**
             * Obtiene el valor de la propiedad pastQtyReleased.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPastQtyReleased() {
                return pastQtyReleased;
            }

            /**
             * Define el valor de la propiedad pastQtyReleased.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPastQtyReleased(BigInteger value) {
                this.pastQtyReleased = value;
            }

            /**
             * Obtiene el valor de la propiedad splitLineWarehouse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSplitLineWarehouse() {
                return splitLineWarehouse;
            }

            /**
             * Define el valor de la propiedad splitLineWarehouse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSplitLineWarehouse(String value) {
                this.splitLineWarehouse = value;
            }

            /**
             * Obtiene el valor de la propiedad vatLineTax.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVatLineTax() {
                return vatLineTax;
            }

            /**
             * Define el valor de la propiedad vatLineTax.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVatLineTax(BigDecimal value) {
                this.vatLineTax = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTax.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLineTax() {
                return lineTax;
            }

            /**
             * Define el valor de la propiedad lineTax.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLineTax(BigDecimal value) {
                this.lineTax = value;
            }

            /**
             * Obtiene el valor de la propiedad unitTax.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitTax() {
                return unitTax;
            }

            /**
             * Define el valor de la propiedad unitTax.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitTax(BigDecimal value) {
                this.unitTax = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPrice.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitPrice() {
                return unitPrice;
            }

            /**
             * Define el valor de la propiedad unitPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitPrice(BigDecimal value) {
                this.unitPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad unitDisc.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitDisc() {
                return unitDisc;
            }

            /**
             * Define el valor de la propiedad unitDisc.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitDisc(BigDecimal value) {
                this.unitDisc = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPH.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitPH() {
                return unitPH;
            }

            /**
             * Define el valor de la propiedad unitPH.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitPH(BigDecimal value) {
                this.unitPH = value;
            }

            /**
             * Obtiene el valor de la propiedad unitFr.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitFr() {
                return unitFr;
            }

            /**
             * Define el valor de la propiedad unitFr.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitFr(BigDecimal value) {
                this.unitFr = value;
            }

            /**
             * Obtiene el valor de la propiedad unitLog.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitLog() {
                return unitLog;
            }

            /**
             * Define el valor de la propiedad unitLog.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitLog(BigDecimal value) {
                this.unitLog = value;
            }

            /**
             * Obtiene el valor de la propiedad unitOth.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitOth() {
                return unitOth;
            }

            /**
             * Define el valor de la propiedad unitOth.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitOth(BigDecimal value) {
                this.unitOth = value;
            }

            /**
             * Obtiene el valor de la propiedad extendedPrice.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getExtendedPrice() {
                return extendedPrice;
            }

            /**
             * Define el valor de la propiedad extendedPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setExtendedPrice(BigDecimal value) {
                this.extendedPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad discountAmt.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDiscountAmt() {
                return discountAmt;
            }

            /**
             * Define el valor de la propiedad discountAmt.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDiscountAmt(BigDecimal value) {
                this.discountAmt = value;
            }

            /**
             * Obtiene el valor de la propiedad discRetail.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDiscRetail() {
                return discRetail;
            }

            /**
             * Define el valor de la propiedad discRetail.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDiscRetail(BigDecimal value) {
                this.discRetail = value;
            }

            /**
             * Obtiene el valor de la propiedad taxRate1.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxRate1() {
                return taxRate1;
            }

            /**
             * Define el valor de la propiedad taxRate1.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxRate1(BigDecimal value) {
                this.taxRate1 = value;
            }

            /**
             * Obtiene el valor de la propiedad taxRate2.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxRate2() {
                return taxRate2;
            }

            /**
             * Define el valor de la propiedad taxRate2.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxRate2(BigDecimal value) {
                this.taxRate2 = value;
            }

            /**
             * Obtiene el valor de la propiedad taxRate3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxRate3() {
                return taxRate3;
            }

            /**
             * Define el valor de la propiedad taxRate3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxRate3(BigDecimal value) {
                this.taxRate3 = value;
            }

            /**
             * Obtiene el valor de la propiedad unitWeight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitWeight() {
                return unitWeight;
            }

            /**
             * Define el valor de la propiedad unitWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitWeight(BigDecimal value) {
                this.unitWeight = value;
            }

            /**
             * Obtiene el valor de la propiedad hazardousItemFlag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHazardousItemFlag() {
                return hazardousItemFlag;
            }

            /**
             * Define el valor de la propiedad hazardousItemFlag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHazardousItemFlag(String value) {
                this.hazardousItemFlag = value;
            }

            /**
             * Obtiene el valor de la propiedad nonInventoryItemFlag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonInventoryItemFlag() {
                return nonInventoryItemFlag;
            }

            /**
             * Define el valor de la propiedad nonInventoryItemFlag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonInventoryItemFlag(String value) {
                this.nonInventoryItemFlag = value;
            }

            /**
             * Obtiene el valor de la propiedad volumnPoints.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVolumnPoints() {
                return volumnPoints;
            }

            /**
             * Define el valor de la propiedad volumnPoints.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVolumnPoints(BigDecimal value) {
                this.volumnPoints = value;
            }

            /**
             * Obtiene el valor de la propiedad earnBase.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEarnBase() {
                return earnBase;
            }

            /**
             * Define el valor de la propiedad earnBase.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEarnBase(BigDecimal value) {
                this.earnBase = value;
            }

            /**
             * Obtiene el valor de la propiedad alchoholPercent.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAlchoholPercent() {
                return alchoholPercent;
            }

            /**
             * Define el valor de la propiedad alchoholPercent.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAlchoholPercent(BigInteger value) {
                this.alchoholPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad countryOfOrigin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryOfOrigin() {
                return countryOfOrigin;
            }

            /**
             * Define el valor de la propiedad countryOfOrigin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryOfOrigin(String value) {
                this.countryOfOrigin = value;
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
     *         &lt;element name="OrderPricing">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_Ret" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Due_in_Words" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Total_Payments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Payments_in_words" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="TotalOrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentReference" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "orderPricing",
        "paymentReference"
    })
    public static class PaymentDetails {

        @XmlElement(name = "OrderPricing", required = true)
        protected Order.PaymentDetails.OrderPricing orderPricing;
        @XmlElement(name = "PaymentReference", required = true)
        protected List<Order.PaymentDetails.PaymentReference> paymentReference;

        /**
         * Obtiene el valor de la propiedad orderPricing.
         * 
         * @return
         *     possible object is
         *     {@link Order.PaymentDetails.OrderPricing }
         *     
         */
        public Order.PaymentDetails.OrderPricing getOrderPricing() {
            return orderPricing;
        }

        /**
         * Define el valor de la propiedad orderPricing.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.PaymentDetails.OrderPricing }
         *     
         */
        public void setOrderPricing(Order.PaymentDetails.OrderPricing value) {
            this.orderPricing = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentReference.
         * 
         * @return
         *     possible object is
         *     {@link Order.PaymentDetails.PaymentReference }
         *     
         */
        public List<Order.PaymentDetails.PaymentReference> getPaymentReference() {
            if (paymentReference == null) {
                paymentReference = new ArrayList<>();
            }
            return this.paymentReference;
        }



        /**
         * Define el valor de la propiedad paymentReference.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.PaymentDetails.PaymentReference }
         *     
         */

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
         *         &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_PkgHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_Ret" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax_3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Due_in_Words" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Total_Payments" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Payments_in_words" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ServiceCharge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="TotalOrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "totalRetail",
            "totalDiscount",
            "totalDiscountedRetail",
            "totalPkgHandling",
            "totalFreight",
            "totalLogistics",
            "totalOther",
            "totalTaxPkgHandling",
            "totalTaxFreight",
            "totalTaxLogistics",
            "totalTaxRet",
            "totalTax1",
            "totalTax2",
            "totalTax3",
            "totalDue",
            "totalDueInWords",
            "totalPayments",
            "totalPaymentsInWords",
            "serviceCharge",
            "totalOrderQty"
        })
        public static class OrderPricing {

            @XmlElement(name = "Total_Retail", required = true)
            protected BigDecimal totalRetail;
            @XmlElement(name = "Total_Discount", required = true)
            protected BigDecimal totalDiscount;
            @XmlElement(name = "Total_Discounted_Retail", required = true)
            protected BigDecimal totalDiscountedRetail;
            @XmlElement(name = "Total_PkgHandling", required = true)
            protected BigDecimal totalPkgHandling;
            @XmlElement(name = "Total_Freight", required = true)
            protected BigDecimal totalFreight;
            @XmlElement(name = "Total_Logistics", required = true)
            protected BigDecimal totalLogistics;
            @XmlElement(name = "Total_Other", required = true)
            protected BigDecimal totalOther;
            @XmlElement(name = "Total_Tax_PkgHandling", required = true)
            protected BigDecimal totalTaxPkgHandling;
            @XmlElement(name = "Total_Tax_Freight", required = true)
            protected BigDecimal totalTaxFreight;
            @XmlElement(name = "Total_Tax_Logistics", required = true)
            protected BigDecimal totalTaxLogistics;
            @XmlElement(name = "Total_Tax_Ret", required = true)
            protected BigDecimal totalTaxRet;
            @XmlElement(name = "Total_Tax_1", required = true)
            protected BigDecimal totalTax1;
            @XmlElement(name = "Total_Tax_2", required = true)
            protected BigDecimal totalTax2;
            @XmlElement(name = "Total_Tax_3", required = true)
            protected BigDecimal totalTax3;
            @XmlElement(name = "Total_Due", required = true)
            protected BigDecimal totalDue;
            @XmlElement(name = "Total_Due_in_Words", required = true)
            protected String totalDueInWords;
            @XmlElement(name = "Total_Payments", required = true)
            protected BigDecimal totalPayments;
            @XmlElement(name = "Total_Payments_in_words", required = true)
            protected String totalPaymentsInWords;
            @XmlElement(name = "ServiceCharge", required = true)
            protected BigInteger serviceCharge;
            @XmlElement(name = "TotalOrderQty", required = true)
            protected BigInteger totalOrderQty;

            /**
             * Obtiene el valor de la propiedad totalRetail.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalRetail() {
                return totalRetail;
            }

            /**
             * Define el valor de la propiedad totalRetail.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalRetail(BigDecimal value) {
                this.totalRetail = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscount() {
                return totalDiscount;
            }

            /**
             * Define el valor de la propiedad totalDiscount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscount(BigDecimal value) {
                this.totalDiscount = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscountedRetail.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscountedRetail() {
                return totalDiscountedRetail;
            }

            /**
             * Define el valor de la propiedad totalDiscountedRetail.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscountedRetail(BigDecimal value) {
                this.totalDiscountedRetail = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPkgHandling.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPkgHandling() {
                return totalPkgHandling;
            }

            /**
             * Define el valor de la propiedad totalPkgHandling.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalPkgHandling(BigDecimal value) {
                this.totalPkgHandling = value;
            }

            /**
             * Obtiene el valor de la propiedad totalFreight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFreight() {
                return totalFreight;
            }

            /**
             * Define el valor de la propiedad totalFreight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFreight(BigDecimal value) {
                this.totalFreight = value;
            }

            /**
             * Obtiene el valor de la propiedad totalLogistics.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalLogistics() {
                return totalLogistics;
            }

            /**
             * Define el valor de la propiedad totalLogistics.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalLogistics(BigDecimal value) {
                this.totalLogistics = value;
            }

            /**
             * Obtiene el valor de la propiedad totalOther.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalOther() {
                return totalOther;
            }

            /**
             * Define el valor de la propiedad totalOther.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalOther(BigDecimal value) {
                this.totalOther = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTaxPkgHandling.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTaxPkgHandling() {
                return totalTaxPkgHandling;
            }

            /**
             * Define el valor de la propiedad totalTaxPkgHandling.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTaxPkgHandling(BigDecimal value) {
                this.totalTaxPkgHandling = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTaxFreight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTaxFreight() {
                return totalTaxFreight;
            }

            /**
             * Define el valor de la propiedad totalTaxFreight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTaxFreight(BigDecimal value) {
                this.totalTaxFreight = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTaxLogistics.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTaxLogistics() {
                return totalTaxLogistics;
            }

            /**
             * Define el valor de la propiedad totalTaxLogistics.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTaxLogistics(BigDecimal value) {
                this.totalTaxLogistics = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTaxRet.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTaxRet() {
                return totalTaxRet;
            }

            /**
             * Define el valor de la propiedad totalTaxRet.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTaxRet(BigDecimal value) {
                this.totalTaxRet = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTax1.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTax1() {
                return totalTax1;
            }

            /**
             * Define el valor de la propiedad totalTax1.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTax1(BigDecimal value) {
                this.totalTax1 = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTax2.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTax2() {
                return totalTax2;
            }

            /**
             * Define el valor de la propiedad totalTax2.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTax2(BigDecimal value) {
                this.totalTax2 = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTax3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTax3() {
                return totalTax3;
            }

            /**
             * Define el valor de la propiedad totalTax3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTax3(BigDecimal value) {
                this.totalTax3 = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDue.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDue() {
                return totalDue;
            }

            /**
             * Define el valor de la propiedad totalDue.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDue(BigDecimal value) {
                this.totalDue = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDueInWords.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalDueInWords() {
                return totalDueInWords;
            }

            /**
             * Define el valor de la propiedad totalDueInWords.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalDueInWords(String value) {
                this.totalDueInWords = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPayments.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayments() {
                return totalPayments;
            }

            /**
             * Define el valor de la propiedad totalPayments.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalPayments(BigDecimal value) {
                this.totalPayments = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPaymentsInWords.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalPaymentsInWords() {
                return totalPaymentsInWords;
            }

            /**
             * Define el valor de la propiedad totalPaymentsInWords.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalPaymentsInWords(String value) {
                this.totalPaymentsInWords = value;
            }

            /**
             * Obtiene el valor de la propiedad serviceCharge.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getServiceCharge() {
                return serviceCharge;
            }

            /**
             * Define el valor de la propiedad serviceCharge.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setServiceCharge(BigInteger value) {
                this.serviceCharge = value;
            }

            /**
             * Obtiene el valor de la propiedad totalOrderQty.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalOrderQty() {
                return totalOrderQty;
            }

            /**
             * Define el valor de la propiedad totalOrderQty.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalOrderQty(BigInteger value) {
                this.totalOrderQty = value;
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
         *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "paymentType",
            "referenceNo",
            "amount"
        })
        public static class PaymentReference {

            @XmlElement(name = "PaymentType", required = true)
            protected String paymentType;
            @XmlElement(name = "ReferenceNo", required = true)
            protected String referenceNo;
            @XmlElement(name = "Amount", required = true)
            protected BigDecimal amount;

            /**
             * Obtiene el valor de la propiedad paymentType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentType() {
                return paymentType;
            }

            /**
             * Define el valor de la propiedad paymentType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentType(String value) {
                this.paymentType = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceNo() {
                return referenceNo;
            }

            /**
             * Define el valor de la propiedad referenceNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceNo(String value) {
                this.referenceNo = value;
            }

            /**
             * Obtiene el valor de la propiedad amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Define el valor de la propiedad amount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QuantityReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="QuantityOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Product_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Extended_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Unit_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LinesInPickList" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "item",
        "linesInPickList"
    })
    public static class PickList {

        @XmlElement(name = "Item", required = true)
        protected List<Order.PickList.Item> item;
        @XmlElement(name = "LinesInPickList", required = true)
        protected BigInteger linesInPickList;

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
         * {@link Order.PickList.Item }
         * 
         * 
         */
        public List<Order.PickList.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Order.PickList.Item>();
            }
            return this.item;
        }

        /**
         * Obtiene el valor de la propiedad linesInPickList.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLinesInPickList() {
            return linesInPickList;
        }

        /**
         * Define el valor de la propiedad linesInPickList.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLinesInPickList(BigInteger value) {
            this.linesInPickList = value;
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
         *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ItemLocalDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StockingSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="QuantityReleased" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="QuantityOrdered" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Lot_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Product_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Extended_Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Unit_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "location",
            "itemDescription",
            "itemLocalDescription",
            "stockingSKU",
            "productCode",
            "unitWeight",
            "uom",
            "quantityReleased",
            "quantityOrdered",
            "lotNumber",
            "productType",
            "unitPrice",
            "extendedPrice",
            "unitTaxRate"
        })
        public static class Item {

            @XmlElement(name = "Location", required = true)
            protected String location;
            @XmlElement(name = "ItemDescription", required = true)
            protected String itemDescription;
            @XmlElement(name = "ItemLocalDescription", required = true)
            protected String itemLocalDescription;
            @XmlElement(name = "StockingSKU", required = true)
            protected String stockingSKU;
            @XmlElement(name = "ProductCode", required = true)
            protected String productCode;
            @XmlElement(name = "UnitWeight", required = true)
            protected BigDecimal unitWeight;
            @XmlElement(name = "UOM", required = true)
            protected String uom;
            @XmlElement(name = "QuantityReleased", required = true)
            protected BigInteger quantityReleased;
            @XmlElement(name = "QuantityOrdered", required = true)
            protected BigInteger quantityOrdered;
            @XmlElement(name = "Lot_Number", required = true)
            protected String lotNumber;
            @XmlElement(name = "Product_Type", required = true)
            protected String productType;
            @XmlElement(name = "Unit_Price", required = true)
            protected BigDecimal unitPrice;
            @XmlElement(name = "Extended_Price", required = true)
            protected BigDecimal extendedPrice;
            @XmlElement(name = "Unit_Tax_Rate", required = true)
            protected BigInteger unitTaxRate;

            /**
             * Obtiene el valor de la propiedad location.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * Define el valor de la propiedad location.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Define el valor de la propiedad itemDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad itemLocalDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemLocalDescription() {
                return itemLocalDescription;
            }

            /**
             * Define el valor de la propiedad itemLocalDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemLocalDescription(String value) {
                this.itemLocalDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad stockingSKU.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStockingSKU() {
                return stockingSKU;
            }

            /**
             * Define el valor de la propiedad stockingSKU.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStockingSKU(String value) {
                this.stockingSKU = value;
            }

            /**
             * Obtiene el valor de la propiedad productCode.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public String getProductCode() {
                return productCode;
            }

            /**
             * Define el valor de la propiedad productCode.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setProductCode(String value) {
                this.productCode = value;
            }

            /**
             * Obtiene el valor de la propiedad unitWeight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitWeight() {
                return unitWeight;
            }

            /**
             * Define el valor de la propiedad unitWeight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitWeight(BigDecimal value) {
                this.unitWeight = value;
            }

            /**
             * Obtiene el valor de la propiedad uom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOM() {
                return uom;
            }

            /**
             * Define el valor de la propiedad uom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOM(String value) {
                this.uom = value;
            }

            /**
             * Obtiene el valor de la propiedad quantityReleased.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantityReleased() {
                return quantityReleased;
            }

            /**
             * Define el valor de la propiedad quantityReleased.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantityReleased(BigInteger value) {
                this.quantityReleased = value;
            }

            /**
             * Obtiene el valor de la propiedad quantityOrdered.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantityOrdered() {
                return quantityOrdered;
            }

            /**
             * Define el valor de la propiedad quantityOrdered.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantityOrdered(BigInteger value) {
                this.quantityOrdered = value;
            }

            /**
             * Obtiene el valor de la propiedad lotNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLotNumber() {
                return lotNumber;
            }

            /**
             * Define el valor de la propiedad lotNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLotNumber(String value) {
                this.lotNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad productType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductType() {
                return productType;
            }

            /**
             * Define el valor de la propiedad productType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductType(String value) {
                this.productType = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPrice.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitPrice() {
                return unitPrice;
            }

            /**
             * Define el valor de la propiedad unitPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitPrice(BigDecimal value) {
                this.unitPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad extendedPrice.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getExtendedPrice() {
                return extendedPrice;
            }

            /**
             * Define el valor de la propiedad extendedPrice.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setExtendedPrice(BigDecimal value) {
                this.extendedPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad unitTaxRate.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnitTaxRate() {
                return unitTaxRate;
            }

            /**
             * Define el valor de la propiedad unitTaxRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnitTaxRate(BigInteger value) {
                this.unitTaxRate = value;
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
     *         &lt;element name="FreightCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FreightCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ShippingInstructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "freightCode",
        "freightCodeDesc",
        "shippingInstructions"
    })
    public static class ShippingInstructions {

        @XmlElement(name = "FreightCode", required = true)
        protected String freightCode;
        @XmlElement(name = "FreightCodeDesc", required = true)
        protected String freightCodeDesc;
        @XmlElement(name = "ShippingInstructions", required = true)
        protected String shippingInstructions;

        /**
         * Obtiene el valor de la propiedad freightCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreightCode() {
            return freightCode;
        }

        /**
         * Define el valor de la propiedad freightCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreightCode(String value) {
            this.freightCode = value;
        }

        /**
         * Obtiene el valor de la propiedad freightCodeDesc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreightCodeDesc() {
            return freightCodeDesc;
        }

        /**
         * Define el valor de la propiedad freightCodeDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreightCodeDesc(String value) {
            this.freightCodeDesc = value;
        }

        /**
         * Obtiene el valor de la propiedad shippingInstructions.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShippingInstructions() {
            return shippingInstructions;
        }

        /**
         * Define el valor de la propiedad shippingInstructions.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShippingInstructions(String value) {
            this.shippingInstructions = value;
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
     *         &lt;element name="Tax">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="India_Service_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Due_Before_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_PH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "tax"
    })
    public static class TaxBreakups {

        @XmlElement(name = "Tax", required = true)
        protected Order.TaxBreakups.Tax tax;

        /**
         * Obtiene el valor de la propiedad tax.
         * 
         * @return
         *     possible object is
         *     {@link Order.TaxBreakups.Tax }
         *     
         */
        public Order.TaxBreakups.Tax getTax() {
            return tax;
        }

        /**
         * Define el valor de la propiedad tax.
         * 
         * @param value
         *     allowed object is
         *     {@link Order.TaxBreakups.Tax }
         *     
         */
        public void setTax(Order.TaxBreakups.Tax value) {
            this.tax = value;
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
         *         &lt;element name="India_Service_Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Tax_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Discounted_Retail" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Due_Before_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Due" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Logistics" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_PH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Freight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="Total_Other" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
            "indiaServiceTaxRate",
            "taxRate",
            "totalRetail",
            "totalDiscount",
            "totalDiscountedRetail",
            "totalDueBeforeTax",
            "totalTax",
            "totalDue",
            "totalLogistics",
            "totalPH",
            "totalFreight",
            "totalOther"
        })
        public static class Tax {

            @XmlElement(name = "India_Service_Tax_Rate", required = true)
            protected BigDecimal indiaServiceTaxRate;
            @XmlElement(name = "Tax_Rate", required = true)
            protected BigDecimal taxRate;
            @XmlElement(name = "Total_Retail", required = true)
            protected BigDecimal totalRetail;
            @XmlElement(name = "Total_Discount", required = true)
            protected BigDecimal totalDiscount;
            @XmlElement(name = "Total_Discounted_Retail", required = true)
            protected BigDecimal totalDiscountedRetail;
            @XmlElement(name = "Total_Due_Before_Tax", required = true)
            protected BigDecimal totalDueBeforeTax;
            @XmlElement(name = "Total_Tax", required = true)
            protected BigDecimal totalTax;
            @XmlElement(name = "Total_Due", required = true)
            protected BigDecimal totalDue;
            @XmlElement(name = "Total_Logistics", required = true)
            protected BigDecimal totalLogistics;
            @XmlElement(name = "Total_PH", required = true)
            protected BigDecimal totalPH;
            @XmlElement(name = "Total_Freight", required = true)
            protected BigDecimal totalFreight;
            @XmlElement(name = "Total_Other", required = true)
            protected BigDecimal totalOther;

            /**
             * Obtiene el valor de la propiedad indiaServiceTaxRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIndiaServiceTaxRate() {
                return indiaServiceTaxRate;
            }

            /**
             * Define el valor de la propiedad indiaServiceTaxRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIndiaServiceTaxRate(BigDecimal value) {
                this.indiaServiceTaxRate = value;
            }

            /**
             * Obtiene el valor de la propiedad taxRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTaxRate() {
                return taxRate;
            }

            /**
             * Define el valor de la propiedad taxRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTaxRate(BigDecimal value) {
                this.taxRate = value;
            }

            /**
             * Obtiene el valor de la propiedad totalRetail.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalRetail() {
                return totalRetail;
            }

            /**
             * Define el valor de la propiedad totalRetail.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalRetail(BigDecimal value) {
                this.totalRetail = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscount() {
                return totalDiscount;
            }

            /**
             * Define el valor de la propiedad totalDiscount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscount(BigDecimal value) {
                this.totalDiscount = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDiscountedRetail.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDiscountedRetail() {
                return totalDiscountedRetail;
            }

            /**
             * Define el valor de la propiedad totalDiscountedRetail.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDiscountedRetail(BigDecimal value) {
                this.totalDiscountedRetail = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDueBeforeTax.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDueBeforeTax() {
                return totalDueBeforeTax;
            }

            /**
             * Define el valor de la propiedad totalDueBeforeTax.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDueBeforeTax(BigDecimal value) {
                this.totalDueBeforeTax = value;
            }

            /**
             * Obtiene el valor de la propiedad totalTax.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalTax() {
                return totalTax;
            }

            /**
             * Define el valor de la propiedad totalTax.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalTax(BigDecimal value) {
                this.totalTax = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDue.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDue() {
                return totalDue;
            }

            /**
             * Define el valor de la propiedad totalDue.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDue(BigDecimal value) {
                this.totalDue = value;
            }

            /**
             * Obtiene el valor de la propiedad totalLogistics.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalLogistics() {
                return totalLogistics;
            }

            /**
             * Define el valor de la propiedad totalLogistics.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalLogistics(BigDecimal value) {
                this.totalLogistics = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPH.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPH() {
                return totalPH;
            }

            /**
             * Define el valor de la propiedad totalPH.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalPH(BigDecimal value) {
                this.totalPH = value;
            }

            /**
             * Obtiene el valor de la propiedad totalFreight.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFreight() {
                return totalFreight;
            }

            /**
             * Define el valor de la propiedad totalFreight.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFreight(BigDecimal value) {
                this.totalFreight = value;
            }

            /**
             * Obtiene el valor de la propiedad totalOther.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalOther() {
                return totalOther;
            }

            /**
             * Define el valor de la propiedad totalOther.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalOther(BigDecimal value) {
                this.totalOther = value;
            }

        }

    }

}
