
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationIdentifier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocationIdentifierType" type="{http://localhost/MeetingBrokerServices}LocationIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationIdentifier", propOrder = {
    "locationId",
    "locationIdentifierType"
})
public class LocationIdentifier {

    @XmlElement(name = "LocationId", required = true, nillable = true)
    protected String locationId;
    @XmlElement(name = "LocationIdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected LocationIdentifierType locationIdentifierType;

    /**
     * 获取locationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * 设置locationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * 获取locationIdentifierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifierType }
     *     
     */
    public LocationIdentifierType getLocationIdentifierType() {
        return locationIdentifierType;
    }

    /**
     * 设置locationIdentifierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifierType }
     *     
     */
    public void setLocationIdentifierType(LocationIdentifierType value) {
        this.locationIdentifierType = value;
    }

}
