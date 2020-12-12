package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import others.LinkDemo;


@XmlRootElement(name="employee")
public class Employee {
	
	private int empId;
	private String empName;
	private String empDesc;
	
	List<LinkDemo> link =new ArrayList<LinkDemo>();
	
	
	
	
	public List<LinkDemo> getLink() {
		return link;
	}
	public void setLink(List<LinkDemo> link) {
		this.link = link;
	}
	
	@XmlElement(required=true)
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@XmlElement(required=true)
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@XmlElement(required=true)
	public String getEmpDesc() {
		return empDesc;
	}
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}
	
	 public void addLink(String url,String ref){	
			LinkDemo l=new LinkDemo();
			l.setLink(url);
			l.setLinkref(ref);
			link.add(l);
		}
	
	

}
