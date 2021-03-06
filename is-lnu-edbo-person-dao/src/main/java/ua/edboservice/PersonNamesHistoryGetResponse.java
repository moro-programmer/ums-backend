
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonNamesHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonNamesHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personNamesHistoryGetResult"
})
@XmlRootElement(name = "PersonNamesHistoryGetResponse")
public class PersonNamesHistoryGetResponse {

    @XmlElement(name = "PersonNamesHistoryGetResult")
    protected ArrayOfDPersonNamesHistory personNamesHistoryGetResult;

    /**
     * Gets the value of the personNamesHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonNamesHistory }
     *     
     */
    public ArrayOfDPersonNamesHistory getPersonNamesHistoryGetResult() {
        return personNamesHistoryGetResult;
    }

    /**
     * Sets the value of the personNamesHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonNamesHistory }
     *     
     */
    public void setPersonNamesHistoryGetResult(ArrayOfDPersonNamesHistory value) {
        this.personNamesHistoryGetResult = value;
    }

}
