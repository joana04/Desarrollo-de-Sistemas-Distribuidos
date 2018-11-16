
package com.ipn.mx.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipn.mx.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarRol_QNAME = new QName("http://ws.mx.ipn.com/", "actualizarRol");
    private final static QName _EliminarRolResponse_QNAME = new QName("http://ws.mx.ipn.com/", "eliminarRolResponse");
    private final static QName _SeleccionarTodosRolResponse_QNAME = new QName("http://ws.mx.ipn.com/", "seleccionarTodosRolResponse");
    private final static QName _ActualizarRolResponse_QNAME = new QName("http://ws.mx.ipn.com/", "actualizarRolResponse");
    private final static QName _InsertarRolResponse_QNAME = new QName("http://ws.mx.ipn.com/", "insertarRolResponse");
    private final static QName _EliminarRol_QNAME = new QName("http://ws.mx.ipn.com/", "eliminarRol");
    private final static QName _SeleccionarUnoRol_QNAME = new QName("http://ws.mx.ipn.com/", "seleccionarUnoRol");
    private final static QName _InsertarRol_QNAME = new QName("http://ws.mx.ipn.com/", "insertarRol");
    private final static QName _SeleccionarTodosRol_QNAME = new QName("http://ws.mx.ipn.com/", "seleccionarTodosRol");
    private final static QName _SeleccionarUnoRolResponse_QNAME = new QName("http://ws.mx.ipn.com/", "seleccionarUnoRolResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipn.mx.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarRol }
     * 
     */
    public InsertarRol createInsertarRol() {
        return new InsertarRol();
    }

    /**
     * Create an instance of {@link SeleccionarTodosRol }
     * 
     */
    public SeleccionarTodosRol createSeleccionarTodosRol() {
        return new SeleccionarTodosRol();
    }

    /**
     * Create an instance of {@link SeleccionarUnoRolResponse }
     * 
     */
    public SeleccionarUnoRolResponse createSeleccionarUnoRolResponse() {
        return new SeleccionarUnoRolResponse();
    }

    /**
     * Create an instance of {@link EliminarRol }
     * 
     */
    public EliminarRol createEliminarRol() {
        return new EliminarRol();
    }

    /**
     * Create an instance of {@link SeleccionarUnoRol }
     * 
     */
    public SeleccionarUnoRol createSeleccionarUnoRol() {
        return new SeleccionarUnoRol();
    }

    /**
     * Create an instance of {@link ActualizarRolResponse }
     * 
     */
    public ActualizarRolResponse createActualizarRolResponse() {
        return new ActualizarRolResponse();
    }

    /**
     * Create an instance of {@link InsertarRolResponse }
     * 
     */
    public InsertarRolResponse createInsertarRolResponse() {
        return new InsertarRolResponse();
    }

    /**
     * Create an instance of {@link EliminarRolResponse }
     * 
     */
    public EliminarRolResponse createEliminarRolResponse() {
        return new EliminarRolResponse();
    }

    /**
     * Create an instance of {@link SeleccionarTodosRolResponse }
     * 
     */
    public SeleccionarTodosRolResponse createSeleccionarTodosRolResponse() {
        return new SeleccionarTodosRolResponse();
    }

    /**
     * Create an instance of {@link ActualizarRol }
     * 
     */
    public ActualizarRol createActualizarRol() {
        return new ActualizarRol();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "actualizarRol")
    public JAXBElement<ActualizarRol> createActualizarRol(ActualizarRol value) {
        return new JAXBElement<ActualizarRol>(_ActualizarRol_QNAME, ActualizarRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "eliminarRolResponse")
    public JAXBElement<EliminarRolResponse> createEliminarRolResponse(EliminarRolResponse value) {
        return new JAXBElement<EliminarRolResponse>(_EliminarRolResponse_QNAME, EliminarRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTodosRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "seleccionarTodosRolResponse")
    public JAXBElement<SeleccionarTodosRolResponse> createSeleccionarTodosRolResponse(SeleccionarTodosRolResponse value) {
        return new JAXBElement<SeleccionarTodosRolResponse>(_SeleccionarTodosRolResponse_QNAME, SeleccionarTodosRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "actualizarRolResponse")
    public JAXBElement<ActualizarRolResponse> createActualizarRolResponse(ActualizarRolResponse value) {
        return new JAXBElement<ActualizarRolResponse>(_ActualizarRolResponse_QNAME, ActualizarRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "insertarRolResponse")
    public JAXBElement<InsertarRolResponse> createInsertarRolResponse(InsertarRolResponse value) {
        return new JAXBElement<InsertarRolResponse>(_InsertarRolResponse_QNAME, InsertarRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "eliminarRol")
    public JAXBElement<EliminarRol> createEliminarRol(EliminarRol value) {
        return new JAXBElement<EliminarRol>(_EliminarRol_QNAME, EliminarRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarUnoRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "seleccionarUnoRol")
    public JAXBElement<SeleccionarUnoRol> createSeleccionarUnoRol(SeleccionarUnoRol value) {
        return new JAXBElement<SeleccionarUnoRol>(_SeleccionarUnoRol_QNAME, SeleccionarUnoRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "insertarRol")
    public JAXBElement<InsertarRol> createInsertarRol(InsertarRol value) {
        return new JAXBElement<InsertarRol>(_InsertarRol_QNAME, InsertarRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTodosRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "seleccionarTodosRol")
    public JAXBElement<SeleccionarTodosRol> createSeleccionarTodosRol(SeleccionarTodosRol value) {
        return new JAXBElement<SeleccionarTodosRol>(_SeleccionarTodosRol_QNAME, SeleccionarTodosRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarUnoRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mx.ipn.com/", name = "seleccionarUnoRolResponse")
    public JAXBElement<SeleccionarUnoRolResponse> createSeleccionarUnoRolResponse(SeleccionarUnoRolResponse value) {
        return new JAXBElement<SeleccionarUnoRolResponse>(_SeleccionarUnoRolResponse_QNAME, SeleccionarUnoRolResponse.class, null, value);
    }

}
