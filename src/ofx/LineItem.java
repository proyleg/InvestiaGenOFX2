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
 *         The OFX element "LINEITEM" is of type "LineItem"
 *       
 * 
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LITMAMT" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="LITMDESC" type="{http://ofx.net/types/2003/04}ShortMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "litmamt",
    "litmdesc"
})
public class LineItem {

    @XmlElement(name = "LITMAMT", required = true)
    protected String litmamt;
    @XmlElement(name = "LITMDESC", required = true)
    protected String litmdesc;

    /**
     * Gets the value of the litmamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLITMAMT() {
        return litmamt;
    }

    /**
     * Sets the value of the litmamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLITMAMT(String value) {
        this.litmamt = value;
    }

    /**
     * Gets the value of the litmdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLITMDESC() {
        return litmdesc;
    }

    /**
     * Sets the value of the litmdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLITMDESC(String value) {
        this.litmdesc = value;
    }

}
