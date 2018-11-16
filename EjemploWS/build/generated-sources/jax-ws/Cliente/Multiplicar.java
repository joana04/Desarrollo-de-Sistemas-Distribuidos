
package Cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multiplicar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multiplicar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroUno" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroDos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicar", propOrder = {
    "numeroUno",
    "numeroDos"
})
public class Multiplicar {

    protected Double numeroUno;
    protected Double numeroDos;

    /**
     * Obtiene el valor de la propiedad numeroUno.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumeroUno() {
        return numeroUno;
    }

    /**
     * Define el valor de la propiedad numeroUno.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumeroUno(Double value) {
        this.numeroUno = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumeroDos() {
        return numeroDos;
    }

    /**
     * Define el valor de la propiedad numeroDos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumeroDos(Double value) {
        this.numeroDos = value;
    }

}
