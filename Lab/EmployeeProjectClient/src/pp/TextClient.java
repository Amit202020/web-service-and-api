package pp;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class TextClient {

	public static void main(String[] args) {
		java.net.URL endpointURL;
		try {
			endpointURL = new java.net.URL(
					"http://localhost:8082/EmployeeProject/services/EmpService?wsdl");

			org.apache.axis.client.Service service = new org.apache.axis.client.Service();

			EmpServiceSoapBindingStub stub = new EmpServiceSoapBindingStub(
					endpointURL, service);

			Employee e = stub.selectEmpById("20");

			System.out.println("Per Month EMI is :" + e.getEmpId()+"/"+e.getEmpName()+"/"+e.getEmpEmail());

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
