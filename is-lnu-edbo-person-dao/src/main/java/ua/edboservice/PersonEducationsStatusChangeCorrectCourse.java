
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionGUID",
    "universityKode",
    "idCourse",
    "idPersonEducations"
})
@XmlRootElement(name = "PersonEducationsStatusChangeCorrectCourse")
public class PersonEducationsStatusChangeCorrectCourse {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "Id_PersonEducations")
    protected String idPersonEducations;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the idPersonEducations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonEducations() {
        return idPersonEducations;
    }

    /**
     * Sets the value of the idPersonEducations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonEducations(String value) {
        this.idPersonEducations = value;
    }

}
