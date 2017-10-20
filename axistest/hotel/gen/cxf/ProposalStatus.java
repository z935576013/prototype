
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProposalStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Draft"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Awarded"/&gt;
 *     &lt;enumeration value="Self_Awarded"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Turned_Down"/&gt;
 *     &lt;enumeration value="Redirected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProposalStatus")
@XmlEnum
public enum ProposalStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Awarded")
    AWARDED("Awarded"),
    @XmlEnumValue("Self_Awarded")
    SELF_AWARDED("Self_Awarded"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Turned_Down")
    TURNED_DOWN("Turned_Down"),
    @XmlEnumValue("Redirected")
    REDIRECTED("Redirected");
    private final String value;

    ProposalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProposalStatus fromValue(String v) {
        for (ProposalStatus c: ProposalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
