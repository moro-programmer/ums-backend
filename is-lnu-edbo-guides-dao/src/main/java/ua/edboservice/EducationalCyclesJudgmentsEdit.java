
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
 *         &lt;element name="Id_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Global_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_JudgmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_JudgmentsTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationalCyclesJudgments",
    "idGlobalEducationalCyclesJudgments",
    "educationalCyclesJudgmentsText",
    "educationalCyclesJudgmentsTextEn"
})
@XmlRootElement(name = "EducationalCycles_JudgmentsEdit")
public class EducationalCyclesJudgmentsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCycles_Judgments")
    protected int idEducationalCyclesJudgments;
    @XmlElement(name = "Id_Global_EducationalCycles_Judgments")
    protected int idGlobalEducationalCyclesJudgments;
    @XmlElement(name = "EducationalCycles_JudgmentsText")
    protected String educationalCyclesJudgmentsText;
    @XmlElement(name = "EducationalCycles_JudgmentsTextEn")
    protected String educationalCyclesJudgmentsTextEn;

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
     * Gets the value of the idEducationalCyclesJudgments property.
     * 
     */
    public int getIdEducationalCyclesJudgments() {
        return idEducationalCyclesJudgments;
    }

    /**
     * Sets the value of the idEducationalCyclesJudgments property.
     * 
     */
    public void setIdEducationalCyclesJudgments(int value) {
        this.idEducationalCyclesJudgments = value;
    }

    /**
     * Gets the value of the idGlobalEducationalCyclesJudgments property.
     * 
     */
    public int getIdGlobalEducationalCyclesJudgments() {
        return idGlobalEducationalCyclesJudgments;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesJudgments property.
     * 
     */
    public void setIdGlobalEducationalCyclesJudgments(int value) {
        this.idGlobalEducationalCyclesJudgments = value;
    }

    /**
     * Gets the value of the educationalCyclesJudgmentsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesJudgmentsText() {
        return educationalCyclesJudgmentsText;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesJudgmentsText(String value) {
        this.educationalCyclesJudgmentsText = value;
    }

    /**
     * Gets the value of the educationalCyclesJudgmentsTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesJudgmentsTextEn() {
        return educationalCyclesJudgmentsTextEn;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesJudgmentsTextEn(String value) {
        this.educationalCyclesJudgmentsTextEn = value;
    }

}
