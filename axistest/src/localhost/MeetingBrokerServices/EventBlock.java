/**
 * EventBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class EventBlock  implements java.io.Serializable {
    private java.util.Calendar startDate;

    private java.util.Calendar alternateStartDate;

    private java.lang.Boolean isAlternateStartDateSelected;

    private java.math.BigDecimal totalEventBudget;

    private java.math.BigDecimal foodCost;

    private java.math.BigDecimal beverageCost;

    private java.math.BigDecimal rentalCost;

    private java.math.BigDecimal resourceCost;

    private java.math.BigDecimal otherCost;

    private java.lang.String comments;

    private localhost.MeetingBrokerServices.EventRequirement[] eventRequirements;

    private localhost.MeetingBrokerServices.EventAvailability[] eventAvailabilities;

    private localhost.MeetingBrokerServices.EventRequirementBusinessData[] eventRequirementBusinessDataCollection;

    private java.math.BigDecimal foodBudget;

    private java.math.BigDecimal beverageBudget;

    private java.math.BigDecimal rentalBudget;

    private java.math.BigDecimal resourceBudget;

    private java.math.BigDecimal otherBudget;

    private localhost.MeetingBrokerServices.SizeUnitOfMeasure sizeUnitOfMeasure;

    public EventBlock() {
    }

    public EventBlock(
           java.util.Calendar startDate,
           java.util.Calendar alternateStartDate,
           java.lang.Boolean isAlternateStartDateSelected,
           java.math.BigDecimal totalEventBudget,
           java.math.BigDecimal foodCost,
           java.math.BigDecimal beverageCost,
           java.math.BigDecimal rentalCost,
           java.math.BigDecimal resourceCost,
           java.math.BigDecimal otherCost,
           java.lang.String comments,
           localhost.MeetingBrokerServices.EventRequirement[] eventRequirements,
           localhost.MeetingBrokerServices.EventAvailability[] eventAvailabilities,
           localhost.MeetingBrokerServices.EventRequirementBusinessData[] eventRequirementBusinessDataCollection,
           java.math.BigDecimal foodBudget,
           java.math.BigDecimal beverageBudget,
           java.math.BigDecimal rentalBudget,
           java.math.BigDecimal resourceBudget,
           java.math.BigDecimal otherBudget,
           localhost.MeetingBrokerServices.SizeUnitOfMeasure sizeUnitOfMeasure) {
           this.startDate = startDate;
           this.alternateStartDate = alternateStartDate;
           this.isAlternateStartDateSelected = isAlternateStartDateSelected;
           this.totalEventBudget = totalEventBudget;
           this.foodCost = foodCost;
           this.beverageCost = beverageCost;
           this.rentalCost = rentalCost;
           this.resourceCost = resourceCost;
           this.otherCost = otherCost;
           this.comments = comments;
           this.eventRequirements = eventRequirements;
           this.eventAvailabilities = eventAvailabilities;
           this.eventRequirementBusinessDataCollection = eventRequirementBusinessDataCollection;
           this.foodBudget = foodBudget;
           this.beverageBudget = beverageBudget;
           this.rentalBudget = rentalBudget;
           this.resourceBudget = resourceBudget;
           this.otherBudget = otherBudget;
           this.sizeUnitOfMeasure = sizeUnitOfMeasure;
    }


    /**
     * Gets the startDate value for this EventBlock.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this EventBlock.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the alternateStartDate value for this EventBlock.
     * 
     * @return alternateStartDate
     */
    public java.util.Calendar getAlternateStartDate() {
        return alternateStartDate;
    }


    /**
     * Sets the alternateStartDate value for this EventBlock.
     * 
     * @param alternateStartDate
     */
    public void setAlternateStartDate(java.util.Calendar alternateStartDate) {
        this.alternateStartDate = alternateStartDate;
    }


    /**
     * Gets the isAlternateStartDateSelected value for this EventBlock.
     * 
     * @return isAlternateStartDateSelected
     */
    public java.lang.Boolean getIsAlternateStartDateSelected() {
        return isAlternateStartDateSelected;
    }


    /**
     * Sets the isAlternateStartDateSelected value for this EventBlock.
     * 
     * @param isAlternateStartDateSelected
     */
    public void setIsAlternateStartDateSelected(java.lang.Boolean isAlternateStartDateSelected) {
        this.isAlternateStartDateSelected = isAlternateStartDateSelected;
    }


    /**
     * Gets the totalEventBudget value for this EventBlock.
     * 
     * @return totalEventBudget
     */
    public java.math.BigDecimal getTotalEventBudget() {
        return totalEventBudget;
    }


    /**
     * Sets the totalEventBudget value for this EventBlock.
     * 
     * @param totalEventBudget
     */
    public void setTotalEventBudget(java.math.BigDecimal totalEventBudget) {
        this.totalEventBudget = totalEventBudget;
    }


    /**
     * Gets the foodCost value for this EventBlock.
     * 
     * @return foodCost
     */
    public java.math.BigDecimal getFoodCost() {
        return foodCost;
    }


    /**
     * Sets the foodCost value for this EventBlock.
     * 
     * @param foodCost
     */
    public void setFoodCost(java.math.BigDecimal foodCost) {
        this.foodCost = foodCost;
    }


    /**
     * Gets the beverageCost value for this EventBlock.
     * 
     * @return beverageCost
     */
    public java.math.BigDecimal getBeverageCost() {
        return beverageCost;
    }


    /**
     * Sets the beverageCost value for this EventBlock.
     * 
     * @param beverageCost
     */
    public void setBeverageCost(java.math.BigDecimal beverageCost) {
        this.beverageCost = beverageCost;
    }


    /**
     * Gets the rentalCost value for this EventBlock.
     * 
     * @return rentalCost
     */
    public java.math.BigDecimal getRentalCost() {
        return rentalCost;
    }


    /**
     * Sets the rentalCost value for this EventBlock.
     * 
     * @param rentalCost
     */
    public void setRentalCost(java.math.BigDecimal rentalCost) {
        this.rentalCost = rentalCost;
    }


    /**
     * Gets the resourceCost value for this EventBlock.
     * 
     * @return resourceCost
     */
    public java.math.BigDecimal getResourceCost() {
        return resourceCost;
    }


    /**
     * Sets the resourceCost value for this EventBlock.
     * 
     * @param resourceCost
     */
    public void setResourceCost(java.math.BigDecimal resourceCost) {
        this.resourceCost = resourceCost;
    }


    /**
     * Gets the otherCost value for this EventBlock.
     * 
     * @return otherCost
     */
    public java.math.BigDecimal getOtherCost() {
        return otherCost;
    }


    /**
     * Sets the otherCost value for this EventBlock.
     * 
     * @param otherCost
     */
    public void setOtherCost(java.math.BigDecimal otherCost) {
        this.otherCost = otherCost;
    }


    /**
     * Gets the comments value for this EventBlock.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EventBlock.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the eventRequirements value for this EventBlock.
     * 
     * @return eventRequirements
     */
    public localhost.MeetingBrokerServices.EventRequirement[] getEventRequirements() {
        return eventRequirements;
    }


    /**
     * Sets the eventRequirements value for this EventBlock.
     * 
     * @param eventRequirements
     */
    public void setEventRequirements(localhost.MeetingBrokerServices.EventRequirement[] eventRequirements) {
        this.eventRequirements = eventRequirements;
    }


    /**
     * Gets the eventAvailabilities value for this EventBlock.
     * 
     * @return eventAvailabilities
     */
    public localhost.MeetingBrokerServices.EventAvailability[] getEventAvailabilities() {
        return eventAvailabilities;
    }


    /**
     * Sets the eventAvailabilities value for this EventBlock.
     * 
     * @param eventAvailabilities
     */
    public void setEventAvailabilities(localhost.MeetingBrokerServices.EventAvailability[] eventAvailabilities) {
        this.eventAvailabilities = eventAvailabilities;
    }


    /**
     * Gets the eventRequirementBusinessDataCollection value for this EventBlock.
     * 
     * @return eventRequirementBusinessDataCollection
     */
    public localhost.MeetingBrokerServices.EventRequirementBusinessData[] getEventRequirementBusinessDataCollection() {
        return eventRequirementBusinessDataCollection;
    }


    /**
     * Sets the eventRequirementBusinessDataCollection value for this EventBlock.
     * 
     * @param eventRequirementBusinessDataCollection
     */
    public void setEventRequirementBusinessDataCollection(localhost.MeetingBrokerServices.EventRequirementBusinessData[] eventRequirementBusinessDataCollection) {
        this.eventRequirementBusinessDataCollection = eventRequirementBusinessDataCollection;
    }


    /**
     * Gets the foodBudget value for this EventBlock.
     * 
     * @return foodBudget
     */
    public java.math.BigDecimal getFoodBudget() {
        return foodBudget;
    }


    /**
     * Sets the foodBudget value for this EventBlock.
     * 
     * @param foodBudget
     */
    public void setFoodBudget(java.math.BigDecimal foodBudget) {
        this.foodBudget = foodBudget;
    }


    /**
     * Gets the beverageBudget value for this EventBlock.
     * 
     * @return beverageBudget
     */
    public java.math.BigDecimal getBeverageBudget() {
        return beverageBudget;
    }


    /**
     * Sets the beverageBudget value for this EventBlock.
     * 
     * @param beverageBudget
     */
    public void setBeverageBudget(java.math.BigDecimal beverageBudget) {
        this.beverageBudget = beverageBudget;
    }


    /**
     * Gets the rentalBudget value for this EventBlock.
     * 
     * @return rentalBudget
     */
    public java.math.BigDecimal getRentalBudget() {
        return rentalBudget;
    }


    /**
     * Sets the rentalBudget value for this EventBlock.
     * 
     * @param rentalBudget
     */
    public void setRentalBudget(java.math.BigDecimal rentalBudget) {
        this.rentalBudget = rentalBudget;
    }


    /**
     * Gets the resourceBudget value for this EventBlock.
     * 
     * @return resourceBudget
     */
    public java.math.BigDecimal getResourceBudget() {
        return resourceBudget;
    }


    /**
     * Sets the resourceBudget value for this EventBlock.
     * 
     * @param resourceBudget
     */
    public void setResourceBudget(java.math.BigDecimal resourceBudget) {
        this.resourceBudget = resourceBudget;
    }


    /**
     * Gets the otherBudget value for this EventBlock.
     * 
     * @return otherBudget
     */
    public java.math.BigDecimal getOtherBudget() {
        return otherBudget;
    }


    /**
     * Sets the otherBudget value for this EventBlock.
     * 
     * @param otherBudget
     */
    public void setOtherBudget(java.math.BigDecimal otherBudget) {
        this.otherBudget = otherBudget;
    }


    /**
     * Gets the sizeUnitOfMeasure value for this EventBlock.
     * 
     * @return sizeUnitOfMeasure
     */
    public localhost.MeetingBrokerServices.SizeUnitOfMeasure getSizeUnitOfMeasure() {
        return sizeUnitOfMeasure;
    }


    /**
     * Sets the sizeUnitOfMeasure value for this EventBlock.
     * 
     * @param sizeUnitOfMeasure
     */
    public void setSizeUnitOfMeasure(localhost.MeetingBrokerServices.SizeUnitOfMeasure sizeUnitOfMeasure) {
        this.sizeUnitOfMeasure = sizeUnitOfMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventBlock)) return false;
        EventBlock other = (EventBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.alternateStartDate==null && other.getAlternateStartDate()==null) || 
             (this.alternateStartDate!=null &&
              this.alternateStartDate.equals(other.getAlternateStartDate()))) &&
            ((this.isAlternateStartDateSelected==null && other.getIsAlternateStartDateSelected()==null) || 
             (this.isAlternateStartDateSelected!=null &&
              this.isAlternateStartDateSelected.equals(other.getIsAlternateStartDateSelected()))) &&
            ((this.totalEventBudget==null && other.getTotalEventBudget()==null) || 
             (this.totalEventBudget!=null &&
              this.totalEventBudget.equals(other.getTotalEventBudget()))) &&
            ((this.foodCost==null && other.getFoodCost()==null) || 
             (this.foodCost!=null &&
              this.foodCost.equals(other.getFoodCost()))) &&
            ((this.beverageCost==null && other.getBeverageCost()==null) || 
             (this.beverageCost!=null &&
              this.beverageCost.equals(other.getBeverageCost()))) &&
            ((this.rentalCost==null && other.getRentalCost()==null) || 
             (this.rentalCost!=null &&
              this.rentalCost.equals(other.getRentalCost()))) &&
            ((this.resourceCost==null && other.getResourceCost()==null) || 
             (this.resourceCost!=null &&
              this.resourceCost.equals(other.getResourceCost()))) &&
            ((this.otherCost==null && other.getOtherCost()==null) || 
             (this.otherCost!=null &&
              this.otherCost.equals(other.getOtherCost()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.eventRequirements==null && other.getEventRequirements()==null) || 
             (this.eventRequirements!=null &&
              java.util.Arrays.equals(this.eventRequirements, other.getEventRequirements()))) &&
            ((this.eventAvailabilities==null && other.getEventAvailabilities()==null) || 
             (this.eventAvailabilities!=null &&
              java.util.Arrays.equals(this.eventAvailabilities, other.getEventAvailabilities()))) &&
            ((this.eventRequirementBusinessDataCollection==null && other.getEventRequirementBusinessDataCollection()==null) || 
             (this.eventRequirementBusinessDataCollection!=null &&
              java.util.Arrays.equals(this.eventRequirementBusinessDataCollection, other.getEventRequirementBusinessDataCollection()))) &&
            ((this.foodBudget==null && other.getFoodBudget()==null) || 
             (this.foodBudget!=null &&
              this.foodBudget.equals(other.getFoodBudget()))) &&
            ((this.beverageBudget==null && other.getBeverageBudget()==null) || 
             (this.beverageBudget!=null &&
              this.beverageBudget.equals(other.getBeverageBudget()))) &&
            ((this.rentalBudget==null && other.getRentalBudget()==null) || 
             (this.rentalBudget!=null &&
              this.rentalBudget.equals(other.getRentalBudget()))) &&
            ((this.resourceBudget==null && other.getResourceBudget()==null) || 
             (this.resourceBudget!=null &&
              this.resourceBudget.equals(other.getResourceBudget()))) &&
            ((this.otherBudget==null && other.getOtherBudget()==null) || 
             (this.otherBudget!=null &&
              this.otherBudget.equals(other.getOtherBudget()))) &&
            ((this.sizeUnitOfMeasure==null && other.getSizeUnitOfMeasure()==null) || 
             (this.sizeUnitOfMeasure!=null &&
              this.sizeUnitOfMeasure.equals(other.getSizeUnitOfMeasure())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getAlternateStartDate() != null) {
            _hashCode += getAlternateStartDate().hashCode();
        }
        if (getIsAlternateStartDateSelected() != null) {
            _hashCode += getIsAlternateStartDateSelected().hashCode();
        }
        if (getTotalEventBudget() != null) {
            _hashCode += getTotalEventBudget().hashCode();
        }
        if (getFoodCost() != null) {
            _hashCode += getFoodCost().hashCode();
        }
        if (getBeverageCost() != null) {
            _hashCode += getBeverageCost().hashCode();
        }
        if (getRentalCost() != null) {
            _hashCode += getRentalCost().hashCode();
        }
        if (getResourceCost() != null) {
            _hashCode += getResourceCost().hashCode();
        }
        if (getOtherCost() != null) {
            _hashCode += getOtherCost().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getEventRequirements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventRequirements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventRequirements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventAvailabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventAvailabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventAvailabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventRequirementBusinessDataCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventRequirementBusinessDataCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventRequirementBusinessDataCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFoodBudget() != null) {
            _hashCode += getFoodBudget().hashCode();
        }
        if (getBeverageBudget() != null) {
            _hashCode += getBeverageBudget().hashCode();
        }
        if (getRentalBudget() != null) {
            _hashCode += getRentalBudget().hashCode();
        }
        if (getResourceBudget() != null) {
            _hashCode += getResourceBudget().hashCode();
        }
        if (getOtherBudget() != null) {
            _hashCode += getOtherBudget().hashCode();
        }
        if (getSizeUnitOfMeasure() != null) {
            _hashCode += getSizeUnitOfMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AlternateStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAlternateStartDateSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsAlternateStartDateSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEventBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TotalEventBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FoodCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BeverageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RentalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResourceCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("eventRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventAvailabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRequirementBusinessDataCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessDataCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FoodBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beverageBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BeverageBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RentalBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResourceBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeUnitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SizeUnitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SizeUnitOfMeasure"));
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
