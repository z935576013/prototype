
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProposalSentEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProposalSentEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProposalURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalSentEventArgs", propOrder = {
    "proposalURL",
    "rfpId",
    "externalRfpId",
    "secondaryExternalRfpId"
})
public class ProposalSentEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "ProposalURL")
    protected String proposalURL;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "SecondaryExternalRfpId")
    protected String secondaryExternalRfpId;

    /**
     * 获取proposalURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalURL() {
        return proposalURL;
    }

    /**
     * 设置proposalURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalURL(String value) {
        this.proposalURL = value;
    }

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
     * 获取externalRfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRfpId() {
        return externalRfpId;
    }

    /**
     * 设置externalRfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRfpId(String value) {
        this.externalRfpId = value;
    }

    /**
     * 获取secondaryExternalRfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }

    /**
     * 设置secondaryExternalRfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryExternalRfpId(String value) {
        this.secondaryExternalRfpId = value;
    }

}
