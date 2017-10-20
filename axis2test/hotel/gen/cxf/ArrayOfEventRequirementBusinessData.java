
package hotel.gen.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfEventRequirementBusinessData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventRequirementBusinessData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventRequirementBusinessData" type="{http://localhost/MeetingBrokerServices}EventRequirementBusinessData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventRequirementBusinessData", propOrder = {
    "eventRequirementBusinessData"
})
public class ArrayOfEventRequirementBusinessData {

    @XmlElement(name = "EventRequirementBusinessData", nillable = true)
    protected List<EventRequirementBusinessData> eventRequirementBusinessData;

    /**
     * Gets the value of the eventRequirementBusinessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventRequirementBusinessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventRequirementBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventRequirementBusinessData }
     * 
     * 
     */
    public List<EventRequirementBusinessData> getEventRequirementBusinessData() {
        if (eventRequirementBusinessData == null) {
            eventRequirementBusinessData = new ArrayList<EventRequirementBusinessData>();
        }
        return this.eventRequirementBusinessData;
    }

}
