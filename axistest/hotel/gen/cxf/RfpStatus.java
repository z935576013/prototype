
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RfpStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RfpStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Drafted"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Awarded"/&gt;
 *     &lt;enumeration value="SelfAwarded"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="TurnedDown"/&gt;
 *     &lt;enumeration value="Redirected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RfpStatus")
@XmlEnum
public enum RfpStatus {

    @XmlEnumValue("Drafted")
    DRAFTED("Drafted"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Awarded")
    AWARDED("Awarded"),
    @XmlEnumValue("SelfAwarded")
    SELF_AWARDED("SelfAwarded"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("TurnedDown")
    TURNED_DOWN("TurnedDown"),
    @XmlEnumValue("Redirected")
    REDIRECTED("Redirected");
    private final String value;

    RfpStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RfpStatus fromValue(String v) {
        for (RfpStatus c: RfpStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
