//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "SECID" is of type "SecurityId"
 *       
 * 
 * <p>Java class for SecurityId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UNIQUEID" type="{http://ofx.net/types/2003/04}CusipType"/>
 *         &lt;element name="UNIQUEIDTYPE" type="{http://ofx.net/types/2003/04}SecurityUserIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityId", propOrder = {
    "uniqueid",
    "uniqueidtype"
})
public class SecurityId {

    @XmlElement(name = "UNIQUEID", required = true)
    protected String uniqueid;
    @XmlElement(name = "UNIQUEIDTYPE", required = true)
    protected String uniqueidtype;

    /**
     * Gets the value of the uniqueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUEID() {
        return uniqueid;
    }

    /**
     * Sets the value of the uniqueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUEID(String value) {
        this.uniqueid = value;
    }

    /**
     * Gets the value of the uniqueidtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUEIDTYPE() {
        return uniqueidtype;
    }

    /**
     * Sets the value of the uniqueidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUEIDTYPE(String value) {
        this.uniqueidtype = value;
    }

}