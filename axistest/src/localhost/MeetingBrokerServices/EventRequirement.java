/**
 * EventRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class EventRequirement  implements java.io.Serializable {
    private int dayNumber;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String externalEventType;

    private java.lang.String externalEventSetupType;

    private java.lang.Integer externalEventTypeId;

    private java.lang.Integer externalEventSetupTypeId;

    private int roomSize;

    private int attendeeQuantity;

    private boolean isTwentyFourHourHold;

    private java.lang.String comments;

    public EventRequirement() {
    }

    public EventRequirement(
           int dayNumber,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String externalEventType,
           java.lang.String externalEventSetupType,
           java.lang.Integer externalEventTypeId,
           java.lang.Integer externalEventSetupTypeId,
           int roomSize,
           int attendeeQuantity,
           boolean isTwentyFourHourHold,
           java.lang.String comments) {
           this.dayNumber = dayNumber;
           this.startTime = startTime;
           this.endTime = endTime;
           this.externalEventType = externalEventType;
           this.externalEventSetupType = externalEventSetupType;
           this.externalEventTypeId = externalEventTypeId;
           this.externalEventSetupTypeId = externalEventSetupTypeId;
           this.roomSize = roomSize;
           this.attendeeQuantity = attendeeQuantity;
           this.isTwentyFourHourHold = isTwentyFourHourHold;
           this.comments = comments;
    }


    /**
     * Gets the dayNumber value for this EventRequirement.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this EventRequirement.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the startTime value for this EventRequirement.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this EventRequirement.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this EventRequirement.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this EventRequirement.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the externalEventType value for this EventRequirement.
     * 
     * @return externalEventType
     */
    public java.lang.String getExternalEventType() {
        return externalEventType;
    }


    /**
     * Sets the externalEventType value for this EventRequirement.
     * 
     * @param externalEventType
     */
    public void setExternalEventType(java.lang.String externalEventType) {
        this.externalEventType = externalEventType;
    }


    /**
     * Gets the externalEventSetupType value for this EventRequirement.
     * 
     * @return externalEventSetupType
     */
    public java.lang.String getExternalEventSetupType() {
        return externalEventSetupType;
    }


    /**
     * Sets the externalEventSetupType value for this EventRequirement.
     * 
     * @param externalEventSetupType
     */
    public void setExternalEventSetupType(java.lang.String externalEventSetupType) {
        this.externalEventSetupType = externalEventSetupType;
    }


    /**
     * Gets the externalEventTypeId value for this EventRequirement.
     * 
     * @return externalEventTypeId
     */
    public java.lang.Integer getExternalEventTypeId() {
        return externalEventTypeId;
    }


    /**
     * Sets the externalEventTypeId value for this EventRequirement.
     * 
     * @param externalEventTypeId
     */
    public void setExternalEventTypeId(java.lang.Integer externalEventTypeId) {
        this.externalEventTypeId = externalEventTypeId;
    }


    /**
     * Gets the externalEventSetupTypeId value for this EventRequirement.
     * 
     * @return externalEventSetupTypeId
     */
    public java.lang.Integer getExternalEventSetupTypeId() {
        return externalEventSetupTypeId;
    }


    /**
     * Sets the externalEventSetupTypeId value for this EventRequirement.
     * 
     * @param externalEventSetupTypeId
     */
    public void setExternalEventSetupTypeId(java.lang.Integer externalEventSetupTypeId) {
        this.externalEventSetupTypeId = externalEventSetupTypeId;
    }


    /**
     * Gets the roomSize value for this EventRequirement.
     * 
     * @return roomSize
     */
    public int getRoomSize() {
        return roomSize;
    }


    /**
     * Sets the roomSize value for this EventRequirement.
     * 
     * @param roomSize
     */
    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }


    /**
     * Gets the attendeeQuantity value for this EventRequirement.
     * 
     * @return attendeeQuantity
     */
    public int getAttendeeQuantity() {
        return attendeeQuantity;
    }


    /**
     * Sets the attendeeQuantity value for this EventRequirement.
     * 
     * @param attendeeQuantity
     */
    public void setAttendeeQuantity(int attendeeQuantity) {
        this.attendeeQuantity = attendeeQuantity;
    }


    /**
     * Gets the isTwentyFourHourHold value for this EventRequirement.
     * 
     * @return isTwentyFourHourHold
     */
    public boolean isIsTwentyFourHourHold() {
        return isTwentyFourHourHold;
    }


    /**
     * Sets the isTwentyFourHourHold value for this EventRequirement.
     * 
     * @param isTwentyFourHourHold
     */
    public void setIsTwentyFourHourHold(boolean isTwentyFourHourHold) {
        this.isTwentyFourHourHold = isTwentyFourHourHold;
    }


    /**
     * Gets the comments value for this EventRequirement.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EventRequirement.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventRequirement)) return false;
        EventRequirement other = (EventRequirement) obj;
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
            ((this.externalEventTypeId==null && other.getExternalEventTypeId()==null) || 
             (this.externalEventTypeId!=null &&
              this.externalEventTypeId.equals(other.getExternalEventTypeId()))) &&
            ((this.externalEventSetupTypeId==null && other.getExternalEventSetupTypeId()==null) || 
             (this.externalEventSetupTypeId!=null &&
              this.externalEventSetupTypeId.equals(other.getExternalEventSetupTypeId()))) &&
            this.roomSize == other.getRoomSize() &&
            this.attendeeQuantity == other.getAttendeeQuantity() &&
            this.isTwentyFourHourHold == other.isIsTwentyFourHourHold() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getExternalEventTypeId() != null) {
            _hashCode += getExternalEventTypeId().hashCode();
        }
        if (getExternalEventSetupTypeId() != null) {
            _hashCode += getExternalEventSetupTypeId().hashCode();
        }
        _hashCode += getRoomSize();
        _hashCode += getAttendeeQuantity();
        _hashCode += (isIsTwentyFourHourHold() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement"));
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
        elemField.setFieldName("externalEventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalEventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalEventSetupTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalEventSetupTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendeeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AttendeeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTwentyFourHourHold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsTwentyFourHourHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Comments"));
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
