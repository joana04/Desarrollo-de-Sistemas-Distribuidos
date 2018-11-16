
package Cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fibonacci complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fibonacci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroUno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fibonacci", propOrder = {
    "numeroUno"
})
public class Fibonacci {

    protected int numeroUno;

    /**
     * Obtiene el valor de la propiedad numeroUno.
     * 
     */
    public int getNumeroUno() {
        return numeroUno;
    }

    /**
     * Define el valor de la propiedad numeroUno.
     * 
     */
    public void setNumeroUno(int value) {
        this.numeroUno = value;
    }

}
