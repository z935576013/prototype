/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Location  implements java.io.Serializable {
    private int subscriptionId;

    private java.lang.String isActive;

    private java.lang.String name;

    private localhost.MeetingBrokerServices.LocationTypes locationType;

    private java.lang.String referenceNumber;

    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String addressLine3;

    private java.lang.String city;

    private java.lang.String stateProvince;

    private java.lang.String postalCode;

    private java.lang.String countryCode;

    private java.lang.String phoneNumber;

    private java.lang.String phoneExtension;

    private java.lang.String faxNumber;

    private java.lang.String comments;

    private java.lang.String managementCompany;

    private java.lang.String brand;

    private java.lang.String GMTOffset;

    private int peakSleepingRooms;

    private java.lang.Integer totalAttendees;

    private java.lang.Integer largestFunctionRoom;

    private java.lang.String currencyCode;

    private java.lang.Integer driveToAirport;

    private java.lang.String taxRate;

    private java.lang.String newMarketProduct;

    private java.lang.String newMarketProductVersion;

    private localhost.MeetingBrokerServices.Holiday[] holidays;

    private localhost.MeetingBrokerServices.LocationAttribute[] locationAttributes;

    private localhost.MeetingBrokerServices.HoursOfOperation[] hoursOfOperationCollection;

    private localhost.MeetingBrokerServices.LocationUser[] locationUsers;

    public Location() {
    }

    public Location(
           int subscriptionId,
           java.lang.String isActive,
           java.lang.String name,
           localhost.MeetingBrokerServices.LocationTypes locationType,
           java.lang.String referenceNumber,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String addressLine3,
           java.lang.String city,
           java.lang.String stateProvince,
           java.lang.String postalCode,
           java.lang.String countryCode,
           java.lang.String phoneNumber,
           java.lang.String phoneExtension,
           java.lang.String faxNumber,
           java.lang.String comments,
           java.lang.String managementCompany,
           java.lang.String brand,
           java.lang.String GMTOffset,
           int peakSleepingRooms,
           java.lang.Integer totalAttendees,
           java.lang.Integer largestFunctionRoom,
           java.lang.String currencyCode,
           java.lang.Integer driveToAirport,
           java.lang.String taxRate,
           java.lang.String newMarketProduct,
           java.lang.String newMarketProductVersion,
           localhost.MeetingBrokerServices.Holiday[] holidays,
           localhost.MeetingBrokerServices.LocationAttribute[] locationAttributes,
           localhost.MeetingBrokerServices.HoursOfOperation[] hoursOfOperationCollection,
           localhost.MeetingBrokerServices.LocationUser[] locationUsers) {
           this.subscriptionId = subscriptionId;
           this.isActive = isActive;
           this.name = name;
           this.locationType = locationType;
           this.referenceNumber = referenceNumber;
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.addressLine3 = addressLine3;
           this.city = city;
           this.stateProvince = stateProvince;
           this.postalCode = postalCode;
           this.countryCode = countryCode;
           this.phoneNumber = phoneNumber;
           this.phoneExtension = phoneExtension;
           this.faxNumber = faxNumber;
           this.comments = comments;
           this.managementCompany = managementCompany;
           this.brand = brand;
           this.GMTOffset = GMTOffset;
           this.peakSleepingRooms = peakSleepingRooms;
           this.totalAttendees = totalAttendees;
           this.largestFunctionRoom = largestFunctionRoom;
           this.currencyCode = currencyCode;
           this.driveToAirport = driveToAirport;
           this.taxRate = taxRate;
           this.newMarketProduct = newMarketProduct;
           this.newMarketProductVersion = newMarketProductVersion;
           this.holidays = holidays;
           this.locationAttributes = locationAttributes;
           this.hoursOfOperationCollection = hoursOfOperationCollection;
           this.locationUsers = locationUsers;
    }


    /**
     * Gets the subscriptionId value for this Location.
     * 
     * @return subscriptionId
     */
    public int getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this Location.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the isActive value for this Location.
     * 
     * @return isActive
     */
    public java.lang.String getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Location.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.String isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the name value for this Location.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Location.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the locationType value for this Location.
     * 
     * @return locationType
     */
    public localhost.MeetingBrokerServices.LocationTypes getLocationType() {
        return locationType;
    }


    /**
     * Sets the locationType value for this Location.
     * 
     * @param locationType
     */
    public void setLocationType(localhost.MeetingBrokerServices.LocationTypes locationType) {
        this.locationType = locationType;
    }


    /**
     * Gets the referenceNumber value for this Location.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this Location.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the addressLine1 value for this Location.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this Location.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this Location.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this Location.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the addressLine3 value for this Location.
     * 
     * @return addressLine3
     */
    public java.lang.String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Sets the addressLine3 value for this Location.
     * 
     * @param addressLine3
     */
    public void setAddressLine3(java.lang.String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    /**
     * Gets the city value for this Location.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Location.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateProvince value for this Location.
     * 
     * @return stateProvince
     */
    public java.lang.String getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this Location.
     * 
     * @param stateProvince
     */
    public void setStateProvince(java.lang.String stateProvince) {
        this.stateProvince = stateProvince;
    }


    /**
     * Gets the postalCode value for this Location.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Location.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the countryCode value for this Location.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Location.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the phoneNumber value for this Location.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Location.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the phoneExtension value for this Location.
     * 
     * @return phoneExtension
     */
    public java.lang.String getPhoneExtension() {
        return phoneExtension;
    }


    /**
     * Sets the phoneExtension value for this Location.
     * 
     * @param phoneExtension
     */
    public void setPhoneExtension(java.lang.String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }


    /**
     * Gets the faxNumber value for this Location.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this Location.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the comments value for this Location.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Location.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the managementCompany value for this Location.
     * 
     * @return managementCompany
     */
    public java.lang.String getManagementCompany() {
        return managementCompany;
    }


    /**
     * Sets the managementCompany value for this Location.
     * 
     * @param managementCompany
     */
    public void setManagementCompany(java.lang.String managementCompany) {
        this.managementCompany = managementCompany;
    }


    /**
     * Gets the brand value for this Location.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this Location.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the GMTOffset value for this Location.
     * 
     * @return GMTOffset
     */
    public java.lang.String getGMTOffset() {
        return GMTOffset;
    }


    /**
     * Sets the GMTOffset value for this Location.
     * 
     * @param GMTOffset
     */
    public void setGMTOffset(java.lang.String GMTOffset) {
        this.GMTOffset = GMTOffset;
    }


    /**
     * Gets the peakSleepingRooms value for this Location.
     * 
     * @return peakSleepingRooms
     */
    public int getPeakSleepingRooms() {
        return peakSleepingRooms;
    }


    /**
     * Sets the peakSleepingRooms value for this Location.
     * 
     * @param peakSleepingRooms
     */
    public void setPeakSleepingRooms(int peakSleepingRooms) {
        this.peakSleepingRooms = peakSleepingRooms;
    }


    /**
     * Gets the totalAttendees value for this Location.
     * 
     * @return totalAttendees
     */
    public java.lang.Integer getTotalAttendees() {
        return totalAttendees;
    }


    /**
     * Sets the totalAttendees value for this Location.
     * 
     * @param totalAttendees
     */
    public void setTotalAttendees(java.lang.Integer totalAttendees) {
        this.totalAttendees = totalAttendees;
    }


    /**
     * Gets the largestFunctionRoom value for this Location.
     * 
     * @return largestFunctionRoom
     */
    public java.lang.Integer getLargestFunctionRoom() {
        return largestFunctionRoom;
    }


    /**
     * Sets the largestFunctionRoom value for this Location.
     * 
     * @param largestFunctionRoom
     */
    public void setLargestFunctionRoom(java.lang.Integer largestFunctionRoom) {
        this.largestFunctionRoom = largestFunctionRoom;
    }


    /**
     * Gets the currencyCode value for this Location.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Location.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the driveToAirport value for this Location.
     * 
     * @return driveToAirport
     */
    public java.lang.Integer getDriveToAirport() {
        return driveToAirport;
    }


    /**
     * Sets the driveToAirport value for this Location.
     * 
     * @param driveToAirport
     */
    public void setDriveToAirport(java.lang.Integer driveToAirport) {
        this.driveToAirport = driveToAirport;
    }


    /**
     * Gets the taxRate value for this Location.
     * 
     * @return taxRate
     */
    public java.lang.String getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this Location.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.String taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the newMarketProduct value for this Location.
     * 
     * @return newMarketProduct
     */
    public java.lang.String getNewMarketProduct() {
        return newMarketProduct;
    }


    /**
     * Sets the newMarketProduct value for this Location.
     * 
     * @param newMarketProduct
     */
    public void setNewMarketProduct(java.lang.String newMarketProduct) {
        this.newMarketProduct = newMarketProduct;
    }


    /**
     * Gets the newMarketProductVersion value for this Location.
     * 
     * @return newMarketProductVersion
     */
    public java.lang.String getNewMarketProductVersion() {
        return newMarketProductVersion;
    }


    /**
     * Sets the newMarketProductVersion value for this Location.
     * 
     * @param newMarketProductVersion
     */
    public void setNewMarketProductVersion(java.lang.String newMarketProductVersion) {
        this.newMarketProductVersion = newMarketProductVersion;
    }


    /**
     * Gets the holidays value for this Location.
     * 
     * @return holidays
     */
    public localhost.MeetingBrokerServices.Holiday[] getHolidays() {
        return holidays;
    }


    /**
     * Sets the holidays value for this Location.
     * 
     * @param holidays
     */
    public void setHolidays(localhost.MeetingBrokerServices.Holiday[] holidays) {
        this.holidays = holidays;
    }


    /**
     * Gets the locationAttributes value for this Location.
     * 
     * @return locationAttributes
     */
    public localhost.MeetingBrokerServices.LocationAttribute[] getLocationAttributes() {
        return locationAttributes;
    }


    /**
     * Sets the locationAttributes value for this Location.
     * 
     * @param locationAttributes
     */
    public void setLocationAttributes(localhost.MeetingBrokerServices.LocationAttribute[] locationAttributes) {
        this.locationAttributes = locationAttributes;
    }


    /**
     * Gets the hoursOfOperationCollection value for this Location.
     * 
     * @return hoursOfOperationCollection
     */
    public localhost.MeetingBrokerServices.HoursOfOperation[] getHoursOfOperationCollection() {
        return hoursOfOperationCollection;
    }


    /**
     * Sets the hoursOfOperationCollection value for this Location.
     * 
     * @param hoursOfOperationCollection
     */
    public void setHoursOfOperationCollection(localhost.MeetingBrokerServices.HoursOfOperation[] hoursOfOperationCollection) {
        this.hoursOfOperationCollection = hoursOfOperationCollection;
    }


    /**
     * Gets the locationUsers value for this Location.
     * 
     * @return locationUsers
     */
    public localhost.MeetingBrokerServices.LocationUser[] getLocationUsers() {
        return locationUsers;
    }


    /**
     * Sets the locationUsers value for this Location.
     * 
     * @param locationUsers
     */
    public void setLocationUsers(localhost.MeetingBrokerServices.LocationUser[] locationUsers) {
        this.locationUsers = locationUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subscriptionId == other.getSubscriptionId() &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.locationType==null && other.getLocationType()==null) || 
             (this.locationType!=null &&
              this.locationType.equals(other.getLocationType()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.addressLine3==null && other.getAddressLine3()==null) || 
             (this.addressLine3!=null &&
              this.addressLine3.equals(other.getAddressLine3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateProvince==null && other.getStateProvince()==null) || 
             (this.stateProvince!=null &&
              this.stateProvince.equals(other.getStateProvince()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.phoneExtension==null && other.getPhoneExtension()==null) || 
             (this.phoneExtension!=null &&
              this.phoneExtension.equals(other.getPhoneExtension()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.managementCompany==null && other.getManagementCompany()==null) || 
             (this.managementCompany!=null &&
              this.managementCompany.equals(other.getManagementCompany()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.GMTOffset==null && other.getGMTOffset()==null) || 
             (this.GMTOffset!=null &&
              this.GMTOffset.equals(other.getGMTOffset()))) &&
            this.peakSleepingRooms == other.getPeakSleepingRooms() &&
            ((this.totalAttendees==null && other.getTotalAttendees()==null) || 
             (this.totalAttendees!=null &&
              this.totalAttendees.equals(other.getTotalAttendees()))) &&
            ((this.largestFunctionRoom==null && other.getLargestFunctionRoom()==null) || 
             (this.largestFunctionRoom!=null &&
              this.largestFunctionRoom.equals(other.getLargestFunctionRoom()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.driveToAirport==null && other.getDriveToAirport()==null) || 
             (this.driveToAirport!=null &&
              this.driveToAirport.equals(other.getDriveToAirport()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.newMarketProduct==null && other.getNewMarketProduct()==null) || 
             (this.newMarketProduct!=null &&
              this.newMarketProduct.equals(other.getNewMarketProduct()))) &&
            ((this.newMarketProductVersion==null && other.getNewMarketProductVersion()==null) || 
             (this.newMarketProductVersion!=null &&
              this.newMarketProductVersion.equals(other.getNewMarketProductVersion()))) &&
            ((this.holidays==null && other.getHolidays()==null) || 
             (this.holidays!=null &&
              java.util.Arrays.equals(this.holidays, other.getHolidays()))) &&
            ((this.locationAttributes==null && other.getLocationAttributes()==null) || 
             (this.locationAttributes!=null &&
              java.util.Arrays.equals(this.locationAttributes, other.getLocationAttributes()))) &&
            ((this.hoursOfOperationCollection==null && other.getHoursOfOperationCollection()==null) || 
             (this.hoursOfOperationCollection!=null &&
              java.util.Arrays.equals(this.hoursOfOperationCollection, other.getHoursOfOperationCollection()))) &&
            ((this.locationUsers==null && other.getLocationUsers()==null) || 
             (this.locationUsers!=null &&
              java.util.Arrays.equals(this.locationUsers, other.getLocationUsers())));
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
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLocationType() != null) {
            _hashCode += getLocationType().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getAddressLine3() != null) {
            _hashCode += getAddressLine3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateProvince() != null) {
            _hashCode += getStateProvince().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPhoneExtension() != null) {
            _hashCode += getPhoneExtension().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getManagementCompany() != null) {
            _hashCode += getManagementCompany().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getGMTOffset() != null) {
            _hashCode += getGMTOffset().hashCode();
        }
        _hashCode += getPeakSleepingRooms();
        if (getTotalAttendees() != null) {
            _hashCode += getTotalAttendees().hashCode();
        }
        if (getLargestFunctionRoom() != null) {
            _hashCode += getLargestFunctionRoom().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDriveToAirport() != null) {
            _hashCode += getDriveToAirport().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getNewMarketProduct() != null) {
            _hashCode += getNewMarketProduct().hashCode();
        }
        if (getNewMarketProductVersion() != null) {
            _hashCode += getNewMarketProductVersion().hashCode();
        }
        if (getHolidays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHolidays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHolidays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHoursOfOperationCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoursOfOperationCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoursOfOperationCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationUsers(), i);
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationTypes"));
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
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("managementCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ManagementCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GMTOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GMTOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peakSleepingRooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PeakSleepingRooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAttendees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TotalAttendees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largestFunctionRoom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LargestFunctionRoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driveToAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DriveToAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMarketProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NewMarketProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMarketProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NewMarketProductVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holiday"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holiday"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursOfOperationCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperationCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUser"));
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
