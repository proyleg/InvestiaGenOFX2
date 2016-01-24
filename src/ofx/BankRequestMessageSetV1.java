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
 *         The OFX element "BANKMSGSRQV1" is of type "BankRequestMessageSetV1"
 *       
 * 
 * <p>Java class for BankRequestMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankRequestMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRequestMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="STMTTRNRQ" type="{http://ofx.net/types/2003/04}StatementTransactionRequest"/>
 *         &lt;element name="STMTENDTRNRQ" type="{http://ofx.net/types/2003/04}StatementEndTransactionRequest"/>
 *         &lt;element name="INTRATRNRQ" type="{http://ofx.net/types/2003/04}IntraTransactionRequest"/>
 *         &lt;element name="RECINTRATRNRQ" type="{http://ofx.net/types/2003/04}RecurringIntraTransactionRequest"/>
 *         &lt;element name="STPCHKTRNRQ" type="{http://ofx.net/types/2003/04}StopCheckTransactionRequest"/>
 *         &lt;element name="BANKMAILTRNRQ" type="{http://ofx.net/types/2003/04}BankMailTransactionRequest"/>
 *         &lt;element name="BANKMAILSYNCRQ" type="{http://ofx.net/types/2003/04}BankMailSyncRequest"/>
 *         &lt;element name="STPCHKSYNCRQ" type="{http://ofx.net/types/2003/04}StopCheckSyncRequest"/>
 *         &lt;element name="INTRASYNCRQ" type="{http://ofx.net/types/2003/04}IntraSyncRequest"/>
 *         &lt;element name="RECINTRASYNCRQ" type="{http://ofx.net/types/2003/04}RecurringIntraSyncRequest"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankRequestMessageSetV1", propOrder = {
    "stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ"
})
public class BankRequestMessageSetV1
    extends AbstractRequestMessageSet
{

    @XmlElements({
        @XmlElement(name = "STMTTRNRQ", type = StatementTransactionRequest.class),
        @XmlElement(name = "STMTENDTRNRQ", type = StatementEndTransactionRequest.class),
        @XmlElement(name = "INTRATRNRQ", type = IntraTransactionRequest.class),
        @XmlElement(name = "RECINTRATRNRQ", type = RecurringIntraTransactionRequest.class),
        @XmlElement(name = "STPCHKTRNRQ", type = StopCheckTransactionRequest.class),
        @XmlElement(name = "BANKMAILTRNRQ", type = BankMailTransactionRequest.class),
        @XmlElement(name = "BANKMAILSYNCRQ", type = BankMailSyncRequest.class),
        @XmlElement(name = "STPCHKSYNCRQ", type = StopCheckSyncRequest.class),
        @XmlElement(name = "INTRASYNCRQ", type = IntraSyncRequest.class),
        @XmlElement(name = "RECINTRASYNCRQ", type = RecurringIntraSyncRequest.class)
    })
    protected List<AbstractRequest> stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ;

    /**
     * Gets the value of the stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTMTTRNRQOrSTMTENDTRNRQOrINTRATRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementTransactionRequest }
     * {@link StatementEndTransactionRequest }
     * {@link IntraTransactionRequest }
     * {@link RecurringIntraTransactionRequest }
     * {@link StopCheckTransactionRequest }
     * {@link BankMailTransactionRequest }
     * {@link BankMailSyncRequest }
     * {@link StopCheckSyncRequest }
     * {@link IntraSyncRequest }
     * {@link RecurringIntraSyncRequest }
     * 
     * 
     */
    public List<AbstractRequest> getSTMTTRNRQOrSTMTENDTRNRQOrINTRATRNRQ() {
        if (stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ == null) {
            stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ = new ArrayList<AbstractRequest>();
        }
        return this.stmttrnrqOrSTMTENDTRNRQOrINTRATRNRQ;
    }

}
