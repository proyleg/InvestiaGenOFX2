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
 *         The OFX element "TAXW2MSGSET" is of type "TaxW2MessageSet"
 *       
 * 
 * <p>Java class for TaxW2MessageSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxW2MessageSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSet">
 *       &lt;sequence>
 *         &lt;element name="TAXW2MSGSETV1" type="{http://ofx.net/types/2003/04}TaxW2MessageSetV1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxW2MessageSet", propOrder = {
    "taxw2MSGSETV1"
})
public class TaxW2MessageSet
    extends AbstractMessageSet
{

    @XmlElement(name = "TAXW2MSGSETV1", required = true)
    protected TaxW2MessageSetV1 taxw2MSGSETV1;

    /**
     * Gets the value of the taxw2MSGSETV1 property.
     * 
     * @return
     *     possible object is
     *     {@link TaxW2MessageSetV1 }
     *     
     */
    public TaxW2MessageSetV1 getTAXW2MSGSETV1() {
        return taxw2MSGSETV1;
    }

    /**
     * Sets the value of the taxw2MSGSETV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxW2MessageSetV1 }
     *     
     */
    public void setTAXW2MSGSETV1(TaxW2MessageSetV1 value) {
        this.taxw2MSGSETV1 = value;
    }

}
