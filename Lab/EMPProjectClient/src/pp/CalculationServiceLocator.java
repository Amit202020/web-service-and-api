/**
 * CalculationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pp;

public class CalculationServiceLocator extends org.apache.axis.client.Service implements pp.CalculationService {

    public CalculationServiceLocator() {
    }


    public CalculationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Calculation
    private java.lang.String Calculation_address = "http://localhost:8082/EMIProject/services/Calculation";

    public java.lang.String getCalculationAddress() {
        return Calculation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculationWSDDServiceName = "Calculation";

    public java.lang.String getCalculationWSDDServiceName() {
        return CalculationWSDDServiceName;
    }

    public void setCalculationWSDDServiceName(java.lang.String name) {
        CalculationWSDDServiceName = name;
    }

    public pp.Calculation getCalculation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Calculation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculation(endpoint);
    }

    public pp.Calculation getCalculation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pp.CalculationSoapBindingStub _stub = new pp.CalculationSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculationEndpointAddress(java.lang.String address) {
        Calculation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pp.Calculation.class.isAssignableFrom(serviceEndpointInterface)) {
                pp.CalculationSoapBindingStub _stub = new pp.CalculationSoapBindingStub(new java.net.URL(Calculation_address), this);
                _stub.setPortName(getCalculationWSDDServiceName());
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
        if ("Calculation".equals(inputPortName)) {
            return getCalculation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pp", "CalculationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pp", "Calculation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Calculation".equals(portName)) {
            setCalculationEndpointAddress(address);
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
