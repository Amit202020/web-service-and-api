package pp;

import java.util.ArrayList;

public class EmpService {
	
	
	public Employee selectEmpById(String empId){
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		
		Employee e=new Employee();
		e.setEmpId("20");
		e.setEmpName("srinibus");
		e.setEmpEmail("srini@gmail.com");
		arr.add(e);
		
		Employee e1=new Employee();
		e1.setEmpId("30");
		e1.setEmpName("nikhil");
		e1.setEmpEmail("nikhil@gmail.com");
		arr.add(e1);
		
		Employee e2=new Employee();
		e2.setEmpId("40");
		e2.setEmpName("paramita");
		e2.setEmpEmail("paro@gmail.com");
		arr.add(e2);
		
		for(Employee emp: arr){
			if(emp.getEmpId().equals(empId)){
				return emp;
			}
	
		}
		return null;
		
	}

}
