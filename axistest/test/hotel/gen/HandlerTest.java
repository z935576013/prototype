

/**
 * HandlerTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
    package hotel.gen;

    /*
     *  HandlerTest Junit test case
    */

    public class HandlerTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testprocessRequest() throws java.lang.Exception{

        hotel.gen.HandlerStub stub =
                    new hotel.gen.HandlerStub();//the default implementation should point to the right endpoint

           hotel.gen.HandlerStub.ProcessRequest processRequest4=
                                                        (hotel.gen.HandlerStub.ProcessRequest)getTestObject(hotel.gen.HandlerStub.ProcessRequest.class);
                    // TODO : Fill in the processRequest4 here
                
                        assertNotNull(stub.processRequest(
                        processRequest4));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartprocessRequest() throws java.lang.Exception{
            hotel.gen.HandlerStub stub = new hotel.gen.HandlerStub();
             hotel.gen.HandlerStub.ProcessRequest processRequest4=
                                                        (hotel.gen.HandlerStub.ProcessRequest)getTestObject(hotel.gen.HandlerStub.ProcessRequest.class);
                    // TODO : Fill in the processRequest4 here
                

                stub.startprocessRequest(
                         processRequest4,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends hotel.gen.HandlerCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultprocessRequest(
                         hotel.gen.HandlerStub.ProcessRequestResponse result
                            ) {
                
            }

            public void receiveErrorprocessRequest(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    