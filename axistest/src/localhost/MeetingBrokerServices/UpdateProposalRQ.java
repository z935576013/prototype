/**
 * UpdateProposalRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class UpdateProposalRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.Proposal proposal;

    public UpdateProposalRQ() {
    }

    public UpdateProposalRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.Proposal proposal) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.proposal = proposal;
    }


    /**
     * Gets the proposal value for this UpdateProposalRQ.
     * 
     * @return proposal
     */
    public localhost.MeetingBrokerServices.Proposal getProposal() {
        return proposal;
    }


    /**
     * Sets the proposal value for this UpdateProposalRQ.
     * 
     * @param proposal
     */
    public void setProposal(localhost.MeetingBrokerServices.Proposal proposal) {
        this.proposal = proposal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateProposalRQ)) return false;
        UpdateProposalRQ other = (UpdateProposalRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.proposal==null && other.getProposal()==null) || 
             (this.proposal!=null &&
              this.proposal.equals(other.getProposal())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProposal() != null) {
            _hashCode += getProposal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateProposalRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateProposalRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Proposal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Proposal"));
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
