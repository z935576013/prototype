
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NINotificationStatusUpdateRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NINotificationStatusUpdateRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NINotificationId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="NotificationStatus" type="{http://localhost/MeetingBrokerServices}NotificationStatus"/&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NINotificationStatusUpdateRQ", propOrder = {
    "niNotificationId",
    "notificationStatus",
    "additionalInformation"
})
public class NINotificationStatusUpdateRQ
    extends Request
{

    @XmlElement(name = "NINotificationId", required = true)
    protected String niNotificationId;
    @XmlElement(name = "NotificationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationStatus notificationStatus;
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;

    /**
     * 获取niNotificationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNINotificationId() {
        return niNotificationId;
    }

    /**
     * 设置niNotificationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNINotificationId(String value) {
        this.niNotificationId = value;
    }

    /**
     * 获取notificationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *     
     */
    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * 设置notificationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *     
     */
    public void setNotificationStatus(NotificationStatus value) {
        this.notificationStatus = value;
    }

    /**
     * 获取additionalInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * 设置additionalInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

}
