package pp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService(name="TestCalculator",
            portName="TestCalculatorPort",
            serviceName="TestCalculatorService",
            targetNamespace="http://www.atos.net/ban/emi")
@SOAPBinding(style=Style.RPC)

public class EMICalculation {
	
	
	@WebResult(partName="RESULT")
	@WebMethod(action="getEmi",operationName="calEMI")
	public double calculatorEMI(@WebParam(partName="principle")double p, @WebParam(partName="rate")double r,@WebParam(partName="time") double t)
	{
	    double emi;
	 
	    r = r / (12 * 100); // one month interest
	    t = t * 12; // one month period
	    emi = (p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1);
	 
	    return (emi);
	}

}
