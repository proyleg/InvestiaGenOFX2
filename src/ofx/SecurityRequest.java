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
 *         The OFX element "SECRQ" is of type "SecurityRequest"
 *       
 * 
 * <p>Java class for SecurityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SECID" type="{http://ofx.net/types/2003/04}SecurityId"/>
 *         &lt;element name="TICKER" type="{http://ofx.net/types/2003/04}TickerType"/>
 *         &lt;element name="FIID" type="{http://ofx.net/types/2003/04}FinancialInstitutionIdType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRequest", propOrder = {
    "secid",
    "ticker",
    "fiid"
})
public class SecurityRequest {

    @XmlElement(name = "SECID")
    protected SecurityId secid;
    @XmlElement(name = "TICKER")
    protected String ticker;
    @XmlElement(name = "FIID")
    protected String fiid;

    /**
     * Gets the value of the secid property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityId }
     *     
     */
    public SecurityId getSECID() {
        return secid;
    }

    /**
     * Sets the value of the secid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityId }
     *     
     */
    public void setSECID(SecurityId value) {
        this.secid = value;
    }

    /**
     * Gets the value of the ticker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKER() {
        return ticker;
    }

    /**
     * Sets the value of the ticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKER(String value) {
        this.ticker = value;
    }

    /**
     * Gets the value of the fiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIID() {
        return fiid;
    }

    /**
     * Sets the value of the fiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIID(String value) {
        this.fiid = value;
    }

}
