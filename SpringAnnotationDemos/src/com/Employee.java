package com;

public class Employee {
	private String employeeName;
	private Address address;
	
	public Employee() {
	}	
	
	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address=" + address + "]";
	}

	
}
