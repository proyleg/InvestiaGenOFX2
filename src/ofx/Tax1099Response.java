//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "TAX1099RS" is of type "Tax1099Response"
 *       
 * 
 * <p>Java class for Tax1099Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax1099Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCTNUM" type="{http://ofx.net/types/2003/04}AccountIdType" minOccurs="0"/>
 *         &lt;element name="RECID" type="{http://ofx.net/types/2003/04}IdType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="TAX1099MISC_V100" type="{http://ofx.net/types/2003/04}Tax1099MISC_V100"/>
 *           &lt;element name="TAX1099R_V100" type="{http://ofx.net/types/2003/04}Tax1099R_V100"/>
 *           &lt;element name="TAX1099B_V100" type="{http://ofx.net/types/2003/04}Tax1099B_V100"/>
 *           &lt;element name="TAX1099INT_V100" type="{http://ofx.net/types/2003/04}Tax1099INT_V100"/>
 *           &lt;element name="TAX1099DIV_V100" type="{http://ofx.net/types/2003/04}Tax1099DIV_V100"/>
 *           &lt;element name="TAX1099OID_V100" type="{http://ofx.net/types/2003/04}Tax1099OID_V100"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax1099Response", propOrder = {
    "acctnum",
    "recid",
    "tax1099MISCV100OrTAX1099RV100OrTAX1099BV100"
})
public class Tax1099Response {

    @XmlElement(name = "ACCTNUM")
    protected String acctnum;
    @XmlElement(name = "RECID")
    protected String recid;
    @XmlElements({
        @XmlElement(name = "TAX1099MISC_V100", type = Tax1099MISCV100 .class),
        @XmlElement(name = "TAX1099R_V100", type = Tax1099RV100 .class),
        @XmlElement(name = "TAX1099B_V100", type = Tax1099BV100 .class),
        @XmlElement(name = "TAX1099INT_V100", type = Tax1099INTV100 .class),
        @XmlElement(name = "TAX1099DIV_V100", type = Tax1099DIVV100 .class),
        @XmlElement(name = "TAX1099OID_V100", type = Tax1099OIDV100 .class)
    })
    protected List<AbstractTaxForm1099> tax1099MISCV100OrTAX1099RV100OrTAX1099BV100;

    /**
     * Gets the value of the acctnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTNUM() {
        return acctnum;
    }

    /**
     * Sets the value of the acctnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTNUM(String value) {
        this.acctnum = value;
    }

    /**
     * Gets the value of the recid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECID() {
        return recid;
    }

    /**
     * Sets the value of the recid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECID(String value) {
        this.recid = value;
    }

    /**
     * Gets the value of the tax1099MISCV100OrTAX1099RV100OrTAX1099BV100 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax1099MISCV100OrTAX1099RV100OrTAX1099BV100 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAX1099MISCV100OrTAX1099RV100OrTAX1099BV100().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax1099MISCV100 }
     * {@link Tax1099RV100 }
     * {@link Tax1099BV100 }
     * {@link Tax1099INTV100 }
     * {@link Tax1099DIVV100 }
     * {@link Tax1099OIDV100 }
     * 
     * 
     */
    public List<AbstractTaxForm1099> getTAX1099MISCV100OrTAX1099RV100OrTAX1099BV100() {
        if (tax1099MISCV100OrTAX1099RV100OrTAX1099BV100 == null) {
            tax1099MISCV100OrTAX1099RV100OrTAX1099BV100 = new ArrayList<AbstractTaxForm1099>();
        }
        return this.tax1099MISCV100OrTAX1099RV100OrTAX1099BV100;
    }

}