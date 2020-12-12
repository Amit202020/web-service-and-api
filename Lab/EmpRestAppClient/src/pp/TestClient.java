package pp;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClient {

	public static void main(String[] args) {
		
		String contextURL="http://localhost:8081/EmpRestApp/rest";
		
		String resourcePath="/emp";
		
		String requestPath="/getEmp/222";
		
		String urlString=contextURL+resourcePath+requestPath;
		
		Client c=Client.create();
		
        WebResource r=c.resource(urlString); 
        
        String result=r.get(String.class);
        
        System.out.println(result);
		
	}

}
