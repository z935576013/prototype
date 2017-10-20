/**
 * RoomAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RoomAvailability  implements java.io.Serializable {
    private int dayNumber;

    private localhost.MeetingBrokerServices.RoomTypes roomType;

    private int singlesAvailable;

    private java.math.BigDecimal singleRate;

    private int doublesAvailable;

    private java.math.BigDecimal doubleRate;

    private int triplesAvailable;

    private java.math.BigDecimal tripleRate;

    private int quadsAvailable;

    private java.math.BigDecimal quadRate;

    private java.lang.String comments;

    public RoomAvailability() {
    }

    public RoomAvailability(
           int dayNumber,
           localhost.MeetingBrokerServices.RoomTypes roomType,
           int singlesAvailable,
           java.math.BigDecimal singleRate,
           int doublesAvailable,
           java.math.BigDecimal doubleRate,
           int triplesAvailable,
           java.math.BigDecimal tripleRate,
           int quadsAvailable,
           java.math.BigDecimal quadRate,
           java.lang.String comments) {
           this.dayNumber = dayNumber;
           this.roomType = roomType;
           this.singlesAvailable = singlesAvailable;
           this.singleRate = singleRate;
           this.doublesAvailable = doublesAvailable;
           this.doubleRate = doubleRate;
           this.triplesAvailable = triplesAvailable;
           this.tripleRate = tripleRate;
           this.quadsAvailable = quadsAvailable;
           this.quadRate = quadRate;
           this.comments = comments;
    }


    /**
     * Gets the dayNumber value for this RoomAvailability.
     * 
     * @return dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }


    /**
     * Sets the dayNumber value for this RoomAvailability.
     * 
     * @param dayNumber
     */
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }


    /**
     * Gets the roomType value for this RoomAvailability.
     * 
     * @return roomType
     */
    public localhost.MeetingBrokerServices.RoomTypes getRoomType() {
        return roomType;
    }


    /**
     * Sets the roomType value for this RoomAvailability.
     * 
     * @param roomType
     */
    public void setRoomType(localhost.MeetingBrokerServices.RoomTypes roomType) {
        this.roomType = roomType;
    }


    /**
     * Gets the singlesAvailable value for this RoomAvailability.
     * 
     * @return singlesAvailable
     */
    public int getSinglesAvailable() {
        return singlesAvailable;
    }


    /**
     * Sets the singlesAvailable value for this RoomAvailability.
     * 
     * @param singlesAvailable
     */
    public void setSinglesAvailable(int singlesAvailable) {
        this.singlesAvailable = singlesAvailable;
    }


    /**
     * Gets the singleRate value for this RoomAvailability.
     * 
     * @return singleRate
     */
    public java.math.BigDecimal getSingleRate() {
        return singleRate;
    }


    /**
     * Sets the singleRate value for this RoomAvailability.
     * 
     * @param singleRate
     */
    public void setSingleRate(java.math.BigDecimal singleRate) {
        this.singleRate = singleRate;
    }


    /**
     * Gets the doublesAvailable value for this RoomAvailability.
     * 
     * @return doublesAvailable
     */
    public int getDoublesAvailable() {
        return doublesAvailable;
    }


    /**
     * Sets the doublesAvailable value for this RoomAvailability.
     * 
     * @param doublesAvailable
     */
    public void setDoublesAvailable(int doublesAvailable) {
        this.doublesAvailable = doublesAvailable;
    }


    /**
     * Gets the doubleRate value for this RoomAvailability.
     * 
     * @return doubleRate
     */
    public java.math.BigDecimal getDoubleRate() {
        return doubleRate;
    }


    /**
     * Sets the doubleRate value for this RoomAvailability.
     * 
     * @param doubleRate
     */
    public void setDoubleRate(java.math.BigDecimal doubleRate) {
        this.doubleRate = doubleRate;
    }


    /**
     * Gets the triplesAvailable value for this RoomAvailability.
     * 
     * @return triplesAvailable
     */
    public int getTriplesAvailable() {
        return triplesAvailable;
    }


    /**
     * Sets the triplesAvailable value for this RoomAvailability.
     * 
     * @param triplesAvailable
     */
    public void setTriplesAvailable(int triplesAvailable) {
        this.triplesAvailable = triplesAvailable;
    }


    /**
     * Gets the tripleRate value for this RoomAvailability.
     * 
     * @return tripleRate
     */
    public java.math.BigDecimal getTripleRate() {
        return tripleRate;
    }


    /**
     * Sets the tripleRate value for this RoomAvailability.
     * 
     * @param tripleRate
     */
    public void setTripleRate(java.math.BigDecimal tripleRate) {
        this.tripleRate = tripleRate;
    }


    /**
     * Gets the quadsAvailable value for this RoomAvailability.
     * 
     * @return quadsAvailable
     */
    public int getQuadsAvailable() {
        return quadsAvailable;
    }


    /**
     * Sets the quadsAvailable value for this RoomAvailability.
     * 
     * @param quadsAvailable
     */
    public void setQuadsAvailable(int quadsAvailable) {
        this.quadsAvailable = quadsAvailable;
    }


    /**
     * Gets the quadRate value for this RoomAvailability.
     * 
     * @return quadRate
     */
    public java.math.BigDecimal getQuadRate() {
        return quadRate;
    }


    /**
     * Sets the quadRate value for this RoomAvailability.
     * 
     * @param quadRate
     */
    public void setQuadRate(java.math.BigDecimal quadRate) {
        this.quadRate = quadRate;
    }


    /**
     * Gets the comments value for this RoomAvailability.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RoomAvailability.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoomAvailability)) return false;
        RoomAvailability other = (RoomAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dayNumber == other.getDayNumber() &&
            ((this.roomType==null && other.getRoomType()==null) || 
             (this.roomType!=null &&
              this.roomType.equals(other.getRoomType()))) &&
            this.singlesAvailable == other.getSinglesAvailable() &&
            ((this.singleRate==null && other.getSingleRate()==null) || 
             (this.singleRate!=null &&
              this.singleRate.equals(other.getSingleRate()))) &&
            this.doublesAvailable == other.getDoublesAvailable() &&
            ((this.doubleRate==null && other.getDoubleRate()==null) || 
             (this.doubleRate!=null &&
              this.doubleRate.equals(other.getDoubleRate()))) &&
            this.triplesAvailable == other.getTriplesAvailable() &&
            ((this.tripleRate==null && other.getTripleRate()==null) || 
             (this.tripleRate!=null &&
              this.tripleRate.equals(other.getTripleRate()))) &&
            this.quadsAvailable == other.getQuadsAvailable() &&
            ((this.quadRate==null && other.getQuadRate()==null) || 
             (this.quadRate!=null &&
              this.quadRate.equals(other.getQuadRate()))) &&
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
        if (getRoomType() != null) {
            _hashCode += getRoomType().hashCode();
        }
        _hashCode += getSinglesAvailable();
        if (getSingleRate() != null) {
            _hashCode += getSingleRate().hashCode();
        }
        _hashCode += getDoublesAvailable();
        if (getDoubleRate() != null) {
            _hashCode += getDoubleRate().hashCode();
        }
        _hashCode += getTriplesAvailable();
        if (getTripleRate() != null) {
            _hashCode += getTripleRate().hashCode();
        }
        _hashCode += getQuadsAvailable();
        if (getQuadRate() != null) {
            _hashCode += getQuadRate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoomAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DayNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomTypes"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singlesAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SinglesAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SingleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doublesAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DoublesAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DoubleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triplesAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TriplesAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TripleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quadsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuadsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
