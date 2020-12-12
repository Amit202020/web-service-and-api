package exp;


public class InvalidAccountDetailsException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAccountDetailsException(){
         System.out.println("Please enter correct acc number");
    }

	@Override
	public String toString() {
		
		return "Invalid Account Details";
	}
    

}