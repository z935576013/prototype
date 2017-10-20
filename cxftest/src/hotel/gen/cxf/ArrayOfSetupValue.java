
package hotel.gen.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSetupValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSetupValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetupValue" type="{http://localhost/MeetingBrokerServices}SetupValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSetupValue", propOrder = {
    "setupValue"
})
public class ArrayOfSetupValue {

    @XmlElement(name = "SetupValue", nillable = true)
    protected List<SetupValue> setupValue;

    /**
     * Gets the value of the setupValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetupValue }
     * 
     * 
     */
    public List<SetupValue> getSetupValue() {
        if (setupValue == null) {
            setupValue = new ArrayList<SetupValue>();
        }
        return this.setupValue;
    }

}
