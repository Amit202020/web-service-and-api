package pp;

public class CalculationProxy implements pp.Calculation {
  private String _endpoint = null;
  private pp.Calculation calculation = null;
  
  public CalculationProxy() {
    _initCalculationProxy();
  }
  
  public CalculationProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculationProxy();
  }
  
  private void _initCalculationProxy() {
    try {
      calculation = (new pp.CalculationServiceLocator()).getCalculation();
      if (calculation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculation != null)
      ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pp.Calculation getCalculation() {
    if (calculation == null)
      _initCalculationProxy();
    return calculation;
  }
  
  public double calculatorEMI(double p, double r, double t) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.calculatorEMI(p, r, t);
  }
  
  public java.lang.String getHello(java.lang.String name) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.getHello(name);
  }
  
  
}