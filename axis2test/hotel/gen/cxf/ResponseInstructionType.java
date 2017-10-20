
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseInstructionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseInstructionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Respond_To_Sender"/&gt;
 *     &lt;enumeration value="Respond_To_Primary_Contact"/&gt;
 *     &lt;enumeration value="Respond_To_Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseInstructionType")
@XmlEnum
public enum ResponseInstructionType {

    @XmlEnumValue("Respond_To_Sender")
    RESPOND_TO_SENDER("Respond_To_Sender"),
    @XmlEnumValue("Respond_To_Primary_Contact")
    RESPOND_TO_PRIMARY_CONTACT("Respond_To_Primary_Contact"),
    @XmlEnumValue("Respond_To_Both")
    RESPOND_TO_BOTH("Respond_To_Both");
    private final String value;

    ResponseInstructionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseInstructionType fromValue(String v) {
        for (ResponseInstructionType c: ResponseInstructionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
