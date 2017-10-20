
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetBusinessDataInfoRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBusinessDataInfoRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessDataType" type="{http://localhost/MeetingBrokerServices}BusinessDataType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeBusinessLockStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDataInfoRQ", propOrder = {
    "notificationId",
    "externalRfpId",
    "secondaryExternalRfpId",
    "siteId",
    "businessDataType",
    "includeBusinessLockStatus"
})
public class GetBusinessDataInfoRQ
    extends Request
{

    @XmlElement(name = "NotificationId")
    protected Integer notificationId;
    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "BusinessDataType")
    @XmlSchemaType(name = "string")
    protected BusinessDataType businessDataType;
    @XmlElement(name = "IncludeBusinessLockStatus")
    protected Boolean includeBusinessLockStatus;

    /**
     * 获取notificationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotificationId() {
        return notificationId;
    }

    /**
     * 设置notificationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotificationId(Integer value) {
        this.notificationId = value;
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
     * 获取includeBusinessLockStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBusinessLockStatus() {
        return includeBusinessLockStatus;
    }

    /**
     * 设置includeBusinessLockStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBusinessLockStatus(Boolean value) {
        this.includeBusinessLockStatus = value;
    }

}
