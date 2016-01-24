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
 *         The OFX element "OOSELLOPT" is of type "OpenOrderSellOption"
 *       
 * 
 * <p>Java class for OpenOrderSellOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderSellOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractOpenOrder">
 *       &lt;sequence>
 *         &lt;element name="OPTSELLTYPE" type="{http://ofx.net/types/2003/04}OptionSellEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderSellOption", propOrder = {
    "optselltype"
})
public class OpenOrderSellOption
    extends AbstractOpenOrder
{

    @XmlElement(name = "OPTSELLTYPE", required = true)
    protected OptionSellEnum optselltype;

    /**
     * Gets the value of the optselltype property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSellEnum }
     *     
     */
    public OptionSellEnum getOPTSELLTYPE() {
        return optselltype;
    }

    /**
     * Sets the value of the optselltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSellEnum }
     *     
     */
    public void setOPTSELLTYPE(OptionSellEnum value) {
        this.optselltype = value;
    }

}
