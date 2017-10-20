
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLinkedRfpsRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetLinkedRfpsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryRfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLinkedRfpsRQ", propOrder = {
    "primaryRfpId"
})
public class GetLinkedRfpsRQ
    extends Request
{

    @XmlElement(name = "PrimaryRfpId")
    protected int primaryRfpId;

    /**
     * 获取primaryRfpId属性的值。
     * 
     */
    public int getPrimaryRfpId() {
        return primaryRfpId;
    }

    /**
     * 设置primaryRfpId属性的值。
     * 
     */
    public void setPrimaryRfpId(int value) {
        this.primaryRfpId = value;
    }

}
