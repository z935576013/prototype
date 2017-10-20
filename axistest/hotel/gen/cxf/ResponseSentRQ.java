
package hotel.gen.cxf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ResponseSentRQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseSentRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://localhost/MeetingBrokerServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseType" type="{http://localhost/MeetingBrokerServices}ResponseType"/&gt;
 *         &lt;element name="ResponseSentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ResponseData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="ExternalResponseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="ResponseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RfpId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRfpIdentification" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LocationIdentifier" type="{http://localhost/MeetingBrokerServices}LocationIdentifier" minOccurs="0"/&gt;
 *                   &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExternalBusinessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalProposalDetail" type="{http://localhost/MeetingBrokerServices}ExternalProposalDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseSentRQ", propOrder = {
    "responseType",
    "responseSentDate",
    "responseData",
    "rfpId",
    "externalRfpIdentification",
    "externalBusinessId",
    "externalProposalDetail"
})
public class ResponseSentRQ
    extends Request
{

    @XmlElement(name = "ResponseType", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseType responseType;
    @XmlElement(name = "ResponseSentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseSentDate;
    @XmlElement(name = "ResponseData")
    protected ResponseSentRQ.ResponseData responseData;
    @XmlElement(name = "RfpId")
    protected BigInteger rfpId;
    @XmlElement(name = "ExternalRfpIdentification")
    protected ResponseSentRQ.ExternalRfpIdentification externalRfpIdentification;
    @XmlElement(name = "ExternalBusinessId")
    protected String externalBusinessId;
    @XmlElement(name = "ExternalProposalDetail")
    protected ExternalProposalDetail externalProposalDetail;

    /**
     * 获取responseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponseType() {
        return responseType;
    }

    /**
     * 设置responseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponseType(ResponseType value) {
        this.responseType = value;
    }

    /**
     * 获取responseSentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseSentDate() {
        return responseSentDate;
    }

    /**
     * 设置responseSentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseSentDate(XMLGregorianCalendar value) {
        this.responseSentDate = value;
    }

    /**
     * 获取responseData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseSentRQ.ResponseData }
     *     
     */
    public ResponseSentRQ.ResponseData getResponseData() {
        return responseData;
    }

    /**
     * 设置responseData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseSentRQ.ResponseData }
     *     
     */
    public void setResponseData(ResponseSentRQ.ResponseData value) {
        this.responseData = value;
    }

    /**
     * 获取rfpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRfpId() {
        return rfpId;
    }

    /**
     * 设置rfpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRfpId(BigInteger value) {
        this.rfpId = value;
    }

    /**
     * 获取externalRfpIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseSentRQ.ExternalRfpIdentification }
     *     
     */
    public ResponseSentRQ.ExternalRfpIdentification getExternalRfpIdentification() {
        return externalRfpIdentification;
    }

    /**
     * 设置externalRfpIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseSentRQ.ExternalRfpIdentification }
     *     
     */
    public void setExternalRfpIdentification(ResponseSentRQ.ExternalRfpIdentification value) {
        this.externalRfpIdentification = value;
    }

    /**
     * 获取externalBusinessId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBusinessId() {
        return externalBusinessId;
    }

    /**
     * 设置externalBusinessId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBusinessId(String value) {
        this.externalBusinessId = value;
    }

    /**
     * 获取externalProposalDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalProposalDetail }
     *     
     */
    public ExternalProposalDetail getExternalProposalDetail() {
        return externalProposalDetail;
    }

    /**
     * 设置externalProposalDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProposalDetail }
     *     
     */
    public void setExternalProposalDetail(ExternalProposalDetail value) {
        this.externalProposalDetail = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LocationIdentifier" type="{http://localhost/MeetingBrokerServices}LocationIdentifier" minOccurs="0"/&gt;
     *         &lt;element name="SecondaryExternalRfpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "externalRfpId",
        "locationIdentifier",
        "secondaryExternalRfpId"
    })
    public static class ExternalRfpIdentification {

        @XmlElement(name = "ExternalRfpId")
        protected String externalRfpId;
        @XmlElement(name = "LocationIdentifier")
        protected LocationIdentifier locationIdentifier;
        @XmlElement(name = "SecondaryExternalRfpId")
        protected String secondaryExternalRfpId;

        /**
         * 获取externalRfpId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalRfpId() {
            return externalRfpId;
        }

        /**
         * 设置externalRfpId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalRfpId(String value) {
            this.externalRfpId = value;
        }

        /**
         * 获取locationIdentifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LocationIdentifier }
         *     
         */
        public LocationIdentifier getLocationIdentifier() {
            return locationIdentifier;
        }

        /**
         * 设置locationIdentifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LocationIdentifier }
         *     
         */
        public void setLocationIdentifier(LocationIdentifier value) {
            this.locationIdentifier = value;
        }

        /**
         * 获取secondaryExternalRfpId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryExternalRfpId() {
            return secondaryExternalRfpId;
        }

        /**
         * 设置secondaryExternalRfpId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryExternalRfpId(String value) {
            this.secondaryExternalRfpId = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="ExternalResponseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *           &lt;element name="ResponseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "externalResponseIdentifier",
        "responseURL"
    })
    public static class ResponseData {

        @XmlElement(name = "ExternalResponseIdentifier")
        protected String externalResponseIdentifier;
        @XmlElement(name = "ResponseURL")
        protected String responseURL;

        /**
         * 获取externalResponseIdentifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalResponseIdentifier() {
            return externalResponseIdentifier;
        }

        /**
         * 设置externalResponseIdentifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalResponseIdentifier(String value) {
            this.externalResponseIdentifier = value;
        }

        /**
         * 获取responseURL属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseURL() {
            return responseURL;
        }

        /**
         * 设置responseURL属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseURL(String value) {
            this.responseURL = value;
        }

    }

}
