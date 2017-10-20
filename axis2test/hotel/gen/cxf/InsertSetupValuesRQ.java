
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InsertSetupValuesRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InsertSetupValuesRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetupValues" type="{http://localhost/MeetingBrokerServices}ArrayOfSetupValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertSetupValuesRQ", propOrder = {
    "setupValues"
})
@XmlSeeAlso({
    InsertSubscriptionSetupValuesRQ.class,
    InsertLocationSetupValuesRQ.class,
    InsertChannelSetupValuesRQ.class
})
public class InsertSetupValuesRQ
    extends Request
{

    @XmlElement(name = "SetupValues")
    protected ArrayOfSetupValue setupValues;

    /**
     * 获取setupValues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetupValue }
     *     
     */
    public ArrayOfSetupValue getSetupValues() {
        return setupValues;
    }

    /**
     * 设置setupValues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetupValue }
     *     
     */
    public void setSetupValues(ArrayOfSetupValue value) {
        this.setupValues = value;
    }

}
