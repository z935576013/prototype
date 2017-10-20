
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLocationNotificationsRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetLocationNotificationsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutstandingNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Notifications" type="{http://localhost/MeetingBrokerServices}ArrayOfNotification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationNotificationsRS", propOrder = {
    "outstandingNotifications",
    "notifications"
})
public class GetLocationNotificationsRS
    extends Acknowledgement
{

    @XmlElement(name = "OutstandingNotifications")
    protected boolean outstandingNotifications;
    @XmlElement(name = "Notifications")
    protected ArrayOfNotification notifications;

    /**
     * 获取outstandingNotifications属性的值。
     * 
     */
    public boolean isOutstandingNotifications() {
        return outstandingNotifications;
    }

    /**
     * 设置outstandingNotifications属性的值。
     * 
     */
    public void setOutstandingNotifications(boolean value) {
        this.outstandingNotifications = value;
    }

    /**
     * 获取notifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotification }
     *     
     */
    public ArrayOfNotification getNotifications() {
        return notifications;
    }

    /**
     * 设置notifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotification }
     *     
     */
    public void setNotifications(ArrayOfNotification value) {
        this.notifications = value;
    }

}
