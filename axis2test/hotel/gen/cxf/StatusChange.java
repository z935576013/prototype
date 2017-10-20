
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StatusChange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StatusChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sites" type="{http://localhost/MeetingBrokerServices}ArrayOfSite" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Status" type="{http://localhost/MeetingBrokerServices}ProposalStatus"/&gt;
 *         &lt;element name="Message" type="{http://localhost/MeetingBrokerServices}Message" minOccurs="0"/&gt;
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
@XmlType(name = "StatusChange", propOrder = {
    "rfpId",
    "sites",
    "startDate",
    "status",
    "message",
    "statusChangeReason"
})
public class StatusChange
    extends Request
{

    @XmlElement(name = "RfpId")
    protected String rfpId;
    @XmlElement(name = "Sites")
    protected ArrayOfSite sites;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalStatus status;
    @XmlElement(name = "Message")
    protected Message message;
    @XmlElement(name = "StatusChangeReason")
    protected String statusChangeReason;

    /**
     * 获取rfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpId(String value) {
        this.rfpId = value;
    }

    /**
     * 获取sites属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSite }
     *     
     */
    public ArrayOfSite getSites() {
        return sites;
    }

    /**
     * 设置sites属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSite }
     *     
     */
    public void setSites(ArrayOfSite value) {
        this.sites = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProposalStatus }
     *     
     */
    public ProposalStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalStatus }
     *     
     */
    public void setStatus(ProposalStatus value) {
        this.status = value;
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
