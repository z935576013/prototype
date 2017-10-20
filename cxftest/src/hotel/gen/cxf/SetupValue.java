
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetupValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SetupValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SetupValueCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SetupValueCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetupValue", propOrder = {
    "entityTypeId",
    "name",
    "setupValueCategoryId",
    "entityId",
    "setupValueCategoryName"
})
public class SetupValue {

    @XmlElement(name = "EntityTypeId")
    protected int entityTypeId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SetupValueCategoryId")
    protected int setupValueCategoryId;
    @XmlElement(name = "EntityId")
    protected int entityId;
    @XmlElement(name = "SetupValueCategoryName")
    protected String setupValueCategoryName;

    /**
     * 获取entityTypeId属性的值。
     * 
     */
    public int getEntityTypeId() {
        return entityTypeId;
    }

    /**
     * 设置entityTypeId属性的值。
     * 
     */
    public void setEntityTypeId(int value) {
        this.entityTypeId = value;
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
     * 获取setupValueCategoryId属性的值。
     * 
     */
    public int getSetupValueCategoryId() {
        return setupValueCategoryId;
    }

    /**
     * 设置setupValueCategoryId属性的值。
     * 
     */
    public void setSetupValueCategoryId(int value) {
        this.setupValueCategoryId = value;
    }

    /**
     * 获取entityId属性的值。
     * 
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * 设置entityId属性的值。
     * 
     */
    public void setEntityId(int value) {
        this.entityId = value;
    }

    /**
     * 获取setupValueCategoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupValueCategoryName() {
        return setupValueCategoryName;
    }

    /**
     * 设置setupValueCategoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupValueCategoryName(String value) {
        this.setupValueCategoryName = value;
    }

}
