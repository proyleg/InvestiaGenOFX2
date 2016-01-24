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
 *         The OFX element "BILLTBLSTRUCTRS" is of type "BillTableStructureResponse"
 *       
 * 
 * <p>Java class for BillTableStructureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillTableStructureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLID" type="{http://ofx.net/types/2003/04}IdType"/>
 *         &lt;element name="BILLDETAILTABLETYPE" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="COLDEF" type="{http://ofx.net/types/2003/04}ColumnDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTableStructureResponse", propOrder = {
    "billid",
    "billdetailtabletype",
    "coldef"
})
public class BillTableStructureResponse {

    @XmlElement(name = "BILLID", required = true)
    protected String billid;
    @XmlElement(name = "BILLDETAILTABLETYPE", required = true)
    protected String billdetailtabletype;
    @XmlElement(name = "COLDEF")
    protected List<ColumnDefinition> coldef;

    /**
     * Gets the value of the billid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLID() {
        return billid;
    }

    /**
     * Sets the value of the billid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLID(String value) {
        this.billid = value;
    }

    /**
     * Gets the value of the billdetailtabletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLDETAILTABLETYPE() {
        return billdetailtabletype;
    }

    /**
     * Sets the value of the billdetailtabletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLDETAILTABLETYPE(String value) {
        this.billdetailtabletype = value;
    }

    /**
     * Gets the value of the coldef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coldef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLDEF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnDefinition }
     * 
     * 
     */
    public List<ColumnDefinition> getCOLDEF() {
        if (coldef == null) {
            coldef = new ArrayList<ColumnDefinition>();
        }
        return this.coldef;
    }

}
