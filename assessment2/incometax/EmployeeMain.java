package com.deloittetraining.assessment2.incometax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of employee : ");
		int n = scanner.nextInt();
		int empid;
		String empname;
		double annualincome;
		
		ArrayList<EmployeeVo> ar = new ArrayList<EmployeeVo>();
		
		//EmployeeVo ev = new EmployeeVo();
		//EmployeeBo eb = new EmployeeBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter your empid, empname and annualincome");
			empid = scanner.nextInt();
			empname = scanner.next();
			annualincome = scanner.nextDouble();
			EmployeeVo ev = new EmployeeVo(empid, empname, annualincome);
			System.out.println(ev);
			EmployeeBo eb=new EmployeeBo();
			eb.calincomeTax(ev);
			ar.add(ev);
		}
		Collections.sort(ar, new EmployeeSort());
		System.out.println("After sorting :");
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		scanner.close();
	}
}
