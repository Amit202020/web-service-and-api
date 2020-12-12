package com.service;

import java.util.ArrayList;

import com.bean.Employee;
import com.dao.EmpDAO;

public class EmpService {
	
	public ArrayList<Employee> getAllEmp(){
		   EmpDAO ed=new EmpDAO();
		   return ed.getAllEmp();
	}
	
	public Employee selectEmpById(int eId){
		  EmpDAO ed=new EmpDAO();
		  return ed.selectEmpById(eId);
	}

}
