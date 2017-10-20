
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNotificationsRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNotificationsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventType" type="{http://localhost/MeetingBrokerServices}NotifierEventType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationsRQ", propOrder = {
    "eventType"
})
public class GetNotificationsRQ
    extends Request
{

    @XmlElement(name = "EventType")
    @XmlSchemaType(name = "string")
    protected NotifierEventType eventType;

    /**
     * 获取eventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotifierEventType }
     *     
     */
    public NotifierEventType getEventType() {
        return eventType;
    }

    /**
     * 设置eventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotifierEventType }
     *     
     */
    public void setEventType(NotifierEventType value) {
        this.eventType = value;
    }

}
