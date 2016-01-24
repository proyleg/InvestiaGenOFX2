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
 *         The OFX element "RECINTERCANRS" is of type "RecurringInterCancellationResponse"
 *       
 * 
 * <p>Java class for RecurringInterCancellationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringInterCancellationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRecurringInterResponse">
 *       &lt;sequence>
 *         &lt;element name="CANPENDING" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringInterCancellationResponse", propOrder = {
    "canpending"
})
public class RecurringInterCancellationResponse
    extends AbstractRecurringInterResponse
{

    @XmlElement(name = "CANPENDING", required = true)
    protected BooleanType canpending;

    /**
     * Gets the value of the canpending property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getCANPENDING() {
        return canpending;
    }

    /**
     * Sets the value of the canpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setCANPENDING(BooleanType value) {
        this.canpending = value;
    }

}
