//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.10 a las 07:50:30 PM CST 
//


package com.infile.logic;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clases.logicom.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clases.logicom.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Order.PickList }
     * 
     */
    public Order.PickList createOrderPickList() {
        return new Order.PickList();
    }

    /**
     * Create an instance of {@link Order.PaymentDetails }
     * 
     */
    public Order.PaymentDetails createOrderPaymentDetails() {
        return new Order.PaymentDetails();
    }

    /**
     * Create an instance of {@link Order.TaxBreakups }
     * 
     */
    public Order.TaxBreakups createOrderTaxBreakups() {
        return new Order.TaxBreakups();
    }

    /**
     * Create an instance of {@link Order.OrderLine }
     * 
     */
    public Order.OrderLine createOrderOrderLine() {
        return new Order.OrderLine();
    }

    /**
     * Create an instance of {@link Order.OrderHeader }
     * 
     */
    public Order.OrderHeader createOrderOrderHeader() {
        return new Order.OrderHeader();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails }
     * 
     */
    public Order.OrderHeader.DistributorDetails createOrderOrderHeaderDistributorDetails() {
        return new Order.OrderHeader.DistributorDetails();
    }

    /**
     * Create an instance of {@link Order.ShippingInstructions }
     * 
     */
    public Order.ShippingInstructions createOrderShippingInstructions() {
        return new Order.ShippingInstructions();
    }

    /**
     * Create an instance of {@link Order.PickList.Item }
     * 
     */
    public Order.PickList.Item createOrderPickListItem() {
        return new Order.PickList.Item();
    }

    /**
     * Create an instance of {@link Order.PaymentDetails.OrderPricing }
     * 
     */
    public Order.PaymentDetails.OrderPricing createOrderPaymentDetailsOrderPricing() {
        return new Order.PaymentDetails.OrderPricing();
    }

    /**
     * Create an instance of {@link Order.PaymentDetails.PaymentReference }
     * 
     */
    public Order.PaymentDetails.PaymentReference createOrderPaymentDetailsPaymentReference() {
        return new Order.PaymentDetails.PaymentReference();
    }

    /**
     * Create an instance of {@link Order.TaxBreakups.Tax }
     * 
     */
    public Order.TaxBreakups.Tax createOrderTaxBreakupsTax() {
        return new Order.TaxBreakups.Tax();
    }

    /**
     * Create an instance of {@link Order.OrderLine.Item }
     * 
     */
    public Order.OrderLine.Item createOrderOrderLineItem() {
        return new Order.OrderLine.Item();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.OrgInformation }
     * 
     */
    public Order.OrderHeader.OrgInformation createOrderOrderHeaderOrgInformation() {
        return new Order.OrderHeader.OrgInformation();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.General }
     * 
     */
    public Order.OrderHeader.General createOrderOrderHeaderGeneral() {
        return new Order.OrderHeader.General();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.ATSInformation }
     * 
     * @return 
     */
    public Order.OrderHeader.ATSInformation createOrderOrderHeaderATSInformation() {
        return new Order.OrderHeader.ATSInformation();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.BillTo }
     * 
     */
    public Order.OrderHeader.DistributorDetails.BillTo createOrderOrderHeaderDistributorDetailsBillTo() {
        return new Order.OrderHeader.DistributorDetails.BillTo();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.ShipTo }
     * 
     */
    public Order.OrderHeader.DistributorDetails.ShipTo createOrderOrderHeaderDistributorDetailsShipTo() {
        return new Order.OrderHeader.DistributorDetails.ShipTo();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.Lineage }
     * 
     */
    public Order.OrderHeader.DistributorDetails.Lineage createOrderOrderHeaderDistributorDetailsLineage() {
        return new Order.OrderHeader.DistributorDetails.Lineage();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.NationalIDs }
     * 
     */
    public Order.OrderHeader.DistributorDetails.NationalIDs createOrderOrderHeaderDistributorDetailsNationalIDs() {
        return new Order.OrderHeader.DistributorDetails.NationalIDs();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.QSNationalIDs }
     * 
     */
    public Order.OrderHeader.DistributorDetails.QSNationalIDs createOrderOrderHeaderDistributorDetailsQSNationalIDs() {
        return new Order.OrderHeader.DistributorDetails.QSNationalIDs();
    }

    /**
     * Create an instance of {@link Order.OrderHeader.DistributorDetails.FQSNationalIDs }
     * 
     */
    public Order.OrderHeader.DistributorDetails.FQSNationalIDs createOrderOrderHeaderDistributorDetailsFQSNationalIDs() {
        return new Order.OrderHeader.DistributorDetails.FQSNationalIDs();
    }

}
