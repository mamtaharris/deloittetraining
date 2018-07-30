package com.deloittetraining.assessment2.calculator;

import java.util.Scanner;

public abstract class Arithmetic {
	double num1;
	double num2;
	
	public Arithmetic() {
	}
	
	public Arithmetic(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public void read() {
		System.out.print("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		setNum1(scanner.nextDouble());
		setNum2(scanner.nextDouble());
		scanner.close();
	}
	
	public void display( double num ) {
		System.out.println("The output is : "+num);
	}
	
	public abstract void calculate ();
	
}
