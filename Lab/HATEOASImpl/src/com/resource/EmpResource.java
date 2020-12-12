package com.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.bean.Employee;
import com.service.EmpService;


@Path("/emp")
public class EmpResource {

	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmp(){
		EmpService es=new EmpService();
		return es.getAllEmp();
		
	}
	
	@GET
	@Path("/getEmp/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee selectEmpById(@PathParam("empId")int empId){
		EmpService es=new EmpService();
		return es.selectEmpById(empId);
		
	}
	
	
	@GET
	@Path("/getEmp/{empId}")
	@Produces(MediaType.APPLICATION_XML)
    public Employee  getEmpById(@PathParam("empId")int empId, @Context UriInfo uriinfo){
		
		EmpService es=new EmpService();
		Employee e= es.selectEmpById(empId);
		
         String uri=uriinfo.getBaseUriBuilder().path(DeptResource.class).path(Long.toString(e.getEmpId())).build().toString();
         e.addLink(uri, "self");
         
         return e;
   }


	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee createEmployee(Employee e){
		
		System.out.println("Employee Created");
		return new Employee();
		
	}
	
	@PUT
	@Path("/upadte")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(Employee e){
		
		System.out.println("Employee Updated");
		return new Employee();
		
	}
	
	@DELETE
	@Path("/delete/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee deleteEmployee(@PathParam("empId") int empId){
		
		System.out.println("Employee Deleted");
		return new Employee();
		
	}

}
