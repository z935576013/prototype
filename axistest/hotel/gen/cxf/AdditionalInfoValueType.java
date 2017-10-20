
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdditionalInfoValueType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalInfoValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalInfoValueType")
@XmlEnum
public enum AdditionalInfoValueType {

    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    AdditionalInfoValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalInfoValueType fromValue(String v) {
        for (AdditionalInfoValueType c: AdditionalInfoValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
