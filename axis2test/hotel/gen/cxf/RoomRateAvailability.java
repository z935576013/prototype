
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomRateAvailability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRateAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Occupancy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateAvailability", propOrder = {
    "occupancy",
    "roomRate"
})
public class RoomRateAvailability {

    @XmlElement(name = "Occupancy")
    protected int occupancy;
    @XmlElement(name = "RoomRate", required = true)
    protected BigDecimal roomRate;

    /**
     * 获取occupancy属性的值。
     * 
     */
    public int getOccupancy() {
        return occupancy;
    }

    /**
     * 设置occupancy属性的值。
     * 
     */
    public void setOccupancy(int value) {
        this.occupancy = value;
    }

    /**
     * 获取roomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomRate() {
        return roomRate;
    }

    /**
     * 设置roomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomRate(BigDecimal value) {
        this.roomRate = value;
    }

}
