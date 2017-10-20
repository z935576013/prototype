
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateMeetingRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateMeetingRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExternalLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomBlock" type="{http://localhost/MeetingBrokerServices}RoomBlock" minOccurs="0"/&gt;
 *         &lt;element name="EventBlock" type="{http://localhost/MeetingBrokerServices}EventBlock" minOccurs="0"/&gt;
 *         &lt;element name="MeetingInfo" type="{http://localhost/MeetingBrokerServices}MeetingInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMeetingRQ", propOrder = {
    "siteId",
    "externalLocationId",
    "roomBlock",
    "eventBlock",
    "meetingInfo"
})
public class CreateMeetingRQ
    extends Request
{

    @XmlElement(name = "SiteId")
    protected int siteId;
    @XmlElement(name = "ExternalLocationId")
    protected int externalLocationId;
    @XmlElement(name = "RoomBlock")
    protected RoomBlock roomBlock;
    @XmlElement(name = "EventBlock")
    protected EventBlock eventBlock;
    @XmlElement(name = "MeetingInfo")
    protected MeetingInfo meetingInfo;

    /**
     * 获取siteId属性的值。
     * 
     */
    public int getSiteId() {
        return siteId;
    }

    /**
     * 设置siteId属性的值。
     * 
     */
    public void setSiteId(int value) {
        this.siteId = value;
    }

    /**
     * 获取externalLocationId属性的值。
     * 
     */
    public int getExternalLocationId() {
        return externalLocationId;
    }

    /**
     * 设置externalLocationId属性的值。
     * 
     */
    public void setExternalLocationId(int value) {
        this.externalLocationId = value;
    }

    /**
     * 获取roomBlock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomBlock }
     *     
     */
    public RoomBlock getRoomBlock() {
        return roomBlock;
    }

    /**
     * 设置roomBlock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomBlock }
     *     
     */
    public void setRoomBlock(RoomBlock value) {
        this.roomBlock = value;
    }

    /**
     * 获取eventBlock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EventBlock }
     *     
     */
    public EventBlock getEventBlock() {
        return eventBlock;
    }

    /**
     * 设置eventBlock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EventBlock }
     *     
     */
    public void setEventBlock(EventBlock value) {
        this.eventBlock = value;
    }

    /**
     * 获取meetingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeetingInfo }
     *     
     */
    public MeetingInfo getMeetingInfo() {
        return meetingInfo;
    }

    /**
     * 设置meetingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInfo }
     *     
     */
    public void setMeetingInfo(MeetingInfo value) {
        this.meetingInfo = value;
    }

}
