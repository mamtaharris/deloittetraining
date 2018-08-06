package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String employeeName;
	
	/*Auto wires address. 
	 * If not false, then program gives an error because it is absolutely required.
	 * So turn it off for getting a null instead of an error.
	 */
	
	@Autowired (required=false)
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
