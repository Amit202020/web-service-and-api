package pp;

public class EmpServiceProxy implements pp.EmpService {
  private String _endpoint = null;
  private pp.EmpService empService = null;
  
  public EmpServiceProxy() {
    _initEmpServiceProxy();
  }
  
  public EmpServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpServiceProxy();
  }
  
  private void _initEmpServiceProxy() {
    try {
      empService = (new pp.EmpServiceServiceLocator()).getEmpService();
      if (empService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empService != null)
      ((javax.xml.rpc.Stub)empService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pp.EmpService getEmpService() {
    if (empService == null)
      _initEmpServiceProxy();
    return empService;
  }
  
  public pp.Employee selectEmpById(java.lang.String empId) throws java.rmi.RemoteException{
    if (empService == null)
      _initEmpServiceProxy();
    return empService.selectEmpById(empId);
  }
  
  
}