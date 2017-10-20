
package hotel.gen.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfNINotification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNINotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NINotification" type="{http://localhost/MeetingBrokerServices}NINotification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNINotification", propOrder = {
    "niNotification"
})
public class ArrayOfNINotification {

    @XmlElement(name = "NINotification", nillable = true)
    protected List<NINotification> niNotification;

    /**
     * Gets the value of the niNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNINotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NINotification }
     * 
     * 
     */
    public List<NINotification> getNINotification() {
        if (niNotification == null) {
            niNotification = new ArrayList<NINotification>();
        }
        return this.niNotification;
    }

}
