
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetResponseInstructionsRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetResponseInstructionsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RfpGuid" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="AllowResponseInstructionOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResponseInstructionType" type="{http://localhost/MeetingBrokerServices}ResponseInstructionType"/&gt;
 *         &lt;element name="Sender" type="{http://localhost/MeetingBrokerServices}Sender" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponseInstructionsRS", propOrder = {
    "rfpId",
    "rfpGuid",
    "allowResponseInstructionOverride",
    "responseInstructionType",
    "sender"
})
public class GetResponseInstructionsRS
    extends Acknowledgement
{

    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "RfpGuid", required = true)
    protected String rfpGuid;
    @XmlElement(name = "AllowResponseInstructionOverride")
    protected boolean allowResponseInstructionOverride;
    @XmlElement(name = "ResponseInstructionType", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseInstructionType responseInstructionType;
    @XmlElement(name = "Sender")
    protected Sender sender;

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

    /**
     * 获取rfpGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpGuid() {
        return rfpGuid;
    }

    /**
     * 设置rfpGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpGuid(String value) {
        this.rfpGuid = value;
    }

    /**
     * 获取allowResponseInstructionOverride属性的值。
     * 
     */
    public boolean isAllowResponseInstructionOverride() {
        return allowResponseInstructionOverride;
    }

    /**
     * 设置allowResponseInstructionOverride属性的值。
     * 
     */
    public void setAllowResponseInstructionOverride(boolean value) {
        this.allowResponseInstructionOverride = value;
    }

    /**
     * 获取responseInstructionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseInstructionType }
     *     
     */
    public ResponseInstructionType getResponseInstructionType() {
        return responseInstructionType;
    }

    /**
     * 设置responseInstructionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseInstructionType }
     *     
     */
    public void setResponseInstructionType(ResponseInstructionType value) {
        this.responseInstructionType = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

}
