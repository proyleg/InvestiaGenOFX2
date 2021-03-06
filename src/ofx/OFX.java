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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "OFX" is of type "Ofx"
 *       
 * 
 * <p>Java class for OFX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFX">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="SIGNONMSGSRQV1" type="{http://ofx.net/types/2003/04}SignonRequestMessageSetV1"/>
 *           &lt;element name="SIGNUPMSGSRQV1" type="{http://ofx.net/types/2003/04}SignupRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="BANKMSGSRQV1" type="{http://ofx.net/types/2003/04}BankRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="CREDITCARDMSGSRQV1" type="{http://ofx.net/types/2003/04}CreditcardRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="INVSTMTMSGSRQV1" type="{http://ofx.net/types/2003/04}InvestmentStatementRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="INTERXFERMSGSRQV1" type="{http://ofx.net/types/2003/04}InterTransferRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="WIREXFERMSGSRQV1" type="{http://ofx.net/types/2003/04}WireTransferRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="BILLPAYMSGSRQV1" type="{http://ofx.net/types/2003/04}BillPayRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="EMAILMSGSRQV1" type="{http://ofx.net/types/2003/04}EmailRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="SECLISTMSGSRQV1" type="{http://ofx.net/types/2003/04}SecurityListRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PRESDIRMSGSRQV1" type="{http://ofx.net/types/2003/04}PresentmentDirRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PRESDLVMSGSRQV1" type="{http://ofx.net/types/2003/04}PresentmentDeliveryRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PROFMSGSRQV1" type="{http://ofx.net/types/2003/04}ProfileRequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAX1098MSGSRQV1" type="{http://ofx.net/types/2003/04}Tax1098RequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAX1099MSGSRQV1" type="{http://ofx.net/types/2003/04}Tax1099RequestMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAXW2MSGSRQV1" type="{http://ofx.net/types/2003/04}TaxW2RequestMessageSetV1" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="SIGNONMSGSRSV1" type="{http://ofx.net/types/2003/04}SignonResponseMessageSetV1"/>
 *           &lt;element name="SIGNUPMSGSRSV1" type="{http://ofx.net/types/2003/04}SignupResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="BANKMSGSRSV1" type="{http://ofx.net/types/2003/04}BankResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="CREDITCARDMSGSRSV1" type="{http://ofx.net/types/2003/04}CreditcardResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="INVSTMTMSGSRSV1" type="{http://ofx.net/types/2003/04}InvestmentStatementResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="INTERXFERMSGSRSV1" type="{http://ofx.net/types/2003/04}InterTransferResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="WIREXFERMSGSRSV1" type="{http://ofx.net/types/2003/04}WireTransferResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="BILLPAYMSGSRSV1" type="{http://ofx.net/types/2003/04}BillPayResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="EMAILMSGSRSV1" type="{http://ofx.net/types/2003/04}EmailResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="SECLISTMSGSRSV1" type="{http://ofx.net/types/2003/04}SecurityListResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PRESDIRMSGSRSV1" type="{http://ofx.net/types/2003/04}PresentmentDirResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PRESDLVMSGSRSV1" type="{http://ofx.net/types/2003/04}PresentmentDeliveryResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="PROFMSGSRSV1" type="{http://ofx.net/types/2003/04}ProfileResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAX1098MSGSRSV1" type="{http://ofx.net/types/2003/04}Tax1098ResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAX1099MSGSRSV1" type="{http://ofx.net/types/2003/04}Tax1099ResponseMessageSetV1" minOccurs="0"/>
 *           &lt;element name="TAXW2MSGSRSV1" type="{http://ofx.net/types/2003/04}TaxW2ResponseMessageSetV1" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFX", propOrder = {
    "signonmsgsrqv1",
    "signupmsgsrqv1",
    "bankmsgsrqv1",
    "creditcardmsgsrqv1",
    "invstmtmsgsrqv1",
    "interxfermsgsrqv1",
    "wirexfermsgsrqv1",
    "billpaymsgsrqv1",
    "emailmsgsrqv1",
    "seclistmsgsrqv1",
    "presdirmsgsrqv1",
    "presdlvmsgsrqv1",
    "profmsgsrqv1",
    "tax1098MSGSRQV1",
    "tax1099MSGSRQV1",
    "taxw2MSGSRQV1",
    "signonmsgsrsv1",
    "signupmsgsrsv1",
    "bankmsgsrsv1",
    "creditcardmsgsrsv1",
    "invstmtmsgsrsv1",
    "interxfermsgsrsv1",
    "wirexfermsgsrsv1",
    "billpaymsgsrsv1",
    "emailmsgsrsv1",
    "seclistmsgsrsv1",
    "presdirmsgsrsv1",
    "presdlvmsgsrsv1",
    "profmsgsrsv1",
    "tax1098MSGSRSV1",
    "tax1099MSGSRSV1",
    "taxw2MSGSRSV1"
})
@XmlRootElement(name="OFX")
public class OFX {

    @XmlElement(name = "SIGNONMSGSRQV1")
    protected SignonRequestMessageSetV1 signonmsgsrqv1;
    @XmlElement(name = "SIGNUPMSGSRQV1")
    protected SignupRequestMessageSetV1 signupmsgsrqv1;
    @XmlElement(name = "BANKMSGSRQV1")
    protected BankRequestMessageSetV1 bankmsgsrqv1;
    @XmlElement(name = "CREDITCARDMSGSRQV1")
    protected CreditcardRequestMessageSetV1 creditcardmsgsrqv1;
    @XmlElement(name = "INVSTMTMSGSRQV1")
    protected InvestmentStatementRequestMessageSetV1 invstmtmsgsrqv1;
    @XmlElement(name = "INTERXFERMSGSRQV1")
    protected InterTransferRequestMessageSetV1 interxfermsgsrqv1;
    @XmlElement(name = "WIREXFERMSGSRQV1")
    protected WireTransferRequestMessageSetV1 wirexfermsgsrqv1;
    @XmlElement(name = "BILLPAYMSGSRQV1")
    protected BillPayRequestMessageSetV1 billpaymsgsrqv1;
    @XmlElement(name = "EMAILMSGSRQV1")
    protected EmailRequestMessageSetV1 emailmsgsrqv1;
    @XmlElement(name = "SECLISTMSGSRQV1")
    protected SecurityListRequestMessageSetV1 seclistmsgsrqv1;
    @XmlElement(name = "PRESDIRMSGSRQV1")
    protected PresentmentDirRequestMessageSetV1 presdirmsgsrqv1;
    @XmlElement(name = "PRESDLVMSGSRQV1")
    protected PresentmentDeliveryRequestMessageSetV1 presdlvmsgsrqv1;
    @XmlElement(name = "PROFMSGSRQV1")
    protected ProfileRequestMessageSetV1 profmsgsrqv1;
    @XmlElement(name = "TAX1098MSGSRQV1")
    protected Tax1098RequestMessageSetV1 tax1098MSGSRQV1;
    @XmlElement(name = "TAX1099MSGSRQV1")
    protected Tax1099RequestMessageSetV1 tax1099MSGSRQV1;
    @XmlElement(name = "TAXW2MSGSRQV1")
    protected TaxW2RequestMessageSetV1 taxw2MSGSRQV1;
    @XmlElement(name = "SIGNONMSGSRSV1")
    protected SignonResponseMessageSetV1 signonmsgsrsv1;
    @XmlElement(name = "SIGNUPMSGSRSV1")
    protected SignupResponseMessageSetV1 signupmsgsrsv1;
    @XmlElement(name = "BANKMSGSRSV1")
    protected BankResponseMessageSetV1 bankmsgsrsv1;
    @XmlElement(name = "CREDITCARDMSGSRSV1")
    protected CreditcardResponseMessageSetV1 creditcardmsgsrsv1;
    @XmlElement(name = "INVSTMTMSGSRSV1")
    protected InvestmentStatementResponseMessageSetV1 invstmtmsgsrsv1;
    @XmlElement(name = "INTERXFERMSGSRSV1")
    protected InterTransferResponseMessageSetV1 interxfermsgsrsv1;
    @XmlElement(name = "WIREXFERMSGSRSV1")
    protected WireTransferResponseMessageSetV1 wirexfermsgsrsv1;
    @XmlElement(name = "BILLPAYMSGSRSV1")
    protected BillPayResponseMessageSetV1 billpaymsgsrsv1;
    @XmlElement(name = "EMAILMSGSRSV1")
    protected EmailResponseMessageSetV1 emailmsgsrsv1;
    @XmlElement(name = "SECLISTMSGSRSV1")
    protected SecurityListResponseMessageSetV1 seclistmsgsrsv1;
    @XmlElement(name = "PRESDIRMSGSRSV1")
    protected PresentmentDirResponseMessageSetV1 presdirmsgsrsv1;
    @XmlElement(name = "PRESDLVMSGSRSV1")
    protected PresentmentDeliveryResponseMessageSetV1 presdlvmsgsrsv1;
    @XmlElement(name = "PROFMSGSRSV1")
    protected ProfileResponseMessageSetV1 profmsgsrsv1;
    @XmlElement(name = "TAX1098MSGSRSV1")
    protected Tax1098ResponseMessageSetV1 tax1098MSGSRSV1;
    @XmlElement(name = "TAX1099MSGSRSV1")
    protected Tax1099ResponseMessageSetV1 tax1099MSGSRSV1;
    @XmlElement(name = "TAXW2MSGSRSV1")
    protected TaxW2ResponseMessageSetV1 taxw2MSGSRSV1;

    /**
     * Gets the value of the signonmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SignonRequestMessageSetV1 }
     *     
     */
    public SignonRequestMessageSetV1 getSIGNONMSGSRQV1() {
        return signonmsgsrqv1;
    }

    /**
     * Sets the value of the signonmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonRequestMessageSetV1 }
     *     
     */
    public void setSIGNONMSGSRQV1(SignonRequestMessageSetV1 value) {
        this.signonmsgsrqv1 = value;
    }

    /**
     * Gets the value of the signupmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SignupRequestMessageSetV1 }
     *     
     */
    public SignupRequestMessageSetV1 getSIGNUPMSGSRQV1() {
        return signupmsgsrqv1;
    }

    /**
     * Sets the value of the signupmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignupRequestMessageSetV1 }
     *     
     */
    public void setSIGNUPMSGSRQV1(SignupRequestMessageSetV1 value) {
        this.signupmsgsrqv1 = value;
    }

    /**
     * Gets the value of the bankmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link BankRequestMessageSetV1 }
     *     
     */
    public BankRequestMessageSetV1 getBANKMSGSRQV1() {
        return bankmsgsrqv1;
    }

    /**
     * Sets the value of the bankmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRequestMessageSetV1 }
     *     
     */
    public void setBANKMSGSRQV1(BankRequestMessageSetV1 value) {
        this.bankmsgsrqv1 = value;
    }

    /**
     * Gets the value of the creditcardmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link CreditcardRequestMessageSetV1 }
     *     
     */
    public CreditcardRequestMessageSetV1 getCREDITCARDMSGSRQV1() {
        return creditcardmsgsrqv1;
    }

    /**
     * Sets the value of the creditcardmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditcardRequestMessageSetV1 }
     *     
     */
    public void setCREDITCARDMSGSRQV1(CreditcardRequestMessageSetV1 value) {
        this.creditcardmsgsrqv1 = value;
    }

    /**
     * Gets the value of the invstmtmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentStatementRequestMessageSetV1 }
     *     
     */
    public InvestmentStatementRequestMessageSetV1 getINVSTMTMSGSRQV1() {
        return invstmtmsgsrqv1;
    }

    /**
     * Sets the value of the invstmtmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentStatementRequestMessageSetV1 }
     *     
     */
    public void setINVSTMTMSGSRQV1(InvestmentStatementRequestMessageSetV1 value) {
        this.invstmtmsgsrqv1 = value;
    }

    /**
     * Gets the value of the interxfermsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link InterTransferRequestMessageSetV1 }
     *     
     */
    public InterTransferRequestMessageSetV1 getINTERXFERMSGSRQV1() {
        return interxfermsgsrqv1;
    }

    /**
     * Sets the value of the interxfermsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterTransferRequestMessageSetV1 }
     *     
     */
    public void setINTERXFERMSGSRQV1(InterTransferRequestMessageSetV1 value) {
        this.interxfermsgsrqv1 = value;
    }

    /**
     * Gets the value of the wirexfermsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link WireTransferRequestMessageSetV1 }
     *     
     */
    public WireTransferRequestMessageSetV1 getWIREXFERMSGSRQV1() {
        return wirexfermsgsrqv1;
    }

    /**
     * Sets the value of the wirexfermsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTransferRequestMessageSetV1 }
     *     
     */
    public void setWIREXFERMSGSRQV1(WireTransferRequestMessageSetV1 value) {
        this.wirexfermsgsrqv1 = value;
    }

    /**
     * Gets the value of the billpaymsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayRequestMessageSetV1 }
     *     
     */
    public BillPayRequestMessageSetV1 getBILLPAYMSGSRQV1() {
        return billpaymsgsrqv1;
    }

    /**
     * Sets the value of the billpaymsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayRequestMessageSetV1 }
     *     
     */
    public void setBILLPAYMSGSRQV1(BillPayRequestMessageSetV1 value) {
        this.billpaymsgsrqv1 = value;
    }

    /**
     * Gets the value of the emailmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link EmailRequestMessageSetV1 }
     *     
     */
    public EmailRequestMessageSetV1 getEMAILMSGSRQV1() {
        return emailmsgsrqv1;
    }

    /**
     * Sets the value of the emailmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailRequestMessageSetV1 }
     *     
     */
    public void setEMAILMSGSRQV1(EmailRequestMessageSetV1 value) {
        this.emailmsgsrqv1 = value;
    }

    /**
     * Gets the value of the seclistmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityListRequestMessageSetV1 }
     *     
     */
    public SecurityListRequestMessageSetV1 getSECLISTMSGSRQV1() {
        return seclistmsgsrqv1;
    }

    /**
     * Sets the value of the seclistmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityListRequestMessageSetV1 }
     *     
     */
    public void setSECLISTMSGSRQV1(SecurityListRequestMessageSetV1 value) {
        this.seclistmsgsrqv1 = value;
    }

    /**
     * Gets the value of the presdirmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentDirRequestMessageSetV1 }
     *     
     */
    public PresentmentDirRequestMessageSetV1 getPRESDIRMSGSRQV1() {
        return presdirmsgsrqv1;
    }

    /**
     * Sets the value of the presdirmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentDirRequestMessageSetV1 }
     *     
     */
    public void setPRESDIRMSGSRQV1(PresentmentDirRequestMessageSetV1 value) {
        this.presdirmsgsrqv1 = value;
    }

    /**
     * Gets the value of the presdlvmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentDeliveryRequestMessageSetV1 }
     *     
     */
    public PresentmentDeliveryRequestMessageSetV1 getPRESDLVMSGSRQV1() {
        return presdlvmsgsrqv1;
    }

    /**
     * Sets the value of the presdlvmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentDeliveryRequestMessageSetV1 }
     *     
     */
    public void setPRESDLVMSGSRQV1(PresentmentDeliveryRequestMessageSetV1 value) {
        this.presdlvmsgsrqv1 = value;
    }

    /**
     * Gets the value of the profmsgsrqv1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileRequestMessageSetV1 }
     *     
     */
    public ProfileRequestMessageSetV1 getPROFMSGSRQV1() {
        return profmsgsrqv1;
    }

    /**
     * Sets the value of the profmsgsrqv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileRequestMessageSetV1 }
     *     
     */
    public void setPROFMSGSRQV1(ProfileRequestMessageSetV1 value) {
        this.profmsgsrqv1 = value;
    }

    /**
     * Gets the value of the tax1098MSGSRQV1 property.
     * 
     * @return
     *     possible object is
     *     {@link Tax1098RequestMessageSetV1 }
     *     
     */
    public Tax1098RequestMessageSetV1 getTAX1098MSGSRQV1() {
        return tax1098MSGSRQV1;
    }

    /**
     * Sets the value of the tax1098MSGSRQV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax1098RequestMessageSetV1 }
     *     
     */
    public void setTAX1098MSGSRQV1(Tax1098RequestMessageSetV1 value) {
        this.tax1098MSGSRQV1 = value;
    }

    /**
     * Gets the value of the tax1099MSGSRQV1 property.
     * 
     * @return
     *     possible object is
     *     {@link Tax1099RequestMessageSetV1 }
     *     
     */
    public Tax1099RequestMessageSetV1 getTAX1099MSGSRQV1() {
        return tax1099MSGSRQV1;
    }

    /**
     * Sets the value of the tax1099MSGSRQV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax1099RequestMessageSetV1 }
     *     
     */
    public void setTAX1099MSGSRQV1(Tax1099RequestMessageSetV1 value) {
        this.tax1099MSGSRQV1 = value;
    }

    /**
     * Gets the value of the taxw2MSGSRQV1 property.
     * 
     * @return
     *     possible object is
     *     {@link TaxW2RequestMessageSetV1 }
     *     
     */
    public TaxW2RequestMessageSetV1 getTAXW2MSGSRQV1() {
        return taxw2MSGSRQV1;
    }

    /**
     * Sets the value of the taxw2MSGSRQV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxW2RequestMessageSetV1 }
     *     
     */
    public void setTAXW2MSGSRQV1(TaxW2RequestMessageSetV1 value) {
        this.taxw2MSGSRQV1 = value;
    }

    /**
     * Gets the value of the signonmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SignonResponseMessageSetV1 }
     *     
     */
    public SignonResponseMessageSetV1 getSIGNONMSGSRSV1() {
        return signonmsgsrsv1;
    }

    /**
     * Sets the value of the signonmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonResponseMessageSetV1 }
     *     
     */
    public void setSIGNONMSGSRSV1(SignonResponseMessageSetV1 value) {
        this.signonmsgsrsv1 = value;
    }

    /**
     * Gets the value of the signupmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SignupResponseMessageSetV1 }
     *     
     */
    public SignupResponseMessageSetV1 getSIGNUPMSGSRSV1() {
        return signupmsgsrsv1;
    }

    /**
     * Sets the value of the signupmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignupResponseMessageSetV1 }
     *     
     */
    public void setSIGNUPMSGSRSV1(SignupResponseMessageSetV1 value) {
        this.signupmsgsrsv1 = value;
    }

    /**
     * Gets the value of the bankmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link BankResponseMessageSetV1 }
     *     
     */
    public BankResponseMessageSetV1 getBANKMSGSRSV1() {
        return bankmsgsrsv1;
    }

    /**
     * Sets the value of the bankmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankResponseMessageSetV1 }
     *     
     */
    public void setBANKMSGSRSV1(BankResponseMessageSetV1 value) {
        this.bankmsgsrsv1 = value;
    }

    /**
     * Gets the value of the creditcardmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link CreditcardResponseMessageSetV1 }
     *     
     */
    public CreditcardResponseMessageSetV1 getCREDITCARDMSGSRSV1() {
        return creditcardmsgsrsv1;
    }

    /**
     * Sets the value of the creditcardmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditcardResponseMessageSetV1 }
     *     
     */
    public void setCREDITCARDMSGSRSV1(CreditcardResponseMessageSetV1 value) {
        this.creditcardmsgsrsv1 = value;
    }

    /**
     * Gets the value of the invstmtmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentStatementResponseMessageSetV1 }
     *     
     */
    public InvestmentStatementResponseMessageSetV1 getINVSTMTMSGSRSV1() {
        return invstmtmsgsrsv1;
    }

    /**
     * Sets the value of the invstmtmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentStatementResponseMessageSetV1 }
     *     
     */
    public void setINVSTMTMSGSRSV1(InvestmentStatementResponseMessageSetV1 value) {
        this.invstmtmsgsrsv1 = value;
    }

    /**
     * Gets the value of the interxfermsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link InterTransferResponseMessageSetV1 }
     *     
     */
    public InterTransferResponseMessageSetV1 getINTERXFERMSGSRSV1() {
        return interxfermsgsrsv1;
    }

    /**
     * Sets the value of the interxfermsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterTransferResponseMessageSetV1 }
     *     
     */
    public void setINTERXFERMSGSRSV1(InterTransferResponseMessageSetV1 value) {
        this.interxfermsgsrsv1 = value;
    }

    /**
     * Gets the value of the wirexfermsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link WireTransferResponseMessageSetV1 }
     *     
     */
    public WireTransferResponseMessageSetV1 getWIREXFERMSGSRSV1() {
        return wirexfermsgsrsv1;
    }

    /**
     * Sets the value of the wirexfermsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTransferResponseMessageSetV1 }
     *     
     */
    public void setWIREXFERMSGSRSV1(WireTransferResponseMessageSetV1 value) {
        this.wirexfermsgsrsv1 = value;
    }

    /**
     * Gets the value of the billpaymsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayResponseMessageSetV1 }
     *     
     */
    public BillPayResponseMessageSetV1 getBILLPAYMSGSRSV1() {
        return billpaymsgsrsv1;
    }

    /**
     * Sets the value of the billpaymsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayResponseMessageSetV1 }
     *     
     */
    public void setBILLPAYMSGSRSV1(BillPayResponseMessageSetV1 value) {
        this.billpaymsgsrsv1 = value;
    }

    /**
     * Gets the value of the emailmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link EmailResponseMessageSetV1 }
     *     
     */
    public EmailResponseMessageSetV1 getEMAILMSGSRSV1() {
        return emailmsgsrsv1;
    }

    /**
     * Sets the value of the emailmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailResponseMessageSetV1 }
     *     
     */
    public void setEMAILMSGSRSV1(EmailResponseMessageSetV1 value) {
        this.emailmsgsrsv1 = value;
    }

    /**
     * Gets the value of the seclistmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityListResponseMessageSetV1 }
     *     
     */
    public SecurityListResponseMessageSetV1 getSECLISTMSGSRSV1() {
        return seclistmsgsrsv1;
    }

    /**
     * Sets the value of the seclistmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityListResponseMessageSetV1 }
     *     
     */
    public void setSECLISTMSGSRSV1(SecurityListResponseMessageSetV1 value) {
        this.seclistmsgsrsv1 = value;
    }

    /**
     * Gets the value of the presdirmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentDirResponseMessageSetV1 }
     *     
     */
    public PresentmentDirResponseMessageSetV1 getPRESDIRMSGSRSV1() {
        return presdirmsgsrsv1;
    }

    /**
     * Sets the value of the presdirmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentDirResponseMessageSetV1 }
     *     
     */
    public void setPRESDIRMSGSRSV1(PresentmentDirResponseMessageSetV1 value) {
        this.presdirmsgsrsv1 = value;
    }

    /**
     * Gets the value of the presdlvmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link PresentmentDeliveryResponseMessageSetV1 }
     *     
     */
    public PresentmentDeliveryResponseMessageSetV1 getPRESDLVMSGSRSV1() {
        return presdlvmsgsrsv1;
    }

    /**
     * Sets the value of the presdlvmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentmentDeliveryResponseMessageSetV1 }
     *     
     */
    public void setPRESDLVMSGSRSV1(PresentmentDeliveryResponseMessageSetV1 value) {
        this.presdlvmsgsrsv1 = value;
    }

    /**
     * Gets the value of the profmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponseMessageSetV1 }
     *     
     */
    public ProfileResponseMessageSetV1 getPROFMSGSRSV1() {
        return profmsgsrsv1;
    }

    /**
     * Sets the value of the profmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponseMessageSetV1 }
     *     
     */
    public void setPROFMSGSRSV1(ProfileResponseMessageSetV1 value) {
        this.profmsgsrsv1 = value;
    }

    /**
     * Gets the value of the tax1098MSGSRSV1 property.
     * 
     * @return
     *     possible object is
     *     {@link Tax1098ResponseMessageSetV1 }
     *     
     */
    public Tax1098ResponseMessageSetV1 getTAX1098MSGSRSV1() {
        return tax1098MSGSRSV1;
    }

    /**
     * Sets the value of the tax1098MSGSRSV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax1098ResponseMessageSetV1 }
     *     
     */
    public void setTAX1098MSGSRSV1(Tax1098ResponseMessageSetV1 value) {
        this.tax1098MSGSRSV1 = value;
    }

    /**
     * Gets the value of the tax1099MSGSRSV1 property.
     * 
     * @return
     *     possible object is
     *     {@link Tax1099ResponseMessageSetV1 }
     *     
     */
    public Tax1099ResponseMessageSetV1 getTAX1099MSGSRSV1() {
        return tax1099MSGSRSV1;
    }

    /**
     * Sets the value of the tax1099MSGSRSV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax1099ResponseMessageSetV1 }
     *     
     */
    public void setTAX1099MSGSRSV1(Tax1099ResponseMessageSetV1 value) {
        this.tax1099MSGSRSV1 = value;
    }

    /**
     * Gets the value of the taxw2MSGSRSV1 property.
     * 
     * @return
     *     possible object is
     *     {@link TaxW2ResponseMessageSetV1 }
     *     
     */
    public TaxW2ResponseMessageSetV1 getTAXW2MSGSRSV1() {
        return taxw2MSGSRSV1;
    }

    /**
     * Sets the value of the taxw2MSGSRSV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxW2ResponseMessageSetV1 }
     *     
     */
    public void setTAXW2MSGSRSV1(TaxW2ResponseMessageSetV1 value) {
        this.taxw2MSGSRSV1 = value;
    }

}
