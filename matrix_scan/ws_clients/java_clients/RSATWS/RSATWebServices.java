/**
 * RSATWebServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public interface RSATWebServices extends javax.xml.rpc.Service {

/**
 * Web services for the Regulatory Sequence Analysis Tools (RSAT).
 * Tools developed by Jacques van Helden
 *       (jvanheld@bigre.ulb.ac.be), SOAP/WSDL interface developed by
 * Olivier Sand (oly@bigre.ulb.ac.be).
 */
    public java.lang.String getRSATWSPortTypeAddress();

    public RSATWS.RSATWSPortType getRSATWSPortType() throws javax.xml.rpc.ServiceException;

    public RSATWS.RSATWSPortType getRSATWSPortType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
