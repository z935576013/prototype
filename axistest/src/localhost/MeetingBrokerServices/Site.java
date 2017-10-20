/**
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Site  implements java.io.Serializable {
    private java.lang.Integer siteId;

    private localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier;

    private java.lang.Boolean allowsRedirect;

    private java.lang.String parentType;

    private boolean sendToParent;

    private java.lang.String salesUserEmail;

    private java.lang.String salesUserFirstName;

    private java.lang.String salesUserLastName;

    private java.lang.String parentUserEmail;

    private java.lang.String parentUserFirstName;

    private java.lang.String parentUserLastName;

    private localhost.MeetingBrokerServices.Answer[] answers;

    private java.util.Calendar startDate;

    private java.lang.String comments;

    private java.lang.String secondaryExternalRfpId;

    private java.lang.String salesAndCateringCompanyId;

    private java.lang.String salesAndCateringClientId;

    private java.lang.String salesAndCateringAgentId;

    private java.lang.String salesAndCateringAgencyId;

    private localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType;

    private java.lang.Boolean allowResponseInstructionOverride;

    public Site() {
    }

    public Site(
           java.lang.Integer siteId,
           localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier,
           java.lang.Boolean allowsRedirect,
           java.lang.String parentType,
           boolean sendToParent,
           java.lang.String salesUserEmail,
           java.lang.String salesUserFirstName,
           java.lang.String salesUserLastName,
           java.lang.String parentUserEmail,
           java.lang.String parentUserFirstName,
           java.lang.String parentUserLastName,
           localhost.MeetingBrokerServices.Answer[] answers,
           java.util.Calendar startDate,
           java.lang.String comments,
           java.lang.String secondaryExternalRfpId,
           java.lang.String salesAndCateringCompanyId,
           java.lang.String salesAndCateringClientId,
           java.lang.String salesAndCateringAgentId,
           java.lang.String salesAndCateringAgencyId,
           localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType,
           java.lang.Boolean allowResponseInstructionOverride) {
           this.siteId = siteId;
           this.locationIdentifier = locationIdentifier;
           this.allowsRedirect = allowsRedirect;
           this.parentType = parentType;
           this.sendToParent = sendToParent;
           this.salesUserEmail = salesUserEmail;
           this.salesUserFirstName = salesUserFirstName;
           this.salesUserLastName = salesUserLastName;
           this.parentUserEmail = parentUserEmail;
           this.parentUserFirstName = parentUserFirstName;
           this.parentUserLastName = parentUserLastName;
           this.answers = answers;
           this.startDate = startDate;
           this.comments = comments;
           this.secondaryExternalRfpId = secondaryExternalRfpId;
           this.salesAndCateringCompanyId = salesAndCateringCompanyId;
           this.salesAndCateringClientId = salesAndCateringClientId;
           this.salesAndCateringAgentId = salesAndCateringAgentId;
           this.salesAndCateringAgencyId = salesAndCateringAgencyId;
           this.responseInstructionType = responseInstructionType;
           this.allowResponseInstructionOverride = allowResponseInstructionOverride;
    }


    /**
     * Gets the siteId value for this Site.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Site.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the locationIdentifier value for this Site.
     * 
     * @return locationIdentifier
     */
    public localhost.MeetingBrokerServices.LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }


    /**
     * Sets the locationIdentifier value for this Site.
     * 
     * @param locationIdentifier
     */
    public void setLocationIdentifier(localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }


    /**
     * Gets the allowsRedirect value for this Site.
     * 
     * @return allowsRedirect
     */
    public java.lang.Boolean getAllowsRedirect() {
        return allowsRedirect;
    }


    /**
     * Sets the allowsRedirect value for this Site.
     * 
     * @param allowsRedirect
     */
    public void setAllowsRedirect(java.lang.Boolean allowsRedirect) {
        this.allowsRedirect = allowsRedirect;
    }


    /**
     * Gets the parentType value for this Site.
     * 
     * @return parentType
     */
    public java.lang.String getParentType() {
        return parentType;
    }


    /**
     * Sets the parentType value for this Site.
     * 
     * @param parentType
     */
    public void setParentType(java.lang.String parentType) {
        this.parentType = parentType;
    }


    /**
     * Gets the sendToParent value for this Site.
     * 
     * @return sendToParent
     */
    public boolean isSendToParent() {
        return sendToParent;
    }


    /**
     * Sets the sendToParent value for this Site.
     * 
     * @param sendToParent
     */
    public void setSendToParent(boolean sendToParent) {
        this.sendToParent = sendToParent;
    }


    /**
     * Gets the salesUserEmail value for this Site.
     * 
     * @return salesUserEmail
     */
    public java.lang.String getSalesUserEmail() {
        return salesUserEmail;
    }


    /**
     * Sets the salesUserEmail value for this Site.
     * 
     * @param salesUserEmail
     */
    public void setSalesUserEmail(java.lang.String salesUserEmail) {
        this.salesUserEmail = salesUserEmail;
    }


    /**
     * Gets the salesUserFirstName value for this Site.
     * 
     * @return salesUserFirstName
     */
    public java.lang.String getSalesUserFirstName() {
        return salesUserFirstName;
    }


    /**
     * Sets the salesUserFirstName value for this Site.
     * 
     * @param salesUserFirstName
     */
    public void setSalesUserFirstName(java.lang.String salesUserFirstName) {
        this.salesUserFirstName = salesUserFirstName;
    }


    /**
     * Gets the salesUserLastName value for this Site.
     * 
     * @return salesUserLastName
     */
    public java.lang.String getSalesUserLastName() {
        return salesUserLastName;
    }


    /**
     * Sets the salesUserLastName value for this Site.
     * 
     * @param salesUserLastName
     */
    public void setSalesUserLastName(java.lang.String salesUserLastName) {
        this.salesUserLastName = salesUserLastName;
    }


    /**
     * Gets the parentUserEmail value for this Site.
     * 
     * @return parentUserEmail
     */
    public java.lang.String getParentUserEmail() {
        return parentUserEmail;
    }


    /**
     * Sets the parentUserEmail value for this Site.
     * 
     * @param parentUserEmail
     */
    public void setParentUserEmail(java.lang.String parentUserEmail) {
        this.parentUserEmail = parentUserEmail;
    }


    /**
     * Gets the parentUserFirstName value for this Site.
     * 
     * @return parentUserFirstName
     */
    public java.lang.String getParentUserFirstName() {
        return parentUserFirstName;
    }


    /**
     * Sets the parentUserFirstName value for this Site.
     * 
     * @param parentUserFirstName
     */
    public void setParentUserFirstName(java.lang.String parentUserFirstName) {
        this.parentUserFirstName = parentUserFirstName;
    }


    /**
     * Gets the parentUserLastName value for this Site.
     * 
     * @return parentUserLastName
     */
    public java.lang.String getParentUserLastName() {
        return parentUserLastName;
    }


    /**
     * Sets the parentUserLastName value for this Site.
     * 
     * @param parentUserLastName
     */
    public void setParentUserLastName(java.lang.String parentUserLastName) {
        this.parentUserLastName = parentUserLastName;
    }


    /**
     * Gets the answers value for this Site.
     * 
     * @return answers
     */
    public localhost.MeetingBrokerServices.Answer[] getAnswers() {
        return answers;
    }


    /**
     * Sets the answers value for this Site.
     * 
     * @param answers
     */
    public void setAnswers(localhost.MeetingBrokerServices.Answer[] answers) {
        this.answers = answers;
    }


    /**
     * Gets the startDate value for this Site.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Site.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the comments value for this Site.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Site.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the secondaryExternalRfpId value for this Site.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this Site.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the salesAndCateringCompanyId value for this Site.
     * 
     * @return salesAndCateringCompanyId
     */
    public java.lang.String getSalesAndCateringCompanyId() {
        return salesAndCateringCompanyId;
    }


    /**
     * Sets the salesAndCateringCompanyId value for this Site.
     * 
     * @param salesAndCateringCompanyId
     */
    public void setSalesAndCateringCompanyId(java.lang.String salesAndCateringCompanyId) {
        this.salesAndCateringCompanyId = salesAndCateringCompanyId;
    }


    /**
     * Gets the salesAndCateringClientId value for this Site.
     * 
     * @return salesAndCateringClientId
     */
    public java.lang.String getSalesAndCateringClientId() {
        return salesAndCateringClientId;
    }


    /**
     * Sets the salesAndCateringClientId value for this Site.
     * 
     * @param salesAndCateringClientId
     */
    public void setSalesAndCateringClientId(java.lang.String salesAndCateringClientId) {
        this.salesAndCateringClientId = salesAndCateringClientId;
    }


    /**
     * Gets the salesAndCateringAgentId value for this Site.
     * 
     * @return salesAndCateringAgentId
     */
    public java.lang.String getSalesAndCateringAgentId() {
        return salesAndCateringAgentId;
    }


    /**
     * Sets the salesAndCateringAgentId value for this Site.
     * 
     * @param salesAndCateringAgentId
     */
    public void setSalesAndCateringAgentId(java.lang.String salesAndCateringAgentId) {
        this.salesAndCateringAgentId = salesAndCateringAgentId;
    }


    /**
     * Gets the salesAndCateringAgencyId value for this Site.
     * 
     * @return salesAndCateringAgencyId
     */
    public java.lang.String getSalesAndCateringAgencyId() {
        return salesAndCateringAgencyId;
    }


    /**
     * Sets the salesAndCateringAgencyId value for this Site.
     * 
     * @param salesAndCateringAgencyId
     */
    public void setSalesAndCateringAgencyId(java.lang.String salesAndCateringAgencyId) {
        this.salesAndCateringAgencyId = salesAndCateringAgencyId;
    }


    /**
     * Gets the responseInstructionType value for this Site.
     * 
     * @return responseInstructionType
     */
    public localhost.MeetingBrokerServices.ResponseInstructionType getResponseInstructionType() {
        return responseInstructionType;
    }


    /**
     * Sets the responseInstructionType value for this Site.
     * 
     * @param responseInstructionType
     */
    public void setResponseInstructionType(localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType) {
        this.responseInstructionType = responseInstructionType;
    }


    /**
     * Gets the allowResponseInstructionOverride value for this Site.
     * 
     * @return allowResponseInstructionOverride
     */
    public java.lang.Boolean getAllowResponseInstructionOverride() {
        return allowResponseInstructionOverride;
    }


    /**
     * Sets the allowResponseInstructionOverride value for this Site.
     * 
     * @param allowResponseInstructionOverride
     */
    public void setAllowResponseInstructionOverride(java.lang.Boolean allowResponseInstructionOverride) {
        this.allowResponseInstructionOverride = allowResponseInstructionOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.locationIdentifier==null && other.getLocationIdentifier()==null) || 
             (this.locationIdentifier!=null &&
              this.locationIdentifier.equals(other.getLocationIdentifier()))) &&
            ((this.allowsRedirect==null && other.getAllowsRedirect()==null) || 
             (this.allowsRedirect!=null &&
              this.allowsRedirect.equals(other.getAllowsRedirect()))) &&
            ((this.parentType==null && other.getParentType()==null) || 
             (this.parentType!=null &&
              this.parentType.equals(other.getParentType()))) &&
            this.sendToParent == other.isSendToParent() &&
            ((this.salesUserEmail==null && other.getSalesUserEmail()==null) || 
             (this.salesUserEmail!=null &&
              this.salesUserEmail.equals(other.getSalesUserEmail()))) &&
            ((this.salesUserFirstName==null && other.getSalesUserFirstName()==null) || 
             (this.salesUserFirstName!=null &&
              this.salesUserFirstName.equals(other.getSalesUserFirstName()))) &&
            ((this.salesUserLastName==null && other.getSalesUserLastName()==null) || 
             (this.salesUserLastName!=null &&
              this.salesUserLastName.equals(other.getSalesUserLastName()))) &&
            ((this.parentUserEmail==null && other.getParentUserEmail()==null) || 
             (this.parentUserEmail!=null &&
              this.parentUserEmail.equals(other.getParentUserEmail()))) &&
            ((this.parentUserFirstName==null && other.getParentUserFirstName()==null) || 
             (this.parentUserFirstName!=null &&
              this.parentUserFirstName.equals(other.getParentUserFirstName()))) &&
            ((this.parentUserLastName==null && other.getParentUserLastName()==null) || 
             (this.parentUserLastName!=null &&
              this.parentUserLastName.equals(other.getParentUserLastName()))) &&
            ((this.answers==null && other.getAnswers()==null) || 
             (this.answers!=null &&
              java.util.Arrays.equals(this.answers, other.getAnswers()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            ((this.salesAndCateringCompanyId==null && other.getSalesAndCateringCompanyId()==null) || 
             (this.salesAndCateringCompanyId!=null &&
              this.salesAndCateringCompanyId.equals(other.getSalesAndCateringCompanyId()))) &&
            ((this.salesAndCateringClientId==null && other.getSalesAndCateringClientId()==null) || 
             (this.salesAndCateringClientId!=null &&
              this.salesAndCateringClientId.equals(other.getSalesAndCateringClientId()))) &&
            ((this.salesAndCateringAgentId==null && other.getSalesAndCateringAgentId()==null) || 
             (this.salesAndCateringAgentId!=null &&
              this.salesAndCateringAgentId.equals(other.getSalesAndCateringAgentId()))) &&
            ((this.salesAndCateringAgencyId==null && other.getSalesAndCateringAgencyId()==null) || 
             (this.salesAndCateringAgencyId!=null &&
              this.salesAndCateringAgencyId.equals(other.getSalesAndCateringAgencyId()))) &&
            ((this.responseInstructionType==null && other.getResponseInstructionType()==null) || 
             (this.responseInstructionType!=null &&
              this.responseInstructionType.equals(other.getResponseInstructionType()))) &&
            ((this.allowResponseInstructionOverride==null && other.getAllowResponseInstructionOverride()==null) || 
             (this.allowResponseInstructionOverride!=null &&
              this.allowResponseInstructionOverride.equals(other.getAllowResponseInstructionOverride())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getLocationIdentifier() != null) {
            _hashCode += getLocationIdentifier().hashCode();
        }
        if (getAllowsRedirect() != null) {
            _hashCode += getAllowsRedirect().hashCode();
        }
        if (getParentType() != null) {
            _hashCode += getParentType().hashCode();
        }
        _hashCode += (isSendToParent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSalesUserEmail() != null) {
            _hashCode += getSalesUserEmail().hashCode();
        }
        if (getSalesUserFirstName() != null) {
            _hashCode += getSalesUserFirstName().hashCode();
        }
        if (getSalesUserLastName() != null) {
            _hashCode += getSalesUserLastName().hashCode();
        }
        if (getParentUserEmail() != null) {
            _hashCode += getParentUserEmail().hashCode();
        }
        if (getParentUserFirstName() != null) {
            _hashCode += getParentUserFirstName().hashCode();
        }
        if (getParentUserLastName() != null) {
            _hashCode += getParentUserLastName().hashCode();
        }
        if (getAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        if (getSalesAndCateringCompanyId() != null) {
            _hashCode += getSalesAndCateringCompanyId().hashCode();
        }
        if (getSalesAndCateringClientId() != null) {
            _hashCode += getSalesAndCateringClientId().hashCode();
        }
        if (getSalesAndCateringAgentId() != null) {
            _hashCode += getSalesAndCateringAgentId().hashCode();
        }
        if (getSalesAndCateringAgencyId() != null) {
            _hashCode += getSalesAndCateringAgencyId().hashCode();
        }
        if (getResponseInstructionType() != null) {
            _hashCode += getResponseInstructionType().hashCode();
        }
        if (getAllowResponseInstructionOverride() != null) {
            _hashCode += getAllowResponseInstructionOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowsRedirect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AllowsRedirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ParentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendToParent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendToParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesUserEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesUserEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesUserFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesUserFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesUserLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesUserLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUserEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ParentUserEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUserFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ParentUserFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUserLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ParentUserLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("secondaryExternalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SecondaryExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesAndCateringCompanyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesAndCateringCompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesAndCateringClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesAndCateringClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesAndCateringAgentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesAndCateringAgentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesAndCateringAgencyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesAndCateringAgencyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseInstructionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowResponseInstructionOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AllowResponseInstructionOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
