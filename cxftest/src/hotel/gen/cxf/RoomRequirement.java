
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomRequirement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRequirement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomType" type="{http://localhost/MeetingBrokerServices}RoomTypes"/&gt;
 *         &lt;element name="DayNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SingleQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DoubleQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TripleQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuadQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "RoomRequirement", propOrder = {
    "roomType",
    "dayNumber",
    "singleQuantity",
    "doubleQuantity",
    "tripleQuantity",
    "quadQuantity",
    "comments"
})
public class RoomRequirement {

    @XmlElement(name = "RoomType", required = true)
    @XmlSchemaType(name = "string")
    protected RoomTypes roomType;
    @XmlElement(name = "DayNumber")
    protected int dayNumber;
    @XmlElement(name = "SingleQuantity")
    protected int singleQuantity;
    @XmlElement(name = "DoubleQuantity")
    protected int doubleQuantity;
    @XmlElement(name = "TripleQuantity")
    protected int tripleQuantity;
    @XmlElement(name = "QuadQuantity")
    protected int quadQuantity;
    @XmlElement(name = "Comments")
    protected String comments;

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
     * 获取singleQuantity属性的值。
     * 
     */
    public int getSingleQuantity() {
        return singleQuantity;
    }

    /**
     * 设置singleQuantity属性的值。
     * 
     */
    public void setSingleQuantity(int value) {
        this.singleQuantity = value;
    }

    /**
     * 获取doubleQuantity属性的值。
     * 
     */
    public int getDoubleQuantity() {
        return doubleQuantity;
    }

    /**
     * 设置doubleQuantity属性的值。
     * 
     */
    public void setDoubleQuantity(int value) {
        this.doubleQuantity = value;
    }

    /**
     * 获取tripleQuantity属性的值。
     * 
     */
    public int getTripleQuantity() {
        return tripleQuantity;
    }

    /**
     * 设置tripleQuantity属性的值。
     * 
     */
    public void setTripleQuantity(int value) {
        this.tripleQuantity = value;
    }

    /**
     * 获取quadQuantity属性的值。
     * 
     */
    public int getQuadQuantity() {
        return quadQuantity;
    }

    /**
     * 设置quadQuantity属性的值。
     * 
     */
    public void setQuadQuantity(int value) {
        this.quadQuantity = value;
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
