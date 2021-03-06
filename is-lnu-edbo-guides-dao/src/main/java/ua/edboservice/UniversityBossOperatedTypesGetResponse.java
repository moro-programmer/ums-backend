
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
 *         &lt;element name="UniversityBossOperatedTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBossOperatedTypes" minOccurs="0"/>
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
    "universityBossOperatedTypesGetResult"
})
@XmlRootElement(name = "UniversityBossOperatedTypesGetResponse")
public class UniversityBossOperatedTypesGetResponse {

    @XmlElement(name = "UniversityBossOperatedTypesGetResult")
    protected ArrayOfDUniversityBossOperatedTypes universityBossOperatedTypesGetResult;

    /**
     * Gets the value of the universityBossOperatedTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBossOperatedTypes }
     *     
     */
    public ArrayOfDUniversityBossOperatedTypes getUniversityBossOperatedTypesGetResult() {
        return universityBossOperatedTypesGetResult;
    }

    /**
     * Sets the value of the universityBossOperatedTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBossOperatedTypes }
     *     
     */
    public void setUniversityBossOperatedTypesGetResult(ArrayOfDUniversityBossOperatedTypes value) {
        this.universityBossOperatedTypesGetResult = value;
    }

}
