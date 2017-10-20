
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExternalProposalDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExternalProposalDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventBlock" type="{http://localhost/MeetingBrokerServices}EventBlock" minOccurs="0"/&gt;
 *         &lt;element name="RoomBlock" type="{http://localhost/MeetingBrokerServices}ExternalRoomBlock" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalProposalDetail", propOrder = {
    "currency",
    "eventBlock",
    "roomBlock"
})
public class ExternalProposalDetail {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "EventBlock")
    protected EventBlock eventBlock;
    @XmlElement(name = "RoomBlock")
    protected ExternalRoomBlock roomBlock;

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * 获取roomBlock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalRoomBlock }
     *     
     */
    public ExternalRoomBlock getRoomBlock() {
        return roomBlock;
    }

    /**
     * 设置roomBlock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRoomBlock }
     *     
     */
    public void setRoomBlock(ExternalRoomBlock value) {
        this.roomBlock = value;
    }

}
