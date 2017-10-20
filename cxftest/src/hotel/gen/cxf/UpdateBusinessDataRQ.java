
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateBusinessDataRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateBusinessDataRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessData" type="{http://localhost/MeetingBrokerServices}BusinessData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBusinessDataRQ", propOrder = {
    "businessData"
})
public class UpdateBusinessDataRQ
    extends Request
{

    @XmlElement(name = "BusinessData")
    protected BusinessData businessData;

    /**
     * 获取businessData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusinessData }
     *     
     */
    public BusinessData getBusinessData() {
        return businessData;
    }

    /**
     * 设置businessData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessData }
     *     
     */
    public void setBusinessData(BusinessData value) {
        this.businessData = value;
    }

}
