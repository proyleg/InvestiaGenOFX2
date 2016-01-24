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
 *         The OFX element "BILLSTATUSMODTRNRQ" is of type "BillStatusModTransactionRequest"
 *       
 * 
 * <p>Java class for BillStatusModTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillStatusModTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="BILLSTATUSMODRQ" type="{http://ofx.net/types/2003/04}BillStatusModRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillStatusModTransactionRequest", propOrder = {
    "billstatusmodrq"
})
public class BillStatusModTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "BILLSTATUSMODRQ", required = true)
    protected BillStatusModRequest billstatusmodrq;

    /**
     * Gets the value of the billstatusmodrq property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatusModRequest }
     *     
     */
    public BillStatusModRequest getBILLSTATUSMODRQ() {
        return billstatusmodrq;
    }

    /**
     * Sets the value of the billstatusmodrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatusModRequest }
     *     
     */
    public void setBILLSTATUSMODRQ(BillStatusModRequest value) {
        this.billstatusmodrq = value;
    }

}