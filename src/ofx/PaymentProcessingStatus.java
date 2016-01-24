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
 *         The OFX element "PMTPRCSTS" is of type "PaymentProcessingStatus"
 *       
 * 
 * <p>Java class for PaymentProcessingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PMTPRCCODE" type="{http://ofx.net/types/2003/04}PaymentProcessStatusEnum"/>
 *         &lt;element name="DTPMTPRC" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProcessingStatus", propOrder = {
    "pmtprccode",
    "dtpmtprc"
})
public class PaymentProcessingStatus {

    @XmlElement(name = "PMTPRCCODE", required = true)
    protected PaymentProcessStatusEnum pmtprccode;
    @XmlElement(name = "DTPMTPRC", required = true)
    protected String dtpmtprc;

    /**
     * Gets the value of the pmtprccode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessStatusEnum }
     *     
     */
    public PaymentProcessStatusEnum getPMTPRCCODE() {
        return pmtprccode;
    }

    /**
     * Sets the value of the pmtprccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessStatusEnum }
     *     
     */
    public void setPMTPRCCODE(PaymentProcessStatusEnum value) {
        this.pmtprccode = value;
    }

    /**
     * Gets the value of the dtpmtprc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPMTPRC() {
        return dtpmtprc;
    }

    /**
     * Sets the value of the dtpmtprc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPMTPRC(String value) {
        this.dtpmtprc = value;
    }

}