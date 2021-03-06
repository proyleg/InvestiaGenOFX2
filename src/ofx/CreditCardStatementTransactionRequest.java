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
 *         The OFX element "CCSTMTTRNRQ" is of type "CreditCardStatementTransactionRequest"
 *       
 * 
 * <p>Java class for CreditCardStatementTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardStatementTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="CCSTMTRQ" type="{http://ofx.net/types/2003/04}CreditCardStatementRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardStatementTransactionRequest", propOrder = {
    "ccstmtrq"
})
public class CreditCardStatementTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "CCSTMTRQ", required = true)
    protected CreditCardStatementRequest ccstmtrq;

    /**
     * Gets the value of the ccstmtrq property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatementRequest }
     *     
     */
    public CreditCardStatementRequest getCCSTMTRQ() {
        return ccstmtrq;
    }

    /**
     * Sets the value of the ccstmtrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatementRequest }
     *     
     */
    public void setCCSTMTRQ(CreditCardStatementRequest value) {
        this.ccstmtrq = value;
    }

}
