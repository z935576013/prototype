/**
 * BusinessSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessSummary  implements java.io.Serializable {
    private java.lang.String externalBookingId;

    private java.lang.String meetingName;

    private java.util.Calendar arrivalDate;

    private java.util.Calendar departureDate;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String bookedBy;

    private java.lang.String companyName;

    private java.lang.String companyContactName;

    private java.lang.String agencyName;

    private java.lang.String agencyContactName;

    private int totalAgreedRooms;

    private int rfpId;

    private int externalLocationId;

    private int subscriptionId;

    public BusinessSummary() {
    }

    public BusinessSummary(
           java.lang.String externalBookingId,
           java.lang.String meetingName,
           java.util.Calendar arrivalDate,
           java.util.Calendar departureDate,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String bookedBy,
           java.lang.String companyName,
           java.lang.String companyContactName,
           java.lang.String agencyName,
           java.lang.String agencyContactName,
           int totalAgreedRooms,
           int rfpId,
           int externalLocationId,
           int subscriptionId) {
           this.externalBookingId = externalBookingId;
           this.meetingName = meetingName;
           this.arrivalDate = arrivalDate;
           this.departureDate = departureDate;
           this.businessStatus = businessStatus;
           this.bookedBy = bookedBy;
           this.companyName = companyName;
           this.companyContactName = companyContactName;
           this.agencyName = agencyName;
           this.agencyContactName = agencyContactName;
           this.totalAgreedRooms = totalAgreedRooms;
           this.rfpId = rfpId;
           this.externalLocationId = externalLocationId;
           this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the externalBookingId value for this BusinessSummary.
     * 
     * @return externalBookingId
     */
    public java.lang.String getExternalBookingId() {
        return externalBookingId;
    }


    /**
     * Sets the externalBookingId value for this BusinessSummary.
     * 
     * @param externalBookingId
     */
    public void setExternalBookingId(java.lang.String externalBookingId) {
        this.externalBookingId = externalBookingId;
    }


    /**
     * Gets the meetingName value for this BusinessSummary.
     * 
     * @return meetingName
     */
    public java.lang.String getMeetingName() {
        return meetingName;
    }


    /**
     * Sets the meetingName value for this BusinessSummary.
     * 
     * @param meetingName
     */
    public void setMeetingName(java.lang.String meetingName) {
        this.meetingName = meetingName;
    }


    /**
     * Gets the arrivalDate value for this BusinessSummary.
     * 
     * @return arrivalDate
     */
    public java.util.Calendar getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this BusinessSummary.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.util.Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the departureDate value for this BusinessSummary.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this BusinessSummary.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the businessStatus value for this BusinessSummary.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this BusinessSummary.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the bookedBy value for this BusinessSummary.
     * 
     * @return bookedBy
     */
    public java.lang.String getBookedBy() {
        return bookedBy;
    }


    /**
     * Sets the bookedBy value for this BusinessSummary.
     * 
     * @param bookedBy
     */
    public void setBookedBy(java.lang.String bookedBy) {
        this.bookedBy = bookedBy;
    }


    /**
     * Gets the companyName value for this BusinessSummary.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this BusinessSummary.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyContactName value for this BusinessSummary.
     * 
     * @return companyContactName
     */
    public java.lang.String getCompanyContactName() {
        return companyContactName;
    }


    /**
     * Sets the companyContactName value for this BusinessSummary.
     * 
     * @param companyContactName
     */
    public void setCompanyContactName(java.lang.String companyContactName) {
        this.companyContactName = companyContactName;
    }


    /**
     * Gets the agencyName value for this BusinessSummary.
     * 
     * @return agencyName
     */
    public java.lang.String getAgencyName() {
        return agencyName;
    }


    /**
     * Sets the agencyName value for this BusinessSummary.
     * 
     * @param agencyName
     */
    public void setAgencyName(java.lang.String agencyName) {
        this.agencyName = agencyName;
    }


    /**
     * Gets the agencyContactName value for this BusinessSummary.
     * 
     * @return agencyContactName
     */
    public java.lang.String getAgencyContactName() {
        return agencyContactName;
    }


    /**
     * Sets the agencyContactName value for this BusinessSummary.
     * 
     * @param agencyContactName
     */
    public void setAgencyContactName(java.lang.String agencyContactName) {
        this.agencyContactName = agencyContactName;
    }


    /**
     * Gets the totalAgreedRooms value for this BusinessSummary.
     * 
     * @return totalAgreedRooms
     */
    public int getTotalAgreedRooms() {
        return totalAgreedRooms;
    }


    /**
     * Sets the totalAgreedRooms value for this BusinessSummary.
     * 
     * @param totalAgreedRooms
     */
    public void setTotalAgreedRooms(int totalAgreedRooms) {
        this.totalAgreedRooms = totalAgreedRooms;
    }


    /**
     * Gets the rfpId value for this BusinessSummary.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this BusinessSummary.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the externalLocationId value for this BusinessSummary.
     * 
     * @return externalLocationId
     */
    public int getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this BusinessSummary.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(int externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the subscriptionId value for this BusinessSummary.
     * 
     * @return subscriptionId
     */
    public int getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this BusinessSummary.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSummary)) return false;
        BusinessSummary other = (BusinessSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalBookingId==null && other.getExternalBookingId()==null) || 
             (this.externalBookingId!=null &&
              this.externalBookingId.equals(other.getExternalBookingId()))) &&
            ((this.meetingName==null && other.getMeetingName()==null) || 
             (this.meetingName!=null &&
              this.meetingName.equals(other.getMeetingName()))) &&
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.businessStatus==null && other.getBusinessStatus()==null) || 
             (this.businessStatus!=null &&
              this.businessStatus.equals(other.getBusinessStatus()))) &&
            ((this.bookedBy==null && other.getBookedBy()==null) || 
             (this.bookedBy!=null &&
              this.bookedBy.equals(other.getBookedBy()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.companyContactName==null && other.getCompanyContactName()==null) || 
             (this.companyContactName!=null &&
              this.companyContactName.equals(other.getCompanyContactName()))) &&
            ((this.agencyName==null && other.getAgencyName()==null) || 
             (this.agencyName!=null &&
              this.agencyName.equals(other.getAgencyName()))) &&
            ((this.agencyContactName==null && other.getAgencyContactName()==null) || 
             (this.agencyContactName!=null &&
              this.agencyContactName.equals(other.getAgencyContactName()))) &&
            this.totalAgreedRooms == other.getTotalAgreedRooms() &&
            this.rfpId == other.getRfpId() &&
            this.externalLocationId == other.getExternalLocationId() &&
            this.subscriptionId == other.getSubscriptionId();
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
        if (getExternalBookingId() != null) {
            _hashCode += getExternalBookingId().hashCode();
        }
        if (getMeetingName() != null) {
            _hashCode += getMeetingName().hashCode();
        }
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getBusinessStatus() != null) {
            _hashCode += getBusinessStatus().hashCode();
        }
        if (getBookedBy() != null) {
            _hashCode += getBookedBy().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCompanyContactName() != null) {
            _hashCode += getCompanyContactName().hashCode();
        }
        if (getAgencyName() != null) {
            _hashCode += getAgencyName().hashCode();
        }
        if (getAgencyContactName() != null) {
            _hashCode += getAgencyContactName().hashCode();
        }
        _hashCode += getTotalAgreedRooms();
        _hashCode += getRfpId();
        _hashCode += getExternalLocationId();
        _hashCode += getSubscriptionId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalBookingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalBookingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BookedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CompanyContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AgencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AgencyContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAgreedRooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TotalAgreedRooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
