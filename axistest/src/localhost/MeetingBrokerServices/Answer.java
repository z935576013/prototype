/**
 * Answer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Answer  implements java.io.Serializable {
    private java.lang.String answerText;

    private java.lang.String questionId;

    private java.lang.String selectedResponseChoices;

    private java.lang.String selectedResponseUnits;

    public Answer() {
    }

    public Answer(
           java.lang.String answerText,
           java.lang.String questionId,
           java.lang.String selectedResponseChoices,
           java.lang.String selectedResponseUnits) {
           this.answerText = answerText;
           this.questionId = questionId;
           this.selectedResponseChoices = selectedResponseChoices;
           this.selectedResponseUnits = selectedResponseUnits;
    }


    /**
     * Gets the answerText value for this Answer.
     * 
     * @return answerText
     */
    public java.lang.String getAnswerText() {
        return answerText;
    }


    /**
     * Sets the answerText value for this Answer.
     * 
     * @param answerText
     */
    public void setAnswerText(java.lang.String answerText) {
        this.answerText = answerText;
    }


    /**
     * Gets the questionId value for this Answer.
     * 
     * @return questionId
     */
    public java.lang.String getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this Answer.
     * 
     * @param questionId
     */
    public void setQuestionId(java.lang.String questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the selectedResponseChoices value for this Answer.
     * 
     * @return selectedResponseChoices
     */
    public java.lang.String getSelectedResponseChoices() {
        return selectedResponseChoices;
    }


    /**
     * Sets the selectedResponseChoices value for this Answer.
     * 
     * @param selectedResponseChoices
     */
    public void setSelectedResponseChoices(java.lang.String selectedResponseChoices) {
        this.selectedResponseChoices = selectedResponseChoices;
    }


    /**
     * Gets the selectedResponseUnits value for this Answer.
     * 
     * @return selectedResponseUnits
     */
    public java.lang.String getSelectedResponseUnits() {
        return selectedResponseUnits;
    }


    /**
     * Sets the selectedResponseUnits value for this Answer.
     * 
     * @param selectedResponseUnits
     */
    public void setSelectedResponseUnits(java.lang.String selectedResponseUnits) {
        this.selectedResponseUnits = selectedResponseUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Answer)) return false;
        Answer other = (Answer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answerText==null && other.getAnswerText()==null) || 
             (this.answerText!=null &&
              this.answerText.equals(other.getAnswerText()))) &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId()))) &&
            ((this.selectedResponseChoices==null && other.getSelectedResponseChoices()==null) || 
             (this.selectedResponseChoices!=null &&
              this.selectedResponseChoices.equals(other.getSelectedResponseChoices()))) &&
            ((this.selectedResponseUnits==null && other.getSelectedResponseUnits()==null) || 
             (this.selectedResponseUnits!=null &&
              this.selectedResponseUnits.equals(other.getSelectedResponseUnits())));
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
        if (getAnswerText() != null) {
            _hashCode += getAnswerText().hashCode();
        }
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        if (getSelectedResponseChoices() != null) {
            _hashCode += getSelectedResponseChoices().hashCode();
        }
        if (getSelectedResponseUnits() != null) {
            _hashCode += getSelectedResponseUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Answer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AnswerText"));
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
        elemField.setFieldName("selectedResponseChoices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SelectedResponseChoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedResponseUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SelectedResponseUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
