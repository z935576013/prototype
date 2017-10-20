
/**
 * WeatherWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */

    package hotel.gen;

    /**
     *  WeatherWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WeatherWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WeatherWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WeatherWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getSupportCityDataset method
            * override this method for handling normal response from getSupportCityDataset operation
            */
           public void receiveResultgetSupportCityDataset(
                    hotel.gen.WeatherWSStub.GetSupportCityDatasetResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportCityDataset operation
           */
            public void receiveErrorgetSupportCityDataset(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWeather method
            * override this method for handling normal response from getWeather operation
            */
           public void receiveResultgetWeather(
                    hotel.gen.WeatherWSStub.GetWeatherResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWeather operation
           */
            public void receiveErrorgetWeather(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRegionProvince method
            * override this method for handling normal response from getRegionProvince operation
            */
           public void receiveResultgetRegionProvince(
                    hotel.gen.WeatherWSStub.GetRegionProvinceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegionProvince operation
           */
            public void receiveErrorgetRegionProvince(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRegionCountry method
            * override this method for handling normal response from getRegionCountry operation
            */
           public void receiveResultgetRegionCountry(
                    hotel.gen.WeatherWSStub.GetRegionCountryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegionCountry operation
           */
            public void receiveErrorgetRegionCountry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRegionDataset method
            * override this method for handling normal response from getRegionDataset operation
            */
           public void receiveResultgetRegionDataset(
                    hotel.gen.WeatherWSStub.GetRegionDatasetResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegionDataset operation
           */
            public void receiveErrorgetRegionDataset(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportCityString method
            * override this method for handling normal response from getSupportCityString operation
            */
           public void receiveResultgetSupportCityString(
                    hotel.gen.WeatherWSStub.GetSupportCityStringResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportCityString operation
           */
            public void receiveErrorgetSupportCityString(java.lang.Exception e) {
            }
                


    }
    