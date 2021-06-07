

package com.clases.fel.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para INCOTERMType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="INCOTERMType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EXW"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="FOB"/>
 *     &lt;enumeration value="CFR"/>
 *     &lt;enumeration value="CIF"/>
 *     &lt;enumeration value="CPT"/>
 *     &lt;enumeration value="CIP"/>
 *     &lt;enumeration value="DDP"/>
 *     &lt;enumeration value="DAP"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "INCOTERMType", namespace = "http://www.sat.gob.gt/face2/ComplementoExportaciones/0.1.0")
@XmlEnum
public enum INCOTERMType {

    EXW,
    FCA,
    FAS,
    FOB,
    CFR,
    CIF,
    CPT,
    CIP,
    DDP,
    DAP,
    DAT,
    ZZZ;

    public String value() {
        return name();
    }

    public static INCOTERMType fromValue(String v) {
        return valueOf(v);
    }

}
