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
 * 	      The OFX element "BILLPMTSTATUSCOUNTS" is of type "BillPaymentstatusCounts"
 * 	    
 * 
 * <p>Java class for BillPaymentstatusCounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentstatusCounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLPMTSTATUSCODE" type="{http://ofx.net/types/2003/04}BillPaymentstatusCodeEnum"/>
 *         &lt;element name="COUNT" type="{http://ofx.net/types/2003/04}IdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentstatusCounts", propOrder = {
    "billpmtstatuscode",
    "count"
})
public class BillPaymentstatusCounts {

    @XmlElement(name = "BILLPMTSTATUSCODE", required = true)
    protected BillPaymentstatusCodeEnum billpmtstatuscode;
    @XmlElement(name = "COUNT", required = true)
    protected String count;

    /**
     * Gets the value of the billpmtstatuscode property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentstatusCodeEnum }
     *     
     */
    public BillPaymentstatusCodeEnum getBILLPMTSTATUSCODE() {
        return billpmtstatuscode;
    }

    /**
     * Sets the value of the billpmtstatuscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentstatusCodeEnum }
     *     
     */
    public void setBILLPMTSTATUSCODE(BillPaymentstatusCodeEnum value) {
        this.billpmtstatuscode = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNT() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNT(String value) {
        this.count = value;
    }

}
