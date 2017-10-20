
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomAvailability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomType" type="{http://localhost/MeetingBrokerServices}RoomTypes"/&gt;
 *         &lt;element name="SinglesAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SingleRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DoublesAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DoubleRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TriplesAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TripleRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="QuadsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuadRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAvailability", propOrder = {
    "dayNumber",
    "roomType",
    "singlesAvailable",
    "singleRate",
    "doublesAvailable",
    "doubleRate",
    "triplesAvailable",
    "tripleRate",
    "quadsAvailable",
    "quadRate",
    "comments"
})
public class RoomAvailability {

    @XmlElement(name = "DayNumber")
    protected int dayNumber;
    @XmlElement(name = "RoomType", required = true)
    @XmlSchemaType(name = "string")
    protected RoomTypes roomType;
    @XmlElement(name = "SinglesAvailable")
    protected int singlesAvailable;
    @XmlElement(name = "SingleRate", required = true)
    protected BigDecimal singleRate;
    @XmlElement(name = "DoublesAvailable")
    protected int doublesAvailable;
    @XmlElement(name = "DoubleRate", required = true)
    protected BigDecimal doubleRate;
    @XmlElement(name = "TriplesAvailable")
    protected int triplesAvailable;
    @XmlElement(name = "TripleRate", required = true)
    protected BigDecimal tripleRate;
    @XmlElement(name = "QuadsAvailable")
    protected int quadsAvailable;
    @XmlElement(name = "QuadRate", required = true)
    protected BigDecimal quadRate;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * 获取dayNumber属性的值。
     * 
     */
    public int getDayNumber() {
        return dayNumber;
    }

    /**
     * 设置dayNumber属性的值。
     * 
     */
    public void setDayNumber(int value) {
        this.dayNumber = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypes }
     *     
     */
    public RoomTypes getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypes }
     *     
     */
    public void setRoomType(RoomTypes value) {
        this.roomType = value;
    }

    /**
     * 获取singlesAvailable属性的值。
     * 
     */
    public int getSinglesAvailable() {
        return singlesAvailable;
    }

    /**
     * 设置singlesAvailable属性的值。
     * 
     */
    public void setSinglesAvailable(int value) {
        this.singlesAvailable = value;
    }

    /**
     * 获取singleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSingleRate() {
        return singleRate;
    }

    /**
     * 设置singleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSingleRate(BigDecimal value) {
        this.singleRate = value;
    }

    /**
     * 获取doublesAvailable属性的值。
     * 
     */
    public int getDoublesAvailable() {
        return doublesAvailable;
    }

    /**
     * 设置doublesAvailable属性的值。
     * 
     */
    public void setDoublesAvailable(int value) {
        this.doublesAvailable = value;
    }

    /**
     * 获取doubleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoubleRate() {
        return doubleRate;
    }

    /**
     * 设置doubleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoubleRate(BigDecimal value) {
        this.doubleRate = value;
    }

    /**
     * 获取triplesAvailable属性的值。
     * 
     */
    public int getTriplesAvailable() {
        return triplesAvailable;
    }

    /**
     * 设置triplesAvailable属性的值。
     * 
     */
    public void setTriplesAvailable(int value) {
        this.triplesAvailable = value;
    }

    /**
     * 获取tripleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTripleRate() {
        return tripleRate;
    }

    /**
     * 设置tripleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTripleRate(BigDecimal value) {
        this.tripleRate = value;
    }

    /**
     * 获取quadsAvailable属性的值。
     * 
     */
    public int getQuadsAvailable() {
        return quadsAvailable;
    }

    /**
     * 设置quadsAvailable属性的值。
     * 
     */
    public void setQuadsAvailable(int value) {
        this.quadsAvailable = value;
    }

    /**
     * 获取quadRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuadRate() {
        return quadRate;
    }

    /**
     * 设置quadRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuadRate(BigDecimal value) {
        this.quadRate = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
