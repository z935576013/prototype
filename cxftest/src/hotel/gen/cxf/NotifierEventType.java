
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotifierEventType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NotifierEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreateBusinessInitiated"/&gt;
 *     &lt;enumeration value="UpdateBusinessInitiated"/&gt;
 *     &lt;enumeration value="ProposalSent"/&gt;
 *     &lt;enumeration value="RfpTurnedDown"/&gt;
 *     &lt;enumeration value="UpdateAgreedBusinessData"/&gt;
 *     &lt;enumeration value="UpdateActualBusinessData"/&gt;
 *     &lt;enumeration value="RfpViewed"/&gt;
 *     &lt;enumeration value="ProposalSelfAwarded"/&gt;
 *     &lt;enumeration value="RfpWithdrawn"/&gt;
 *     &lt;enumeration value="RfpCancelled"/&gt;
 *     &lt;enumeration value="RfpAwarded"/&gt;
 *     &lt;enumeration value="RfpRedirected"/&gt;
 *     &lt;enumeration value="RfpUpdated"/&gt;
 *     &lt;enumeration value="RfpLinked"/&gt;
 *     &lt;enumeration value="RfpUnlinked"/&gt;
 *     &lt;enumeration value="UpdateBlockedBusinessData"/&gt;
 *     &lt;enumeration value="UpdatePickedUpBusinessData"/&gt;
 *     &lt;enumeration value="TextMessageCreated"/&gt;
 *     &lt;enumeration value="RfpWithdrawnWithAutoTurnDown"/&gt;
 *     &lt;enumeration value="GeneralBusinessDataUpdated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotifierEventType")
@XmlEnum
public enum NotifierEventType {

    @XmlEnumValue("CreateBusinessInitiated")
    CREATE_BUSINESS_INITIATED("CreateBusinessInitiated"),
    @XmlEnumValue("UpdateBusinessInitiated")
    UPDATE_BUSINESS_INITIATED("UpdateBusinessInitiated"),
    @XmlEnumValue("ProposalSent")
    PROPOSAL_SENT("ProposalSent"),
    @XmlEnumValue("RfpTurnedDown")
    RFP_TURNED_DOWN("RfpTurnedDown"),
    @XmlEnumValue("UpdateAgreedBusinessData")
    UPDATE_AGREED_BUSINESS_DATA("UpdateAgreedBusinessData"),
    @XmlEnumValue("UpdateActualBusinessData")
    UPDATE_ACTUAL_BUSINESS_DATA("UpdateActualBusinessData"),
    @XmlEnumValue("RfpViewed")
    RFP_VIEWED("RfpViewed"),
    @XmlEnumValue("ProposalSelfAwarded")
    PROPOSAL_SELF_AWARDED("ProposalSelfAwarded"),
    @XmlEnumValue("RfpWithdrawn")
    RFP_WITHDRAWN("RfpWithdrawn"),
    @XmlEnumValue("RfpCancelled")
    RFP_CANCELLED("RfpCancelled"),
    @XmlEnumValue("RfpAwarded")
    RFP_AWARDED("RfpAwarded"),
    @XmlEnumValue("RfpRedirected")
    RFP_REDIRECTED("RfpRedirected"),
    @XmlEnumValue("RfpUpdated")
    RFP_UPDATED("RfpUpdated"),
    @XmlEnumValue("RfpLinked")
    RFP_LINKED("RfpLinked"),
    @XmlEnumValue("RfpUnlinked")
    RFP_UNLINKED("RfpUnlinked"),
    @XmlEnumValue("UpdateBlockedBusinessData")
    UPDATE_BLOCKED_BUSINESS_DATA("UpdateBlockedBusinessData"),
    @XmlEnumValue("UpdatePickedUpBusinessData")
    UPDATE_PICKED_UP_BUSINESS_DATA("UpdatePickedUpBusinessData"),
    @XmlEnumValue("TextMessageCreated")
    TEXT_MESSAGE_CREATED("TextMessageCreated"),
    @XmlEnumValue("RfpWithdrawnWithAutoTurnDown")
    RFP_WITHDRAWN_WITH_AUTO_TURN_DOWN("RfpWithdrawnWithAutoTurnDown"),
    @XmlEnumValue("GeneralBusinessDataUpdated")
    GENERAL_BUSINESS_DATA_UPDATED("GeneralBusinessDataUpdated");
    private final String value;

    NotifierEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotifierEventType fromValue(String v) {
        for (NotifierEventType c: NotifierEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
