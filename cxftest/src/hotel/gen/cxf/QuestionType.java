
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuestionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="SingleSelect"/&gt;
 *     &lt;enumeration value="MultiSelect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuestionType")
@XmlEnum
public enum QuestionType {

    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("SingleSelect")
    SINGLE_SELECT("SingleSelect"),
    @XmlEnumValue("MultiSelect")
    MULTI_SELECT("MultiSelect");
    private final String value;

    QuestionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionType fromValue(String v) {
        for (QuestionType c: QuestionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
