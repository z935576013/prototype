
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LocationIdentifierType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LocationIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MeetingBroker"/&gt;
 *     &lt;enumeration value="External"/&gt;
 *     &lt;enumeration value="LocationCode"/&gt;
 *     &lt;enumeration value="HotelUGI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationIdentifierType")
@XmlEnum
public enum LocationIdentifierType {

    @XmlEnumValue("MeetingBroker")
    MEETING_BROKER("MeetingBroker"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("LocationCode")
    LOCATION_CODE("LocationCode"),
    @XmlEnumValue("HotelUGI")
    HOTEL_UGI("HotelUGI");
    private final String value;

    LocationIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationIdentifierType fromValue(String v) {
        for (LocationIdentifierType c: LocationIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
