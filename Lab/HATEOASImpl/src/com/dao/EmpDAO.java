package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.bean.Employee;

public class EmpDAO {

	public Connection getCon() {
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public ArrayList<Employee> getAllEmp() {
		ArrayList<Employee> arr = new ArrayList<Employee>();
		try {
			Statement st = getCon().createStatement();
			String sql = "SELECT * FROM emp";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setEmpDesc(rs.getString(3));
				arr.add(e);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return arr;
	}
	
	

	public Employee selectEmpById(int eId) {
		try {
			Statement st = getCon().createStatement();
			String sql = "SELECT * FROM emp WHERE empid="+eId+"";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setEmpDesc(rs.getString(3));
				return e;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
