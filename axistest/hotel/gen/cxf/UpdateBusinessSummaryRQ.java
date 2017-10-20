
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateBusinessSummaryRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateBusinessSummaryRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessSummary" type="{http://localhost/MeetingBrokerServices}BusinessSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBusinessSummaryRQ", propOrder = {
    "businessSummary"
})
public class UpdateBusinessSummaryRQ
    extends Request
{

    @XmlElement(name = "BusinessSummary")
    protected BusinessSummary businessSummary;

    /**
     * 获取businessSummary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessSummary }
     *     
     */
    public BusinessSummary getBusinessSummary() {
        return businessSummary;
    }

    /**
     * 设置businessSummary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSummary }
     *     
     */
    public void setBusinessSummary(BusinessSummary value) {
        this.businessSummary = value;
    }

}
