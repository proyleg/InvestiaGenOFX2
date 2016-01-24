//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="CREDIT"/>
 *     &lt;enumeration value="DEBIT"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="DIV"/>
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="SRVCHG"/>
 *     &lt;enumeration value="DEP"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="XFER"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="PAYMENT"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="DIRECTDEP"/>
 *     &lt;enumeration value="DIRECTDEBIT"/>
 *     &lt;enumeration value="REPEATPMT"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionEnum")
@XmlEnum
public enum TransactionEnum {

    CREDIT,
    DEBIT,
    INT,
    DIV,
    FEE,
    SRVCHG,
    DEP,
    ATM,
    POS,
    XFER,
    CHECK,
    PAYMENT,
    CASH,
    DIRECTDEP,
    DIRECTDEBIT,
    REPEATPMT,
    OTHER;

    public String value() {
        return name();
    }

    public static TransactionEnum fromValue(String v) {
        return valueOf(v);
    }

}
