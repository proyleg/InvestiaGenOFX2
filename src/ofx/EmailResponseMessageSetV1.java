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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "EMAILMSGSRSV1" is of type "EmailResponseMessageSetV1"
 *       
 * 
 * <p>Java class for EmailResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="MAILTRNRS" type="{http://ofx.net/types/2003/04}MailTransactionResponse"/>
 *         &lt;element name="MAILSYNCRS" type="{http://ofx.net/types/2003/04}MailSyncResponse"/>
 *         &lt;element name="GETMIMETRNRS" type="{http://ofx.net/types/2003/04}GetMimeTransactionResponse"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailResponseMessageSetV1", propOrder = {
    "mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS"
})
public class EmailResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElements({
        @XmlElement(name = "MAILTRNRS", type = MailTransactionResponse.class),
        @XmlElement(name = "MAILSYNCRS", type = MailSyncResponse.class),
        @XmlElement(name = "GETMIMETRNRS", type = GetMimeTransactionResponse.class)
    })
    protected List<AbstractResponse> mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS;

    /**
     * Gets the value of the mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAILTRNRSOrMAILSYNCRSOrGETMIMETRNRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailTransactionResponse }
     * {@link MailSyncResponse }
     * {@link GetMimeTransactionResponse }
     * 
     * 
     */
    public List<AbstractResponse> getMAILTRNRSOrMAILSYNCRSOrGETMIMETRNRS() {
        if (mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS == null) {
            mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS = new ArrayList<AbstractResponse>();
        }
        return this.mailtrnrsOrMAILSYNCRSOrGETMIMETRNRS;
    }

}
