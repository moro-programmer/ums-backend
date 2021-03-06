
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEducationalCycles_UseKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEducationalCycles_UseKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEducationalCycles_UseKnowledge" type="{http://edboservice.ua/}dEducationalCycles_UseKnowledge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEducationalCycles_UseKnowledge", propOrder = {
    "dEducationalCyclesUseKnowledge"
})
public class ArrayOfDEducationalCyclesUseKnowledge {

    @XmlElement(name = "dEducationalCycles_UseKnowledge", nillable = true)
    protected List<DEducationalCyclesUseKnowledge> dEducationalCyclesUseKnowledge;

    /**
     * Gets the value of the dEducationalCyclesUseKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEducationalCyclesUseKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEducationalCyclesUseKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEducationalCyclesUseKnowledge }
     * 
     * 
     */
    public List<DEducationalCyclesUseKnowledge> getDEducationalCyclesUseKnowledge() {
        if (dEducationalCyclesUseKnowledge == null) {
            dEducationalCyclesUseKnowledge = new ArrayList<DEducationalCyclesUseKnowledge>();
        }
        return this.dEducationalCyclesUseKnowledge;
    }

}
