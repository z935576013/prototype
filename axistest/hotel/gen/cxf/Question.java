
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Question complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Question"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAnswerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionType" type="{http://localhost/MeetingBrokerServices}QuestionType"/&gt;
 *         &lt;element name="ResponseChoices" type="{http://localhost/MeetingBrokerServices}ArrayOfResponseChoice" minOccurs="0"/&gt;
 *         &lt;element name="ResponseUnits" type="{http://localhost/MeetingBrokerServices}ArrayOfResponseUnit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Question", propOrder = {
    "questionText",
    "isAnswerRequired",
    "answer",
    "questionId",
    "category",
    "section",
    "questionType",
    "responseChoices",
    "responseUnits"
})
public class Question {

    @XmlElement(name = "QuestionText")
    protected String questionText;
    @XmlElement(name = "IsAnswerRequired")
    protected boolean isAnswerRequired;
    @XmlElement(name = "Answer")
    protected String answer;
    @XmlElement(name = "QuestionId")
    protected String questionId;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Section")
    protected String section;
    @XmlElement(name = "QuestionType", required = true)
    @XmlSchemaType(name = "string")
    protected QuestionType questionType;
    @XmlElement(name = "ResponseChoices")
    protected ArrayOfResponseChoice responseChoices;
    @XmlElement(name = "ResponseUnits")
    protected ArrayOfResponseUnit responseUnits;

    /**
     * 获取questionText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * 设置questionText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * 获取isAnswerRequired属性的值。
     * 
     */
    public boolean isIsAnswerRequired() {
        return isAnswerRequired;
    }

    /**
     * 设置isAnswerRequired属性的值。
     * 
     */
    public void setIsAnswerRequired(boolean value) {
        this.isAnswerRequired = value;
    }

    /**
     * 获取answer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置answer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * 获取questionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * 设置questionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionId(String value) {
        this.questionId = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * 获取section属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * 设置section属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * 获取questionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuestionType }
     *     
     */
    public QuestionType getQuestionType() {
        return questionType;
    }

    /**
     * 设置questionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionType }
     *     
     */
    public void setQuestionType(QuestionType value) {
        this.questionType = value;
    }

    /**
     * 获取responseChoices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseChoice }
     *     
     */
    public ArrayOfResponseChoice getResponseChoices() {
        return responseChoices;
    }

    /**
     * 设置responseChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseChoice }
     *     
     */
    public void setResponseChoices(ArrayOfResponseChoice value) {
        this.responseChoices = value;
    }

    /**
     * 获取responseUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseUnit }
     *     
     */
    public ArrayOfResponseUnit getResponseUnits() {
        return responseUnits;
    }

    /**
     * 设置responseUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseUnit }
     *     
     */
    public void setResponseUnits(ArrayOfResponseUnit value) {
        this.responseUnits = value;
    }

}
