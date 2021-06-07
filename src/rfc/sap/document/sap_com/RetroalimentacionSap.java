/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc.sap.document.sap_com;


public class RetroalimentacionSap {

    private String VBELN = "";
    private String SERIE = "";
    private String NDOC = "";
    private String UUID = "";
    private String ERROR = "";

    
    public String getVBELN() {
        return VBELN;
    }

    public void setVBELN(String VBELN) {
        this.VBELN = VBELN;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public String getNDOC() {
        return NDOC;
    }

    public void setNDOC(String NDOC) {
        this.NDOC = NDOC;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getERROR() {
        return ERROR;
    }

    public void setERROR(String ERROR) {
        this.ERROR = ERROR;
    }

}
