package pp;

import javax.jws.WebService;

@WebService
public class CalWebServiceImpl {
	
	public int addition(int a,int b){
		return (a+b);
	}

}
