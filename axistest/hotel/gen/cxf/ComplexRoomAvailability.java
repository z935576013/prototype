
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ComplexRoomAvailability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ComplexRoomAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExternalRoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomType" type="{http://localhost/MeetingBrokerServices}RoomTypes"/&gt;
 *         &lt;element name="ExternalRoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomRateAvailabilities" type="{http://localhost/MeetingBrokerServices}ArrayOfRoomRateAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexRoomAvailability", propOrder = {
    "dayNumber",
    "externalRoomCategory",
    "roomType",
    "externalRoomType",
    "quantityAvailable",
    "comments",
    "roomRateAvailabilities"
})
public class ComplexRoomAvailability {

    @XmlElement(name = "DayNumber")
    protected int dayNumber;
    @XmlElement(name = "ExternalRoomCategory")
    protected String externalRoomCategory;
    @XmlElement(name = "RoomType", required = true)
    @XmlSchemaType(name = "string")
    protected RoomTypes roomType;
    @XmlElement(name = "ExternalRoomType")
    protected String externalRoomType;
    @XmlElement(name = "QuantityAvailable")
    protected int quantityAvailable;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "RoomRateAvailabilities")
    protected ArrayOfRoomRateAvailability roomRateAvailabilities;

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
     * 获取externalRoomCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRoomCategory() {
        return externalRoomCategory;
    }

    /**
     * 设置externalRoomCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRoomCategory(String value) {
        this.externalRoomCategory = value;
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
     * 获取externalRoomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRoomType() {
        return externalRoomType;
    }

    /**
     * 设置externalRoomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRoomType(String value) {
        this.externalRoomType = value;
    }

    /**
     * 获取quantityAvailable属性的值。
     * 
     */
    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * 设置quantityAvailable属性的值。
     * 
     */
    public void setQuantityAvailable(int value) {
        this.quantityAvailable = value;
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

    /**
     * 获取roomRateAvailabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRateAvailability }
     *     
     */
    public ArrayOfRoomRateAvailability getRoomRateAvailabilities() {
        return roomRateAvailabilities;
    }

    /**
     * 设置roomRateAvailabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRateAvailability }
     *     
     */
    public void setRoomRateAvailabilities(ArrayOfRoomRateAvailability value) {
        this.roomRateAvailabilities = value;
    }

}
