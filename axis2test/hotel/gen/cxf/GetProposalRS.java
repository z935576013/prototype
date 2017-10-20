
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetProposalRS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetProposalRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Acknowledgement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proposal" type="{http://localhost/MeetingBrokerServices}Proposal" minOccurs="0"/&gt;
 *         &lt;element name="Messages" type="{http://localhost/MeetingBrokerServices}ArrayOfMessage" minOccurs="0"/&gt;
 *         &lt;element name="Questions" type="{http://localhost/MeetingBrokerServices}ArrayOfQuestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProposalRS", propOrder = {
    "proposal",
    "messages",
    "questions"
})
public class GetProposalRS
    extends Acknowledgement
{

    @XmlElement(name = "Proposal")
    protected Proposal proposal;
    @XmlElement(name = "Messages")
    protected ArrayOfMessage messages;
    @XmlElement(name = "Questions")
    protected ArrayOfQuestion questions;

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

    /**
     * 获取messages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * 设置messages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

    /**
     * 获取questions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuestion }
     *     
     */
    public ArrayOfQuestion getQuestions() {
        return questions;
    }

    /**
     * 设置questions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuestion }
     *     
     */
    public void setQuestions(ArrayOfQuestion value) {
        this.questions = value;
    }

}
