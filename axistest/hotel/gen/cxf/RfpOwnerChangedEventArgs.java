
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RfpOwnerChangedEventArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RfpOwnerChangedEventArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}NINotificationArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifiers" type="{http://localhost/MeetingBrokerServices}LocationIdentifiers" minOccurs="0"/&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RfpStatus" type="{http://localhost/MeetingBrokerServices}RfpStatus"/&gt;
 *         &lt;element name="RfpOwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpOwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfpOwnerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfpOwnerChangedEventArgs", propOrder = {
    "externalRfpId",
    "locationIdentifiers",
    "rfpId",
    "rfpStatus",
    "rfpOwnerFirstName",
    "rfpOwnerLastName",
    "rfpOwnerEmail"
})
public class RfpOwnerChangedEventArgs
    extends NINotificationArgs
{

    @XmlElement(name = "ExternalRfpId")
    protected String externalRfpId;
    @XmlElement(name = "LocationIdentifiers")
    protected LocationIdentifiers locationIdentifiers;
    @XmlElement(name = "RfpId")
    protected int rfpId;
    @XmlElement(name = "RfpStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RfpStatus rfpStatus;
    @XmlElement(name = "RfpOwnerFirstName")
    protected String rfpOwnerFirstName;
    @XmlElement(name = "RfpOwnerLastName")
    protected String rfpOwnerLastName;
    @XmlElement(name = "RfpOwnerEmail")
    protected String rfpOwnerEmail;

    /**
     * 获取externalRfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRfpId() {
        return externalRfpId;
    }

    /**
     * 设置externalRfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRfpId(String value) {
        this.externalRfpId = value;
    }

    /**
     * 获取locationIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentifiers }
     *     
     */
    public LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }

    /**
     * 设置locationIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentifiers }
     *     
     */
    public void setLocationIdentifiers(LocationIdentifiers value) {
        this.locationIdentifiers = value;
    }

    /**
     * 获取rfpId属性的值。
     * 
     */
    public int getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     */
    public void setRfpId(int value) {
        this.rfpId = value;
    }

    /**
     * 获取rfpStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RfpStatus }
     *     
     */
    public RfpStatus getRfpStatus() {
        return rfpStatus;
    }

    /**
     * 设置rfpStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RfpStatus }
     *     
     */
    public void setRfpStatus(RfpStatus value) {
        this.rfpStatus = value;
    }

    /**
     * 获取rfpOwnerFirstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpOwnerFirstName() {
        return rfpOwnerFirstName;
    }

    /**
     * 设置rfpOwnerFirstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpOwnerFirstName(String value) {
        this.rfpOwnerFirstName = value;
    }

    /**
     * 获取rfpOwnerLastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpOwnerLastName() {
        return rfpOwnerLastName;
    }

    /**
     * 设置rfpOwnerLastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpOwnerLastName(String value) {
        this.rfpOwnerLastName = value;
    }

    /**
     * 获取rfpOwnerEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpOwnerEmail() {
        return rfpOwnerEmail;
    }

    /**
     * 设置rfpOwnerEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpOwnerEmail(String value) {
        this.rfpOwnerEmail = value;
    }

}
