
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GetBusinessDataRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBusinessDataRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDataInfo" type="{http://localhost/MeetingBrokerServices}BusinessDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="Messages" type="{http://localhost/MeetingBrokerServices}ArrayOfMessage" minOccurs="0"/&gt;
 *         &lt;element name="BusinessStatus" type="{http://localhost/MeetingBrokerServices}BusinessStatus" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLostBusinessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessOwnerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsCommissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RfpGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessStatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDataRS", propOrder = {
    "externalRfpId",
    "siteId",
    "businessDataInfo",
    "messages",
    "businessStatus",
    "externalLostBusinessReason",
    "businessOwnerFirstName",
    "businessOwnerLastName",
    "businessOwnerEmail",
    "startDate",
    "externalCurrency",
    "commission",
    "isCommissionable",
    "rfpId",
    "rfpGuid",
    "businessStatusChangeDate"
})
public class GetBusinessDataRS
    extends Acknowledgement
{

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "BusinessDataInfo")
    protected BusinessDataInfo businessDataInfo;
    @XmlElement(name = "Messages")
    protected ArrayOfMessage messages;
    @XmlElement(name = "BusinessStatus")
    @XmlSchemaType(name = "string")
    protected BusinessStatus businessStatus;
    @XmlElement(name = "ExternalLostBusinessReason")
    protected String externalLostBusinessReason;
    @XmlElement(name = "BusinessOwnerFirstName")
    protected String businessOwnerFirstName;
    @XmlElement(name = "BusinessOwnerLastName")
    protected String businessOwnerLastName;
    @XmlElement(name = "BusinessOwnerEmail")
    protected String businessOwnerEmail;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "ExternalCurrency")
    protected String externalCurrency;
    @XmlElement(name = "Commission")
    protected BigDecimal commission;
    @XmlElement(name = "IsCommissionable")
    protected Boolean isCommissionable;
    @XmlElement(name = "RfpId")
    protected Integer rfpId;
    @XmlElement(name = "RfpGuid")
    protected String rfpGuid;
    @XmlElement(name = "BusinessStatusChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar businessStatusChangeDate;

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
     * 获取messages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * 设置messages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
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
     * 获取rfpGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpGuid() {
        return rfpGuid;
    }

    /**
     * 设置rfpGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpGuid(String value) {
        this.rfpGuid = value;
    }

    /**
     * 获取businessStatusChangeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusinessStatusChangeDate() {
        return businessStatusChangeDate;
    }

    /**
     * 设置businessStatusChangeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusinessStatusChangeDate(XMLGregorianCalendar value) {
        this.businessStatusChangeDate = value;
    }

}
