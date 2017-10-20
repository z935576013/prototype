
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CancelRfpRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancelRfpRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpCancellations" type="{http://localhost/MeetingBrokerServices}ArrayOfSubscriptionRfpCancellation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRfpRS", propOrder = {
    "rfpCancellations"
})
public class CancelRfpRS
    extends Acknowledgement
{

    @XmlElement(name = "RfpCancellations")
    protected ArrayOfSubscriptionRfpCancellation rfpCancellations;

    /**
     * 获取rfpCancellations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionRfpCancellation }
     *     
     */
    public ArrayOfSubscriptionRfpCancellation getRfpCancellations() {
        return rfpCancellations;
    }

    /**
     * 设置rfpCancellations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionRfpCancellation }
     *     
     */
    public void setRfpCancellations(ArrayOfSubscriptionRfpCancellation value) {
        this.rfpCancellations = value;
    }

}
