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
 *         The OFX element "WIREBENEFICIARY" is of type "WireBeneficiary"
 *       
 * 
 * <p>Java class for WireBeneficiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireBeneficiary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="BANKACCTTO" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;element name="MEMO" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireBeneficiary", propOrder = {
    "name",
    "bankacctto",
    "memo"
})
public class WireBeneficiary {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "BANKACCTTO", required = true)
    protected BankAccount bankacctto;
    @XmlElement(name = "MEMO")
    protected String memo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bankacctto property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBANKACCTTO() {
        return bankacctto;
    }

    /**
     * Sets the value of the bankacctto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBANKACCTTO(BankAccount value) {
        this.bankacctto = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMO() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMO(String value) {
        this.memo = value;
    }

}
