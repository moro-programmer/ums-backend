
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
 *         &lt;element name="Id_23nkmain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MONCheck" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "id23Nkmain",
    "monCheck"
})
@XmlRootElement(name = "m23nkMONCheckChange")
public class M23NkMONCheckChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_23nkmain")
    protected int id23Nkmain;
    @XmlElement(name = "MONCheck")
    protected int monCheck;

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
     * Gets the value of the id23Nkmain property.
     * 
     */
    public int getId23Nkmain() {
        return id23Nkmain;
    }

    /**
     * Sets the value of the id23Nkmain property.
     * 
     */
    public void setId23Nkmain(int value) {
        this.id23Nkmain = value;
    }

    /**
     * Gets the value of the monCheck property.
     * 
     */
    public int getMONCheck() {
        return monCheck;
    }

    /**
     * Sets the value of the monCheck property.
     * 
     */
    public void setMONCheck(int value) {
        this.monCheck = value;
    }

}
