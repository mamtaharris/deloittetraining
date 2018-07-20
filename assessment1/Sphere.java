package com.javatraining.deloitte.assessment1;

import java.util.Scanner;

public class Sphere extends Shape{
	
	//Sphere Area= 4pr2  , Volume = 4/3 pr3 
	double p = 3.14159265359;
	double r;
	
	public Sphere() {
		r=0;
	}
	
	
	public Sphere(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		Scanner s = new Scanner(System.in);
		r=s.nextDouble();
		Sphere sphere = new Sphere(r);
		return (4*p*Math.pow(r, 2));
	}

	@Override
	public double volume() {
		return ((4/3.0)*p*Math.pow(r, 3));
	}	
}
