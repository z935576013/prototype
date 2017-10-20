
package hotel.gen.cxf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventRequirementBusinessData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EventRequirementBusinessData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEventSetupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttendeeQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FoodBudget" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="BeverageBudget" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RentalBudget" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ResourceBudget" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OtherBudget" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventRequirementBusinessData", propOrder = {
    "dayNumber",
    "startTime",
    "endTime",
    "externalEventType",
    "externalEventSetupType",
    "attendeeQuantity",
    "foodBudget",
    "beverageBudget",
    "rentalBudget",
    "resourceBudget",
    "otherBudget"
})
public class EventRequirementBusinessData {

    @XmlElement(name = "DayNumber")
    protected int dayNumber;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "ExternalEventType")
    protected String externalEventType;
    @XmlElement(name = "ExternalEventSetupType")
    protected String externalEventSetupType;
    @XmlElement(name = "AttendeeQuantity")
    protected int attendeeQuantity;
    @XmlElement(name = "FoodBudget", required = true)
    protected BigDecimal foodBudget;
    @XmlElement(name = "BeverageBudget", required = true)
    protected BigDecimal beverageBudget;
    @XmlElement(name = "RentalBudget", required = true)
    protected BigDecimal rentalBudget;
    @XmlElement(name = "ResourceBudget", required = true)
    protected BigDecimal resourceBudget;
    @XmlElement(name = "OtherBudget", required = true)
    protected BigDecimal otherBudget;

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
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取externalEventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEventType() {
        return externalEventType;
    }

    /**
     * 设置externalEventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEventType(String value) {
        this.externalEventType = value;
    }

    /**
     * 获取externalEventSetupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEventSetupType() {
        return externalEventSetupType;
    }

    /**
     * 设置externalEventSetupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEventSetupType(String value) {
        this.externalEventSetupType = value;
    }

    /**
     * 获取attendeeQuantity属性的值。
     * 
     */
    public int getAttendeeQuantity() {
        return attendeeQuantity;
    }

    /**
     * 设置attendeeQuantity属性的值。
     * 
     */
    public void setAttendeeQuantity(int value) {
        this.attendeeQuantity = value;
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

}
