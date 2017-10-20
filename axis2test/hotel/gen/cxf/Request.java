
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Request complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UserGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestMetaDataGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "documentId",
    "transactionId",
    "documentDate",
    "receivedTime",
    "userGuid",
    "requestMetaDataGuid"
})
@XmlSeeAlso({
    RfpBookingLinkRQ.class,
    GetResponseInstructionsRQ.class,
    ResponseSentRQ.class,
    GetLinkedRfpsRQ.class,
    NINotificationStatusUpdateRQ.class,
    GetNINotificationsRQ.class,
    UpdateBusinessSummaryRQ.class,
    GetNotificationDataRQ.class,
    GetBusinessDataInfoRQ.class,
    UpdateLocationRQ.class,
    GetLocationNotificationsRQ.class,
    Acknowledgement.class,
    StatusChange.class,
    TextMessage.class,
    GetBusinessDataRQ.class,
    UpdateBusinessDataRQ.class,
    GetNotificationsRQ.class,
    CancelRfpRQ.class,
    CreateMeetingRQ.class,
    UpdateProposalRQ.class,
    GetProposalRQ.class,
    NoOpRQ.class,
    InsertSetupValuesRQ.class,
    WithdrawRfpRQ.class,
    GetRfpRQ.class,
    AwardRfpRQ.class,
    SendRfpsRQ.class
})
public class Request {

    @XmlElement(name = "DocumentId")
    protected String documentId;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "ReceivedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedTime;
    @XmlElement(name = "UserGuid")
    protected String userGuid;
    @XmlElement(name = "RequestMetaDataGuid")
    protected String requestMetaDataGuid;

    /**
     * 获取documentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * 设置documentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * 获取transactionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置transactionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * 获取documentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * 设置documentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * 获取receivedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedTime() {
        return receivedTime;
    }

    /**
     * 设置receivedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedTime(XMLGregorianCalendar value) {
        this.receivedTime = value;
    }

    /**
     * 获取userGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * 设置userGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuid(String value) {
        this.userGuid = value;
    }

    /**
     * 获取requestMetaDataGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMetaDataGuid() {
        return requestMetaDataGuid;
    }

    /**
     * 设置requestMetaDataGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMetaDataGuid(String value) {
        this.requestMetaDataGuid = value;
    }

}
