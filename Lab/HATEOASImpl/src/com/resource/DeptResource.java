package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.bean.Dept;
import com.service.DeptService;


@Path("/dept")
public class DeptResource {
	
	@GET
	@Path("/getDept/{deptId}")
	@Produces(MediaType.APPLICATION_XML)
	public Dept selectDeptById(@PathParam("deptId")int deptId){
		DeptService es=new DeptService();
		return es.selectDeptById(deptId);
		
	}
}
