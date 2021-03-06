
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
 *         &lt;element name="Id_QuestionnairesQuestionWishe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireWishe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idQuestionnairesQuestionWishe",
    "questionnaireWishe"
})
@XmlRootElement(name = "QuestionnairesQuestionWishesEdit")
public class QuestionnairesQuestionWishesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_QuestionnairesQuestionWishe")
    protected int idQuestionnairesQuestionWishe;
    @XmlElement(name = "QuestionnaireWishe")
    protected String questionnaireWishe;

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
     * Gets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public int getIdQuestionnairesQuestionWishe() {
        return idQuestionnairesQuestionWishe;
    }

    /**
     * Sets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public void setIdQuestionnairesQuestionWishe(int value) {
        this.idQuestionnairesQuestionWishe = value;
    }

    /**
     * Gets the value of the questionnaireWishe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireWishe() {
        return questionnaireWishe;
    }

    /**
     * Sets the value of the questionnaireWishe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireWishe(String value) {
        this.questionnaireWishe = value;
    }

}
