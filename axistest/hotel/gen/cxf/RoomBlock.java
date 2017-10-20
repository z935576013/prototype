
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RoomBlock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAlternateStartDateSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BudgetedRoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomRequirements" type="{http://localhost/MeetingBrokerServices}ArrayOfRoomRequirement" minOccurs="0"/&gt;
 *         &lt;element name="RoomAvailabilities" type="{http://localhost/MeetingBrokerServices}ArrayOfRoomAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomBlock", propOrder = {
    "startDate",
    "alternateStartDate",
    "isAlternateStartDateSelected",
    "budgetedRoomRate",
    "comments",
    "roomRequirements",
    "roomAvailabilities"
})
@XmlSeeAlso({
    ExternalRoomBlock.class
})
public class RoomBlock {

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "AlternateStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alternateStartDate;
    @XmlElement(name = "IsAlternateStartDateSelected")
    protected Boolean isAlternateStartDateSelected;
    @XmlElement(name = "BudgetedRoomRate")
    protected BigDecimal budgetedRoomRate;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "RoomRequirements")
    protected ArrayOfRoomRequirement roomRequirements;
    @XmlElement(name = "RoomAvailabilities")
    protected ArrayOfRoomAvailability roomAvailabilities;

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取alternateStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlternateStartDate() {
        return alternateStartDate;
    }

    /**
     * 设置alternateStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlternateStartDate(XMLGregorianCalendar value) {
        this.alternateStartDate = value;
    }

    /**
     * 获取isAlternateStartDateSelected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternateStartDateSelected() {
        return isAlternateStartDateSelected;
    }

    /**
     * 设置isAlternateStartDateSelected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternateStartDateSelected(Boolean value) {
        this.isAlternateStartDateSelected = value;
    }

    /**
     * 获取budgetedRoomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBudgetedRoomRate() {
        return budgetedRoomRate;
    }

    /**
     * 设置budgetedRoomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBudgetedRoomRate(BigDecimal value) {
        this.budgetedRoomRate = value;
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
     * 获取roomRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRequirement }
     *     
     */
    public ArrayOfRoomRequirement getRoomRequirements() {
        return roomRequirements;
    }

    /**
     * 设置roomRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRequirement }
     *     
     */
    public void setRoomRequirements(ArrayOfRoomRequirement value) {
        this.roomRequirements = value;
    }

    /**
     * 获取roomAvailabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomAvailability }
     *     
     */
    public ArrayOfRoomAvailability getRoomAvailabilities() {
        return roomAvailabilities;
    }

    /**
     * 设置roomAvailabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomAvailability }
     *     
     */
    public void setRoomAvailabilities(ArrayOfRoomAvailability value) {
        this.roomAvailabilities = value;
    }

}
