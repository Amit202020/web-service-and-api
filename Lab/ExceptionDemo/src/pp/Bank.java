package pp;

import javax.jws.WebMethod;
import javax.jws.WebService;

import exp.InvalidAccountDetailsException;


@WebService
public class Bank{

    int am=5000;
    String ac="hdfc1234";

    @WebMethod
    public int deposit(String acc,int amt)throws Exception{
           if(ac.equals(acc)){
              am=am+amt;
              return am;
           }else{
              throw new InvalidAccountDetailsException();
           }

    }
}