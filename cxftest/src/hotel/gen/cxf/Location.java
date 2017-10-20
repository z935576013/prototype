
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Location complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://localhost/MeetingBrokerServices}LocationTypes"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagementCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GMTOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeakSleepingRooms" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalAttendees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LargestFunctionRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriveToAirport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewMarketProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewMarketProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Holidays" type="{http://localhost/MeetingBrokerServices}ArrayOfHoliday" minOccurs="0"/&gt;
 *         &lt;element name="LocationAttributes" type="{http://localhost/MeetingBrokerServices}ArrayOfLocationAttribute" minOccurs="0"/&gt;
 *         &lt;element name="HoursOfOperationCollection" type="{http://localhost/MeetingBrokerServices}ArrayOfHoursOfOperation" minOccurs="0"/&gt;
 *         &lt;element name="LocationUsers" type="{http://localhost/MeetingBrokerServices}ArrayOfLocationUser" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "subscriptionId",
    "isActive",
    "name",
    "locationType",
    "referenceNumber",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "city",
    "stateProvince",
    "postalCode",
    "countryCode",
    "phoneNumber",
    "phoneExtension",
    "faxNumber",
    "comments",
    "managementCompany",
    "brand",
    "gmtOffset",
    "peakSleepingRooms",
    "totalAttendees",
    "largestFunctionRoom",
    "currencyCode",
    "driveToAirport",
    "taxRate",
    "newMarketProduct",
    "newMarketProductVersion",
    "holidays",
    "locationAttributes",
    "hoursOfOperationCollection",
    "locationUsers"
})
public class Location {

    @XmlElement(name = "SubscriptionId")
    protected int subscriptionId;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LocationType", required = true)
    @XmlSchemaType(name = "string")
    protected LocationTypes locationType;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateProvince")
    protected String stateProvince;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PhoneExtension")
    protected String phoneExtension;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ManagementCompany")
    protected String managementCompany;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "GMTOffset")
    protected String gmtOffset;
    @XmlElement(name = "PeakSleepingRooms")
    protected int peakSleepingRooms;
    @XmlElement(name = "TotalAttendees")
    protected Integer totalAttendees;
    @XmlElement(name = "LargestFunctionRoom")
    protected Integer largestFunctionRoom;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DriveToAirport")
    protected Integer driveToAirport;
    @XmlElement(name = "TaxRate")
    protected String taxRate;
    @XmlElement(name = "NewMarketProduct")
    protected String newMarketProduct;
    @XmlElement(name = "NewMarketProductVersion")
    protected String newMarketProductVersion;
    @XmlElement(name = "Holidays")
    protected ArrayOfHoliday holidays;
    @XmlElement(name = "LocationAttributes")
    protected ArrayOfLocationAttribute locationAttributes;
    @XmlElement(name = "HoursOfOperationCollection")
    protected ArrayOfHoursOfOperation hoursOfOperationCollection;
    @XmlElement(name = "LocationUsers")
    protected ArrayOfLocationUser locationUsers;

    /**
     * 获取subscriptionId属性的值。
     * 
     */
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * 设置subscriptionId属性的值。
     * 
     */
    public void setSubscriptionId(int value) {
        this.subscriptionId = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取locationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationTypes }
     *     
     */
    public LocationTypes getLocationType() {
        return locationType;
    }

    /**
     * 设置locationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypes }
     *     
     */
    public void setLocationType(LocationTypes value) {
        this.locationType = value;
    }

    /**
     * 获取referenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 设置referenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * 获取addressLine1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * 设置addressLine1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * 获取addressLine2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * 设置addressLine2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * 获取addressLine3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * 设置addressLine3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取stateProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * 设置stateProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvince(String value) {
        this.stateProvince = value;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * 获取phoneExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * 设置phoneExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * 获取faxNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * 设置faxNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
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
     * 获取managementCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementCompany() {
        return managementCompany;
    }

    /**
     * 设置managementCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementCompany(String value) {
        this.managementCompany = value;
    }

    /**
     * 获取brand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置brand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * 获取gmtOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTOffset() {
        return gmtOffset;
    }

    /**
     * 设置gmtOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTOffset(String value) {
        this.gmtOffset = value;
    }

    /**
     * 获取peakSleepingRooms属性的值。
     * 
     */
    public int getPeakSleepingRooms() {
        return peakSleepingRooms;
    }

    /**
     * 设置peakSleepingRooms属性的值。
     * 
     */
    public void setPeakSleepingRooms(int value) {
        this.peakSleepingRooms = value;
    }

    /**
     * 获取totalAttendees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAttendees() {
        return totalAttendees;
    }

    /**
     * 设置totalAttendees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAttendees(Integer value) {
        this.totalAttendees = value;
    }

    /**
     * 获取largestFunctionRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLargestFunctionRoom() {
        return largestFunctionRoom;
    }

    /**
     * 设置largestFunctionRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLargestFunctionRoom(Integer value) {
        this.largestFunctionRoom = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取driveToAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDriveToAirport() {
        return driveToAirport;
    }

    /**
     * 设置driveToAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDriveToAirport(Integer value) {
        this.driveToAirport = value;
    }

    /**
     * 获取taxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * 设置taxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * 获取newMarketProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMarketProduct() {
        return newMarketProduct;
    }

    /**
     * 设置newMarketProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMarketProduct(String value) {
        this.newMarketProduct = value;
    }

    /**
     * 获取newMarketProductVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMarketProductVersion() {
        return newMarketProductVersion;
    }

    /**
     * 设置newMarketProductVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMarketProductVersion(String value) {
        this.newMarketProductVersion = value;
    }

    /**
     * 获取holidays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public ArrayOfHoliday getHolidays() {
        return holidays;
    }

    /**
     * 设置holidays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHoliday }
     *     
     */
    public void setHolidays(ArrayOfHoliday value) {
        this.holidays = value;
    }

    /**
     * 获取locationAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationAttribute }
     *     
     */
    public ArrayOfLocationAttribute getLocationAttributes() {
        return locationAttributes;
    }

    /**
     * 设置locationAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationAttribute }
     *     
     */
    public void setLocationAttributes(ArrayOfLocationAttribute value) {
        this.locationAttributes = value;
    }

    /**
     * 获取hoursOfOperationCollection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHoursOfOperation }
     *     
     */
    public ArrayOfHoursOfOperation getHoursOfOperationCollection() {
        return hoursOfOperationCollection;
    }

    /**
     * 设置hoursOfOperationCollection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHoursOfOperation }
     *     
     */
    public void setHoursOfOperationCollection(ArrayOfHoursOfOperation value) {
        this.hoursOfOperationCollection = value;
    }

    /**
     * 获取locationUsers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationUser }
     *     
     */
    public ArrayOfLocationUser getLocationUsers() {
        return locationUsers;
    }

    /**
     * 设置locationUsers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationUser }
     *     
     */
    public void setLocationUsers(ArrayOfLocationUser value) {
        this.locationUsers = value;
    }

}
