package pp;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class TestClient {

	public static void main(String[] args) {

		java.net.URL endpointURL;
		try {
			endpointURL = new java.net.URL(
					"http://localhost:8082/EMIProject/services/Calculation?wsdl");

			org.apache.axis.client.Service service = new org.apache.axis.client.Service();

			CalculationSoapBindingStub stub = new CalculationSoapBindingStub(
					endpointURL, service);

			double result = stub.calculatorEMI(4000000.00, 8.35, 240.00);

			System.out.println("Per Month EMI is :" + result);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
