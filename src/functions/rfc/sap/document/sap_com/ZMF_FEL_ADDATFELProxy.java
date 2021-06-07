package functions.rfc.sap.document.sap_com;

public class ZMF_FEL_ADDATFELProxy implements functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType zMF_FEL_ADDATFEL_PortType = null;
  
  public ZMF_FEL_ADDATFELProxy() {
    _initZMF_FEL_ADDATFELProxy();
  }
  
  public ZMF_FEL_ADDATFELProxy(String endpoint) {
    _endpoint = endpoint;
    _initZMF_FEL_ADDATFELProxy();
  }
  
  private void _initZMF_FEL_ADDATFELProxy() {
    try {
      zMF_FEL_ADDATFEL_PortType = (new functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_ServiceLocator()).getZMF_FEL_ADDATFEL();
      if (zMF_FEL_ADDATFEL_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zMF_FEL_ADDATFEL_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zMF_FEL_ADDATFEL_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zMF_FEL_ADDATFEL_PortType != null)
      ((javax.xml.rpc.Stub)zMF_FEL_ADDATFEL_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public functions.rfc.sap.document.sap_com.ZMF_FEL_ADDATFEL_PortType getZMF_FEL_ADDATFEL_PortType() {
    if (zMF_FEL_ADDATFEL_PortType == null)
      _initZMF_FEL_ADDATFELProxy();
    return zMF_FEL_ADDATFEL_PortType;
  }
  
  public void ZMF_FEL_ADDATFEL(java.lang.String ERROR, java.lang.String NDOC, java.lang.String SERIE, java.lang.String UUID, java.lang.String VBELN, javax.xml.rpc.holders.StringHolder e_MESG, javax.xml.rpc.holders.StringHolder e_MTYP) throws java.rmi.RemoteException{
    if (zMF_FEL_ADDATFEL_PortType == null)
      _initZMF_FEL_ADDATFELProxy();
    zMF_FEL_ADDATFEL_PortType.ZMF_FEL_ADDATFEL(ERROR, NDOC, SERIE, UUID, VBELN, e_MESG, e_MTYP);
  }
  
  
}