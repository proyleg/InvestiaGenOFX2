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
 *         The OFX element "INVMAILTRNRQ" is of type "InvestmentMailTransactionRequest"
 *       
 * 
 * <p>Java class for InvestmentMailTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentMailTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="INVMAILRQ" type="{http://ofx.net/types/2003/04}InvestmentMailRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentMailTransactionRequest", propOrder = {
    "invmailrq"
})
public class InvestmentMailTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "INVMAILRQ", required = true)
    protected InvestmentMailRequest invmailrq;

    /**
     * Gets the value of the invmailrq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentMailRequest }
     *     
     */
    public InvestmentMailRequest getINVMAILRQ() {
        return invmailrq;
    }

    /**
     * Sets the value of the invmailrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentMailRequest }
     *     
     */
    public void setINVMAILRQ(InvestmentMailRequest value) {
        this.invmailrq = value;
    }

}
