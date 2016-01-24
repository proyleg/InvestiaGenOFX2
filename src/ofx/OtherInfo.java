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
 *         The OFX element "OTHERINFO" is of type "OtherInfo"
 *       
 * 
 * <p>Java class for OtherInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSecurityInfo">
 *       &lt;sequence>
 *         &lt;element name="TYPEDESC" type="{http://ofx.net/types/2003/04}TypeDescriptionType" minOccurs="0"/>
 *         &lt;element name="ASSETCLASS" type="{http://ofx.net/types/2003/04}AssetClassEnum" minOccurs="0"/>
 *         &lt;element name="FIASSETCLASS" type="{http://ofx.net/types/2003/04}GenericNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherInfo", propOrder = {
    "typedesc",
    "assetclass",
    "fiassetclass"
})
public class OtherInfo
    extends AbstractSecurityInfo
{

    @XmlElement(name = "TYPEDESC")
    protected String typedesc;
    @XmlElement(name = "ASSETCLASS")
    protected AssetClassEnum assetclass;
    @XmlElement(name = "FIASSETCLASS")
    protected String fiassetclass;

    /**
     * Gets the value of the typedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEDESC() {
        return typedesc;
    }

    /**
     * Sets the value of the typedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEDESC(String value) {
        this.typedesc = value;
    }

    /**
     * Gets the value of the assetclass property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassEnum }
     *     
     */
    public AssetClassEnum getASSETCLASS() {
        return assetclass;
    }

    /**
     * Sets the value of the assetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassEnum }
     *     
     */
    public void setASSETCLASS(AssetClassEnum value) {
        this.assetclass = value;
    }

    /**
     * Gets the value of the fiassetclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASSETCLASS() {
        return fiassetclass;
    }

    /**
     * Sets the value of the fiassetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIASSETCLASS(String value) {
        this.fiassetclass = value;
    }

}