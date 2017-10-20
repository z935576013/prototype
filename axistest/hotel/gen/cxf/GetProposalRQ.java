
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetProposalRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetProposalRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProposalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NotificationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProposalRQ", propOrder = {
    "proposalId",
    "notificationId"
})
public class GetProposalRQ
    extends Request
{

    @XmlElement(name = "ProposalId")
    protected int proposalId;
    @XmlElement(name = "NotificationId")
    protected int notificationId;

    /**
     * 获取proposalId属性的值。
     * 
     */
    public int getProposalId() {
        return proposalId;
    }

    /**
     * 设置proposalId属性的值。
     * 
     */
    public void setProposalId(int value) {
        this.proposalId = value;
    }

    /**
     * 获取notificationId属性的值。
     * 
     */
    public int getNotificationId() {
        return notificationId;
    }

    /**
     * 设置notificationId属性的值。
     * 
     */
    public void setNotificationId(int value) {
        this.notificationId = value;
    }

}
