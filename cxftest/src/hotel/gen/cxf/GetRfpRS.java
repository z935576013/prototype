
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetRfpRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetRfpRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfp" type="{http://localhost/MeetingBrokerServices}ExternalRfp" minOccurs="0"/&gt;
 *         &lt;element name="Messages" type="{http://localhost/MeetingBrokerServices}ArrayOfMessage" minOccurs="0"/&gt;
 *         &lt;element name="StatusChangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRfpRS", propOrder = {
    "externalRfp",
    "messages",
    "statusChangeReason"
})
public class GetRfpRS
    extends Acknowledgement
{

    @XmlElement(name = "ExternalRfp")
    protected ExternalRfp externalRfp;
    @XmlElement(name = "Messages")
    protected ArrayOfMessage messages;
    @XmlElement(name = "StatusChangeReason")
    protected String statusChangeReason;

    /**
     * 获取externalRfp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalRfp }
     *     
     */
    public ExternalRfp getExternalRfp() {
        return externalRfp;
    }

    /**
     * 设置externalRfp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRfp }
     *     
     */
    public void setExternalRfp(ExternalRfp value) {
        this.externalRfp = value;
    }

    /**
     * 获取messages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * 设置messages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

    /**
     * 获取statusChangeReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusChangeReason() {
        return statusChangeReason;
    }

    /**
     * 设置statusChangeReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusChangeReason(String value) {
        this.statusChangeReason = value;
    }

}
