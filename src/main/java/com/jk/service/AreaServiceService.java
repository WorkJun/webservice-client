package com.jk.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-06-29T20:15:02.246+08:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "AreaServiceService", 
                  wsdlLocation = "http://localhost:8080/webservice-server/webservice/cxfTest?wsdl",
                  targetNamespace = "http://service.jk.com/") 
public class AreaServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.jk.com/", "AreaServiceService");
    public final static QName AreaServicePort = new QName("http://service.jk.com/", "AreaServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/webservice-server/webservice/cxfTest?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AreaServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/webservice-server/webservice/cxfTest?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AreaServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AreaServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AreaServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AreaServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AreaServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AreaServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AreaService
     */
    @WebEndpoint(name = "AreaServicePort")
    public AreaService getAreaServicePort() {
        return super.getPort(AreaServicePort, AreaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AreaService
     */
    @WebEndpoint(name = "AreaServicePort")
    public AreaService getAreaServicePort(WebServiceFeature... features) {
        return super.getPort(AreaServicePort, AreaService.class, features);
    }

}