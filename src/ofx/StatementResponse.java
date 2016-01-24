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
 *         The OFX element "STMTRS" is of type "StatementResponse"
 *       
 * 
 * <p>Java class for StatementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CURDEF" type="{http://ofx.net/types/2003/04}CurrencyEnum"/>
 *         &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;element name="BANKTRANLIST" type="{http://ofx.net/types/2003/04}BankTransactionList" minOccurs="0"/>
 *         &lt;element name="LEDGERBAL" type="{http://ofx.net/types/2003/04}LedgerBalance"/>
 *         &lt;element name="AVAILBAL" type="{http://ofx.net/types/2003/04}AvailableBalance" minOccurs="0"/>
 *         &lt;element name="BALLIST" type="{http://ofx.net/types/2003/04}BalanceList" minOccurs="0"/>
 *         &lt;element name="MKTGINFO" type="{http://ofx.net/types/2003/04}InfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementResponse", propOrder = {
    "curdef",
    "bankacctfrom",
    "banktranlist",
    "ledgerbal",
    "availbal",
    "ballist",
    "mktginfo"
})
public class StatementResponse {

    @XmlElement(name = "CURDEF", required = true)
    protected CurrencyEnum curdef;
    @XmlElement(name = "BANKACCTFROM", required = true)
    protected BankAccount bankacctfrom;
    @XmlElement(name = "BANKTRANLIST")
    protected BankTransactionList banktranlist;
    @XmlElement(name = "LEDGERBAL", required = true)
    protected LedgerBalance ledgerbal;
    @XmlElement(name = "AVAILBAL")
    protected AvailableBalance availbal;
    @XmlElement(name = "BALLIST")
    protected BalanceList ballist;
    @XmlElement(name = "MKTGINFO")
    protected String mktginfo;

    /**
     * Gets the value of the curdef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getCURDEF() {
        return curdef;
    }

    /**
     * Sets the value of the curdef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setCURDEF(CurrencyEnum value) {
        this.curdef = value;
    }

    /**
     * Gets the value of the bankacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBANKACCTFROM() {
        return bankacctfrom;
    }

    /**
     * Sets the value of the bankacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBANKACCTFROM(BankAccount value) {
        this.bankacctfrom = value;
    }

    /**
     * Gets the value of the banktranlist property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionList }
     *     
     */
    public BankTransactionList getBANKTRANLIST() {
        return banktranlist;
    }

    /**
     * Sets the value of the banktranlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionList }
     *     
     */
    public void setBANKTRANLIST(BankTransactionList value) {
        this.banktranlist = value;
    }

    /**
     * Gets the value of the ledgerbal property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerBalance }
     *     
     */
    public LedgerBalance getLEDGERBAL() {
        return ledgerbal;
    }

    /**
     * Sets the value of the ledgerbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerBalance }
     *     
     */
    public void setLEDGERBAL(LedgerBalance value) {
        this.ledgerbal = value;
    }

    /**
     * Gets the value of the availbal property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableBalance }
     *     
     */
    public AvailableBalance getAVAILBAL() {
        return availbal;
    }

    /**
     * Sets the value of the availbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableBalance }
     *     
     */
    public void setAVAILBAL(AvailableBalance value) {
        this.availbal = value;
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

    /**
     * Gets the value of the mktginfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMKTGINFO() {
        return mktginfo;
    }

    /**
     * Sets the value of the mktginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMKTGINFO(String value) {
        this.mktginfo = value;
    }

}
