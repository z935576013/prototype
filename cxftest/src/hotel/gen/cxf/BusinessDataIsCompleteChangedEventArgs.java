
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessDataIsCompleteChangedEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessDataIsCompleteChangedEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifiers" type="{http://localhost/MeetingBrokerServices}LocationIdentifiers" minOccurs="0"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RfpStatus" type="{http://localhost/MeetingBrokerServices}RfpStatus"/&gt;
 *         &lt;element name="BusinessStatus" type="{http://localhost/MeetingBrokerServices}BusinessStatus"/&gt;
 *         &lt;element name="BusinessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAgreedComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsActualComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsBlockedComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPickedUpComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDataIsCompleteChangedEventArgs", propOrder = {
    "externalRfpId",
    "secondaryExternalRfpId",
    "locationIdentifiers",
    "rfpId",
    "rfpStatus",
    "businessStatus",
    "businessId",
    "isAgreedComplete",
    "isActualComplete",
    "isBlockedComplete",
    "isPickedUpComplete"
})
public class BusinessDataIsCompleteChangedEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "LocationIdentifiers")
    protected LocationIdentifiers locationIdentifiers;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "RfpStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RfpStatus rfpStatus;
    @XmlElement(name = "BusinessStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BusinessStatus businessStatus;
    @XmlElement(name = "BusinessId")
    protected String businessId;
    @XmlElement(name = "IsAgreedComplete")
    protected boolean isAgreedComplete;
    @XmlElement(name = "IsActualComplete")
    protected boolean isActualComplete;
    @XmlElement(name = "IsBlockedComplete")
    protected boolean isBlockedComplete;
    @XmlElement(name = "IsPickedUpComplete")
    protected boolean isPickedUpComplete;

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
     * 获取locationIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifiers }
     *     
     */
    public LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }

    /**
     * 设置locationIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifiers }
     *     
     */
    public void setLocationIdentifiers(LocationIdentifiers value) {
        this.locationIdentifiers = value;
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
     * 获取rfpStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RfpStatus }
     *     
     */
    public RfpStatus getRfpStatus() {
        return rfpStatus;
    }

    /**
     * 设置rfpStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RfpStatus }
     *     
     */
    public void setRfpStatus(RfpStatus value) {
        this.rfpStatus = value;
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
     * 获取isAgreedComplete属性的值。
     * 
     */
    public boolean isIsAgreedComplete() {
        return isAgreedComplete;
    }

    /**
     * 设置isAgreedComplete属性的值。
     * 
     */
    public void setIsAgreedComplete(boolean value) {
        this.isAgreedComplete = value;
    }

    /**
     * 获取isActualComplete属性的值。
     * 
     */
    public boolean isIsActualComplete() {
        return isActualComplete;
    }

    /**
     * 设置isActualComplete属性的值。
     * 
     */
    public void setIsActualComplete(boolean value) {
        this.isActualComplete = value;
    }

    /**
     * 获取isBlockedComplete属性的值。
     * 
     */
    public boolean isIsBlockedComplete() {
        return isBlockedComplete;
    }

    /**
     * 设置isBlockedComplete属性的值。
     * 
     */
    public void setIsBlockedComplete(boolean value) {
        this.isBlockedComplete = value;
    }

    /**
     * 获取isPickedUpComplete属性的值。
     * 
     */
    public boolean isIsPickedUpComplete() {
        return isPickedUpComplete;
    }

    /**
     * 设置isPickedUpComplete属性的值。
     * 
     */
    public void setIsPickedUpComplete(boolean value) {
        this.isPickedUpComplete = value;
    }

}
