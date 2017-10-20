/**
 * HandlerSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class HandlerSoapStub extends org.apache.axis.client.Stub implements localhost.MeetingBrokerServices.HandlerSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Request"), localhost.MeetingBrokerServices.Request.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Acknowledgement"));
        oper.setReturnClass(localhost.MeetingBrokerServices.Acknowledgement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProcessRequestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public HandlerSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HandlerSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HandlerSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">Notification>NotificationData");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NotificationNotificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ProcessRequest");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ProcessRequestResponse");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ProcessRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ResponseSentRQ>ExternalRfpIdentification");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseSentRQExternalRfpIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ResponseSentRQ>ResponseData");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseSentRQResponseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Acknowledgement");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Acknowledgement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AcknowledgementStatusCode");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AcknowledgementStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ActualBusinessDataUpdatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ActualBusinessDataUpdatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AdditionalInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInfoValueType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AdditionalInfoValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AgreedBusinessDataUpdatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AgreedBusinessDataUpdatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Answer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfAdditionalInformation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AdditionalInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfAnswer");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Answer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Answer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfAttachment");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attachment");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfAttribute");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Attribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attribute");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfCancelledRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CancelledRfp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfp");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfChar");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "char");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "char");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfComplexRoomAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ComplexRoomAvailability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfError");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Error[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Error");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfEventAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventAvailability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfEventRequirement");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfEventRequirementBusinessData");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventRequirementBusinessData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfExternalRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ExternalRfp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfFailedRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.FailedRfp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FailedRfp");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FailedRfp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfHoliday");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Holiday[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holiday");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holiday");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfHoursOfOperation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.HoursOfOperation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperation");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfLinkedRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LinkedRfp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfp");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfLocation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Location[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Location");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Location");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfLocationAttribute");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttribute");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfLocationUser");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUser");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUser");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfMessage");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfNINotification");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NINotification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotification");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfNotification");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Notification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Notification");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Notification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfOtherIncomeItem");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.OtherIncomeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfQuestion");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Question[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfResponseChoice");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseChoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfResponseUnit");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseUnit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfRoomAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomAvailability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfRoomRateAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomRateAvailability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfRoomRequirement");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfSetupValue");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SetupValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValue");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfSite");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Site[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ArrayOfSubscriptionRfpCancellation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SubscriptionRfpCancellation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionRfpCancellation");
            qName2 = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionRfpCancellation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attachment");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Attribute");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AwardRfpRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.AwardRfpRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BlockedBusinessDataUpdatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BlockedBusinessDataUpdatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessData");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessDataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataIsCompleteChangedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessDataIsCompleteChangedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerChangedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessOwnerChangedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatusChangedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessStatusChangedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessSummary");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.BusinessSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelledRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CancelledRfp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelRfpRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CancelRfpRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelRfpRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CancelRfpRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ComplexRoomAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Contact");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateBusinessInitiatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CreateBusinessInitiatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateMeetingRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CreateMeetingRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateMeetingRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.CreateMeetingRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Error");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ErrorType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventBlock");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirement");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventRequirementBusinessData");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.EventRequirementBusinessData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalProposalDetail");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ExternalProposalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ExternalRfp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRoomBlock");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ExternalRoomBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FailedRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.FailedRfp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataInfoRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetBusinessDataInfoRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataInfoRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetBusinessDataInfoRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetBusinessDataRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetBusinessDataRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLinkedRfpsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetLinkedRfpsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLinkedRfpsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetLinkedRfpsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLocationNotificationsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetLocationNotificationsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLocationNotificationsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetLocationNotificationsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNINotificationsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNINotificationsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNINotificationsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNINotificationsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNotificationDataRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNotificationDataRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNotificationDataRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNotificationDataRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNotificationsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNotificationsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetNotificationsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetNotificationsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetProposalRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetProposalRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetProposalRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetProposalRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetResponseInstructionsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetResponseInstructionsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetResponseInstructionsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetResponseInstructionsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetRfpRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetRfpRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetRfpRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.GetRfpRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HeartBeatEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.HeartBeatEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Holiday");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HoursOfOperation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.HoursOfOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "InsertChannelSetupValuesRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.InsertChannelSetupValuesRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "InsertLocationSetupValuesRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.InsertLocationSetupValuesRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "InsertSetupValuesRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.InsertSetupValuesRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "InsertSubscriptionSetupValuesRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.InsertSubscriptionSetupValuesRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfp");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LinkedRfp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Location");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationAttribute");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationIdentifiers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifierType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationTypes");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUpdatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationUpdatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationUser");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.LocationUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.MeetingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotification");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NINotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NINotificationArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationStatusUpdateRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NINotificationStatusUpdateRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NINotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NoOpRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NoOpRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Notification");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationStatus");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NotificationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotifierEventType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.NotifierEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.OtherIncomeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Override");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Override.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PickedUpBusinessDataUpdatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.PickedUpBusinessDataUpdatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Profile");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Proposal");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Proposal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalSentEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ProposalSentEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalStatus");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ProposalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Question.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "QuestionType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.QuestionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Request");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseChoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructionType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseInstructionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseSentRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseSentRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseSentRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseSentRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseType");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.ResponseUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpActionTypes");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpActionTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLink");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpBookingLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLinkRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpBookingLinkRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLinkRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpBookingLinkRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpCreatedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpCreatedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpOwnerChangedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpOwnerChangedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpStatus");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpViewedEventArgs");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RfpViewedEventArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomBlock");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomRateAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRequirement");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomTypes");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.RoomTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Sender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendRfpsRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SendRfpsRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendRfpsRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SendRfpsRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValue");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SetupValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Severity");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Severity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.Site.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SizeUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SizeUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StatusChange");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.StatusChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SubscriptionRfpCancellation");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.SubscriptionRfpCancellation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TextMessage");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.TextMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TextMessageRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.TextMessageRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateBusinessDataRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateBusinessDataRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateBusinessDataRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateBusinessDataRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateBusinessSummaryRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateBusinessSummaryRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateLocationRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateLocationRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateProposalRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateProposalRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateProposalRS");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.UpdateProposalRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "WithdrawRfpRQ");
            cachedSerQNames.add(qName);
            cls = localhost.MeetingBrokerServices.WithdrawRfpRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "char");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public localhost.MeetingBrokerServices.Acknowledgement processRequest(localhost.MeetingBrokerServices.Request request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://localhost/MeetingBrokerServices/ProcessRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProcessRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        
	 java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (localhost.MeetingBrokerServices.Acknowledgement) _resp;
            } catch (java.lang.Exception _exception) {
                return (localhost.MeetingBrokerServices.Acknowledgement) org.apache.axis.utils.JavaUtils.convert(_resp, localhost.MeetingBrokerServices.Acknowledgement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
