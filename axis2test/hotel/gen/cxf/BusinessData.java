
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BusinessData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProposalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AgreedBusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="PickedUpBusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="ActualBusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="BlockedBusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="MeetingInfo" type="{http://localhost/MeetingBrokerServices}MeetingInfo" minOccurs="0"/&gt;
 *         &lt;element name="BusinessStatus" type="{http://localhost/MeetingBrokerServices}BusinessStatus"/&gt;
 *         &lt;element name="ExternalLostBusinessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpAccessUserEmailList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpAccessUserIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsPickUpComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LostToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostToHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherIncomeItems" type="{http://localhost/MeetingBrokerServices}ArrayOfOtherIncomeItem" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://localhost/MeetingBrokerServices}LocationIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessData", propOrder = {
    "rfpId",
    "proposalId",
    "agreedBusinessDataInfo",
    "pickedUpBusinessDataInfo",
    "actualBusinessDataInfo",
    "blockedBusinessDataInfo",
    "meetingInfo",
    "businessStatus",
    "externalLostBusinessReason",
    "businessOwnerId",
    "businessOwnerName",
    "businessOwnerEmail",
    "rfpAccessUserEmailList",
    "rfpAccessUserIdList",
    "departureDate",
    "comments",
    "externalBookingId",
    "businessCreationDate",
    "isPickUpComplete",
    "lostToCity",
    "lostToHotel",
    "otherIncomeItems",
    "locationIdentifier"
})
public class BusinessData {

    @XmlElement(name = "RfpId")
    protected Integer rfpId;
    @XmlElement(name = "ProposalId")
    protected Integer proposalId;
    @XmlElement(name = "AgreedBusinessDataInfo")
    protected BusinessDataInfo agreedBusinessDataInfo;
    @XmlElement(name = "PickedUpBusinessDataInfo")
    protected BusinessDataInfo pickedUpBusinessDataInfo;
    @XmlElement(name = "ActualBusinessDataInfo")
    protected BusinessDataInfo actualBusinessDataInfo;
    @XmlElement(name = "BlockedBusinessDataInfo")
    protected BusinessDataInfo blockedBusinessDataInfo;
    @XmlElement(name = "MeetingInfo")
    protected MeetingInfo meetingInfo;
    @XmlElement(name = "BusinessStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BusinessStatus businessStatus;
    @XmlElement(name = "ExternalLostBusinessReason")
    protected String externalLostBusinessReason;
    @XmlElement(name = "BusinessOwnerId")
    protected Integer businessOwnerId;
    @XmlElement(name = "BusinessOwnerName")
    protected String businessOwnerName;
    @XmlElement(name = "BusinessOwnerEmail")
    protected String businessOwnerEmail;
    @XmlElement(name = "RfpAccessUserEmailList")
    protected String rfpAccessUserEmailList;
    @XmlElement(name = "RfpAccessUserIdList")
    protected String rfpAccessUserIdList;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ExternalBookingId")
    protected String externalBookingId;
    @XmlElement(name = "BusinessCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessCreationDate;
    @XmlElement(name = "IsPickUpComplete")
    protected boolean isPickUpComplete;
    @XmlElement(name = "LostToCity")
    protected String lostToCity;
    @XmlElement(name = "LostToHotel")
    protected String lostToHotel;
    @XmlElement(name = "OtherIncomeItems")
    protected ArrayOfOtherIncomeItem otherIncomeItems;
    @XmlElement(name = "LocationIdentifier")
    protected LocationIdentifier locationIdentifier;

    /**
     * 获取rfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRfpId(Integer value) {
        this.rfpId = value;
    }

    /**
     * 获取proposalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProposalId() {
        return proposalId;
    }

    /**
     * 设置proposalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProposalId(Integer value) {
        this.proposalId = value;
    }

    /**
     * 获取agreedBusinessDataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataInfo }
     *     
     */
    public BusinessDataInfo getAgreedBusinessDataInfo() {
        return agreedBusinessDataInfo;
    }

    /**
     * 设置agreedBusinessDataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataInfo }
     *     
     */
    public void setAgreedBusinessDataInfo(BusinessDataInfo value) {
        this.agreedBusinessDataInfo = value;
    }

    /**
     * 获取pickedUpBusinessDataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataInfo }
     *     
     */
    public BusinessDataInfo getPickedUpBusinessDataInfo() {
        return pickedUpBusinessDataInfo;
    }

    /**
     * 设置pickedUpBusinessDataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataInfo }
     *     
     */
    public void setPickedUpBusinessDataInfo(BusinessDataInfo value) {
        this.pickedUpBusinessDataInfo = value;
    }

    /**
     * 获取actualBusinessDataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataInfo }
     *     
     */
    public BusinessDataInfo getActualBusinessDataInfo() {
        return actualBusinessDataInfo;
    }

    /**
     * 设置actualBusinessDataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataInfo }
     *     
     */
    public void setActualBusinessDataInfo(BusinessDataInfo value) {
        this.actualBusinessDataInfo = value;
    }

    /**
     * 获取blockedBusinessDataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataInfo }
     *     
     */
    public BusinessDataInfo getBlockedBusinessDataInfo() {
        return blockedBusinessDataInfo;
    }

    /**
     * 设置blockedBusinessDataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataInfo }
     *     
     */
    public void setBlockedBusinessDataInfo(BusinessDataInfo value) {
        this.blockedBusinessDataInfo = value;
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
     * 获取businessStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessStatus }
     *     
     */
    public BusinessStatus getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置businessStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessStatus }
     *     
     */
    public void setBusinessStatus(BusinessStatus value) {
        this.businessStatus = value;
    }

    /**
     * 获取externalLostBusinessReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }

    /**
     * 设置externalLostBusinessReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLostBusinessReason(String value) {
        this.externalLostBusinessReason = value;
    }

    /**
     * 获取businessOwnerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessOwnerId() {
        return businessOwnerId;
    }

    /**
     * 设置businessOwnerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessOwnerId(Integer value) {
        this.businessOwnerId = value;
    }

    /**
     * 获取businessOwnerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwnerName() {
        return businessOwnerName;
    }

    /**
     * 设置businessOwnerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwnerName(String value) {
        this.businessOwnerName = value;
    }

    /**
     * 获取businessOwnerEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwnerEmail() {
        return businessOwnerEmail;
    }

    /**
     * 设置businessOwnerEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwnerEmail(String value) {
        this.businessOwnerEmail = value;
    }

    /**
     * 获取rfpAccessUserEmailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpAccessUserEmailList() {
        return rfpAccessUserEmailList;
    }

    /**
     * 设置rfpAccessUserEmailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpAccessUserEmailList(String value) {
        this.rfpAccessUserEmailList = value;
    }

    /**
     * 获取rfpAccessUserIdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpAccessUserIdList() {
        return rfpAccessUserIdList;
    }

    /**
     * 设置rfpAccessUserIdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpAccessUserIdList(String value) {
        this.rfpAccessUserIdList = value;
    }

    /**
     * 获取departureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * 设置departureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
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

    /**
     * 获取externalBookingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingId() {
        return externalBookingId;
    }

    /**
     * 设置externalBookingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingId(String value) {
        this.externalBookingId = value;
    }

    /**
     * 获取businessCreationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessCreationDate() {
        return businessCreationDate;
    }

    /**
     * 设置businessCreationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessCreationDate(XMLGregorianCalendar value) {
        this.businessCreationDate = value;
    }

    /**
     * 获取isPickUpComplete属性的值。
     * 
     */
    public boolean isIsPickUpComplete() {
        return isPickUpComplete;
    }

    /**
     * 设置isPickUpComplete属性的值。
     * 
     */
    public void setIsPickUpComplete(boolean value) {
        this.isPickUpComplete = value;
    }

    /**
     * 获取lostToCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostToCity() {
        return lostToCity;
    }

    /**
     * 设置lostToCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostToCity(String value) {
        this.lostToCity = value;
    }

    /**
     * 获取lostToHotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostToHotel() {
        return lostToHotel;
    }

    /**
     * 设置lostToHotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostToHotel(String value) {
        this.lostToHotel = value;
    }

    /**
     * 获取otherIncomeItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherIncomeItem }
     *     
     */
    public ArrayOfOtherIncomeItem getOtherIncomeItems() {
        return otherIncomeItems;
    }

    /**
     * 设置otherIncomeItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherIncomeItem }
     *     
     */
    public void setOtherIncomeItems(ArrayOfOtherIncomeItem value) {
        this.otherIncomeItems = value;
    }

    /**
     * 获取locationIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifier }
     *     
     */
    public LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * 设置locationIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifier }
     *     
     */
    public void setLocationIdentifier(LocationIdentifier value) {
        this.locationIdentifier = value;
    }

}
