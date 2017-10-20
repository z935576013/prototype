
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SendRfpsRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SendRfpsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfps" type="{http://localhost/MeetingBrokerServices}ArrayOfExternalRfp" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://localhost/MeetingBrokerServices}Message" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendRfpsRQ", propOrder = {
    "externalRfps",
    "message"
})
public class SendRfpsRQ
    extends Request
{

    @XmlElement(name = "ExternalRfps")
    protected ArrayOfExternalRfp externalRfps;
    @XmlElement(name = "Message")
    protected Message message;

    /**
     * 获取externalRfps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExternalRfp }
     *     
     */
    public ArrayOfExternalRfp getExternalRfps() {
        return externalRfps;
    }

    /**
     * 设置externalRfps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExternalRfp }
     *     
     */
    public void setExternalRfps(ArrayOfExternalRfp value) {
        this.externalRfps = value;
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

}
