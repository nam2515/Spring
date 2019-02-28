package com.naman;

public class Employee {

	private int empNumber;
	private String empname;
	private Address Address;
	
	
	public Employee(int empNumber, String empname, com.naman.Address address) {
		super();
		this.empNumber = empNumber;
		this.empname = empname;
		Address = address;
	}
	
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
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}


}
