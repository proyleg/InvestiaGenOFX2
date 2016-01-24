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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "PMTINFO" is of type "PaymentInfo"
 *       
 * 
 * <p>Java class for PaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;element name="TRNAMT" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;choice>
 *           &lt;element name="PAYEEID" type="{http://ofx.net/types/2003/04}PayeeIdType"/>
 *           &lt;element name="PAYEE" type="{http://ofx.net/types/2003/04}Payee"/>
 *         &lt;/choice>
 *         &lt;element name="PAYEELSTID" type="{http://ofx.net/types/2003/04}PayeeIdType" minOccurs="0"/>
 *         &lt;element name="BANKACCTTO" type="{http://ofx.net/types/2003/04}BankAccount" minOccurs="0"/>
 *         &lt;element name="EXTDPMT" type="{http://ofx.net/types/2003/04}ExtendedPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PAYACCT" type="{http://ofx.net/types/2003/04}IdType"/>
 *         &lt;element name="DTDUE" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="MEMO" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *         &lt;element name="BILLREFINFO" type="{http://ofx.net/types/2003/04}BillRefInfoType" minOccurs="0"/>
 *         &lt;element name="BILLPUBINFO" type="{http://ofx.net/types/2003/04}BillPubInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfo", propOrder = {
    "bankacctfrom",
    "trnamt",
    "payeeid",
    "payee",
    "payeelstid",
    "bankacctto",
    "extdpmt",
    "payacct",
    "dtdue",
    "memo",
    "billrefinfo",
    "billpubinfo"
})
public class PaymentInfo {

    @XmlElement(name = "BANKACCTFROM", required = true)
    protected BankAccount bankacctfrom;
    @XmlElement(name = "TRNAMT", required = true)
    protected String trnamt;
    @XmlElement(name = "PAYEEID")
    protected String payeeid;
    @XmlElement(name = "PAYEE")
    protected Payee payee;
    @XmlElement(name = "PAYEELSTID")
    protected String payeelstid;
    @XmlElement(name = "BANKACCTTO")
    protected BankAccount bankacctto;
    @XmlElement(name = "EXTDPMT")
    protected List<ExtendedPayment> extdpmt;
    @XmlElement(name = "PAYACCT", required = true)
    protected String payacct;
    @XmlElement(name = "DTDUE", required = true)
    protected String dtdue;
    @XmlElement(name = "MEMO")
    protected String memo;
    @XmlElement(name = "BILLREFINFO")
    protected String billrefinfo;
    @XmlElement(name = "BILLPUBINFO")
    protected BillPubInfo billpubinfo;

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
     * Gets the value of the trnamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNAMT() {
        return trnamt;
    }

    /**
     * Sets the value of the trnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNAMT(String value) {
        this.trnamt = value;
    }

    /**
     * Gets the value of the payeeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYEEID() {
        return payeeid;
    }

    /**
     * Sets the value of the payeeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYEEID(String value) {
        this.payeeid = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPAYEE() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPAYEE(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payeelstid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYEELSTID() {
        return payeelstid;
    }

    /**
     * Sets the value of the payeelstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYEELSTID(String value) {
        this.payeelstid = value;
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
     * Gets the value of the extdpmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extdpmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXTDPMT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPayment }
     * 
     * 
     */
    public List<ExtendedPayment> getEXTDPMT() {
        if (extdpmt == null) {
            extdpmt = new ArrayList<ExtendedPayment>();
        }
        return this.extdpmt;
    }

    /**
     * Gets the value of the payacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYACCT() {
        return payacct;
    }

    /**
     * Sets the value of the payacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYACCT(String value) {
        this.payacct = value;
    }

    /**
     * Gets the value of the dtdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDUE() {
        return dtdue;
    }

    /**
     * Sets the value of the dtdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDUE(String value) {
        this.dtdue = value;
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

    /**
     * Gets the value of the billrefinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLREFINFO() {
        return billrefinfo;
    }

    /**
     * Sets the value of the billrefinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLREFINFO(String value) {
        this.billrefinfo = value;
    }

    /**
     * Gets the value of the billpubinfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillPubInfo }
     *     
     */
    public BillPubInfo getBILLPUBINFO() {
        return billpubinfo;
    }

    /**
     * Sets the value of the billpubinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPubInfo }
     *     
     */
    public void setBILLPUBINFO(BillPubInfo value) {
        this.billpubinfo = value;
    }

}