package dao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="Emp")
@XmlType(propOrder={"empEmail","empId","empName"})
public class Employee {
	
	private int empId;
	private String empName;
	private String empEmail;
	
	@XmlElement(name="EmployeeId")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@XmlElement(name="EmployeeName")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@XmlElement(name="EmployeeEmail")
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
}
