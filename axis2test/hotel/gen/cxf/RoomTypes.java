
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomTypes的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RoomTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Run_Of_House"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Double_Double"/&gt;
 *     &lt;enumeration value="Suite"/&gt;
 *     &lt;enumeration value="Complimentary_Run_Of_House"/&gt;
 *     &lt;enumeration value="Complimentary_Standard"/&gt;
 *     &lt;enumeration value="Complimentary_Double_Double"/&gt;
 *     &lt;enumeration value="Complimentary_Suite"/&gt;
 *     &lt;enumeration value="External"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomTypes")
@XmlEnum
public enum RoomTypes {

    @XmlEnumValue("Run_Of_House")
    RUN_OF_HOUSE("Run_Of_House"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Double_Double")
    DOUBLE_DOUBLE("Double_Double"),
    @XmlEnumValue("Suite")
    SUITE("Suite"),
    @XmlEnumValue("Complimentary_Run_Of_House")
    COMPLIMENTARY_RUN_OF_HOUSE("Complimentary_Run_Of_House"),
    @XmlEnumValue("Complimentary_Standard")
    COMPLIMENTARY_STANDARD("Complimentary_Standard"),
    @XmlEnumValue("Complimentary_Double_Double")
    COMPLIMENTARY_DOUBLE_DOUBLE("Complimentary_Double_Double"),
    @XmlEnumValue("Complimentary_Suite")
    COMPLIMENTARY_SUITE("Complimentary_Suite"),
    @XmlEnumValue("External")
    EXTERNAL("External");
    private final String value;

    RoomTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomTypes fromValue(String v) {
        for (RoomTypes c: RoomTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
