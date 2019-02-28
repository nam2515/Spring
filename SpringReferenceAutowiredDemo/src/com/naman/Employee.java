package com.naman;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empNumber;
	private String empname;
	@Autowired
	private Address address;
	
	public int getEmpNumber() {
		return empNumber;
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
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		address = address;
	}


}
