
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExternalRfp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExternalRfp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomBlock" type="{http://localhost/MeetingBrokerServices}RoomBlock" minOccurs="0"/&gt;
 *         &lt;element name="EventBlock" type="{http://localhost/MeetingBrokerServices}EventBlock" minOccurs="0"/&gt;
 *         &lt;element name="MeetingInfo" type="{http://localhost/MeetingBrokerServices}MeetingInfo" minOccurs="0"/&gt;
 *         &lt;element name="Sites" type="{http://localhost/MeetingBrokerServices}ArrayOfSite" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Questions" type="{http://localhost/MeetingBrokerServices}ArrayOfQuestion" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://localhost/MeetingBrokerServices}Sender" minOccurs="0"/&gt;
 *         &lt;element name="Override" type="{http://localhost/MeetingBrokerServices}Override" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInformations" type="{http://localhost/MeetingBrokerServices}ArrayOfAdditionalInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRfp", propOrder = {
    "externalRfpId",
    "roomBlock",
    "eventBlock",
    "meetingInfo",
    "sites",
    "status",
    "questions",
    "sender",
    "override",
    "additionalInformations"
})
public class ExternalRfp {

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "RoomBlock")
    protected RoomBlock roomBlock;
    @XmlElement(name = "EventBlock")
    protected EventBlock eventBlock;
    @XmlElement(name = "MeetingInfo")
    protected MeetingInfo meetingInfo;
    @XmlElement(name = "Sites")
    protected ArrayOfSite sites;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Questions")
    protected ArrayOfQuestion questions;
    @XmlElement(name = "Sender")
    protected Sender sender;
    @XmlElement(name = "Override")
    protected Override override;
    @XmlElement(name = "AdditionalInformations")
    protected ArrayOfAdditionalInformation additionalInformations;

    /**
     * 获取externalRfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRfpId() {
        return externalRfpId;
    }

    /**
     * 设置externalRfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRfpId(String value) {
        this.externalRfpId = value;
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

    /**
     * 获取sites属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSite }
     *     
     */
    public ArrayOfSite getSites() {
        return sites;
    }

    /**
     * 设置sites属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSite }
     *     
     */
    public void setSites(ArrayOfSite value) {
        this.sites = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取questions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuestion }
     *     
     */
    public ArrayOfQuestion getQuestions() {
        return questions;
    }

    /**
     * 设置questions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuestion }
     *     
     */
    public void setQuestions(ArrayOfQuestion value) {
        this.questions = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * 获取override属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Override }
     *     
     */
    public Override getOverride() {
        return override;
    }

    /**
     * 设置override属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Override }
     *     
     */
    public void setOverride(Override value) {
        this.override = value;
    }

    /**
     * 获取additionalInformations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalInformation }
     *     
     */
    public ArrayOfAdditionalInformation getAdditionalInformations() {
        return additionalInformations;
    }

    /**
     * 设置additionalInformations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalInformation }
     *     
     */
    public void setAdditionalInformations(ArrayOfAdditionalInformation value) {
        this.additionalInformations = value;
    }

}
