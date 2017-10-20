
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessDataType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Agreed"/&gt;
 *     &lt;enumeration value="PickedUp"/&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Blocked"/&gt;
 *     &lt;enumeration value="General"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessDataType")
@XmlEnum
public enum BusinessDataType {

    @XmlEnumValue("Agreed")
    AGREED("Agreed"),
    @XmlEnumValue("PickedUp")
    PICKED_UP("PickedUp"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("General")
    GENERAL("General");
    private final String value;

    BusinessDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessDataType fromValue(String v) {
        for (BusinessDataType c: BusinessDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
