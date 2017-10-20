
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationUpdatedEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationUpdatedEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationGuid" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationUpdatedEventArgs", propOrder = {
    "locationId",
    "locationGuid",
    "isActive",
    "imageURL"
})
public class LocationUpdatedEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "LocationId")
    protected int locationId;
    @XmlElement(name = "LocationGuid", required = true)
    protected String locationGuid;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "ImageURL")
    protected String imageURL;

    /**
     * 获取locationId属性的值。
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * 设置locationId属性的值。
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * 获取locationGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationGuid() {
        return locationGuid;
    }

    /**
     * 设置locationGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationGuid(String value) {
        this.locationGuid = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * 获取imageURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * 设置imageURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

}
