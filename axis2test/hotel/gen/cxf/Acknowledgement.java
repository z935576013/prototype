
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Acknowledgement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Acknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://localhost/MeetingBrokerServices}AcknowledgementStatusCode"/&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Errors" type="{http://localhost/MeetingBrokerServices}ArrayOfError" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acknowledgement", propOrder = {
    "statusCode",
    "success",
    "errors"
})
@XmlSeeAlso({
    RfpBookingLinkRS.class,
    GetResponseInstructionsRS.class,
    ResponseSentRS.class,
    GetLinkedRfpsRS.class,
    GetNINotificationsRS.class,
    UpdateBusinessDataRS.class,
    TextMessageRS.class,
    GetBusinessDataInfoRS.class,
    GetNotificationDataRS.class,
    SendRfpsRS.class,
    CancelRfpRS.class,
    GetLocationNotificationsRS.class,
    GetBusinessDataRS.class,
    UpdateProposalRS.class,
    GetNotificationsRS.class,
    CreateMeetingRS.class,
    GetRfpRS.class,
    GetProposalRS.class
})
public class Acknowledgement
    extends Request
{

    @XmlElement(name = "StatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected AcknowledgementStatusCode statusCode;
    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "Errors")
    protected ArrayOfError errors;

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
     * 获取success属性的值。
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
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

}
