/**
 * ZMF_FEL_ADDATFEL_ServiceLocator.java
 *
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */
package functions.rfc.sap.document.sap_com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ZMF_FEL_ADDATFEL_ServiceLocator extends org.apache.axis.client.Service implements functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_Service {

    private String url_servicio_web = "";

    public String getUrl_servicio_web() {
        return url_servicio_web;
    }

    public void setUrl_servicio_web(String url_servicio_web) {
        this.url_servicio_web = url_servicio_web;
    }

    public ZMF_FEL_ADDATFEL_ServiceLocator() {
                
        
    }

    public ZMF_FEL_ADDATFEL_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZMF_FEL_ADDATFEL_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ZMF_FEL_ADDATFEL
    //private java.lang.String ZMF_FEL_ADDATFEL_address = "http://gtfreccapp02.grid.latam:8000/sap/bc/srt/rfc/sap/zmf_fel_addatfel/250/zmf_fel_addatfel/zmf_fel_addatfel";
    //private java.lang.String ZMF_FEL_ADDATFEL_address = "http://172.16.100.33:8000/sap/bc/srt/wsdl/flv_10002A111AD1/bndg_url/sap/bc/srt/rfc/sap/zmf_fel_addatfel/250/zmf_fel_addatfel/zmf_fel_addatfel?";
    private java.lang.String ZMF_FEL_ADDATFEL_address = "";

    public java.lang.String getZMF_FEL_ADDATFELAddress() {

        return ZMF_FEL_ADDATFEL_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ZMF_FEL_ADDATFELWSDDServiceName = "ZMF_FEL_ADDATFEL";

    public java.lang.String getZMF_FEL_ADDATFELWSDDServiceName() {
        return ZMF_FEL_ADDATFELWSDDServiceName;
    }

    public void setZMF_FEL_ADDATFELWSDDServiceName(java.lang.String name) {
        ZMF_FEL_ADDATFELWSDDServiceName = name;
    }

    public functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType getZMF_FEL_ADDATFEL() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;

        ZMF_FEL_ADDATFEL_address = url_servicio_web ;
        
        System.out.println("URL " + ZMF_FEL_ADDATFEL_address);

        try {
            endpoint = new java.net.URL(ZMF_FEL_ADDATFEL_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZMF_FEL_ADDATFEL(endpoint);
    }

    public functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType getZMF_FEL_ADDATFEL(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_BindingStub(portAddress, this);
            _stub.setPortName(getZMF_FEL_ADDATFELWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZMF_FEL_ADDATFELEndpointAddress(java.lang.String address) {
        ZMF_FEL_ADDATFEL_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_BindingStub(new java.net.URL(ZMF_FEL_ADDATFEL_address), this);
                _stub.setPortName(getZMF_FEL_ADDATFELWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ZMF_FEL_ADDATFEL".equals(inputPortName)) {
            return getZMF_FEL_ADDATFEL();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_FEL_ADDATFEL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZMF_FEL_ADDATFEL"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("ZMF_FEL_ADDATFEL".equals(portName)) {
            setZMF_FEL_ADDATFELEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
