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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         The OFX element "TAX1099MSGSETV1" is of type "Tax1099MessageSetV1"
 *       
 * 
 * <p>Java class for Tax1099MessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax1099MessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractMessageSetVersion">
 *       &lt;sequence>
 *         &lt;element name="TAX1099DNLD" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="EXTD1099B" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="TAXYEARSUPPORTED" type="{http://ofx.net/types/2003/04}YearType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax1099MessageSetV1", propOrder = {
    "tax1099DNLD",
    "extd1099B",
    "taxyearsupported"
})
public class Tax1099MessageSetV1
    extends AbstractMessageSetVersion
{

    @XmlElement(name = "TAX1099DNLD", required = true)
    protected BooleanType tax1099DNLD;
    @XmlElement(name = "EXTD1099B", required = true)
    protected BooleanType extd1099B;
    @XmlElement(name = "TAXYEARSUPPORTED", required = true)
    protected List<XMLGregorianCalendar> taxyearsupported;

    /**
     * Gets the value of the tax1099DNLD property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getTAX1099DNLD() {
        return tax1099DNLD;
    }

    /**
     * Sets the value of the tax1099DNLD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setTAX1099DNLD(BooleanType value) {
        this.tax1099DNLD = value;
    }

    /**
     * Gets the value of the extd1099B property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getEXTD1099B() {
        return extd1099B;
    }

    /**
     * Sets the value of the extd1099B property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setEXTD1099B(BooleanType value) {
        this.extd1099B = value;
    }

    /**
     * Gets the value of the taxyearsupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxyearsupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAXYEARSUPPORTED().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTAXYEARSUPPORTED() {
        if (taxyearsupported == null) {
            taxyearsupported = new ArrayList<XMLGregorianCalendar>();
        }
        return this.taxyearsupported;
    }

}
