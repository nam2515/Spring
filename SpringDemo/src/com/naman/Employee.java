package com.naman;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int empNumber;
	private String empname;
	public int getEmpNumber() {
		return empNumber;
	}
	
	
	public Employee() {
		super();
		System.out.println("From employee constructor");
	}


	public Employee(int empNumber, String empname) {
		super();
		this.empNumber = empNumber;
		this.empname = empname;
	}


	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " );
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
	
}
