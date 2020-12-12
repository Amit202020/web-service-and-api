package dao;

import java.sql.*;

public class EmpDAO {
	
	 public Connection getCon(){
	      Connection con=null;	 
	         try{
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	         }catch(Exception e){
	        	 
	         }
	       return con;
	 }
		   
	 public void inserDb(Employee e){
		 
		 try{
		   Statement st=getCon().createStatement();
		   String sql="INSERT INTO emp VALUES("+e.getEmpId()+",'"+e.getEmpName()+"','"+e.getEmpEmail()+"')";
		   st.executeUpdate(sql);
		   System.out.println("success");
		   }catch(Exception e1){
			 
		 }
	 }
		   
	 public Employee selectById(int eId){
		 
	        ResultSet rs=null;
	        Employee ee=new Employee();
			 try{
			   Statement st=getCon().createStatement();
			   String sql="SELECT * FROM emp WHERE empid="+eId+"";
			   rs=st.executeQuery(sql);
			   while(rs.next()){
				   
				   ee.setEmpId(rs.getInt(1));
				   ee.setEmpName(rs.getString(2));
				   ee.setEmpEmail(rs.getString(3));
				   
			   }
			   System.out.println("success select");
			   }catch(Exception e1){
				 
			 }
			 return ee;
		   
	 }

}
