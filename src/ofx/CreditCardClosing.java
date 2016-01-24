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
 *         The OFX element "CCCLOSING" is of type "CreditCardClosing"
 *       
 * 
 * <p>Java class for CreditCardClosing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardClosing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType"/>
 *         &lt;element name="DTOPEN" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DTCLOSE" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTNEXT" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BALOPEN" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="BALCLOSE" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="DTPMTDUE" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="MINPMTDUE" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="FINCHG" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="PAYANDCREDIT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="PURANDADV" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="DEBADJ" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="CREDITLIMIT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="DTPOSTSTART" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="DTPOSTEND" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="MKTGINFO" type="{http://ofx.net/types/2003/04}InfoType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CURRENCY" type="{http://ofx.net/types/2003/04}Currency"/>
 *           &lt;element name="ORIGCURRENCY" type="{http://ofx.net/types/2003/04}Currency"/>
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
@XmlType(name = "CreditCardClosing", propOrder = {
    "fitid",
    "dtopen",
    "dtclose",
    "dtnext",
    "balopen",
    "balclose",
    "dtpmtdue",
    "minpmtdue",
    "finchg",
    "payandcredit",
    "purandadv",
    "debadj",
    "creditlimit",
    "dtpoststart",
    "dtpostend",
    "mktginfo",
    "currency",
    "origcurrency"
})
public class CreditCardClosing {

    @XmlElement(name = "FITID", required = true)
    protected String fitid;
    @XmlElement(name = "DTOPEN")
    protected String dtopen;
    @XmlElement(name = "DTCLOSE", required = true)
    protected String dtclose;
    @XmlElement(name = "DTNEXT")
    protected String dtnext;
    @XmlElement(name = "BALOPEN")
    protected String balopen;
    @XmlElement(name = "BALCLOSE", required = true)
    protected String balclose;
    @XmlElement(name = "DTPMTDUE")
    protected String dtpmtdue;
    @XmlElement(name = "MINPMTDUE")
    protected String minpmtdue;
    @XmlElement(name = "FINCHG")
    protected String finchg;
    @XmlElement(name = "PAYANDCREDIT")
    protected String payandcredit;
    @XmlElement(name = "PURANDADV")
    protected String purandadv;
    @XmlElement(name = "DEBADJ")
    protected String debadj;
    @XmlElement(name = "CREDITLIMIT")
    protected String creditlimit;
    @XmlElement(name = "DTPOSTSTART", required = true)
    protected String dtpoststart;
    @XmlElement(name = "DTPOSTEND", required = true)
    protected String dtpostend;
    @XmlElement(name = "MKTGINFO")
    protected String mktginfo;
    @XmlElement(name = "CURRENCY")
    protected Currency currency;
    @XmlElement(name = "ORIGCURRENCY")
    protected Currency origcurrency;

    /**
     * Gets the value of the fitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFITID() {
        return fitid;
    }

    /**
     * Sets the value of the fitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFITID(String value) {
        this.fitid = value;
    }

    /**
     * Gets the value of the dtopen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTOPEN() {
        return dtopen;
    }

    /**
     * Sets the value of the dtopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTOPEN(String value) {
        this.dtopen = value;
    }

    /**
     * Gets the value of the dtclose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCLOSE() {
        return dtclose;
    }

    /**
     * Sets the value of the dtclose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTCLOSE(String value) {
        this.dtclose = value;
    }

    /**
     * Gets the value of the dtnext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTNEXT() {
        return dtnext;
    }

    /**
     * Sets the value of the dtnext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTNEXT(String value) {
        this.dtnext = value;
    }

    /**
     * Gets the value of the balopen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALOPEN() {
        return balopen;
    }

    /**
     * Sets the value of the balopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALOPEN(String value) {
        this.balopen = value;
    }

    /**
     * Gets the value of the balclose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALCLOSE() {
        return balclose;
    }

    /**
     * Sets the value of the balclose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALCLOSE(String value) {
        this.balclose = value;
    }

    /**
     * Gets the value of the dtpmtdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPMTDUE() {
        return dtpmtdue;
    }

    /**
     * Sets the value of the dtpmtdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPMTDUE(String value) {
        this.dtpmtdue = value;
    }

    /**
     * Gets the value of the minpmtdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINPMTDUE() {
        return minpmtdue;
    }

    /**
     * Sets the value of the minpmtdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINPMTDUE(String value) {
        this.minpmtdue = value;
    }

    /**
     * Gets the value of the finchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINCHG() {
        return finchg;
    }

    /**
     * Sets the value of the finchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINCHG(String value) {
        this.finchg = value;
    }

    /**
     * Gets the value of the payandcredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYANDCREDIT() {
        return payandcredit;
    }

    /**
     * Sets the value of the payandcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYANDCREDIT(String value) {
        this.payandcredit = value;
    }

    /**
     * Gets the value of the purandadv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURANDADV() {
        return purandadv;
    }

    /**
     * Sets the value of the purandadv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURANDADV(String value) {
        this.purandadv = value;
    }

    /**
     * Gets the value of the debadj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBADJ() {
        return debadj;
    }

    /**
     * Sets the value of the debadj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBADJ(String value) {
        this.debadj = value;
    }

    /**
     * Gets the value of the creditlimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITLIMIT() {
        return creditlimit;
    }

    /**
     * Sets the value of the creditlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITLIMIT(String value) {
        this.creditlimit = value;
    }

    /**
     * Gets the value of the dtpoststart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPOSTSTART() {
        return dtpoststart;
    }

    /**
     * Sets the value of the dtpoststart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPOSTSTART(String value) {
        this.dtpoststart = value;
    }

    /**
     * Gets the value of the dtpostend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPOSTEND() {
        return dtpostend;
    }

    /**
     * Sets the value of the dtpostend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPOSTEND(String value) {
        this.dtpostend = value;
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

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCURRENCY(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the origcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getORIGCURRENCY() {
        return origcurrency;
    }

    /**
     * Sets the value of the origcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setORIGCURRENCY(Currency value) {
        this.origcurrency = value;
    }

}