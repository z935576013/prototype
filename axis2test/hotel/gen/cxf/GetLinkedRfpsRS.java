
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLinkedRfpsRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetLinkedRfpsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedRfpList" type="{http://localhost/MeetingBrokerServices}ArrayOfLinkedRfp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLinkedRfpsRS", propOrder = {
    "linkedRfpList"
})
public class GetLinkedRfpsRS
    extends Acknowledgement
{

    @XmlElement(name = "LinkedRfpList")
    protected ArrayOfLinkedRfp linkedRfpList;

    /**
     * 获取linkedRfpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedRfp }
     *     
     */
    public ArrayOfLinkedRfp getLinkedRfpList() {
        return linkedRfpList;
    }

    /**
     * 设置linkedRfpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedRfp }
     *     
     */
    public void setLinkedRfpList(ArrayOfLinkedRfp value) {
        this.linkedRfpList = value;
    }

}
