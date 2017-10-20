
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExternalRoomBlock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExternalRoomBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}RoomBlock"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComplexRoomAvailabilities" type="{http://localhost/MeetingBrokerServices}ArrayOfComplexRoomAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRoomBlock", propOrder = {
    "complexRoomAvailabilities"
})
public class ExternalRoomBlock
    extends RoomBlock
{

    @XmlElement(name = "ComplexRoomAvailabilities")
    protected ArrayOfComplexRoomAvailability complexRoomAvailabilities;

    /**
     * 获取complexRoomAvailabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComplexRoomAvailability }
     *     
     */
    public ArrayOfComplexRoomAvailability getComplexRoomAvailabilities() {
        return complexRoomAvailabilities;
    }

    /**
     * 设置complexRoomAvailabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComplexRoomAvailability }
     *     
     */
    public void setComplexRoomAvailabilities(ArrayOfComplexRoomAvailability value) {
        this.complexRoomAvailabilities = value;
    }

}
