
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GetBusinessDataInfoRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBusinessDataInfoRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="BusinessStatus" type="{http://localhost/MeetingBrokerServices}BusinessStatus" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLostBusinessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpAccessUserEmailList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpAccessUserIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPickUpComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BusinessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherIncomeItems" type="{http://localhost/MeetingBrokerServices}ArrayOfOtherIncomeItem" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LostToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostToHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLockedBySC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDataInfoRS", propOrder = {
    "businessDataInfo",
    "businessStatus",
    "externalLostBusinessReason",
    "businessOwnerId",
    "businessOwnerFirstName",
    "businessOwnerLastName",
    "businessOwnerEmail",
    "rfpAccessUserEmailList",
    "rfpAccessUserIdList",
    "startDate",
    "departureDate",
    "externalRfpId",
    "secondaryExternalRfpId",
    "siteId",
    "comments",
    "isPickUpComplete",
    "businessCreateDate",
    "businessId",
    "otherIncomeItems",
    "externalCurrency",
    "commission",
    "lostToCity",
    "lostToHotel",
    "isLockedBySC"
})
public class GetBusinessDataInfoRS
    extends Acknowledgement
{

    @XmlElement(name = "BusinessDataInfo")
    protected BusinessDataInfo businessDataInfo;
    @XmlElement(name = "BusinessStatus")
    @XmlSchemaType(name = "string")
    protected BusinessStatus businessStatus;
    @XmlElement(name = "ExternalLostBusinessReason")
    protected String externalLostBusinessReason;
    @XmlElement(name = "BusinessOwnerId")
    protected Integer businessOwnerId;
    @XmlElement(name = "BusinessOwnerFirstName")
    protected String businessOwnerFirstName;
    @XmlElement(name = "BusinessOwnerLastName")
    protected String businessOwnerLastName;
    @XmlElement(name = "BusinessOwnerEmail")
    protected String businessOwnerEmail;
    @XmlElement(name = "RfpAccessUserEmailList")
    protected String rfpAccessUserEmailList;
    @XmlElement(name = "RfpAccessUserIdList")
    protected String rfpAccessUserIdList;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "IsPickUpComplete")
    protected Boolean isPickUpComplete;
    @XmlElement(name = "BusinessCreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessCreateDate;
    @XmlElement(name = "BusinessId")
    protected String businessId;
    @XmlElement(name = "OtherIncomeItems")
    protected ArrayOfOtherIncomeItem otherIncomeItems;
    @XmlElement(name = "ExternalCurrency")
    protected String externalCurrency;
    @XmlElement(name = "Commission")
    protected BigDecimal commission;
    @XmlElement(name = "LostToCity")
    protected String lostToCity;
    @XmlElement(name = "LostToHotel")
    protected String lostToHotel;
    @XmlElement(name = "IsLockedBySC")
    protected Boolean isLockedBySC;

    /**
     * 获取businessDataInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDataInfo }
     *     
     */
    public BusinessDataInfo getBusinessDataInfo() {
        return businessDataInfo;
    }

    /**
     * 设置businessDataInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDataInfo }
     *     
     */
    public void setBusinessDataInfo(BusinessDataInfo value) {
        this.businessDataInfo = value;
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
     * 获取businessOwnerFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwnerFirstName() {
        return businessOwnerFirstName;
    }

    /**
     * 设置businessOwnerFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwnerFirstName(String value) {
        this.businessOwnerFirstName = value;
    }

    /**
     * 获取businessOwnerLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwnerLastName() {
        return businessOwnerLastName;
    }

    /**
     * 设置businessOwnerLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwnerLastName(String value) {
        this.businessOwnerLastName = value;
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
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * 获取secondaryExternalRfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }

    /**
     * 设置secondaryExternalRfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryExternalRfpId(String value) {
        this.secondaryExternalRfpId = value;
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
     * 获取isPickUpComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPickUpComplete() {
        return isPickUpComplete;
    }

    /**
     * 设置isPickUpComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPickUpComplete(Boolean value) {
        this.isPickUpComplete = value;
    }

    /**
     * 获取businessCreateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessCreateDate() {
        return businessCreateDate;
    }

    /**
     * 设置businessCreateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessCreateDate(XMLGregorianCalendar value) {
        this.businessCreateDate = value;
    }

    /**
     * 获取businessId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置businessId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessId(String value) {
        this.businessId = value;
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
     * 获取isLockedBySC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockedBySC() {
        return isLockedBySC;
    }

    /**
     * 设置isLockedBySC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockedBySC(Boolean value) {
        this.isLockedBySC = value;
    }

}
