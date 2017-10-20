
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Prospect"/&gt;
 *     &lt;enumeration value="Tentative"/&gt;
 *     &lt;enumeration value="Definite"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Inquiry"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="TurnedDown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessStatus")
@XmlEnum
public enum BusinessStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Prospect")
    PROSPECT("Prospect"),
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),
    @XmlEnumValue("Definite")
    DEFINITE("Definite"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Inquiry")
    INQUIRY("Inquiry"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("TurnedDown")
    TURNED_DOWN("TurnedDown");
    private final String value;

    BusinessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessStatus fromValue(String v) {
        for (BusinessStatus c: BusinessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
