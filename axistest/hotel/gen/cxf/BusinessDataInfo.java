
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessDataInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessDataInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDataType" type="{http://localhost/MeetingBrokerServices}BusinessDataType"/&gt;
 *         &lt;element name="RoomBlock" type="{http://localhost/MeetingBrokerServices}RoomBlock" minOccurs="0"/&gt;
 *         &lt;element name="EventBlock" type="{http://localhost/MeetingBrokerServices}EventBlock" minOccurs="0"/&gt;
 *         &lt;element name="IsComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDataInfo", propOrder = {
    "businessDataType",
    "roomBlock",
    "eventBlock",
    "isComplete"
})
public class BusinessDataInfo {

    @XmlElement(name = "BusinessDataType", required = true)
    @XmlSchemaType(name = "string")
    protected BusinessDataType businessDataType;
    @XmlElement(name = "RoomBlock")
    protected RoomBlock roomBlock;
    @XmlElement(name = "EventBlock")
    protected EventBlock eventBlock;
    @XmlElement(name = "IsComplete")
    protected Boolean isComplete;

    /**
     * 获取businessDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataType }
     *     
     */
    public BusinessDataType getBusinessDataType() {
        return businessDataType;
    }

    /**
     * 设置businessDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataType }
     *     
     */
    public void setBusinessDataType(BusinessDataType value) {
        this.businessDataType = value;
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
     * 获取isComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplete() {
        return isComplete;
    }

    /**
     * 设置isComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }

}
