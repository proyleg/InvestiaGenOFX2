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
 *         The OFX element "PRESMAILRS" is of type "PresentmentMailResponse"
 *       
 * 
 * <p>Java class for PresentmentMailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentMailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRESACCTFROM" type="{http://ofx.net/types/2003/04}PresentmentAccount"/>
 *         &lt;element name="MAIL" type="{http://ofx.net/types/2003/04}Mail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentMailResponse", propOrder = {
    "presacctfrom",
    "mail"
})
public class PresentmentMailResponse {

    @XmlElement(name = "PRESACCTFROM", required = true)
    protected PresentmentAccount presacctfrom;
    @XmlElement(name = "MAIL", required = true)
    protected Mail mail;

    /**
     * Gets the value of the presacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentAccount }
     *     
     */
    public PresentmentAccount getPRESACCTFROM() {
        return presacctfrom;
    }

    /**
     * Sets the value of the presacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentAccount }
     *     
     */
    public void setPRESACCTFROM(PresentmentAccount value) {
        this.presacctfrom = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link Mail }
     *     
     */
    public Mail getMAIL() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mail }
     *     
     */
    public void setMAIL(Mail value) {
        this.mail = value;
    }

}
