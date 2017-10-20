
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SendRfpsRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SendRfpsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailedRfps" type="{http://localhost/MeetingBrokerServices}ArrayOfFailedRfp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendRfpsRS", propOrder = {
    "failedRfps"
})
public class SendRfpsRS
    extends Acknowledgement
{

    @XmlElement(name = "FailedRfps")
    protected ArrayOfFailedRfp failedRfps;

    /**
     * 获取failedRfps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedRfp }
     *     
     */
    public ArrayOfFailedRfp getFailedRfps() {
        return failedRfps;
    }

    /**
     * 设置failedRfps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedRfp }
     *     
     */
    public void setFailedRfps(ArrayOfFailedRfp value) {
        this.failedRfps = value;
    }

}
