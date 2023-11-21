
package ConsomationRechercheChambre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercherChambres complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercherChambres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prixMinimum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prixMaximum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nbLit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherChambres", propOrder = {
    "prixMinimum",
    "prixMaximum",
    "nbLit"
})
public class RechercherChambres {

    protected float prixMinimum;
    protected float prixMaximum;
    protected int nbLit;

    /**
     * Obtient la valeur de la propri�t� prixMinimum.
     * 
     */
    public float getPrixMinimum() {
        return prixMinimum;
    }

    /**
     * D�finit la valeur de la propri�t� prixMinimum.
     * 
     */
    public void setPrixMinimum(float value) {
        this.prixMinimum = value;
    }

    /**
     * Obtient la valeur de la propri�t� prixMaximum.
     * 
     */
    public float getPrixMaximum() {
        return prixMaximum;
    }

    /**
     * D�finit la valeur de la propri�t� prixMaximum.
     * 
     */
    public void setPrixMaximum(float value) {
        this.prixMaximum = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbLit.
     * 
     */
    public int getNbLit() {
        return nbLit;
    }

    /**
     * D�finit la valeur de la propri�t� nbLit.
     * 
     */
    public void setNbLit(int value) {
        this.nbLit = value;
    }

}
