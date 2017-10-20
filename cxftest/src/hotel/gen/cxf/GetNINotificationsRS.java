
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNINotificationsRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNINotificationsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NINotifications" type="{http://localhost/MeetingBrokerServices}ArrayOfNINotification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNINotificationsRS", propOrder = {
    "niNotifications"
})
public class GetNINotificationsRS
    extends Acknowledgement
{

    @XmlElement(name = "NINotifications")
    protected ArrayOfNINotification niNotifications;

    /**
     * 获取niNotifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNINotification }
     *     
     */
    public ArrayOfNINotification getNINotifications() {
        return niNotifications;
    }

    /**
     * 设置niNotifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNINotification }
     *     
     */
    public void setNINotifications(ArrayOfNINotification value) {
        this.niNotifications = value;
    }

}
