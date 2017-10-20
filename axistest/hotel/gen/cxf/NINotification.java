
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>NINotification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NINotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NINotificationId" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="NINotificationType" type="{http://localhost/MeetingBrokerServices}NINotificationType"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NINotificationArgs" type="{http://localhost/MeetingBrokerServices}NINotificationArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NINotification", propOrder = {
    "niNotificationId",
    "niNotificationType",
    "createDate",
    "niNotificationArgs"
})
public class NINotification {

    @XmlElement(name = "NINotificationId", required = true)
    protected String niNotificationId;
    @XmlElement(name = "NINotificationType", required = true)
    @XmlSchemaType(name = "string")
    protected NINotificationType niNotificationType;
    @XmlElement(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "NINotificationArgs")
    protected NINotificationArgs niNotificationArgs;

    /**
     * 获取niNotificationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNINotificationId() {
        return niNotificationId;
    }

    /**
     * 设置niNotificationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNINotificationId(String value) {
        this.niNotificationId = value;
    }

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

    /**
     * 获取createDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * 获取niNotificationArgs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NINotificationArgs }
     *     
     */
    public NINotificationArgs getNINotificationArgs() {
        return niNotificationArgs;
    }

    /**
     * 设置niNotificationArgs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NINotificationArgs }
     *     
     */
    public void setNINotificationArgs(NINotificationArgs value) {
        this.niNotificationArgs = value;
    }

}
