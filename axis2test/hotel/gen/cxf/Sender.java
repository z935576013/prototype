
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Sender complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Sender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://localhost/MeetingBrokerServices}LocationIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="UserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sender", propOrder = {
    "siteId",
    "locationIdentifier",
    "userFirstName",
    "userLastName",
    "userEmailAddress",
    "externalUserName"
})
public class Sender {

    @XmlElement(name = "SiteId")
    protected Integer siteId;
    @XmlElement(name = "LocationIdentifier")
    protected LocationIdentifier locationIdentifier;
    @XmlElement(name = "UserFirstName")
    protected String userFirstName;
    @XmlElement(name = "UserLastName")
    protected String userLastName;
    @XmlElement(name = "UserEmailAddress")
    protected String userEmailAddress;
    @XmlElement(name = "ExternalUserName")
    protected String externalUserName;

    /**
     * 获取siteId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 设置siteId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteId(Integer value) {
        this.siteId = value;
    }

    /**
     * 获取locationIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifier }
     *     
     */
    public LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * 设置locationIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifier }
     *     
     */
    public void setLocationIdentifier(LocationIdentifier value) {
        this.locationIdentifier = value;
    }

    /**
     * 获取userFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * 设置userFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * 获取userLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * 设置userLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

    /**
     * 获取userEmailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    /**
     * 设置userEmailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmailAddress(String value) {
        this.userEmailAddress = value;
    }

    /**
     * 获取externalUserName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserName() {
        return externalUserName;
    }

    /**
     * 设置externalUserName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserName(String value) {
        this.externalUserName = value;
    }

}
