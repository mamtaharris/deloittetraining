package com.javatraining.deloitte.assessment1;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	//Rectangle Area: l X w

	@Override
	public double area() {
		Scanner s = new Scanner(System.in);
		double lenght=s.nextDouble();
		double width=s.nextDouble();
		return (lenght*width);
	}

	@Override
	public double volume() {
		return -1;
	}
}
