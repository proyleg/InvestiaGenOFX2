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
 * <p>Java class for BillStatusCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillStatusCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="WITHDRAWN"/>
 *     &lt;enumeration value="UNDELIVERABLE"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="VIEWED"/>
 *     &lt;enumeration value="RETIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillStatusCodeEnum")
@XmlEnum
public enum BillStatusCodeEnum {

    WITHDRAWN,
    UNDELIVERABLE,
    NEW,
    DELIVERED,
    VIEWED,
    RETIRED;

    public String value() {
        return name();
    }

    public static BillStatusCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
