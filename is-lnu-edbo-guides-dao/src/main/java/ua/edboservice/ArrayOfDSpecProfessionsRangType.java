
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecProfessionsRangType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecProfessionsRangType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecProfessionsRangType" type="{http://edboservice.ua/}dSpecProfessionsRangType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecProfessionsRangType", propOrder = {
    "dSpecProfessionsRangType"
})
public class ArrayOfDSpecProfessionsRangType {

    @XmlElement(nillable = true)
    protected List<DSpecProfessionsRangType> dSpecProfessionsRangType;

    /**
     * Gets the value of the dSpecProfessionsRangType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecProfessionsRangType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecProfessionsRangType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecProfessionsRangType }
     * 
     * 
     */
    public List<DSpecProfessionsRangType> getDSpecProfessionsRangType() {
        if (dSpecProfessionsRangType == null) {
            dSpecProfessionsRangType = new ArrayList<DSpecProfessionsRangType>();
        }
        return this.dSpecProfessionsRangType;
    }

}
