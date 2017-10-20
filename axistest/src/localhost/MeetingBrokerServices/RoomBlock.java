/**
 * RoomBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RoomBlock  implements java.io.Serializable {
    private java.util.Calendar startDate;

    private java.util.Calendar alternateStartDate;

    private java.lang.Boolean isAlternateStartDateSelected;

    private java.math.BigDecimal budgetedRoomRate;

    private java.lang.String comments;

    private localhost.MeetingBrokerServices.RoomRequirement[] roomRequirements;

    private localhost.MeetingBrokerServices.RoomAvailability[] roomAvailabilities;

    public RoomBlock() {
    }

    public RoomBlock(
           java.util.Calendar startDate,
           java.util.Calendar alternateStartDate,
           java.lang.Boolean isAlternateStartDateSelected,
           java.math.BigDecimal budgetedRoomRate,
           java.lang.String comments,
           localhost.MeetingBrokerServices.RoomRequirement[] roomRequirements,
           localhost.MeetingBrokerServices.RoomAvailability[] roomAvailabilities) {
           this.startDate = startDate;
           this.alternateStartDate = alternateStartDate;
           this.isAlternateStartDateSelected = isAlternateStartDateSelected;
           this.budgetedRoomRate = budgetedRoomRate;
           this.comments = comments;
           this.roomRequirements = roomRequirements;
           this.roomAvailabilities = roomAvailabilities;
    }


    /**
     * Gets the startDate value for this RoomBlock.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RoomBlock.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the alternateStartDate value for this RoomBlock.
     * 
     * @return alternateStartDate
     */
    public java.util.Calendar getAlternateStartDate() {
        return alternateStartDate;
    }


    /**
     * Sets the alternateStartDate value for this RoomBlock.
     * 
     * @param alternateStartDate
     */
    public void setAlternateStartDate(java.util.Calendar alternateStartDate) {
        this.alternateStartDate = alternateStartDate;
    }


    /**
     * Gets the isAlternateStartDateSelected value for this RoomBlock.
     * 
     * @return isAlternateStartDateSelected
     */
    public java.lang.Boolean getIsAlternateStartDateSelected() {
        return isAlternateStartDateSelected;
    }


    /**
     * Sets the isAlternateStartDateSelected value for this RoomBlock.
     * 
     * @param isAlternateStartDateSelected
     */
    public void setIsAlternateStartDateSelected(java.lang.Boolean isAlternateStartDateSelected) {
        this.isAlternateStartDateSelected = isAlternateStartDateSelected;
    }


    /**
     * Gets the budgetedRoomRate value for this RoomBlock.
     * 
     * @return budgetedRoomRate
     */
    public java.math.BigDecimal getBudgetedRoomRate() {
        return budgetedRoomRate;
    }


    /**
     * Sets the budgetedRoomRate value for this RoomBlock.
     * 
     * @param budgetedRoomRate
     */
    public void setBudgetedRoomRate(java.math.BigDecimal budgetedRoomRate) {
        this.budgetedRoomRate = budgetedRoomRate;
    }


    /**
     * Gets the comments value for this RoomBlock.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RoomBlock.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the roomRequirements value for this RoomBlock.
     * 
     * @return roomRequirements
     */
    public localhost.MeetingBrokerServices.RoomRequirement[] getRoomRequirements() {
        return roomRequirements;
    }


    /**
     * Sets the roomRequirements value for this RoomBlock.
     * 
     * @param roomRequirements
     */
    public void setRoomRequirements(localhost.MeetingBrokerServices.RoomRequirement[] roomRequirements) {
        this.roomRequirements = roomRequirements;
    }


    /**
     * Gets the roomAvailabilities value for this RoomBlock.
     * 
     * @return roomAvailabilities
     */
    public localhost.MeetingBrokerServices.RoomAvailability[] getRoomAvailabilities() {
        return roomAvailabilities;
    }


    /**
     * Sets the roomAvailabilities value for this RoomBlock.
     * 
     * @param roomAvailabilities
     */
    public void setRoomAvailabilities(localhost.MeetingBrokerServices.RoomAvailability[] roomAvailabilities) {
        this.roomAvailabilities = roomAvailabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoomBlock)) return false;
        RoomBlock other = (RoomBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.alternateStartDate==null && other.getAlternateStartDate()==null) || 
             (this.alternateStartDate!=null &&
              this.alternateStartDate.equals(other.getAlternateStartDate()))) &&
            ((this.isAlternateStartDateSelected==null && other.getIsAlternateStartDateSelected()==null) || 
             (this.isAlternateStartDateSelected!=null &&
              this.isAlternateStartDateSelected.equals(other.getIsAlternateStartDateSelected()))) &&
            ((this.budgetedRoomRate==null && other.getBudgetedRoomRate()==null) || 
             (this.budgetedRoomRate!=null &&
              this.budgetedRoomRate.equals(other.getBudgetedRoomRate()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.roomRequirements==null && other.getRoomRequirements()==null) || 
             (this.roomRequirements!=null &&
              java.util.Arrays.equals(this.roomRequirements, other.getRoomRequirements()))) &&
            ((this.roomAvailabilities==null && other.getRoomAvailabilities()==null) || 
             (this.roomAvailabilities!=null &&
              java.util.Arrays.equals(this.roomAvailabilities, other.getRoomAvailabilities())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getAlternateStartDate() != null) {
            _hashCode += getAlternateStartDate().hashCode();
        }
        if (getIsAlternateStartDateSelected() != null) {
            _hashCode += getIsAlternateStartDateSelected().hashCode();
        }
        if (getBudgetedRoomRate() != null) {
            _hashCode += getBudgetedRoomRate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getRoomRequirements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomRequirements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomRequirements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoomAvailabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomAvailabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomAvailabilities(), i);
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
        new org.apache.axis.description.TypeDesc(RoomBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAlternateStartDateSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsAlternateStartDateSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetedRoomRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BudgetedRoomRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomAvailabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability"));
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
