
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RfpActionTypes的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RfpActionTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RfpLinked"/&gt;
 *     &lt;enumeration value="RfpUnlinked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RfpActionTypes")
@XmlEnum
public enum RfpActionTypes {

    @XmlEnumValue("RfpLinked")
    RFP_LINKED("RfpLinked"),
    @XmlEnumValue("RfpUnlinked")
    RFP_UNLINKED("RfpUnlinked");
    private final String value;

    RfpActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RfpActionTypes fromValue(String v) {
        for (RfpActionTypes c: RfpActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
