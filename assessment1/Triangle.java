package com.javatraining.deloitte.assessment1;

import java.util.Scanner;

public class Triangle extends Shape {

	// Triangle Area = 1/2 of the base X the height, 

	@Override
	public double area() {
		Scanner s = new Scanner(System.in);
		double base = s.nextDouble();
		double height = s.nextDouble();
		return (0.5*base*height);
	}

	@Override
	public double volume() {
		return -1;
	}
}
