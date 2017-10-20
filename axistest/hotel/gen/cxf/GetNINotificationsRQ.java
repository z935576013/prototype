
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNINotificationsRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNINotificationsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NINotificationType" type="{http://localhost/MeetingBrokerServices}NINotificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNINotificationsRQ", propOrder = {
    "niNotificationType"
})
public class GetNINotificationsRQ
    extends Request
{

    @XmlElement(name = "NINotificationType")
    @XmlSchemaType(name = "string")
    protected NINotificationType niNotificationType;

    /**
     * 获取niNotificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NINotificationType }
     *     
     */
    public NINotificationType getNINotificationType() {
        return niNotificationType;
    }

    /**
     * 设置niNotificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NINotificationType }
     *     
     */
    public void setNINotificationType(NINotificationType value) {
        this.niNotificationType = value;
    }

}
