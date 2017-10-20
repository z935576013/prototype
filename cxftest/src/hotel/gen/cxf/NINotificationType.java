
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NINotificationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NINotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreateBusinessInitiated"/&gt;
 *     &lt;enumeration value="ProposalSent"/&gt;
 *     &lt;enumeration value="BusinessStatusChanged"/&gt;
 *     &lt;enumeration value="RfpCreated"/&gt;
 *     &lt;enumeration value="RfpViewed"/&gt;
 *     &lt;enumeration value="PickedUpBusinessDataUpdated"/&gt;
 *     &lt;enumeration value="AgreedBusinessDataUpdated"/&gt;
 *     &lt;enumeration value="BlockedBusinessDataUpdated"/&gt;
 *     &lt;enumeration value="ActualBusinessDataUpdated"/&gt;
 *     &lt;enumeration value="BusinessOwnerChanged"/&gt;
 *     &lt;enumeration value="BusinessDataIsCompleteChanged"/&gt;
 *     &lt;enumeration value="HeartBeat"/&gt;
 *     &lt;enumeration value="LocationUpdated"/&gt;
 *     &lt;enumeration value="RfpOwnerChanged"/&gt;
 *     &lt;enumeration value="BusinessDataInfoUpdateFailed"/&gt;
 *     &lt;enumeration value="BusinessDataInfoUpdated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NINotificationType")
@XmlEnum
public enum NINotificationType {

    @XmlEnumValue("CreateBusinessInitiated")
    CREATE_BUSINESS_INITIATED("CreateBusinessInitiated"),
    @XmlEnumValue("ProposalSent")
    PROPOSAL_SENT("ProposalSent"),
    @XmlEnumValue("BusinessStatusChanged")
    BUSINESS_STATUS_CHANGED("BusinessStatusChanged"),
    @XmlEnumValue("RfpCreated")
    RFP_CREATED("RfpCreated"),
    @XmlEnumValue("RfpViewed")
    RFP_VIEWED("RfpViewed"),
    @XmlEnumValue("PickedUpBusinessDataUpdated")
    PICKED_UP_BUSINESS_DATA_UPDATED("PickedUpBusinessDataUpdated"),
    @XmlEnumValue("AgreedBusinessDataUpdated")
    AGREED_BUSINESS_DATA_UPDATED("AgreedBusinessDataUpdated"),
    @XmlEnumValue("BlockedBusinessDataUpdated")
    BLOCKED_BUSINESS_DATA_UPDATED("BlockedBusinessDataUpdated"),
    @XmlEnumValue("ActualBusinessDataUpdated")
    ACTUAL_BUSINESS_DATA_UPDATED("ActualBusinessDataUpdated"),
    @XmlEnumValue("BusinessOwnerChanged")
    BUSINESS_OWNER_CHANGED("BusinessOwnerChanged"),
    @XmlEnumValue("BusinessDataIsCompleteChanged")
    BUSINESS_DATA_IS_COMPLETE_CHANGED("BusinessDataIsCompleteChanged"),
    @XmlEnumValue("HeartBeat")
    HEART_BEAT("HeartBeat"),
    @XmlEnumValue("LocationUpdated")
    LOCATION_UPDATED("LocationUpdated"),
    @XmlEnumValue("RfpOwnerChanged")
    RFP_OWNER_CHANGED("RfpOwnerChanged"),
    @XmlEnumValue("BusinessDataInfoUpdateFailed")
    BUSINESS_DATA_INFO_UPDATE_FAILED("BusinessDataInfoUpdateFailed"),
    @XmlEnumValue("BusinessDataInfoUpdated")
    BUSINESS_DATA_INFO_UPDATED("BusinessDataInfoUpdated");
    private final String value;

    NINotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NINotificationType fromValue(String v) {
        for (NINotificationType c: NINotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
