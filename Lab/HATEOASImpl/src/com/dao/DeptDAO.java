package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bean.Dept;
import com.bean.Employee;

public class DeptDAO {
	
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
	
	public Dept selectDeptById(int dId) {
		try {
			Statement st = getCon().createStatement();
			String sql = "SELECT * FROM dept WHERE deptid="+dId+"";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Dept d = new Dept();
				d.setDeptId(rs.getInt(1));
				d.setDeptName(rs.getString(2));
				d.setDeptDesc(rs.getString(3));
				return d;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
