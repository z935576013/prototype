
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Notification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Notification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotifierEventType" type="{http://localhost/MeetingBrokerServices}NotifierEventType"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProposalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NotificationData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "externalRfpId",
    "secondaryExternalRfpId",
    "notificationId",
    "notifierEventType",
    "rfpId",
    "proposalId",
    "siteId",
    "channelId",
    "notificationData"
})
public class Notification {

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;
    @XmlElement(name = "NotificationId")
    protected int notificationId;
    @XmlElement(name = "NotifierEventType", required = true)
    @XmlSchemaType(name = "string")
    protected NotifierEventType notifierEventType;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "ProposalId")
    protected int proposalId;
    @XmlElement(name = "SiteId")
    protected int siteId;
    @XmlElement(name = "ChannelId")
    protected Integer channelId;
    @XmlElement(name = "NotificationData")
    protected Notification.NotificationData notificationData;

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
     * 获取notificationId属性的值。
     * 
     */
    public int getNotificationId() {
        return notificationId;
    }

    /**
     * 设置notificationId属性的值。
     * 
     */
    public void setNotificationId(int value) {
        this.notificationId = value;
    }

    /**
     * 获取notifierEventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotifierEventType }
     *     
     */
    public NotifierEventType getNotifierEventType() {
        return notifierEventType;
    }

    /**
     * 设置notifierEventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotifierEventType }
     *     
     */
    public void setNotifierEventType(NotifierEventType value) {
        this.notifierEventType = value;
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
     * 获取channelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置channelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelId(Integer value) {
        this.channelId = value;
    }

    /**
     * 获取notificationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Notification.NotificationData }
     *     
     */
    public Notification.NotificationData getNotificationData() {
        return notificationData;
    }

    /**
     * 设置notificationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Notification.NotificationData }
     *     
     */
    public void setNotificationData(Notification.NotificationData value) {
        this.notificationData = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class NotificationData {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
