
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Proposal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Proposal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLocationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://localhost/MeetingBrokerServices}ProposalStatus"/&gt;
 *         &lt;element name="MeetingInfo" type="{http://localhost/MeetingBrokerServices}MeetingInfo" minOccurs="0"/&gt;
 *         &lt;element name="RoomBlock" type="{http://localhost/MeetingBrokerServices}RoomBlock" minOccurs="0"/&gt;
 *         &lt;element name="EventBlock" type="{http://localhost/MeetingBrokerServices}EventBlock" minOccurs="0"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProposalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectedLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectedLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AssignedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal", propOrder = {
    "externalRfpId",
    "siteId",
    "externalLocationId",
    "commission",
    "isCommissionable",
    "status",
    "meetingInfo",
    "roomBlock",
    "eventBlock",
    "rfpId",
    "proposalId",
    "channelName",
    "sendingUser",
    "sendingLocation",
    "redirectedLocationName",
    "redirectedLocationId",
    "assignedUser"
})
public class Proposal {

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "ExternalLocationId")
    protected Integer externalLocationId;
    @XmlElement(name = "Commission")
    protected BigDecimal commission;
    @XmlElement(name = "IsCommissionable")
    protected Boolean isCommissionable;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalStatus status;
    @XmlElement(name = "MeetingInfo")
    protected MeetingInfo meetingInfo;
    @XmlElement(name = "RoomBlock")
    protected RoomBlock roomBlock;
    @XmlElement(name = "EventBlock")
    protected EventBlock eventBlock;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "ProposalId")
    protected int proposalId;
    @XmlElement(name = "ChannelName")
    protected String channelName;
    @XmlElement(name = "SendingUser")
    protected String sendingUser;
    @XmlElement(name = "SendingLocation")
    protected String sendingLocation;
    @XmlElement(name = "RedirectedLocationName")
    protected String redirectedLocationName;
    @XmlElement(name = "RedirectedLocationId")
    protected int redirectedLocationId;
    @XmlElement(name = "AssignedUser")
    protected String assignedUser;

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
     * 获取siteId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 设置siteId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteId(Integer value) {
        this.siteId = value;
    }

    /**
     * 获取externalLocationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalLocationId() {
        return externalLocationId;
    }

    /**
     * 设置externalLocationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalLocationId(Integer value) {
        this.externalLocationId = value;
    }

    /**
     * 获取commission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * 获取isCommissionable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommissionable() {
        return isCommissionable;
    }

    /**
     * 设置isCommissionable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommissionable(Boolean value) {
        this.isCommissionable = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProposalStatus }
     *     
     */
    public ProposalStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalStatus }
     *     
     */
    public void setStatus(ProposalStatus value) {
        this.status = value;
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
     * 获取rfpId属性的值。
     * 
     */
    public int getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     */
    public void setRfpId(int value) {
        this.rfpId = value;
    }

    /**
     * 获取proposalId属性的值。
     * 
     */
    public int getProposalId() {
        return proposalId;
    }

    /**
     * 设置proposalId属性的值。
     * 
     */
    public void setProposalId(int value) {
        this.proposalId = value;
    }

    /**
     * 获取channelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置channelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * 获取sendingUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingUser() {
        return sendingUser;
    }

    /**
     * 设置sendingUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingUser(String value) {
        this.sendingUser = value;
    }

    /**
     * 获取sendingLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingLocation() {
        return sendingLocation;
    }

    /**
     * 设置sendingLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingLocation(String value) {
        this.sendingLocation = value;
    }

    /**
     * 获取redirectedLocationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectedLocationName() {
        return redirectedLocationName;
    }

    /**
     * 设置redirectedLocationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectedLocationName(String value) {
        this.redirectedLocationName = value;
    }

    /**
     * 获取redirectedLocationId属性的值。
     * 
     */
    public int getRedirectedLocationId() {
        return redirectedLocationId;
    }

    /**
     * 设置redirectedLocationId属性的值。
     * 
     */
    public void setRedirectedLocationId(int value) {
        this.redirectedLocationId = value;
    }

    /**
     * 获取assignedUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUser() {
        return assignedUser;
    }

    /**
     * 设置assignedUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUser(String value) {
        this.assignedUser = value;
    }

}
