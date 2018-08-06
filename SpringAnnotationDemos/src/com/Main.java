package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {	
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee =  context.getBean(Employee.class);
		Address address = context.getBean(Address.class);
		address.setId(100);
		address.setCity("bangalore");
		address.setCountry("india");
		employee.setEmployeeName("aaa");
		employee.setAddress(address);
		System.out.println(employee);
		System.out.println(address);
		}
}

 
