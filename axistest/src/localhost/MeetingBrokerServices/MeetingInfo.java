/**
 * MeetingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class MeetingInfo  implements java.io.Serializable {
    private java.lang.String meetingName;

    private java.lang.String referenceNumber;

    private java.math.BigDecimal totalBudget;

    private java.util.Calendar startDate;

    private java.util.Calendar alternateStartDate1;

    private java.lang.String alternateStartDate1Comments;

    private java.util.Calendar alternateStartDate2;

    private java.lang.String alternateStartDate2Comments;

    private java.lang.Integer attendeeQuantity;

    private java.util.Calendar respondByDate;

    private java.lang.String responseInstructions;

    private java.lang.String generalComments;

    private java.lang.String destinationComments;

    private java.lang.String meetingHistoryComments;

    private java.lang.String meetingSeriesName;

    private java.lang.Integer numberOfEvents;

    private java.lang.Integer numberOfNights;

    private java.lang.String externalMeetingType;

    private java.lang.String externalCurrency;

    private java.lang.String externalLeadSource;

    private java.lang.String externalMarketSegment;

    private java.lang.Boolean isAgencyPrimaryContact;

    private java.lang.Integer peakRooms;

    private java.lang.Integer numberOfAttendeesAtLargestEvent;

    private java.math.BigDecimal commission;

    private java.lang.Boolean isCommissionable;

    private localhost.MeetingBrokerServices.Profile agencyProfile;

    private localhost.MeetingBrokerServices.Profile companyProfile;

    private java.lang.String promotionalCode;

    public MeetingInfo() {
    }

    public MeetingInfo(
           java.lang.String meetingName,
           java.lang.String referenceNumber,
           java.math.BigDecimal totalBudget,
           java.util.Calendar startDate,
           java.util.Calendar alternateStartDate1,
           java.lang.String alternateStartDate1Comments,
           java.util.Calendar alternateStartDate2,
           java.lang.String alternateStartDate2Comments,
           java.lang.Integer attendeeQuantity,
           java.util.Calendar respondByDate,
           java.lang.String responseInstructions,
           java.lang.String generalComments,
           java.lang.String destinationComments,
           java.lang.String meetingHistoryComments,
           java.lang.String meetingSeriesName,
           java.lang.Integer numberOfEvents,
           java.lang.Integer numberOfNights,
           java.lang.String externalMeetingType,
           java.lang.String externalCurrency,
           java.lang.String externalLeadSource,
           java.lang.String externalMarketSegment,
           java.lang.Boolean isAgencyPrimaryContact,
           java.lang.Integer peakRooms,
           java.lang.Integer numberOfAttendeesAtLargestEvent,
           java.math.BigDecimal commission,
           java.lang.Boolean isCommissionable,
           localhost.MeetingBrokerServices.Profile agencyProfile,
           localhost.MeetingBrokerServices.Profile companyProfile,
           java.lang.String promotionalCode) {
           this.meetingName = meetingName;
           this.referenceNumber = referenceNumber;
           this.totalBudget = totalBudget;
           this.startDate = startDate;
           this.alternateStartDate1 = alternateStartDate1;
           this.alternateStartDate1Comments = alternateStartDate1Comments;
           this.alternateStartDate2 = alternateStartDate2;
           this.alternateStartDate2Comments = alternateStartDate2Comments;
           this.attendeeQuantity = attendeeQuantity;
           this.respondByDate = respondByDate;
           this.responseInstructions = responseInstructions;
           this.generalComments = generalComments;
           this.destinationComments = destinationComments;
           this.meetingHistoryComments = meetingHistoryComments;
           this.meetingSeriesName = meetingSeriesName;
           this.numberOfEvents = numberOfEvents;
           this.numberOfNights = numberOfNights;
           this.externalMeetingType = externalMeetingType;
           this.externalCurrency = externalCurrency;
           this.externalLeadSource = externalLeadSource;
           this.externalMarketSegment = externalMarketSegment;
           this.isAgencyPrimaryContact = isAgencyPrimaryContact;
           this.peakRooms = peakRooms;
           this.numberOfAttendeesAtLargestEvent = numberOfAttendeesAtLargestEvent;
           this.commission = commission;
           this.isCommissionable = isCommissionable;
           this.agencyProfile = agencyProfile;
           this.companyProfile = companyProfile;
           this.promotionalCode = promotionalCode;
    }


    /**
     * Gets the meetingName value for this MeetingInfo.
     * 
     * @return meetingName
     */
    public java.lang.String getMeetingName() {
        return meetingName;
    }


    /**
     * Sets the meetingName value for this MeetingInfo.
     * 
     * @param meetingName
     */
    public void setMeetingName(java.lang.String meetingName) {
        this.meetingName = meetingName;
    }


    /**
     * Gets the referenceNumber value for this MeetingInfo.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this MeetingInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the totalBudget value for this MeetingInfo.
     * 
     * @return totalBudget
     */
    public java.math.BigDecimal getTotalBudget() {
        return totalBudget;
    }


    /**
     * Sets the totalBudget value for this MeetingInfo.
     * 
     * @param totalBudget
     */
    public void setTotalBudget(java.math.BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }


    /**
     * Gets the startDate value for this MeetingInfo.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this MeetingInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the alternateStartDate1 value for this MeetingInfo.
     * 
     * @return alternateStartDate1
     */
    public java.util.Calendar getAlternateStartDate1() {
        return alternateStartDate1;
    }


    /**
     * Sets the alternateStartDate1 value for this MeetingInfo.
     * 
     * @param alternateStartDate1
     */
    public void setAlternateStartDate1(java.util.Calendar alternateStartDate1) {
        this.alternateStartDate1 = alternateStartDate1;
    }


    /**
     * Gets the alternateStartDate1Comments value for this MeetingInfo.
     * 
     * @return alternateStartDate1Comments
     */
    public java.lang.String getAlternateStartDate1Comments() {
        return alternateStartDate1Comments;
    }


    /**
     * Sets the alternateStartDate1Comments value for this MeetingInfo.
     * 
     * @param alternateStartDate1Comments
     */
    public void setAlternateStartDate1Comments(java.lang.String alternateStartDate1Comments) {
        this.alternateStartDate1Comments = alternateStartDate1Comments;
    }


    /**
     * Gets the alternateStartDate2 value for this MeetingInfo.
     * 
     * @return alternateStartDate2
     */
    public java.util.Calendar getAlternateStartDate2() {
        return alternateStartDate2;
    }


    /**
     * Sets the alternateStartDate2 value for this MeetingInfo.
     * 
     * @param alternateStartDate2
     */
    public void setAlternateStartDate2(java.util.Calendar alternateStartDate2) {
        this.alternateStartDate2 = alternateStartDate2;
    }


    /**
     * Gets the alternateStartDate2Comments value for this MeetingInfo.
     * 
     * @return alternateStartDate2Comments
     */
    public java.lang.String getAlternateStartDate2Comments() {
        return alternateStartDate2Comments;
    }


    /**
     * Sets the alternateStartDate2Comments value for this MeetingInfo.
     * 
     * @param alternateStartDate2Comments
     */
    public void setAlternateStartDate2Comments(java.lang.String alternateStartDate2Comments) {
        this.alternateStartDate2Comments = alternateStartDate2Comments;
    }


    /**
     * Gets the attendeeQuantity value for this MeetingInfo.
     * 
     * @return attendeeQuantity
     */
    public java.lang.Integer getAttendeeQuantity() {
        return attendeeQuantity;
    }


    /**
     * Sets the attendeeQuantity value for this MeetingInfo.
     * 
     * @param attendeeQuantity
     */
    public void setAttendeeQuantity(java.lang.Integer attendeeQuantity) {
        this.attendeeQuantity = attendeeQuantity;
    }


    /**
     * Gets the respondByDate value for this MeetingInfo.
     * 
     * @return respondByDate
     */
    public java.util.Calendar getRespondByDate() {
        return respondByDate;
    }


    /**
     * Sets the respondByDate value for this MeetingInfo.
     * 
     * @param respondByDate
     */
    public void setRespondByDate(java.util.Calendar respondByDate) {
        this.respondByDate = respondByDate;
    }


    /**
     * Gets the responseInstructions value for this MeetingInfo.
     * 
     * @return responseInstructions
     */
    public java.lang.String getResponseInstructions() {
        return responseInstructions;
    }


    /**
     * Sets the responseInstructions value for this MeetingInfo.
     * 
     * @param responseInstructions
     */
    public void setResponseInstructions(java.lang.String responseInstructions) {
        this.responseInstructions = responseInstructions;
    }


    /**
     * Gets the generalComments value for this MeetingInfo.
     * 
     * @return generalComments
     */
    public java.lang.String getGeneralComments() {
        return generalComments;
    }


    /**
     * Sets the generalComments value for this MeetingInfo.
     * 
     * @param generalComments
     */
    public void setGeneralComments(java.lang.String generalComments) {
        this.generalComments = generalComments;
    }


    /**
     * Gets the destinationComments value for this MeetingInfo.
     * 
     * @return destinationComments
     */
    public java.lang.String getDestinationComments() {
        return destinationComments;
    }


    /**
     * Sets the destinationComments value for this MeetingInfo.
     * 
     * @param destinationComments
     */
    public void setDestinationComments(java.lang.String destinationComments) {
        this.destinationComments = destinationComments;
    }


    /**
     * Gets the meetingHistoryComments value for this MeetingInfo.
     * 
     * @return meetingHistoryComments
     */
    public java.lang.String getMeetingHistoryComments() {
        return meetingHistoryComments;
    }


    /**
     * Sets the meetingHistoryComments value for this MeetingInfo.
     * 
     * @param meetingHistoryComments
     */
    public void setMeetingHistoryComments(java.lang.String meetingHistoryComments) {
        this.meetingHistoryComments = meetingHistoryComments;
    }


    /**
     * Gets the meetingSeriesName value for this MeetingInfo.
     * 
     * @return meetingSeriesName
     */
    public java.lang.String getMeetingSeriesName() {
        return meetingSeriesName;
    }


    /**
     * Sets the meetingSeriesName value for this MeetingInfo.
     * 
     * @param meetingSeriesName
     */
    public void setMeetingSeriesName(java.lang.String meetingSeriesName) {
        this.meetingSeriesName = meetingSeriesName;
    }


    /**
     * Gets the numberOfEvents value for this MeetingInfo.
     * 
     * @return numberOfEvents
     */
    public java.lang.Integer getNumberOfEvents() {
        return numberOfEvents;
    }


    /**
     * Sets the numberOfEvents value for this MeetingInfo.
     * 
     * @param numberOfEvents
     */
    public void setNumberOfEvents(java.lang.Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }


    /**
     * Gets the numberOfNights value for this MeetingInfo.
     * 
     * @return numberOfNights
     */
    public java.lang.Integer getNumberOfNights() {
        return numberOfNights;
    }


    /**
     * Sets the numberOfNights value for this MeetingInfo.
     * 
     * @param numberOfNights
     */
    public void setNumberOfNights(java.lang.Integer numberOfNights) {
        this.numberOfNights = numberOfNights;
    }


    /**
     * Gets the externalMeetingType value for this MeetingInfo.
     * 
     * @return externalMeetingType
     */
    public java.lang.String getExternalMeetingType() {
        return externalMeetingType;
    }


    /**
     * Sets the externalMeetingType value for this MeetingInfo.
     * 
     * @param externalMeetingType
     */
    public void setExternalMeetingType(java.lang.String externalMeetingType) {
        this.externalMeetingType = externalMeetingType;
    }


    /**
     * Gets the externalCurrency value for this MeetingInfo.
     * 
     * @return externalCurrency
     */
    public java.lang.String getExternalCurrency() {
        return externalCurrency;
    }


    /**
     * Sets the externalCurrency value for this MeetingInfo.
     * 
     * @param externalCurrency
     */
    public void setExternalCurrency(java.lang.String externalCurrency) {
        this.externalCurrency = externalCurrency;
    }


    /**
     * Gets the externalLeadSource value for this MeetingInfo.
     * 
     * @return externalLeadSource
     */
    public java.lang.String getExternalLeadSource() {
        return externalLeadSource;
    }


    /**
     * Sets the externalLeadSource value for this MeetingInfo.
     * 
     * @param externalLeadSource
     */
    public void setExternalLeadSource(java.lang.String externalLeadSource) {
        this.externalLeadSource = externalLeadSource;
    }


    /**
     * Gets the externalMarketSegment value for this MeetingInfo.
     * 
     * @return externalMarketSegment
     */
    public java.lang.String getExternalMarketSegment() {
        return externalMarketSegment;
    }


    /**
     * Sets the externalMarketSegment value for this MeetingInfo.
     * 
     * @param externalMarketSegment
     */
    public void setExternalMarketSegment(java.lang.String externalMarketSegment) {
        this.externalMarketSegment = externalMarketSegment;
    }


    /**
     * Gets the isAgencyPrimaryContact value for this MeetingInfo.
     * 
     * @return isAgencyPrimaryContact
     */
    public java.lang.Boolean getIsAgencyPrimaryContact() {
        return isAgencyPrimaryContact;
    }


    /**
     * Sets the isAgencyPrimaryContact value for this MeetingInfo.
     * 
     * @param isAgencyPrimaryContact
     */
    public void setIsAgencyPrimaryContact(java.lang.Boolean isAgencyPrimaryContact) {
        this.isAgencyPrimaryContact = isAgencyPrimaryContact;
    }


    /**
     * Gets the peakRooms value for this MeetingInfo.
     * 
     * @return peakRooms
     */
    public java.lang.Integer getPeakRooms() {
        return peakRooms;
    }


    /**
     * Sets the peakRooms value for this MeetingInfo.
     * 
     * @param peakRooms
     */
    public void setPeakRooms(java.lang.Integer peakRooms) {
        this.peakRooms = peakRooms;
    }


    /**
     * Gets the numberOfAttendeesAtLargestEvent value for this MeetingInfo.
     * 
     * @return numberOfAttendeesAtLargestEvent
     */
    public java.lang.Integer getNumberOfAttendeesAtLargestEvent() {
        return numberOfAttendeesAtLargestEvent;
    }


    /**
     * Sets the numberOfAttendeesAtLargestEvent value for this MeetingInfo.
     * 
     * @param numberOfAttendeesAtLargestEvent
     */
    public void setNumberOfAttendeesAtLargestEvent(java.lang.Integer numberOfAttendeesAtLargestEvent) {
        this.numberOfAttendeesAtLargestEvent = numberOfAttendeesAtLargestEvent;
    }


    /**
     * Gets the commission value for this MeetingInfo.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this MeetingInfo.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the isCommissionable value for this MeetingInfo.
     * 
     * @return isCommissionable
     */
    public java.lang.Boolean getIsCommissionable() {
        return isCommissionable;
    }


    /**
     * Sets the isCommissionable value for this MeetingInfo.
     * 
     * @param isCommissionable
     */
    public void setIsCommissionable(java.lang.Boolean isCommissionable) {
        this.isCommissionable = isCommissionable;
    }


    /**
     * Gets the agencyProfile value for this MeetingInfo.
     * 
     * @return agencyProfile
     */
    public localhost.MeetingBrokerServices.Profile getAgencyProfile() {
        return agencyProfile;
    }


    /**
     * Sets the agencyProfile value for this MeetingInfo.
     * 
     * @param agencyProfile
     */
    public void setAgencyProfile(localhost.MeetingBrokerServices.Profile agencyProfile) {
        this.agencyProfile = agencyProfile;
    }


    /**
     * Gets the companyProfile value for this MeetingInfo.
     * 
     * @return companyProfile
     */
    public localhost.MeetingBrokerServices.Profile getCompanyProfile() {
        return companyProfile;
    }


    /**
     * Sets the companyProfile value for this MeetingInfo.
     * 
     * @param companyProfile
     */
    public void setCompanyProfile(localhost.MeetingBrokerServices.Profile companyProfile) {
        this.companyProfile = companyProfile;
    }


    /**
     * Gets the promotionalCode value for this MeetingInfo.
     * 
     * @return promotionalCode
     */
    public java.lang.String getPromotionalCode() {
        return promotionalCode;
    }


    /**
     * Sets the promotionalCode value for this MeetingInfo.
     * 
     * @param promotionalCode
     */
    public void setPromotionalCode(java.lang.String promotionalCode) {
        this.promotionalCode = promotionalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeetingInfo)) return false;
        MeetingInfo other = (MeetingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.meetingName==null && other.getMeetingName()==null) || 
             (this.meetingName!=null &&
              this.meetingName.equals(other.getMeetingName()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.totalBudget==null && other.getTotalBudget()==null) || 
             (this.totalBudget!=null &&
              this.totalBudget.equals(other.getTotalBudget()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.alternateStartDate1==null && other.getAlternateStartDate1()==null) || 
             (this.alternateStartDate1!=null &&
              this.alternateStartDate1.equals(other.getAlternateStartDate1()))) &&
            ((this.alternateStartDate1Comments==null && other.getAlternateStartDate1Comments()==null) || 
             (this.alternateStartDate1Comments!=null &&
              this.alternateStartDate1Comments.equals(other.getAlternateStartDate1Comments()))) &&
            ((this.alternateStartDate2==null && other.getAlternateStartDate2()==null) || 
             (this.alternateStartDate2!=null &&
              this.alternateStartDate2.equals(other.getAlternateStartDate2()))) &&
            ((this.alternateStartDate2Comments==null && other.getAlternateStartDate2Comments()==null) || 
             (this.alternateStartDate2Comments!=null &&
              this.alternateStartDate2Comments.equals(other.getAlternateStartDate2Comments()))) &&
            ((this.attendeeQuantity==null && other.getAttendeeQuantity()==null) || 
             (this.attendeeQuantity!=null &&
              this.attendeeQuantity.equals(other.getAttendeeQuantity()))) &&
            ((this.respondByDate==null && other.getRespondByDate()==null) || 
             (this.respondByDate!=null &&
              this.respondByDate.equals(other.getRespondByDate()))) &&
            ((this.responseInstructions==null && other.getResponseInstructions()==null) || 
             (this.responseInstructions!=null &&
              this.responseInstructions.equals(other.getResponseInstructions()))) &&
            ((this.generalComments==null && other.getGeneralComments()==null) || 
             (this.generalComments!=null &&
              this.generalComments.equals(other.getGeneralComments()))) &&
            ((this.destinationComments==null && other.getDestinationComments()==null) || 
             (this.destinationComments!=null &&
              this.destinationComments.equals(other.getDestinationComments()))) &&
            ((this.meetingHistoryComments==null && other.getMeetingHistoryComments()==null) || 
             (this.meetingHistoryComments!=null &&
              this.meetingHistoryComments.equals(other.getMeetingHistoryComments()))) &&
            ((this.meetingSeriesName==null && other.getMeetingSeriesName()==null) || 
             (this.meetingSeriesName!=null &&
              this.meetingSeriesName.equals(other.getMeetingSeriesName()))) &&
            ((this.numberOfEvents==null && other.getNumberOfEvents()==null) || 
             (this.numberOfEvents!=null &&
              this.numberOfEvents.equals(other.getNumberOfEvents()))) &&
            ((this.numberOfNights==null && other.getNumberOfNights()==null) || 
             (this.numberOfNights!=null &&
              this.numberOfNights.equals(other.getNumberOfNights()))) &&
            ((this.externalMeetingType==null && other.getExternalMeetingType()==null) || 
             (this.externalMeetingType!=null &&
              this.externalMeetingType.equals(other.getExternalMeetingType()))) &&
            ((this.externalCurrency==null && other.getExternalCurrency()==null) || 
             (this.externalCurrency!=null &&
              this.externalCurrency.equals(other.getExternalCurrency()))) &&
            ((this.externalLeadSource==null && other.getExternalLeadSource()==null) || 
             (this.externalLeadSource!=null &&
              this.externalLeadSource.equals(other.getExternalLeadSource()))) &&
            ((this.externalMarketSegment==null && other.getExternalMarketSegment()==null) || 
             (this.externalMarketSegment!=null &&
              this.externalMarketSegment.equals(other.getExternalMarketSegment()))) &&
            ((this.isAgencyPrimaryContact==null && other.getIsAgencyPrimaryContact()==null) || 
             (this.isAgencyPrimaryContact!=null &&
              this.isAgencyPrimaryContact.equals(other.getIsAgencyPrimaryContact()))) &&
            ((this.peakRooms==null && other.getPeakRooms()==null) || 
             (this.peakRooms!=null &&
              this.peakRooms.equals(other.getPeakRooms()))) &&
            ((this.numberOfAttendeesAtLargestEvent==null && other.getNumberOfAttendeesAtLargestEvent()==null) || 
             (this.numberOfAttendeesAtLargestEvent!=null &&
              this.numberOfAttendeesAtLargestEvent.equals(other.getNumberOfAttendeesAtLargestEvent()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.isCommissionable==null && other.getIsCommissionable()==null) || 
             (this.isCommissionable!=null &&
              this.isCommissionable.equals(other.getIsCommissionable()))) &&
            ((this.agencyProfile==null && other.getAgencyProfile()==null) || 
             (this.agencyProfile!=null &&
              this.agencyProfile.equals(other.getAgencyProfile()))) &&
            ((this.companyProfile==null && other.getCompanyProfile()==null) || 
             (this.companyProfile!=null &&
              this.companyProfile.equals(other.getCompanyProfile()))) &&
            ((this.promotionalCode==null && other.getPromotionalCode()==null) || 
             (this.promotionalCode!=null &&
              this.promotionalCode.equals(other.getPromotionalCode())));
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
        if (getMeetingName() != null) {
            _hashCode += getMeetingName().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getTotalBudget() != null) {
            _hashCode += getTotalBudget().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getAlternateStartDate1() != null) {
            _hashCode += getAlternateStartDate1().hashCode();
        }
        if (getAlternateStartDate1Comments() != null) {
            _hashCode += getAlternateStartDate1Comments().hashCode();
        }
        if (getAlternateStartDate2() != null) {
            _hashCode += getAlternateStartDate2().hashCode();
        }
        if (getAlternateStartDate2Comments() != null) {
            _hashCode += getAlternateStartDate2Comments().hashCode();
        }
        if (getAttendeeQuantity() != null) {
            _hashCode += getAttendeeQuantity().hashCode();
        }
        if (getRespondByDate() != null) {
            _hashCode += getRespondByDate().hashCode();
        }
        if (getResponseInstructions() != null) {
            _hashCode += getResponseInstructions().hashCode();
        }
        if (getGeneralComments() != null) {
            _hashCode += getGeneralComments().hashCode();
        }
        if (getDestinationComments() != null) {
            _hashCode += getDestinationComments().hashCode();
        }
        if (getMeetingHistoryComments() != null) {
            _hashCode += getMeetingHistoryComments().hashCode();
        }
        if (getMeetingSeriesName() != null) {
            _hashCode += getMeetingSeriesName().hashCode();
        }
        if (getNumberOfEvents() != null) {
            _hashCode += getNumberOfEvents().hashCode();
        }
        if (getNumberOfNights() != null) {
            _hashCode += getNumberOfNights().hashCode();
        }
        if (getExternalMeetingType() != null) {
            _hashCode += getExternalMeetingType().hashCode();
        }
        if (getExternalCurrency() != null) {
            _hashCode += getExternalCurrency().hashCode();
        }
        if (getExternalLeadSource() != null) {
            _hashCode += getExternalLeadSource().hashCode();
        }
        if (getExternalMarketSegment() != null) {
            _hashCode += getExternalMarketSegment().hashCode();
        }
        if (getIsAgencyPrimaryContact() != null) {
            _hashCode += getIsAgencyPrimaryContact().hashCode();
        }
        if (getPeakRooms() != null) {
            _hashCode += getPeakRooms().hashCode();
        }
        if (getNumberOfAttendeesAtLargestEvent() != null) {
            _hashCode += getNumberOfAttendeesAtLargestEvent().hashCode();
        }
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getIsCommissionable() != null) {
            _hashCode += getIsCommissionable().hashCode();
        }
        if (getAgencyProfile() != null) {
            _hashCode += getAgencyProfile().hashCode();
        }
        if (getCompanyProfile() != null) {
            _hashCode += getCompanyProfile().hashCode();
        }
        if (getPromotionalCode() != null) {
            _hashCode += getPromotionalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeetingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TotalBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate1Comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate1Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate2Comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate2Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendeeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AttendeeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RespondByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GeneralComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DestinationComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingHistoryComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingHistoryComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingSeriesName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingSeriesName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NumberOfEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfNights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NumberOfNights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalMeetingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalMeetingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLeadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalMarketSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalMarketSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAgencyPrimaryContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsAgencyPrimaryContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peakRooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PeakRooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfAttendeesAtLargestEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NumberOfAttendeesAtLargestEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommissionable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsCommissionable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AgencyProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CompanyProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PromotionalCode"));
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
