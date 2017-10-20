
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Site complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Site"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://localhost/MeetingBrokerServices}LocationIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="AllowsRedirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendToParent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SalesUserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesUserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesUserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentUserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentUserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentUserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Answers" type="{http://localhost/MeetingBrokerServices}ArrayOfAnswer" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndCateringCompanyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndCateringClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndCateringAgentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndCateringAgencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseInstructionType" type="{http://localhost/MeetingBrokerServices}ResponseInstructionType" minOccurs="0"/&gt;
 *         &lt;element name="AllowResponseInstructionOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", propOrder = {
    "siteId",
    "locationIdentifier",
    "allowsRedirect",
    "parentType",
    "sendToParent",
    "salesUserEmail",
    "salesUserFirstName",
    "salesUserLastName",
    "parentUserEmail",
    "parentUserFirstName",
    "parentUserLastName",
    "answers",
    "startDate",
    "comments",
    "secondaryExternalRfpId",
    "salesAndCateringCompanyId",
    "salesAndCateringClientId",
    "salesAndCateringAgentId",
    "salesAndCateringAgencyId",
    "responseInstructionType",
    "allowResponseInstructionOverride"
})
public class Site {

    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "LocationIdentifier")
    protected LocationIdentifier locationIdentifier;
    @XmlElement(name = "AllowsRedirect", defaultValue = "true")
    protected Boolean allowsRedirect;
    @XmlElement(name = "ParentType")
    protected String parentType;
    @XmlElement(name = "SendToParent")
    protected boolean sendToParent;
    @XmlElement(name = "SalesUserEmail")
    protected String salesUserEmail;
    @XmlElement(name = "SalesUserFirstName")
    protected String salesUserFirstName;
    @XmlElement(name = "SalesUserLastName")
    protected String salesUserLastName;
    @XmlElement(name = "ParentUserEmail")
    protected String parentUserEmail;
    @XmlElement(name = "ParentUserFirstName")
    protected String parentUserFirstName;
    @XmlElement(name = "ParentUserLastName")
    protected String parentUserLastName;
    @XmlElement(name = "Answers")
    protected ArrayOfAnswer answers;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "SalesAndCateringCompanyId")
    protected String salesAndCateringCompanyId;
    @XmlElement(name = "SalesAndCateringClientId")
    protected String salesAndCateringClientId;
    @XmlElement(name = "SalesAndCateringAgentId")
    protected String salesAndCateringAgentId;
    @XmlElement(name = "SalesAndCateringAgencyId")
    protected String salesAndCateringAgencyId;
    @XmlElement(name = "ResponseInstructionType")
    @XmlSchemaType(name = "string")
    protected ResponseInstructionType responseInstructionType;
    @XmlElement(name = "AllowResponseInstructionOverride")
    protected Boolean allowResponseInstructionOverride;

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

    /**
     * 获取allowsRedirect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsRedirect() {
        return allowsRedirect;
    }

    /**
     * 设置allowsRedirect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsRedirect(Boolean value) {
        this.allowsRedirect = value;
    }

    /**
     * 获取parentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentType() {
        return parentType;
    }

    /**
     * 设置parentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentType(String value) {
        this.parentType = value;
    }

    /**
     * 获取sendToParent属性的值。
     * 
     */
    public boolean isSendToParent() {
        return sendToParent;
    }

    /**
     * 设置sendToParent属性的值。
     * 
     */
    public void setSendToParent(boolean value) {
        this.sendToParent = value;
    }

    /**
     * 获取salesUserEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUserEmail() {
        return salesUserEmail;
    }

    /**
     * 设置salesUserEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUserEmail(String value) {
        this.salesUserEmail = value;
    }

    /**
     * 获取salesUserFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUserFirstName() {
        return salesUserFirstName;
    }

    /**
     * 设置salesUserFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUserFirstName(String value) {
        this.salesUserFirstName = value;
    }

    /**
     * 获取salesUserLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUserLastName() {
        return salesUserLastName;
    }

    /**
     * 设置salesUserLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUserLastName(String value) {
        this.salesUserLastName = value;
    }

    /**
     * 获取parentUserEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUserEmail() {
        return parentUserEmail;
    }

    /**
     * 设置parentUserEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUserEmail(String value) {
        this.parentUserEmail = value;
    }

    /**
     * 获取parentUserFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUserFirstName() {
        return parentUserFirstName;
    }

    /**
     * 设置parentUserFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUserFirstName(String value) {
        this.parentUserFirstName = value;
    }

    /**
     * 获取parentUserLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUserLastName() {
        return parentUserLastName;
    }

    /**
     * 设置parentUserLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUserLastName(String value) {
        this.parentUserLastName = value;
    }

    /**
     * 获取answers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswer }
     *     
     */
    public ArrayOfAnswer getAnswers() {
        return answers;
    }

    /**
     * 设置answers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswer }
     *     
     */
    public void setAnswers(ArrayOfAnswer value) {
        this.answers = value;
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
     * 获取salesAndCateringCompanyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAndCateringCompanyId() {
        return salesAndCateringCompanyId;
    }

    /**
     * 设置salesAndCateringCompanyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAndCateringCompanyId(String value) {
        this.salesAndCateringCompanyId = value;
    }

    /**
     * 获取salesAndCateringClientId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAndCateringClientId() {
        return salesAndCateringClientId;
    }

    /**
     * 设置salesAndCateringClientId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAndCateringClientId(String value) {
        this.salesAndCateringClientId = value;
    }

    /**
     * 获取salesAndCateringAgentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAndCateringAgentId() {
        return salesAndCateringAgentId;
    }

    /**
     * 设置salesAndCateringAgentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAndCateringAgentId(String value) {
        this.salesAndCateringAgentId = value;
    }

    /**
     * 获取salesAndCateringAgencyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAndCateringAgencyId() {
        return salesAndCateringAgencyId;
    }

    /**
     * 设置salesAndCateringAgencyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAndCateringAgencyId(String value) {
        this.salesAndCateringAgencyId = value;
    }

    /**
     * 获取responseInstructionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseInstructionType }
     *     
     */
    public ResponseInstructionType getResponseInstructionType() {
        return responseInstructionType;
    }

    /**
     * 设置responseInstructionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseInstructionType }
     *     
     */
    public void setResponseInstructionType(ResponseInstructionType value) {
        this.responseInstructionType = value;
    }

    /**
     * 获取allowResponseInstructionOverride属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowResponseInstructionOverride() {
        return allowResponseInstructionOverride;
    }

    /**
     * 设置allowResponseInstructionOverride属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowResponseInstructionOverride(Boolean value) {
        this.allowResponseInstructionOverride = value;
    }

}
