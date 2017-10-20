
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Proposal"/&gt;
 *     &lt;enumeration value="TurnDown"/&gt;
 *     &lt;enumeration value="Acknowledgement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseType")
@XmlEnum
public enum ResponseType {

    @XmlEnumValue("Proposal")
    PROPOSAL("Proposal"),
    @XmlEnumValue("TurnDown")
    TURN_DOWN("TurnDown"),
    @XmlEnumValue("Acknowledgement")
    ACKNOWLEDGEMENT("Acknowledgement");
    private final String value;

    ResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseType fromValue(String v) {
        for (ResponseType c: ResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
