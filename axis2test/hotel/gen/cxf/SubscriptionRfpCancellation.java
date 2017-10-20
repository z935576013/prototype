
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubscriptionRfpCancellation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SubscriptionRfpCancellation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StatusCode" type="{http://localhost/MeetingBrokerServices}AcknowledgementStatusCode"/&gt;
 *         &lt;element name="Errors" type="{http://localhost/MeetingBrokerServices}ArrayOfError" minOccurs="0"/&gt;
 *         &lt;element name="CancelledRfps" type="{http://localhost/MeetingBrokerServices}ArrayOfCancelledRfp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRfpCancellation", propOrder = {
    "subscriptionId",
    "statusCode",
    "errors",
    "cancelledRfps"
})
public class SubscriptionRfpCancellation {

    @XmlElement(name = "SubscriptionId")
    protected int subscriptionId;
    @XmlElement(name = "StatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected AcknowledgementStatusCode statusCode;
    @XmlElement(name = "Errors")
    protected ArrayOfError errors;
    @XmlElement(name = "CancelledRfps")
    protected ArrayOfCancelledRfp cancelledRfps;

    /**
     * 获取subscriptionId属性的值。
     * 
     */
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * 设置subscriptionId属性的值。
     * 
     */
    public void setSubscriptionId(int value) {
        this.subscriptionId = value;
    }

    /**
     * 获取statusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementStatusCode }
     *     
     */
    public AcknowledgementStatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * 设置statusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementStatusCode }
     *     
     */
    public void setStatusCode(AcknowledgementStatusCode value) {
        this.statusCode = value;
    }

    /**
     * 获取errors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfError }
     *     
     */
    public ArrayOfError getErrors() {
        return errors;
    }

    /**
     * 设置errors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfError }
     *     
     */
    public void setErrors(ArrayOfError value) {
        this.errors = value;
    }

    /**
     * 获取cancelledRfps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelledRfp }
     *     
     */
    public ArrayOfCancelledRfp getCancelledRfps() {
        return cancelledRfps;
    }

    /**
     * 设置cancelledRfps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelledRfp }
     *     
     */
    public void setCancelledRfps(ArrayOfCancelledRfp value) {
        this.cancelledRfps = value;
    }

}
