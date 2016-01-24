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
 *         The OFX element "TAXW2MSGSRSV1" is of type "TaxW2ResponseMessageSetV1"
 *       
 * 
 * <p>Java class for TaxW2ResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxW2ResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="TAXW2TRNRS" type="{http://ofx.net/types/2003/04}TaxW2TransactionResponse"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxW2ResponseMessageSetV1", propOrder = {
    "taxw2TRNRS"
})
public class TaxW2ResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElement(name = "TAXW2TRNRS", required = true)
    protected List<TaxW2TransactionResponse> taxw2TRNRS;

    /**
     * Gets the value of the taxw2TRNRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxw2TRNRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAXW2TRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxW2TransactionResponse }
     * 
     * 
     */
    public List<TaxW2TransactionResponse> getTAXW2TRNRS() {
        if (taxw2TRNRS == null) {
            taxw2TRNRS = new ArrayList<TaxW2TransactionResponse>();
        }
        return this.taxw2TRNRS;
    }

}
