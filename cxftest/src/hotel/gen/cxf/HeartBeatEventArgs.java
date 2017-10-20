
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HeartBeatEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HeartBeatEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifiers" type="{http://localhost/MeetingBrokerServices}LocationIdentifiers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartBeatEventArgs", propOrder = {
    "channelId",
    "locationIdentifiers"
})
public class HeartBeatEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "ChannelId")
    protected Integer channelId;
    @XmlElement(name = "LocationIdentifiers")
    protected LocationIdentifiers locationIdentifiers;

    /**
     * 获取channelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置channelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * 获取locationIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifiers }
     *     
     */
    public LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }

    /**
     * 设置locationIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifiers }
     *     
     */
    public void setLocationIdentifiers(LocationIdentifiers value) {
        this.locationIdentifiers = value;
    }

}
