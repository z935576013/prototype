
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RfpBookingLink complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RfpBookingLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProposalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeetingSeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RespondByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RfpAction" type="{http://localhost/MeetingBrokerServices}RfpActionTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfpBookingLink", propOrder = {
    "bookingId",
    "externalLocationId",
    "rfpId",
    "proposalId",
    "channelName",
    "sendingLocation",
    "sendingUser",
    "referenceNumber",
    "meetingSeriesName",
    "respondByDate",
    "rfpAction"
})
public class RfpBookingLink {

    @XmlElement(name = "BookingId")
    protected String bookingId;
    @XmlElement(name = "ExternalLocationId")
    protected int externalLocationId;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "ProposalId")
    protected int proposalId;
    @XmlElement(name = "ChannelName")
    protected String channelName;
    @XmlElement(name = "SendingLocation")
    protected String sendingLocation;
    @XmlElement(name = "SendingUser")
    protected String sendingUser;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "MeetingSeriesName")
    protected String meetingSeriesName;
    @XmlElement(name = "RespondByDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar respondByDate;
    @XmlElement(name = "RfpAction", required = true)
    @XmlSchemaType(name = "string")
    protected RfpActionTypes rfpAction;

    /**
     * 获取bookingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * 设置bookingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
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
     * 获取referenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 设置referenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * 获取meetingSeriesName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingSeriesName() {
        return meetingSeriesName;
    }

    /**
     * 设置meetingSeriesName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingSeriesName(String value) {
        this.meetingSeriesName = value;
    }

    /**
     * 获取respondByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRespondByDate() {
        return respondByDate;
    }

    /**
     * 设置respondByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRespondByDate(XMLGregorianCalendar value) {
        this.respondByDate = value;
    }

    /**
     * 获取rfpAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RfpActionTypes }
     *     
     */
    public RfpActionTypes getRfpAction() {
        return rfpAction;
    }

    /**
     * 设置rfpAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RfpActionTypes }
     *     
     */
    public void setRfpAction(RfpActionTypes value) {
        this.rfpAction = value;
    }

}
