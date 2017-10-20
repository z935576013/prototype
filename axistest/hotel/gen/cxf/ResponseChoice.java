
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseChoice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExternalResponseChoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseChoice", propOrder = {
    "response",
    "isSelected",
    "externalResponseChoiceId"
})
public class ResponseChoice {

    @XmlElement(name = "Response")
    protected String response;
    @XmlElement(name = "IsSelected")
    protected boolean isSelected;
    @XmlElement(name = "ExternalResponseChoiceId")
    protected String externalResponseChoiceId;

    /**
     * 获取response属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * 设置response属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * 获取isSelected属性的值。
     * 
     */
    public boolean isIsSelected() {
        return isSelected;
    }

    /**
     * 设置isSelected属性的值。
     * 
     */
    public void setIsSelected(boolean value) {
        this.isSelected = value;
    }

    /**
     * 获取externalResponseChoiceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResponseChoiceId() {
        return externalResponseChoiceId;
    }

    /**
     * 设置externalResponseChoiceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResponseChoiceId(String value) {
        this.externalResponseChoiceId = value;
    }

}
