
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityFacultetSpecialitiesWaves complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityFacultetSpecialitiesWaves">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitySpecialities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitySpecialitiesDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecIndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesLicenseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasonDetails" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiloviyCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BudjetCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PozakonCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityFacultetSpecialitiesWaves", propOrder = {
    "idUniversitySpecialities",
    "universitySpecialitiesKode",
    "universitySpecialitiesDateBegin",
    "universitySpecialitiesDateEnd",
    "universityKode",
    "universityFullName",
    "universityShortName",
    "universityFacultetKode",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "specCode",
    "specClasifierCode",
    "idLanguage",
    "specIndastryCode",
    "specIndastryName",
    "specDirectionsCode",
    "specDirectionName",
    "specSpecialityCode",
    "specSpecialityName",
    "specScecializationCode",
    "specScecializationName",
    "universitySpecialitiesLicenseCount",
    "universitySpecialitiesContractCount",
    "idPersonRequestSeasons",
    "nameRequestSeasons",
    "idPersonRequestSeasonDetails",
    "idPersonEducationForm",
    "personEducationFormName",
    "idQualification",
    "qualificationName",
    "specSpecialityClasifierCode",
    "idUniversityEntrantWave",
    "entrantWaveNumber",
    "isActive",
    "ciloviyCount",
    "budjetCount",
    "contractCount",
    "entrantWaveName",
    "entrantWaveDescription",
    "entrantWaveDateLastChange",
    "pozakonCount",
    "idCourse"
})
public class DUniversityFacultetSpecialitiesWaves {

    @XmlElement(name = "Id_UniversitySpecialities")
    protected int idUniversitySpecialities;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "UniversitySpecialitiesDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universitySpecialitiesDateBegin;
    @XmlElement(name = "UniversitySpecialitiesDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universitySpecialitiesDateEnd;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "SpecIndastryCode")
    protected String specIndastryCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "UniversitySpecialitiesLicenseCount")
    protected int universitySpecialitiesLicenseCount;
    @XmlElement(name = "UniversitySpecialitiesContractCount")
    protected int universitySpecialitiesContractCount;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "NameRequestSeasons")
    protected String nameRequestSeasons;
    @XmlElement(name = "Id_PersonRequestSeasonDetails")
    protected int idPersonRequestSeasonDetails;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "EntrantWaveNumber")
    protected int entrantWaveNumber;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "CiloviyCount")
    protected int ciloviyCount;
    @XmlElement(name = "BudjetCount")
    protected int budjetCount;
    @XmlElement(name = "ContractCount")
    protected int contractCount;
    @XmlElement(name = "EntrantWaveName")
    protected String entrantWaveName;
    @XmlElement(name = "EntrantWaveDescription")
    protected String entrantWaveDescription;
    @XmlElement(name = "EntrantWaveDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrantWaveDateLastChange;
    @XmlElement(name = "PozakonCount")
    protected int pozakonCount;
    @XmlElement(name = "Id_Course")
    protected int idCourse;

    /**
     * Gets the value of the idUniversitySpecialities property.
     * 
     */
    public int getIdUniversitySpecialities() {
        return idUniversitySpecialities;
    }

    /**
     * Sets the value of the idUniversitySpecialities property.
     * 
     */
    public void setIdUniversitySpecialities(int value) {
        this.idUniversitySpecialities = value;
    }

    /**
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the universitySpecialitiesDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversitySpecialitiesDateBegin() {
        return universitySpecialitiesDateBegin;
    }

    /**
     * Sets the value of the universitySpecialitiesDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversitySpecialitiesDateBegin(XMLGregorianCalendar value) {
        this.universitySpecialitiesDateBegin = value;
    }

    /**
     * Gets the value of the universitySpecialitiesDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversitySpecialitiesDateEnd() {
        return universitySpecialitiesDateEnd;
    }

    /**
     * Sets the value of the universitySpecialitiesDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversitySpecialitiesDateEnd(XMLGregorianCalendar value) {
        this.universitySpecialitiesDateEnd = value;
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
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the specIndastryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryCode() {
        return specIndastryCode;
    }

    /**
     * Sets the value of the specIndastryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryCode(String value) {
        this.specIndastryCode = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesLicenseCount property.
     * 
     */
    public int getUniversitySpecialitiesLicenseCount() {
        return universitySpecialitiesLicenseCount;
    }

    /**
     * Sets the value of the universitySpecialitiesLicenseCount property.
     * 
     */
    public void setUniversitySpecialitiesLicenseCount(int value) {
        this.universitySpecialitiesLicenseCount = value;
    }

    /**
     * Gets the value of the universitySpecialitiesContractCount property.
     * 
     */
    public int getUniversitySpecialitiesContractCount() {
        return universitySpecialitiesContractCount;
    }

    /**
     * Sets the value of the universitySpecialitiesContractCount property.
     * 
     */
    public void setUniversitySpecialitiesContractCount(int value) {
        this.universitySpecialitiesContractCount = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the nameRequestSeasons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRequestSeasons() {
        return nameRequestSeasons;
    }

    /**
     * Sets the value of the nameRequestSeasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRequestSeasons(String value) {
        this.nameRequestSeasons = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public int getIdPersonRequestSeasonDetails() {
        return idPersonRequestSeasonDetails;
    }

    /**
     * Sets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public void setIdPersonRequestSeasonDetails(int value) {
        this.idPersonRequestSeasonDetails = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
    }

    /**
     * Gets the value of the entrantWaveNumber property.
     * 
     */
    public int getEntrantWaveNumber() {
        return entrantWaveNumber;
    }

    /**
     * Sets the value of the entrantWaveNumber property.
     * 
     */
    public void setEntrantWaveNumber(int value) {
        this.entrantWaveNumber = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the ciloviyCount property.
     * 
     */
    public int getCiloviyCount() {
        return ciloviyCount;
    }

    /**
     * Sets the value of the ciloviyCount property.
     * 
     */
    public void setCiloviyCount(int value) {
        this.ciloviyCount = value;
    }

    /**
     * Gets the value of the budjetCount property.
     * 
     */
    public int getBudjetCount() {
        return budjetCount;
    }

    /**
     * Sets the value of the budjetCount property.
     * 
     */
    public void setBudjetCount(int value) {
        this.budjetCount = value;
    }

    /**
     * Gets the value of the contractCount property.
     * 
     */
    public int getContractCount() {
        return contractCount;
    }

    /**
     * Sets the value of the contractCount property.
     * 
     */
    public void setContractCount(int value) {
        this.contractCount = value;
    }

    /**
     * Gets the value of the entrantWaveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantWaveName() {
        return entrantWaveName;
    }

    /**
     * Sets the value of the entrantWaveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantWaveName(String value) {
        this.entrantWaveName = value;
    }

    /**
     * Gets the value of the entrantWaveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantWaveDescription() {
        return entrantWaveDescription;
    }

    /**
     * Sets the value of the entrantWaveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantWaveDescription(String value) {
        this.entrantWaveDescription = value;
    }

    /**
     * Gets the value of the entrantWaveDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrantWaveDateLastChange() {
        return entrantWaveDateLastChange;
    }

    /**
     * Sets the value of the entrantWaveDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrantWaveDateLastChange(XMLGregorianCalendar value) {
        this.entrantWaveDateLastChange = value;
    }

    /**
     * Gets the value of the pozakonCount property.
     * 
     */
    public int getPozakonCount() {
        return pozakonCount;
    }

    /**
     * Sets the value of the pozakonCount property.
     * 
     */
    public void setPozakonCount(int value) {
        this.pozakonCount = value;
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

}
