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
 *         The OFX element "INCTRAN" is of type "IncTransaction"
 *       
 * 
 * <p>Java class for IncTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTSTART" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DTEND" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="INCLUDE" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncTransaction", propOrder = {
    "dtstart",
    "dtend",
    "include"
})
public class IncTransaction {

    @XmlElement(name = "DTSTART")
    protected String dtstart;
    @XmlElement(name = "DTEND")
    protected String dtend;
    @XmlElement(name = "INCLUDE", required = true)
    protected BooleanType include;

    /**
     * Gets the value of the dtstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSTART() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSTART(String value) {
        this.dtstart = value;
    }

    /**
     * Gets the value of the dtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEND() {
        return dtend;
    }

    /**
     * Sets the value of the dtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEND(String value) {
        this.dtend = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDE() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDE(BooleanType value) {
        this.include = value;
    }

}
