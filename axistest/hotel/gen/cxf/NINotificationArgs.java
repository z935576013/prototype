
package hotel.gen.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NINotificationArgs complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NINotificationArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NINotificationArgs")
@XmlSeeAlso({
    RfpOwnerChangedEventArgs.class,
    LocationUpdatedEventArgs.class,
    RfpViewedEventArgs.class,
    ActualBusinessDataUpdatedEventArgs.class,
    AgreedBusinessDataUpdatedEventArgs.class,
    BlockedBusinessDataUpdatedEventArgs.class,
    PickedUpBusinessDataUpdatedEventArgs.class,
    HeartBeatEventArgs.class,
    RfpCreatedEventArgs.class,
    ProposalSentEventArgs.class,
    BusinessOwnerChangedEventArgs.class,
    BusinessDataIsCompleteChangedEventArgs.class,
    BusinessStatusChangedEventArgs.class,
    CreateBusinessInitiatedEventArgs.class
})
public abstract class NINotificationArgs {


}
