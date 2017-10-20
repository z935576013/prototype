
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventAvailability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EventAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventAvailabilityId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DayNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEventSetupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AttendeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsTwentyFourHourHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAvailability", propOrder = {
    "eventAvailabilityId",
    "dayNumber",
    "startTime",
    "endTime",
    "externalEventType",
    "externalEventSetupType",
    "roomSize",
    "attendeeQuantity",
    "isTwentyFourHourHold",
    "comments"
})
public class EventAvailability {

    @XmlElement(name = "EventAvailabilityId")
    protected int eventAvailabilityId;
    @XmlElement(name = "DayNumber")
    protected int dayNumber;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "ExternalEventType")
    protected String externalEventType;
    @XmlElement(name = "ExternalEventSetupType")
    protected String externalEventSetupType;
    @XmlElement(name = "RoomSize")
    protected int roomSize;
    @XmlElement(name = "AttendeeQuantity")
    protected int attendeeQuantity;
    @XmlElement(name = "IsTwentyFourHourHold")
    protected boolean isTwentyFourHourHold;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * 获取eventAvailabilityId属性的值。
     * 
     */
    public int getEventAvailabilityId() {
        return eventAvailabilityId;
    }

    /**
     * 设置eventAvailabilityId属性的值。
     * 
     */
    public void setEventAvailabilityId(int value) {
        this.eventAvailabilityId = value;
    }

    /**
     * 获取dayNumber属性的值。
     * 
     */
    public int getDayNumber() {
        return dayNumber;
    }

    /**
     * 设置dayNumber属性的值。
     * 
     */
    public void setDayNumber(int value) {
        this.dayNumber = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取externalEventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEventType() {
        return externalEventType;
    }

    /**
     * 设置externalEventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEventType(String value) {
        this.externalEventType = value;
    }

    /**
     * 获取externalEventSetupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEventSetupType() {
        return externalEventSetupType;
    }

    /**
     * 设置externalEventSetupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEventSetupType(String value) {
        this.externalEventSetupType = value;
    }

    /**
     * 获取roomSize属性的值。
     * 
     */
    public int getRoomSize() {
        return roomSize;
    }

    /**
     * 设置roomSize属性的值。
     * 
     */
    public void setRoomSize(int value) {
        this.roomSize = value;
    }

    /**
     * 获取attendeeQuantity属性的值。
     * 
     */
    public int getAttendeeQuantity() {
        return attendeeQuantity;
    }

    /**
     * 设置attendeeQuantity属性的值。
     * 
     */
    public void setAttendeeQuantity(int value) {
        this.attendeeQuantity = value;
    }

    /**
     * 获取isTwentyFourHourHold属性的值。
     * 
     */
    public boolean isIsTwentyFourHourHold() {
        return isTwentyFourHourHold;
    }

    /**
     * 设置isTwentyFourHourHold属性的值。
     * 
     */
    public void setIsTwentyFourHourHold(boolean value) {
        this.isTwentyFourHourHold = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
