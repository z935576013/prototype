
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WithdrawRfpRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WithdrawRfpRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Message" type="{http://localhost/MeetingBrokerServices}Message" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLostBusinessReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LostToHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoTurnDownBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithdrawnReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawRfpRQ", propOrder = {
    "rfpId",
    "siteId",
    "message",
    "secondaryExternalRfpId",
    "externalLostBusinessReason",
    "lostToCity",
    "lostToHotel",
    "autoTurnDownBusiness",
    "withdrawnReason"
})
public class WithdrawRfpRQ
    extends Request
{

    @XmlElement(name = "RfpId")
    protected String rfpId;
    @XmlElement(name = "SiteId")
    protected int siteId;
    @XmlElement(name = "Message")
    protected Message message;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "ExternalLostBusinessReason")
    protected String externalLostBusinessReason;
    @XmlElement(name = "LostToCity")
    protected String lostToCity;
    @XmlElement(name = "LostToHotel")
    protected String lostToHotel;
    @XmlElement(name = "AutoTurnDownBusiness")
    protected Boolean autoTurnDownBusiness;
    @XmlElement(name = "WithdrawnReason")
    protected String withdrawnReason;

    /**
     * 获取rfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpId(String value) {
        this.rfpId = value;
    }

    /**
     * 获取siteId属性的值。
     * 
     */
    public int getSiteId() {
        return siteId;
    }

    /**
     * 设置siteId属性的值。
     * 
     */
    public void setSiteId(int value) {
        this.siteId = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
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
     * 获取autoTurnDownBusiness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoTurnDownBusiness() {
        return autoTurnDownBusiness;
    }

    /**
     * 设置autoTurnDownBusiness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoTurnDownBusiness(Boolean value) {
        this.autoTurnDownBusiness = value;
    }

    /**
     * 获取withdrawnReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawnReason() {
        return withdrawnReason;
    }

    /**
     * 设置withdrawnReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawnReason(String value) {
        this.withdrawnReason = value;
    }

}
