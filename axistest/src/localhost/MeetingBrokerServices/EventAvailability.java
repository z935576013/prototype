/**
 * EventAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class EventAvailability  implements java.io.Serializable {
    private int eventAvailabilityId;

    private int dayNumber;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String externalEventType;

    private java.lang.String externalEventSetupType;

    private int roomSize;

    private int attendeeQuantity;

    private boolean isTwentyFourHourHold;

    private java.lang.String comments;

    public EventAvailability() {
    }

    public EventAvailability(
           int eventAvailabilityId,
           int dayNumber,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String externalEventType,
           java.lang.String externalEventSetupType,
           int roomSize,
           int attendeeQuantity,
           boolean isTwentyFourHourHold,
           java.lang.String comments) {
           this.eventAvailabilityId = eventAvailabilityId;
           this.dayNumber = dayNumber;
           this.startTime = startTime;
           this.endTime = endTime;
           this.externalEventType = externalEventType;
           this.externalEventSetupType = externalEventSetupType;
           this.roomSize = roomSize;
           this.attendeeQuantity = attendeeQuantity;
           this.isTwentyFourHourHold = isTwentyFourHourHold;
           this.comments = comments;
    }


    /**
     * Gets the eventAvailabilityId value for this EventAvailability.
     * 
     * @return eventAvailabilityId
     */
    public int getEventAvailabilityId() {
        return eventAvailabilityId;
    }


    /**
     * Sets the eventAvailabilityId value for this EventAvailability.
     * 
     * @param eventAvailabilityId
     */
    public void setEventAvailabilityId(int eventAvailabilityId) {
        this.eventAvailabilityId = eventAvailabilityId;
    }


    /**
     * Gets the dayNumber value for this EventAvailability.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this EventAvailability.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the startTime value for this EventAvailability.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this EventAvailability.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this EventAvailability.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this EventAvailability.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the externalEventType value for this EventAvailability.
     * 
     * @return externalEventType
     */
    public java.lang.String getExternalEventType() {
        return externalEventType;
    }


    /**
     * Sets the externalEventType value for this EventAvailability.
     * 
     * @param externalEventType
     */
    public void setExternalEventType(java.lang.String externalEventType) {
        this.externalEventType = externalEventType;
    }


    /**
     * Gets the externalEventSetupType value for this EventAvailability.
     * 
     * @return externalEventSetupType
     */
    public java.lang.String getExternalEventSetupType() {
        return externalEventSetupType;
    }


    /**
     * Sets the externalEventSetupType value for this EventAvailability.
     * 
     * @param externalEventSetupType
     */
    public void setExternalEventSetupType(java.lang.String externalEventSetupType) {
        this.externalEventSetupType = externalEventSetupType;
    }


    /**
     * Gets the roomSize value for this EventAvailability.
     * 
     * @return roomSize
     */
    public int getRoomSize() {
        return roomSize;
    }


    /**
     * Sets the roomSize value for this EventAvailability.
     * 
     * @param roomSize
     */
    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }


    /**
     * Gets the attendeeQuantity value for this EventAvailability.
     * 
     * @return attendeeQuantity
     */
    public int getAttendeeQuantity() {
        return attendeeQuantity;
    }


    /**
     * Sets the attendeeQuantity value for this EventAvailability.
     * 
     * @param attendeeQuantity
     */
    public void setAttendeeQuantity(int attendeeQuantity) {
        this.attendeeQuantity = attendeeQuantity;
    }


    /**
     * Gets the isTwentyFourHourHold value for this EventAvailability.
     * 
     * @return isTwentyFourHourHold
     */
    public boolean isIsTwentyFourHourHold() {
        return isTwentyFourHourHold;
    }


    /**
     * Sets the isTwentyFourHourHold value for this EventAvailability.
     * 
     * @param isTwentyFourHourHold
     */
    public void setIsTwentyFourHourHold(boolean isTwentyFourHourHold) {
        this.isTwentyFourHourHold = isTwentyFourHourHold;
    }


    /**
     * Gets the comments value for this EventAvailability.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EventAvailability.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventAvailability)) return false;
        EventAvailability other = (EventAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventAvailabilityId == other.getEventAvailabilityId() &&
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
        _hashCode += getEventAvailabilityId();
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
        new org.apache.axis.description.TypeDesc(EventAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventAvailabilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailabilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
