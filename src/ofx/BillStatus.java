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
 * 	      The OFX element "BILLSTATUS" is of type "BillStatus"
 * 	    
 * 
 * <p>Java class for BillStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLSTATUSCODE" type="{http://ofx.net/types/2003/04}BillStatusCodeEnum"/>
 *         &lt;element name="DTEFF" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="STATUSMODBY" type="{http://ofx.net/types/2003/04}StatusModBYEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillStatus", propOrder = {
    "billstatuscode",
    "dteff",
    "statusmodby"
})
public class BillStatus {

    @XmlElement(name = "BILLSTATUSCODE", required = true)
    protected BillStatusCodeEnum billstatuscode;
    @XmlElement(name = "DTEFF", required = true)
    protected String dteff;
    @XmlElement(name = "STATUSMODBY")
    protected StatusModBYEnum statusmodby;

    /**
     * Gets the value of the billstatuscode property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatusCodeEnum }
     *     
     */
    public BillStatusCodeEnum getBILLSTATUSCODE() {
        return billstatuscode;
    }

    /**
     * Sets the value of the billstatuscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatusCodeEnum }
     *     
     */
    public void setBILLSTATUSCODE(BillStatusCodeEnum value) {
        this.billstatuscode = value;
    }

    /**
     * Gets the value of the dteff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEFF() {
        return dteff;
    }

    /**
     * Sets the value of the dteff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEFF(String value) {
        this.dteff = value;
    }

    /**
     * Gets the value of the statusmodby property.
     * 
     * @return
     *     possible object is
     *     {@link StatusModBYEnum }
     *     
     */
    public StatusModBYEnum getSTATUSMODBY() {
        return statusmodby;
    }

    /**
     * Sets the value of the statusmodby property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusModBYEnum }
     *     
     */
    public void setSTATUSMODBY(StatusModBYEnum value) {
        this.statusmodby = value;
    }

}