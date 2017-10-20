
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateBusinessInitiatedEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateBusinessInitiatedEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBusinessInitiatedEventArgs", propOrder = {
    "rfpId"
})
public class CreateBusinessInitiatedEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "RfpId")
    protected int rfpId;

    /**
     * 获取rfpId属性的值。
     * 
     */
    public int getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     */
    public void setRfpId(int value) {
        this.rfpId = value;
    }

}
