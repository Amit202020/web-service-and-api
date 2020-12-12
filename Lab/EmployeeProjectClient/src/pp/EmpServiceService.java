/**
 * EmpServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pp;

public interface EmpServiceService extends javax.xml.rpc.Service {
    public java.lang.String getEmpServiceAddress();

    public pp.EmpService getEmpService() throws javax.xml.rpc.ServiceException;

    public pp.EmpService getEmpService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
