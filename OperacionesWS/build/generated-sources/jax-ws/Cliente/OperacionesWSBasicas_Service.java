
package Cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OperacionesWSBasicas", targetNamespace = "http://ws.mx.ipn.com/", wsdlLocation = "http://localhost:8080/EjerOperaciones/OperacionesWSBasicas?wsdl")
public class OperacionesWSBasicas_Service
    extends Service
{

    private final static URL OPERACIONESWSBASICAS_WSDL_LOCATION;
    private final static WebServiceException OPERACIONESWSBASICAS_EXCEPTION;
    private final static QName OPERACIONESWSBASICAS_QNAME = new QName("http://ws.mx.ipn.com/", "OperacionesWSBasicas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EjerOperaciones/OperacionesWSBasicas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACIONESWSBASICAS_WSDL_LOCATION = url;
        OPERACIONESWSBASICAS_EXCEPTION = e;
    }

    public OperacionesWSBasicas_Service() {
        super(__getWsdlLocation(), OPERACIONESWSBASICAS_QNAME);
    }

    public OperacionesWSBasicas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACIONESWSBASICAS_QNAME, features);
    }

    public OperacionesWSBasicas_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERACIONESWSBASICAS_QNAME);
    }

    public OperacionesWSBasicas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACIONESWSBASICAS_QNAME, features);
    }

    public OperacionesWSBasicas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacionesWSBasicas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacionesWSBasicas
     */
    @WebEndpoint(name = "OperacionesWSBasicasPort")
    public OperacionesWSBasicas getOperacionesWSBasicasPort() {
        return super.getPort(new QName("http://ws.mx.ipn.com/", "OperacionesWSBasicasPort"), OperacionesWSBasicas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacionesWSBasicas
     */
    @WebEndpoint(name = "OperacionesWSBasicasPort")
    public OperacionesWSBasicas getOperacionesWSBasicasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.mx.ipn.com/", "OperacionesWSBasicasPort"), OperacionesWSBasicas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACIONESWSBASICAS_EXCEPTION!= null) {
            throw OPERACIONESWSBASICAS_EXCEPTION;
        }
        return OPERACIONESWSBASICAS_WSDL_LOCATION;
    }

}
