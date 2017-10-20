
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>EventBlock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EventBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AlternateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAlternateStartDateSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEventBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FoodCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BeverageCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RentalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ResourceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtherCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventRequirements" type="{http://localhost/MeetingBrokerServices}ArrayOfEventRequirement" minOccurs="0"/&gt;
 *         &lt;element name="EventAvailabilities" type="{http://localhost/MeetingBrokerServices}ArrayOfEventAvailability" minOccurs="0"/&gt;
 *         &lt;element name="EventRequirementBusinessDataCollection" type="{http://localhost/MeetingBrokerServices}ArrayOfEventRequirementBusinessData" minOccurs="0"/&gt;
 *         &lt;element name="FoodBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BeverageBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RentalBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ResourceBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtherBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SizeUnitOfMeasure" type="{http://localhost/MeetingBrokerServices}SizeUnitOfMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventBlock", propOrder = {
    "startDate",
    "alternateStartDate",
    "isAlternateStartDateSelected",
    "totalEventBudget",
    "foodCost",
    "beverageCost",
    "rentalCost",
    "resourceCost",
    "otherCost",
    "comments",
    "eventRequirements",
    "eventAvailabilities",
    "eventRequirementBusinessDataCollection",
    "foodBudget",
    "beverageBudget",
    "rentalBudget",
    "resourceBudget",
    "otherBudget",
    "sizeUnitOfMeasure"
})
public class EventBlock {

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "AlternateStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alternateStartDate;
    @XmlElement(name = "IsAlternateStartDateSelected")
    protected Boolean isAlternateStartDateSelected;
    @XmlElement(name = "TotalEventBudget")
    protected BigDecimal totalEventBudget;
    @XmlElement(name = "FoodCost")
    protected BigDecimal foodCost;
    @XmlElement(name = "BeverageCost")
    protected BigDecimal beverageCost;
    @XmlElement(name = "RentalCost")
    protected BigDecimal rentalCost;
    @XmlElement(name = "ResourceCost")
    protected BigDecimal resourceCost;
    @XmlElement(name = "OtherCost")
    protected BigDecimal otherCost;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "EventRequirements")
    protected ArrayOfEventRequirement eventRequirements;
    @XmlElement(name = "EventAvailabilities")
    protected ArrayOfEventAvailability eventAvailabilities;
    @XmlElement(name = "EventRequirementBusinessDataCollection")
    protected ArrayOfEventRequirementBusinessData eventRequirementBusinessDataCollection;
    @XmlElement(name = "FoodBudget")
    protected BigDecimal foodBudget;
    @XmlElement(name = "BeverageBudget")
    protected BigDecimal beverageBudget;
    @XmlElement(name = "RentalBudget")
    protected BigDecimal rentalBudget;
    @XmlElement(name = "ResourceBudget")
    protected BigDecimal resourceBudget;
    @XmlElement(name = "OtherBudget")
    protected BigDecimal otherBudget;
    @XmlElement(name = "SizeUnitOfMeasure")
    @XmlSchemaType(name = "string")
    protected SizeUnitOfMeasure sizeUnitOfMeasure;

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
     * 获取totalEventBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalEventBudget() {
        return totalEventBudget;
    }

    /**
     * 设置totalEventBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalEventBudget(BigDecimal value) {
        this.totalEventBudget = value;
    }

    /**
     * 获取foodCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFoodCost() {
        return foodCost;
    }

    /**
     * 设置foodCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFoodCost(BigDecimal value) {
        this.foodCost = value;
    }

    /**
     * 获取beverageCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeverageCost() {
        return beverageCost;
    }

    /**
     * 设置beverageCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeverageCost(BigDecimal value) {
        this.beverageCost = value;
    }

    /**
     * 获取rentalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentalCost() {
        return rentalCost;
    }

    /**
     * 设置rentalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentalCost(BigDecimal value) {
        this.rentalCost = value;
    }

    /**
     * 获取resourceCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResourceCost() {
        return resourceCost;
    }

    /**
     * 设置resourceCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResourceCost(BigDecimal value) {
        this.resourceCost = value;
    }

    /**
     * 获取otherCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCost() {
        return otherCost;
    }

    /**
     * 设置otherCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCost(BigDecimal value) {
        this.otherCost = value;
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
     * 获取eventRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventRequirement }
     *     
     */
    public ArrayOfEventRequirement getEventRequirements() {
        return eventRequirements;
    }

    /**
     * 设置eventRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventRequirement }
     *     
     */
    public void setEventRequirements(ArrayOfEventRequirement value) {
        this.eventRequirements = value;
    }

    /**
     * 获取eventAvailabilities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventAvailability }
     *     
     */
    public ArrayOfEventAvailability getEventAvailabilities() {
        return eventAvailabilities;
    }

    /**
     * 设置eventAvailabilities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventAvailability }
     *     
     */
    public void setEventAvailabilities(ArrayOfEventAvailability value) {
        this.eventAvailabilities = value;
    }

    /**
     * 获取eventRequirementBusinessDataCollection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventRequirementBusinessData }
     *     
     */
    public ArrayOfEventRequirementBusinessData getEventRequirementBusinessDataCollection() {
        return eventRequirementBusinessDataCollection;
    }

    /**
     * 设置eventRequirementBusinessDataCollection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventRequirementBusinessData }
     *     
     */
    public void setEventRequirementBusinessDataCollection(ArrayOfEventRequirementBusinessData value) {
        this.eventRequirementBusinessDataCollection = value;
    }

    /**
     * 获取foodBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFoodBudget() {
        return foodBudget;
    }

    /**
     * 设置foodBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFoodBudget(BigDecimal value) {
        this.foodBudget = value;
    }

    /**
     * 获取beverageBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeverageBudget() {
        return beverageBudget;
    }

    /**
     * 设置beverageBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeverageBudget(BigDecimal value) {
        this.beverageBudget = value;
    }

    /**
     * 获取rentalBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentalBudget() {
        return rentalBudget;
    }

    /**
     * 设置rentalBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentalBudget(BigDecimal value) {
        this.rentalBudget = value;
    }

    /**
     * 获取resourceBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResourceBudget() {
        return resourceBudget;
    }

    /**
     * 设置resourceBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResourceBudget(BigDecimal value) {
        this.resourceBudget = value;
    }

    /**
     * 获取otherBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherBudget() {
        return otherBudget;
    }

    /**
     * 设置otherBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherBudget(BigDecimal value) {
        this.otherBudget = value;
    }

    /**
     * 获取sizeUnitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitOfMeasure }
     *     
     */
    public SizeUnitOfMeasure getSizeUnitOfMeasure() {
        return sizeUnitOfMeasure;
    }

    /**
     * 设置sizeUnitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitOfMeasure }
     *     
     */
    public void setSizeUnitOfMeasure(SizeUnitOfMeasure value) {
        this.sizeUnitOfMeasure = value;
    }

}
