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
 * 	      The OFX element "INVBAL" is of type "InvestmentBalance"
 * 	    
 * 
 * <p>Java class for InvestmentBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVAILCASH" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="MARGINBALANCE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="SHORTBALANCE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="BUYPOWER" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="BALLIST" type="{http://ofx.net/types/2003/04}BalanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentBalance", propOrder = {
    "availcash",
    "marginbalance",
    "shortbalance",
    "buypower",
    "ballist"
})
public class InvestmentBalance {

    @XmlElement(name = "AVAILCASH", required = true)
    protected String availcash;
    @XmlElement(name = "MARGINBALANCE", required = true)
    protected String marginbalance;
    @XmlElement(name = "SHORTBALANCE", required = true)
    protected String shortbalance;
    @XmlElement(name = "BUYPOWER")
    protected String buypower;
    @XmlElement(name = "BALLIST")
    protected BalanceList ballist;

    /**
     * Gets the value of the availcash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILCASH() {
        return availcash;
    }

    /**
     * Sets the value of the availcash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILCASH(String value) {
        this.availcash = value;
    }

    /**
     * Gets the value of the marginbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARGINBALANCE() {
        return marginbalance;
    }

    /**
     * Sets the value of the marginbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARGINBALANCE(String value) {
        this.marginbalance = value;
    }

    /**
     * Gets the value of the shortbalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTBALANCE() {
        return shortbalance;
    }

    /**
     * Sets the value of the shortbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTBALANCE(String value) {
        this.shortbalance = value;
    }

    /**
     * Gets the value of the buypower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYPOWER() {
        return buypower;
    }

    /**
     * Sets the value of the buypower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYPOWER(String value) {
        this.buypower = value;
    }

    /**
     * Gets the value of the ballist property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceList }
     *     
     */
    public BalanceList getBALLIST() {
        return ballist;
    }

    /**
     * Sets the value of the ballist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceList }
     *     
     */
    public void setBALLIST(BalanceList value) {
        this.ballist = value;
    }

}
