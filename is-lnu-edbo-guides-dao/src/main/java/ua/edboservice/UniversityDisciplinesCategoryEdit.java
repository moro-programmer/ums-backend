
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
 *         &lt;element name="Id_UniversitiesDisciplinesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesDisciplinesCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversitiesDisciplinesCategory",
    "universitiesDisciplinesCategoryName",
    "idQualificationGroup"
})
@XmlRootElement(name = "UniversityDisciplinesCategoryEdit")
public class UniversityDisciplinesCategoryEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversitiesDisciplinesCategory")
    protected int idUniversitiesDisciplinesCategory;
    @XmlElement(name = "UniversitiesDisciplinesCategoryName")
    protected String universitiesDisciplinesCategoryName;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;

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
     * Gets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public int getIdUniversitiesDisciplinesCategory() {
        return idUniversitiesDisciplinesCategory;
    }

    /**
     * Sets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public void setIdUniversitiesDisciplinesCategory(int value) {
        this.idUniversitiesDisciplinesCategory = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesCategoryName() {
        return universitiesDisciplinesCategoryName;
    }

    /**
     * Sets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesCategoryName(String value) {
        this.universitiesDisciplinesCategoryName = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

}
