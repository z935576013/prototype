
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationTypes的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Property"/&gt;
 *     &lt;enumeration value="Sales_Office"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationTypes")
@XmlEnum
public enum LocationTypes {

    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("Sales_Office")
    SALES_OFFICE("Sales_Office");
    private final String value;

    LocationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationTypes fromValue(String v) {
        for (LocationTypes c: LocationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
