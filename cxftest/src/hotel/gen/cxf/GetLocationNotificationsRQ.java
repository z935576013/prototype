
package hotel.gen.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLocationNotificationsRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetLocationNotificationsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="ExternalLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;element name="NotificationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationNotificationsRQ", propOrder = {
    "externalLocationIdOrNotificationId"
})
public class GetLocationNotificationsRQ
    extends Request
{

    @XmlElementRefs({
        @XmlElementRef(name = "NotificationId", namespace = "http://localhost/MeetingBrokerServices", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExternalLocationId", namespace = "http://localhost/MeetingBrokerServices", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Integer>> externalLocationIdOrNotificationId;

    /**
     * Gets the value of the externalLocationIdOrNotificationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalLocationIdOrNotificationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalLocationIdOrNotificationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Integer>> getExternalLocationIdOrNotificationId() {
        if (externalLocationIdOrNotificationId == null) {
            externalLocationIdOrNotificationId = new ArrayList<JAXBElement<Integer>>();
        }
        return this.externalLocationIdOrNotificationId;
    }

}
