
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AcknowledgementStatusCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PNE"/&gt;
 *     &lt;enumeration value="PWE"/&gt;
 *     &lt;enumeration value="NPE"/&gt;
 *     &lt;enumeration value="FSR"/&gt;
 *     &lt;enumeration value="NAC"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementStatusCode")
@XmlEnum
public enum AcknowledgementStatusCode {

    @XmlEnumValue("None")
    NONE("None"),
    PAR("PAR"),
    PNE("PNE"),
    PWE("PWE"),
    NPE("NPE"),
    FSR("FSR"),
    NAC("NAC"),
    TF("TF");
    private final String value;

    AcknowledgementStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcknowledgementStatusCode fromValue(String v) {
        for (AcknowledgementStatusCode c: AcknowledgementStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
