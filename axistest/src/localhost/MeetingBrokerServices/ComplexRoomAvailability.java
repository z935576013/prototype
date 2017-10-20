/**
 * ComplexRoomAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ComplexRoomAvailability  implements java.io.Serializable {
    private int dayNumber;

    private java.lang.String externalRoomCategory;

    private localhost.MeetingBrokerServices.RoomTypes roomType;

    private java.lang.String externalRoomType;

    private int quantityAvailable;

    private java.lang.String comments;

    private localhost.MeetingBrokerServices.RoomRateAvailability[] roomRateAvailabilities;

    public ComplexRoomAvailability() {
    }

    public ComplexRoomAvailability(
           int dayNumber,
           java.lang.String externalRoomCategory,
           localhost.MeetingBrokerServices.RoomTypes roomType,
           java.lang.String externalRoomType,
           int quantityAvailable,
           java.lang.String comments,
           localhost.MeetingBrokerServices.RoomRateAvailability[] roomRateAvailabilities) {
           this.dayNumber = dayNumber;
           this.externalRoomCategory = externalRoomCategory;
           this.roomType = roomType;
           this.externalRoomType = externalRoomType;
           this.quantityAvailable = quantityAvailable;
           this.comments = comments;
           this.roomRateAvailabilities = roomRateAvailabilities;
    }


    /**
     * Gets the dayNumber value for this ComplexRoomAvailability.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this ComplexRoomAvailability.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the externalRoomCategory value for this ComplexRoomAvailability.
     * 
     * @return externalRoomCategory
     */
    public java.lang.String getExternalRoomCategory() {
        return externalRoomCategory;
    }


    /**
     * Sets the externalRoomCategory value for this ComplexRoomAvailability.
     * 
     * @param externalRoomCategory
     */
    public void setExternalRoomCategory(java.lang.String externalRoomCategory) {
        this.externalRoomCategory = externalRoomCategory;
    }


    /**
     * Gets the roomType value for this ComplexRoomAvailability.
     * 
     * @return roomType
     */
    public localhost.MeetingBrokerServices.RoomTypes getRoomType() {
        return roomType;
    }


    /**
     * Sets the roomType value for this ComplexRoomAvailability.
     * 
     * @param roomType
     */
    public void setRoomType(localhost.MeetingBrokerServices.RoomTypes roomType) {
        this.roomType = roomType;
    }


    /**
     * Gets the externalRoomType value for this ComplexRoomAvailability.
     * 
     * @return externalRoomType
     */
    public java.lang.String getExternalRoomType() {
        return externalRoomType;
    }


    /**
     * Sets the externalRoomType value for this ComplexRoomAvailability.
     * 
     * @param externalRoomType
     */
    public void setExternalRoomType(java.lang.String externalRoomType) {
        this.externalRoomType = externalRoomType;
    }


    /**
     * Gets the quantityAvailable value for this ComplexRoomAvailability.
     * 
     * @return quantityAvailable
     */
    public int getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ComplexRoomAvailability.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the comments value for this ComplexRoomAvailability.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ComplexRoomAvailability.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the roomRateAvailabilities value for this ComplexRoomAvailability.
     * 
     * @return roomRateAvailabilities
     */
    public localhost.MeetingBrokerServices.RoomRateAvailability[] getRoomRateAvailabilities() {
        return roomRateAvailabilities;
    }


    /**
     * Sets the roomRateAvailabilities value for this ComplexRoomAvailability.
     * 
     * @param roomRateAvailabilities
     */
    public void setRoomRateAvailabilities(localhost.MeetingBrokerServices.RoomRateAvailability[] roomRateAvailabilities) {
        this.roomRateAvailabilities = roomRateAvailabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexRoomAvailability)) return false;
        ComplexRoomAvailability other = (ComplexRoomAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dayNumber == other.getDayNumber() &&
            ((this.externalRoomCategory==null && other.getExternalRoomCategory()==null) || 
             (this.externalRoomCategory!=null &&
              this.externalRoomCategory.equals(other.getExternalRoomCategory()))) &&
            ((this.roomType==null && other.getRoomType()==null) || 
             (this.roomType!=null &&
              this.roomType.equals(other.getRoomType()))) &&
            ((this.externalRoomType==null && other.getExternalRoomType()==null) || 
             (this.externalRoomType!=null &&
              this.externalRoomType.equals(other.getExternalRoomType()))) &&
            this.quantityAvailable == other.getQuantityAvailable() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.roomRateAvailabilities==null && other.getRoomRateAvailabilities()==null) || 
             (this.roomRateAvailabilities!=null &&
              java.util.Arrays.equals(this.roomRateAvailabilities, other.getRoomRateAvailabilities())));
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
        if (getExternalRoomCategory() != null) {
            _hashCode += getExternalRoomCategory().hashCode();
        }
        if (getRoomType() != null) {
            _hashCode += getRoomType().hashCode();
        }
        if (getExternalRoomType() != null) {
            _hashCode += getExternalRoomType().hashCode();
        }
        _hashCode += getQuantityAvailable();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getRoomRateAvailabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoomRateAvailabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoomRateAvailabilities(), i);
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
        new org.apache.axis.description.TypeDesc(ComplexRoomAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DayNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRoomCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRoomCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomTypes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRoomType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRoomType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("roomRateAvailabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability"));
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
