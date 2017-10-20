/**
 * EventRequirementBusinessData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class EventRequirementBusinessData  implements java.io.Serializable {
    private int dayNumber;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String externalEventType;

    private java.lang.String externalEventSetupType;

    private int attendeeQuantity;

    private java.math.BigDecimal foodBudget;

    private java.math.BigDecimal beverageBudget;

    private java.math.BigDecimal rentalBudget;

    private java.math.BigDecimal resourceBudget;

    private java.math.BigDecimal otherBudget;

    public EventRequirementBusinessData() {
    }

    public EventRequirementBusinessData(
           int dayNumber,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String externalEventType,
           java.lang.String externalEventSetupType,
           int attendeeQuantity,
           java.math.BigDecimal foodBudget,
           java.math.BigDecimal beverageBudget,
           java.math.BigDecimal rentalBudget,
           java.math.BigDecimal resourceBudget,
           java.math.BigDecimal otherBudget) {
           this.dayNumber = dayNumber;
           this.startTime = startTime;
           this.endTime = endTime;
           this.externalEventType = externalEventType;
           this.externalEventSetupType = externalEventSetupType;
           this.attendeeQuantity = attendeeQuantity;
           this.foodBudget = foodBudget;
           this.beverageBudget = beverageBudget;
           this.rentalBudget = rentalBudget;
           this.resourceBudget = resourceBudget;
           this.otherBudget = otherBudget;
    }


    /**
     * Gets the dayNumber value for this EventRequirementBusinessData.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this EventRequirementBusinessData.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the startTime value for this EventRequirementBusinessData.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this EventRequirementBusinessData.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this EventRequirementBusinessData.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this EventRequirementBusinessData.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the externalEventType value for this EventRequirementBusinessData.
     * 
     * @return externalEventType
     */
    public java.lang.String getExternalEventType() {
        return externalEventType;
    }


    /**
     * Sets the externalEventType value for this EventRequirementBusinessData.
     * 
     * @param externalEventType
     */
    public void setExternalEventType(java.lang.String externalEventType) {
        this.externalEventType = externalEventType;
    }


    /**
     * Gets the externalEventSetupType value for this EventRequirementBusinessData.
     * 
     * @return externalEventSetupType
     */
    public java.lang.String getExternalEventSetupType() {
        return externalEventSetupType;
    }


    /**
     * Sets the externalEventSetupType value for this EventRequirementBusinessData.
     * 
     * @param externalEventSetupType
     */
    public void setExternalEventSetupType(java.lang.String externalEventSetupType) {
        this.externalEventSetupType = externalEventSetupType;
    }


    /**
     * Gets the attendeeQuantity value for this EventRequirementBusinessData.
     * 
     * @return attendeeQuantity
     */
    public int getAttendeeQuantity() {
        return attendeeQuantity;
    }


    /**
     * Sets the attendeeQuantity value for this EventRequirementBusinessData.
     * 
     * @param attendeeQuantity
     */
    public void setAttendeeQuantity(int attendeeQuantity) {
        this.attendeeQuantity = attendeeQuantity;
    }


    /**
     * Gets the foodBudget value for this EventRequirementBusinessData.
     * 
     * @return foodBudget
     */
    public java.math.BigDecimal getFoodBudget() {
        return foodBudget;
    }


    /**
     * Sets the foodBudget value for this EventRequirementBusinessData.
     * 
     * @param foodBudget
     */
    public void setFoodBudget(java.math.BigDecimal foodBudget) {
        this.foodBudget = foodBudget;
    }


    /**
     * Gets the beverageBudget value for this EventRequirementBusinessData.
     * 
     * @return beverageBudget
     */
    public java.math.BigDecimal getBeverageBudget() {
        return beverageBudget;
    }


    /**
     * Sets the beverageBudget value for this EventRequirementBusinessData.
     * 
     * @param beverageBudget
     */
    public void setBeverageBudget(java.math.BigDecimal beverageBudget) {
        this.beverageBudget = beverageBudget;
    }


    /**
     * Gets the rentalBudget value for this EventRequirementBusinessData.
     * 
     * @return rentalBudget
     */
    public java.math.BigDecimal getRentalBudget() {
        return rentalBudget;
    }


    /**
     * Sets the rentalBudget value for this EventRequirementBusinessData.
     * 
     * @param rentalBudget
     */
    public void setRentalBudget(java.math.BigDecimal rentalBudget) {
        this.rentalBudget = rentalBudget;
    }


    /**
     * Gets the resourceBudget value for this EventRequirementBusinessData.
     * 
     * @return resourceBudget
     */
    public java.math.BigDecimal getResourceBudget() {
        return resourceBudget;
    }


    /**
     * Sets the resourceBudget value for this EventRequirementBusinessData.
     * 
     * @param resourceBudget
     */
    public void setResourceBudget(java.math.BigDecimal resourceBudget) {
        this.resourceBudget = resourceBudget;
    }


    /**
     * Gets the otherBudget value for this EventRequirementBusinessData.
     * 
     * @return otherBudget
     */
    public java.math.BigDecimal getOtherBudget() {
        return otherBudget;
    }


    /**
     * Sets the otherBudget value for this EventRequirementBusinessData.
     * 
     * @param otherBudget
     */
    public void setOtherBudget(java.math.BigDecimal otherBudget) {
        this.otherBudget = otherBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventRequirementBusinessData)) return false;
        EventRequirementBusinessData other = (EventRequirementBusinessData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dayNumber == other.getDayNumber() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.externalEventType==null && other.getExternalEventType()==null) || 
             (this.externalEventType!=null &&
              this.externalEventType.equals(other.getExternalEventType()))) &&
            ((this.externalEventSetupType==null && other.getExternalEventSetupType()==null) || 
             (this.externalEventSetupType!=null &&
              this.externalEventSetupType.equals(other.getExternalEventSetupType()))) &&
            this.attendeeQuantity == other.getAttendeeQuantity() &&
            ((this.foodBudget==null && other.getFoodBudget()==null) || 
             (this.foodBudget!=null &&
              this.foodBudget.equals(other.getFoodBudget()))) &&
            ((this.beverageBudget==null && other.getBeverageBudget()==null) || 
             (this.beverageBudget!=null &&
              this.beverageBudget.equals(other.getBeverageBudget()))) &&
            ((this.rentalBudget==null && other.getRentalBudget()==null) || 
             (this.rentalBudget!=null &&
              this.rentalBudget.equals(other.getRentalBudget()))) &&
            ((this.resourceBudget==null && other.getResourceBudget()==null) || 
             (this.resourceBudget!=null &&
              this.resourceBudget.equals(other.getResourceBudget()))) &&
            ((this.otherBudget==null && other.getOtherBudget()==null) || 
             (this.otherBudget!=null &&
              this.otherBudget.equals(other.getOtherBudget())));
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
        _hashCode += getDayNumber();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getExternalEventType() != null) {
            _hashCode += getExternalEventType().hashCode();
        }
        if (getExternalEventSetupType() != null) {
            _hashCode += getExternalEventSetupType().hashCode();
        }
        _hashCode += getAttendeeQuantity();
        if (getFoodBudget() != null) {
            _hashCode += getFoodBudget().hashCode();
        }
        if (getBeverageBudget() != null) {
            _hashCode += getBeverageBudget().hashCode();
        }
        if (getRentalBudget() != null) {
            _hashCode += getRentalBudget().hashCode();
        }
        if (getResourceBudget() != null) {
            _hashCode += getResourceBudget().hashCode();
        }
        if (getOtherBudget() != null) {
            _hashCode += getOtherBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventRequirementBusinessData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DayNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalEventSetupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalEventSetupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendeeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AttendeeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FoodBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BeverageBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RentalBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResourceBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
