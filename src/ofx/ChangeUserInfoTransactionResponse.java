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
 *         The OFX element "CHGUSERINFOTRNRS" is of type "ChangeUserInfoTransactionResponse"
 *       
 * 
 * <p>Java class for ChangeUserInfoTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeUserInfoTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="CHGUSERINFORS" type="{http://ofx.net/types/2003/04}ChangeUserInfoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeUserInfoTransactionResponse", propOrder = {
    "chguserinfors"
})
public class ChangeUserInfoTransactionResponse
    extends AbstractTransactionResponse
{

    @XmlElement(name = "CHGUSERINFORS")
    protected ChangeUserInfoResponse chguserinfors;

    /**
     * Gets the value of the chguserinfors property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeUserInfoResponse }
     *     
     */
    public ChangeUserInfoResponse getCHGUSERINFORS() {
        return chguserinfors;
    }

    /**
     * Sets the value of the chguserinfors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeUserInfoResponse }
     *     
     */
    public void setCHGUSERINFORS(ChangeUserInfoResponse value) {
        this.chguserinfors = value;
    }

}
