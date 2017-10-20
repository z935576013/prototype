/**
 * SubscriptionRfpCancellation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class SubscriptionRfpCancellation  implements java.io.Serializable {
    private int subscriptionId;

    private localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode;

    private localhost.MeetingBrokerServices.Error[] errors;

    private localhost.MeetingBrokerServices.CancelledRfp[] cancelledRfps;

    public SubscriptionRfpCancellation() {
    }

    public SubscriptionRfpCancellation(
           int subscriptionId,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           localhost.MeetingBrokerServices.Error[] errors,
           localhost.MeetingBrokerServices.CancelledRfp[] cancelledRfps) {
           this.subscriptionId = subscriptionId;
           this.statusCode = statusCode;
           this.errors = errors;
           this.cancelledRfps = cancelledRfps;
    }


    /**
     * Gets the subscriptionId value for this SubscriptionRfpCancellation.
     * 
     * @return subscriptionId
     */
    public int getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this SubscriptionRfpCancellation.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the statusCode value for this SubscriptionRfpCancellation.
     * 
     * @return statusCode
     */
    public localhost.MeetingBrokerServices.AcknowledgementStatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SubscriptionRfpCancellation.
     * 
     * @param statusCode
     */
    public void setStatusCode(localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the errors value for this SubscriptionRfpCancellation.
     * 
     * @return errors
     */
    public localhost.MeetingBrokerServices.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SubscriptionRfpCancellation.
     * 
     * @param errors
     */
    public void setErrors(localhost.MeetingBrokerServices.Error[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the cancelledRfps value for this SubscriptionRfpCancellation.
     * 
     * @return cancelledRfps
     */
    public localhost.MeetingBrokerServices.CancelledRfp[] getCancelledRfps() {
        return cancelledRfps;
    }


    /**
     * Sets the cancelledRfps value for this SubscriptionRfpCancellation.
     * 
     * @param cancelledRfps
     */
    public void setCancelledRfps(localhost.MeetingBrokerServices.CancelledRfp[] cancelledRfps) {
        this.cancelledRfps = cancelledRfps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionRfpCancellation)) return false;
        SubscriptionRfpCancellation other = (SubscriptionRfpCancellation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subscriptionId == other.getSubscriptionId() &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.cancelledRfps==null && other.getCancelledRfps()==null) || 
             (this.cancelledRfps!=null &&
              java.util.Arrays.equals(this.cancelledRfps, other.getCancelledRfps())));
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
        _hashCode += getSubscriptionId();
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCancelledRfps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelledRfps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelledRfps(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriptionRfpCancellation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionRfpCancellation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AcknowledgementStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Error"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledRfps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfp"));
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
