/**
 * RoomRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RoomRequirement  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.RoomTypes roomType;

    private int dayNumber;

    private int singleQuantity;

    private int doubleQuantity;

    private int tripleQuantity;

    private int quadQuantity;

    private java.lang.String comments;

    public RoomRequirement() {
    }

    public RoomRequirement(
           localhost.MeetingBrokerServices.RoomTypes roomType,
           int dayNumber,
           int singleQuantity,
           int doubleQuantity,
           int tripleQuantity,
           int quadQuantity,
           java.lang.String comments) {
           this.roomType = roomType;
           this.dayNumber = dayNumber;
           this.singleQuantity = singleQuantity;
           this.doubleQuantity = doubleQuantity;
           this.tripleQuantity = tripleQuantity;
           this.quadQuantity = quadQuantity;
           this.comments = comments;
    }


    /**
     * Gets the roomType value for this RoomRequirement.
     * 
     * @return roomType
     */
    public localhost.MeetingBrokerServices.RoomTypes getRoomType() {
        return roomType;
    }


    /**
     * Sets the roomType value for this RoomRequirement.
     * 
     * @param roomType
     */
    public void setRoomType(localhost.MeetingBrokerServices.RoomTypes roomType) {
        this.roomType = roomType;
    }


    /**
     * Gets the dayNumber value for this RoomRequirement.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this RoomRequirement.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the singleQuantity value for this RoomRequirement.
     * 
     * @return singleQuantity
     */
    public int getSingleQuantity() {
        return singleQuantity;
    }


    /**
     * Sets the singleQuantity value for this RoomRequirement.
     * 
     * @param singleQuantity
     */
    public void setSingleQuantity(int singleQuantity) {
        this.singleQuantity = singleQuantity;
    }


    /**
     * Gets the doubleQuantity value for this RoomRequirement.
     * 
     * @return doubleQuantity
     */
    public int getDoubleQuantity() {
        return doubleQuantity;
    }


    /**
     * Sets the doubleQuantity value for this RoomRequirement.
     * 
     * @param doubleQuantity
     */
    public void setDoubleQuantity(int doubleQuantity) {
        this.doubleQuantity = doubleQuantity;
    }


    /**
     * Gets the tripleQuantity value for this RoomRequirement.
     * 
     * @return tripleQuantity
     */
    public int getTripleQuantity() {
        return tripleQuantity;
    }


    /**
     * Sets the tripleQuantity value for this RoomRequirement.
     * 
     * @param tripleQuantity
     */
    public void setTripleQuantity(int tripleQuantity) {
        this.tripleQuantity = tripleQuantity;
    }


    /**
     * Gets the quadQuantity value for this RoomRequirement.
     * 
     * @return quadQuantity
     */
    public int getQuadQuantity() {
        return quadQuantity;
    }


    /**
     * Sets the quadQuantity value for this RoomRequirement.
     * 
     * @param quadQuantity
     */
    public void setQuadQuantity(int quadQuantity) {
        this.quadQuantity = quadQuantity;
    }


    /**
     * Gets the comments value for this RoomRequirement.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RoomRequirement.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoomRequirement)) return false;
        RoomRequirement other = (RoomRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roomType==null && other.getRoomType()==null) || 
             (this.roomType!=null &&
              this.roomType.equals(other.getRoomType()))) &&
            this.dayNumber == other.getDayNumber() &&
            this.singleQuantity == other.getSingleQuantity() &&
            this.doubleQuantity == other.getDoubleQuantity() &&
            this.tripleQuantity == other.getTripleQuantity() &&
            this.quadQuantity == other.getQuadQuantity() &&
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
        if (getRoomType() != null) {
            _hashCode += getRoomType().hashCode();
        }
        _hashCode += getDayNumber();
        _hashCode += getSingleQuantity();
        _hashCode += getDoubleQuantity();
        _hashCode += getTripleQuantity();
        _hashCode += getQuadQuantity();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoomRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomTypes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DayNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SingleQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DoubleQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripleQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TripleQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quadQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuadQuantity"));
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
