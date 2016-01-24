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
 *         The OFX element "INVSTMTTRNRQ" is of type "InvestmentStatementTransactionRequest"
 *       
 * 
 * <p>Java class for InvestmentStatementTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentStatementTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="INVSTMTRQ" type="{http://ofx.net/types/2003/04}InvestmentStatementRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentStatementTransactionRequest", propOrder = {
    "invstmtrq"
})
public class InvestmentStatementTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "INVSTMTRQ", required = true)
    protected InvestmentStatementRequest invstmtrq;

    /**
     * Gets the value of the invstmtrq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentStatementRequest }
     *     
     */
    public InvestmentStatementRequest getINVSTMTRQ() {
        return invstmtrq;
    }

    /**
     * Sets the value of the invstmtrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentStatementRequest }
     *     
     */
    public void setINVSTMTRQ(InvestmentStatementRequest value) {
        this.invstmtrq = value;
    }

}