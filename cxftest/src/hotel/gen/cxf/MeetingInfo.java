
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeetingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeetingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate1Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate2Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RespondByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ResponseInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeetingHistoryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeetingSeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExternalMeetingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalMarketSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAgencyPrimaryContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PeakRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfAttendeesAtLargestEvent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AgencyProfile" type="{http://localhost/MeetingBrokerServices}Profile" minOccurs="0"/&gt;
 *         &lt;element name="CompanyProfile" type="{http://localhost/MeetingBrokerServices}Profile" minOccurs="0"/&gt;
 *         &lt;element name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInfo", propOrder = {
    "meetingName",
    "referenceNumber",
    "totalBudget",
    "startDate",
    "alternateStartDate1",
    "alternateStartDate1Comments",
    "alternateStartDate2",
    "alternateStartDate2Comments",
    "attendeeQuantity",
    "respondByDate",
    "responseInstructions",
    "generalComments",
    "destinationComments",
    "meetingHistoryComments",
    "meetingSeriesName",
    "numberOfEvents",
    "numberOfNights",
    "externalMeetingType",
    "externalCurrency",
    "externalLeadSource",
    "externalMarketSegment",
    "isAgencyPrimaryContact",
    "peakRooms",
    "numberOfAttendeesAtLargestEvent",
    "commission",
    "isCommissionable",
    "agencyProfile",
    "companyProfile",
    "promotionalCode"
})
public class MeetingInfo {

    @XmlElement(name = "MeetingName")
    protected String meetingName;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "TotalBudget")
    protected BigDecimal totalBudget;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected String startDate;
    @XmlElement(name = "AlternateStartDate1")
    @XmlSchemaType(name = "dateTime")
    protected String alternateStartDate1;
    @XmlElement(name = "AlternateStartDate1Comments")
    protected String alternateStartDate1Comments;
    @XmlElement(name = "AlternateStartDate2")
    @XmlSchemaType(name = "dateTime")
    protected String alternateStartDate2;
    @XmlElement(name = "AlternateStartDate2Comments")
    protected String alternateStartDate2Comments;
    @XmlElement(name = "AttendeeQuantity")
    protected Integer attendeeQuantity;
    @XmlElement(name = "RespondByDate")
    @XmlSchemaType(name = "dateTime")
    protected String respondByDate;
    @XmlElement(name = "ResponseInstructions")
    protected String responseInstructions;
    @XmlElement(name = "GeneralComments")
    protected String generalComments;
    @XmlElement(name = "DestinationComments")
    protected String destinationComments;
    @XmlElement(name = "MeetingHistoryComments")
    protected String meetingHistoryComments;
    @XmlElement(name = "MeetingSeriesName")
    protected String meetingSeriesName;
    @XmlElement(name = "NumberOfEvents")
    protected Integer numberOfEvents;
    @XmlElement(name = "NumberOfNights")
    protected Integer numberOfNights;
    @XmlElement(name = "ExternalMeetingType")
    protected String externalMeetingType;
    @XmlElement(name = "ExternalCurrency")
    protected String externalCurrency;
    @XmlElement(name = "ExternalLeadSource")
    protected String externalLeadSource;
    @XmlElement(name = "ExternalMarketSegment")
    protected String externalMarketSegment;
    @XmlElement(name = "IsAgencyPrimaryContact")
    protected Boolean isAgencyPrimaryContact;
    @XmlElement(name = "PeakRooms")
    protected Integer peakRooms;
    @XmlElement(name = "NumberOfAttendeesAtLargestEvent")
    protected Integer numberOfAttendeesAtLargestEvent;
    @XmlElement(name = "Commission")
    protected BigDecimal commission;
    @XmlElement(name = "IsCommissionable")
    protected Boolean isCommissionable;
    @XmlElement(name = "AgencyProfile")
    protected Profile agencyProfile;
    @XmlElement(name = "CompanyProfile")
    protected Profile companyProfile;
    @XmlElement(name = "PromotionalCode")
    protected String promotionalCode;

    /**
     * 获取meetingName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingName() {
        return meetingName;
    }

    /**
     * 设置meetingName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingName(String value) {
        this.meetingName = value;
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
     * 获取totalBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    /**
     * 设置totalBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBudget(BigDecimal value) {
        this.totalBudget = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * 获取alternateStartDate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateStartDate1() {
        return alternateStartDate1;
    }

    /**
     * 设置alternateStartDate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateStartDate1(String value) {
        this.alternateStartDate1 = value;
    }

    /**
     * 获取alternateStartDate1Comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateStartDate1Comments() {
        return alternateStartDate1Comments;
    }

    /**
     * 设置alternateStartDate1Comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateStartDate1Comments(String value) {
        this.alternateStartDate1Comments = value;
    }

    /**
     * 获取alternateStartDate2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateStartDate2() {
        return alternateStartDate2;
    }

    /**
     * 设置alternateStartDate2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateStartDate2(String value) {
        this.alternateStartDate2 = value;
    }

    /**
     * 获取alternateStartDate2Comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateStartDate2Comments() {
        return alternateStartDate2Comments;
    }

    /**
     * 设置alternateStartDate2Comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateStartDate2Comments(String value) {
        this.alternateStartDate2Comments = value;
    }

    /**
     * 获取attendeeQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttendeeQuantity() {
        return attendeeQuantity;
    }

    /**
     * 设置attendeeQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttendeeQuantity(Integer value) {
        this.attendeeQuantity = value;
    }

    /**
     * 获取respondByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespondByDate() {
        return respondByDate;
    }

    /**
     * 设置respondByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespondByDate(String value) {
        this.respondByDate = value;
    }

    /**
     * 获取responseInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseInstructions() {
        return responseInstructions;
    }

    /**
     * 设置responseInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseInstructions(String value) {
        this.responseInstructions = value;
    }

    /**
     * 获取generalComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralComments() {
        return generalComments;
    }

    /**
     * 设置generalComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralComments(String value) {
        this.generalComments = value;
    }

    /**
     * 获取destinationComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationComments() {
        return destinationComments;
    }

    /**
     * 设置destinationComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationComments(String value) {
        this.destinationComments = value;
    }

    /**
     * 获取meetingHistoryComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingHistoryComments() {
        return meetingHistoryComments;
    }

    /**
     * 设置meetingHistoryComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingHistoryComments(String value) {
        this.meetingHistoryComments = value;
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
     * 获取numberOfEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfEvents() {
        return numberOfEvents;
    }

    /**
     * 设置numberOfEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfEvents(Integer value) {
        this.numberOfEvents = value;
    }

    /**
     * 获取numberOfNights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * 设置numberOfNights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfNights(Integer value) {
        this.numberOfNights = value;
    }

    /**
     * 获取externalMeetingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalMeetingType() {
        return externalMeetingType;
    }

    /**
     * 设置externalMeetingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalMeetingType(String value) {
        this.externalMeetingType = value;
    }

    /**
     * 获取externalCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCurrency() {
        return externalCurrency;
    }

    /**
     * 设置externalCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCurrency(String value) {
        this.externalCurrency = value;
    }

    /**
     * 获取externalLeadSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLeadSource() {
        return externalLeadSource;
    }

    /**
     * 设置externalLeadSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLeadSource(String value) {
        this.externalLeadSource = value;
    }

    /**
     * 获取externalMarketSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalMarketSegment() {
        return externalMarketSegment;
    }

    /**
     * 设置externalMarketSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalMarketSegment(String value) {
        this.externalMarketSegment = value;
    }

    /**
     * 获取isAgencyPrimaryContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAgencyPrimaryContact() {
        return isAgencyPrimaryContact;
    }

    /**
     * 设置isAgencyPrimaryContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgencyPrimaryContact(Boolean value) {
        this.isAgencyPrimaryContact = value;
    }

    /**
     * 获取peakRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeakRooms() {
        return peakRooms;
    }

    /**
     * 设置peakRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeakRooms(Integer value) {
        this.peakRooms = value;
    }

    /**
     * 获取numberOfAttendeesAtLargestEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAttendeesAtLargestEvent() {
        return numberOfAttendeesAtLargestEvent;
    }

    /**
     * 设置numberOfAttendeesAtLargestEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAttendeesAtLargestEvent(Integer value) {
        this.numberOfAttendeesAtLargestEvent = value;
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
     * 获取agencyProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getAgencyProfile() {
        return agencyProfile;
    }

    /**
     * 设置agencyProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setAgencyProfile(Profile value) {
        this.agencyProfile = value;
    }

    /**
     * 获取companyProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getCompanyProfile() {
        return companyProfile;
    }

    /**
     * 设置companyProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setCompanyProfile(Profile value) {
        this.companyProfile = value;
    }

    /**
     * 获取promotionalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * 设置promotionalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

}
