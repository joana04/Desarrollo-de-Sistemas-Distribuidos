
package com.ipn.mx.ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsRoles", targetNamespace = "http://ws.mx.ipn.com/", wsdlLocation = "http://localhost:8080/WebRoles/wsRoles?wsdl")
public class WsRoles_Service
    extends Service
{

    private final static URL WSROLES_WSDL_LOCATION;
    private final static WebServiceException WSROLES_EXCEPTION;
    private final static QName WSROLES_QNAME = new QName("http://ws.mx.ipn.com/", "wsRoles");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebRoles/wsRoles?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSROLES_WSDL_LOCATION = url;
        WSROLES_EXCEPTION = e;
    }

    public WsRoles_Service() {
        super(__getWsdlLocation(), WSROLES_QNAME);
    }

    public WsRoles_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSROLES_QNAME, features);
    }

    public WsRoles_Service(URL wsdlLocation) {
        super(wsdlLocation, WSROLES_QNAME);
    }

    public WsRoles_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSROLES_QNAME, features);
    }

    public WsRoles_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsRoles_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsRoles
     */
    @WebEndpoint(name = "wsRolesPort")
    public WsRoles getWsRolesPort() {
        return super.getPort(new QName("http://ws.mx.ipn.com/", "wsRolesPort"), WsRoles.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsRoles
     */
    @WebEndpoint(name = "wsRolesPort")
    public WsRoles getWsRolesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.mx.ipn.com/", "wsRolesPort"), WsRoles.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSROLES_EXCEPTION!= null) {
            throw WSROLES_EXCEPTION;
        }
        return WSROLES_WSDL_LOCATION;
    }

}
