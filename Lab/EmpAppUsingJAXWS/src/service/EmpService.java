package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import dao.EmpDAO;
import dao.Employee;



@WebService
public class EmpService {
	

	@WebMethod
	public void insertDb(int empId,String empName,String empEmail){
		EmpDAO obj=new EmpDAO();
		Employee eObj=new Employee();
		eObj.setEmpId(empId);
		eObj.setEmpName(empName);
		eObj.setEmpEmail(empEmail);
		obj.inserDb(eObj);
		
	}
	
	@WebMethod
	public Employee selectById(int eId){
		EmpDAO obj=new EmpDAO();
		return obj.selectById(eId);
	}
		 

}
