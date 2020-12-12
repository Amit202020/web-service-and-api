/**
 * EmpServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pp;

public class EmpServiceServiceLocator extends org.apache.axis.client.Service implements pp.EmpServiceService {

    public EmpServiceServiceLocator() {
    }


    public EmpServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmpServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmpService
    private java.lang.String EmpService_address = "http://localhost:8082/EmployeeProject/services/EmpService";

    public java.lang.String getEmpServiceAddress() {
        return EmpService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmpServiceWSDDServiceName = "EmpService";

    public java.lang.String getEmpServiceWSDDServiceName() {
        return EmpServiceWSDDServiceName;
    }

    public void setEmpServiceWSDDServiceName(java.lang.String name) {
        EmpServiceWSDDServiceName = name;
    }

    public pp.EmpService getEmpService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmpService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmpService(endpoint);
    }

    public pp.EmpService getEmpService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pp.EmpServiceSoapBindingStub _stub = new pp.EmpServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmpServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmpServiceEndpointAddress(java.lang.String address) {
        EmpService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pp.EmpService.class.isAssignableFrom(serviceEndpointInterface)) {
                pp.EmpServiceSoapBindingStub _stub = new pp.EmpServiceSoapBindingStub(new java.net.URL(EmpService_address), this);
                _stub.setPortName(getEmpServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmpService".equals(inputPortName)) {
            return getEmpService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pp", "EmpServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pp", "EmpService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmpService".equals(portName)) {
            setEmpServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
