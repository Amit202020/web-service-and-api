package com.service;

import com.bean.Dept;
import com.dao.DeptDAO;


public class DeptService {
	
	public Dept selectDeptById(int dId){
		
		  DeptDAO  d=new DeptDAO();
		  return d.selectDeptById(dId);
	}

}
