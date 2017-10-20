
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateProposalRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateProposalRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proposal" type="{http://localhost/MeetingBrokerServices}Proposal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProposalRQ", propOrder = {
    "proposal"
})
public class UpdateProposalRQ
    extends Request
{

    @XmlElement(name = "Proposal")
    protected Proposal proposal;

    /**
     * 获取proposal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Proposal }
     *     
     */
    public Proposal getProposal() {
        return proposal;
    }

    /**
     * 设置proposal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal }
     *     
     */
    public void setProposal(Proposal value) {
        this.proposal = value;
    }

}
