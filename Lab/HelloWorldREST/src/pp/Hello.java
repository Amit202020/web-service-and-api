package pp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/demo")
public class Hello {
	
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloText(){
	        	return  "Welcome To REST WS";
	}
	
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String getHelloXML(){
		return  "<message>Welcome To REST WS</message>";
		
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String getHelloHTML(){
		return  "<B>Welcome To REST WS</B>";
	}



}
