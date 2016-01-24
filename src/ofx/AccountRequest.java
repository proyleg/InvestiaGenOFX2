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
 *         The OFX element "ACCTRQ" is of type "AccountRequest"
 *       
 * 
 * <p>Java class for AccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SVCADD" type="{http://ofx.net/types/2003/04}ServiceAdd"/>
 *           &lt;element name="SVCCHG" type="{http://ofx.net/types/2003/04}ServiceChange"/>
 *           &lt;element name="SVCDEL" type="{http://ofx.net/types/2003/04}ServiceDelete"/>
 *         &lt;/choice>
 *         &lt;element name="SVC" type="{http://ofx.net/types/2003/04}ServiceEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRequest", propOrder = {
    "svcadd",
    "svcchg",
    "svcdel",
    "svc"
})
public class AccountRequest {

    @XmlElement(name = "SVCADD")
    protected ServiceAdd svcadd;
    @XmlElement(name = "SVCCHG")
    protected ServiceChange svcchg;
    @XmlElement(name = "SVCDEL")
    protected ServiceDelete svcdel;
    @XmlElement(name = "SVC", required = true)
    protected ServiceEnum svc;

    /**
     * Gets the value of the svcadd property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdd }
     *     
     */
    public ServiceAdd getSVCADD() {
        return svcadd;
    }

    /**
     * Sets the value of the svcadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdd }
     *     
     */
    public void setSVCADD(ServiceAdd value) {
        this.svcadd = value;
    }

    /**
     * Gets the value of the svcchg property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceChange }
     *     
     */
    public ServiceChange getSVCCHG() {
        return svcchg;
    }

    /**
     * Sets the value of the svcchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChange }
     *     
     */
    public void setSVCCHG(ServiceChange value) {
        this.svcchg = value;
    }

    /**
     * Gets the value of the svcdel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelete }
     *     
     */
    public ServiceDelete getSVCDEL() {
        return svcdel;
    }

    /**
     * Sets the value of the svcdel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelete }
     *     
     */
    public void setSVCDEL(ServiceDelete value) {
        this.svcdel = value;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEnum }
     *     
     */
    public ServiceEnum getSVC() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEnum }
     *     
     */
    public void setSVC(ServiceEnum value) {
        this.svc = value;
    }

}
