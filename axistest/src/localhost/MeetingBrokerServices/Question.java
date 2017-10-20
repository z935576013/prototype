/**
 * Question.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Question  implements java.io.Serializable {
    private java.lang.String questionText;

    private boolean isAnswerRequired;

    private java.lang.String answer;

    private java.lang.String questionId;

    private java.lang.String category;

    private java.lang.String section;

    private localhost.MeetingBrokerServices.QuestionType questionType;

    private localhost.MeetingBrokerServices.ResponseChoice[] responseChoices;

    private localhost.MeetingBrokerServices.ResponseUnit[] responseUnits;

    public Question() {
    }

    public Question(
           java.lang.String questionText,
           boolean isAnswerRequired,
           java.lang.String answer,
           java.lang.String questionId,
           java.lang.String category,
           java.lang.String section,
           localhost.MeetingBrokerServices.QuestionType questionType,
           localhost.MeetingBrokerServices.ResponseChoice[] responseChoices,
           localhost.MeetingBrokerServices.ResponseUnit[] responseUnits) {
           this.questionText = questionText;
           this.isAnswerRequired = isAnswerRequired;
           this.answer = answer;
           this.questionId = questionId;
           this.category = category;
           this.section = section;
           this.questionType = questionType;
           this.responseChoices = responseChoices;
           this.responseUnits = responseUnits;
    }


    /**
     * Gets the questionText value for this Question.
     * 
     * @return questionText
     */
    public java.lang.String getQuestionText() {
        return questionText;
    }


    /**
     * Sets the questionText value for this Question.
     * 
     * @param questionText
     */
    public void setQuestionText(java.lang.String questionText) {
        this.questionText = questionText;
    }


    /**
     * Gets the isAnswerRequired value for this Question.
     * 
     * @return isAnswerRequired
     */
    public boolean isIsAnswerRequired() {
        return isAnswerRequired;
    }


    /**
     * Sets the isAnswerRequired value for this Question.
     * 
     * @param isAnswerRequired
     */
    public void setIsAnswerRequired(boolean isAnswerRequired) {
        this.isAnswerRequired = isAnswerRequired;
    }


    /**
     * Gets the answer value for this Question.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this Question.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the questionId value for this Question.
     * 
     * @return questionId
     */
    public java.lang.String getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this Question.
     * 
     * @param questionId
     */
    public void setQuestionId(java.lang.String questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the category value for this Question.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Question.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the section value for this Question.
     * 
     * @return section
     */
    public java.lang.String getSection() {
        return section;
    }


    /**
     * Sets the section value for this Question.
     * 
     * @param section
     */
    public void setSection(java.lang.String section) {
        this.section = section;
    }


    /**
     * Gets the questionType value for this Question.
     * 
     * @return questionType
     */
    public localhost.MeetingBrokerServices.QuestionType getQuestionType() {
        return questionType;
    }


    /**
     * Sets the questionType value for this Question.
     * 
     * @param questionType
     */
    public void setQuestionType(localhost.MeetingBrokerServices.QuestionType questionType) {
        this.questionType = questionType;
    }


    /**
     * Gets the responseChoices value for this Question.
     * 
     * @return responseChoices
     */
    public localhost.MeetingBrokerServices.ResponseChoice[] getResponseChoices() {
        return responseChoices;
    }


    /**
     * Sets the responseChoices value for this Question.
     * 
     * @param responseChoices
     */
    public void setResponseChoices(localhost.MeetingBrokerServices.ResponseChoice[] responseChoices) {
        this.responseChoices = responseChoices;
    }


    /**
     * Gets the responseUnits value for this Question.
     * 
     * @return responseUnits
     */
    public localhost.MeetingBrokerServices.ResponseUnit[] getResponseUnits() {
        return responseUnits;
    }


    /**
     * Sets the responseUnits value for this Question.
     * 
     * @param responseUnits
     */
    public void setResponseUnits(localhost.MeetingBrokerServices.ResponseUnit[] responseUnits) {
        this.responseUnits = responseUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Question)) return false;
        Question other = (Question) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionText==null && other.getQuestionText()==null) || 
             (this.questionText!=null &&
              this.questionText.equals(other.getQuestionText()))) &&
            this.isAnswerRequired == other.isIsAnswerRequired() &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.questionType==null && other.getQuestionType()==null) || 
             (this.questionType!=null &&
              this.questionType.equals(other.getQuestionType()))) &&
            ((this.responseChoices==null && other.getResponseChoices()==null) || 
             (this.responseChoices!=null &&
              java.util.Arrays.equals(this.responseChoices, other.getResponseChoices()))) &&
            ((this.responseUnits==null && other.getResponseUnits()==null) || 
             (this.responseUnits!=null &&
              java.util.Arrays.equals(this.responseUnits, other.getResponseUnits())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getQuestionText() != null) {
            _hashCode += getQuestionText().hashCode();
        }
        _hashCode += (isIsAnswerRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getQuestionType() != null) {
            _hashCode += getQuestionType().hashCode();
        }
        if (getResponseChoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseChoices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseChoices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Question.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuestionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAnswerRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsAnswerRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuestionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuestionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuestionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseChoices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
