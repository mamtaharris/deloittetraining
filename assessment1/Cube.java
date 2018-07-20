package com.javatraining.deloitte.assessment1;

import java.util.Scanner;

public class Cube extends Shape{

	//Cube Area = 2lw + 2lh + 2wh Volume = l X w X h
	double lenght;
	double height;
	double width;
	
	public Cube() {
		lenght=0;
		height=0;
		width=0;
	}
	
	public Cube(double lenght, double height, double width) {
		super();
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		Scanner s = new Scanner(System.in);
		lenght = s.nextDouble();
		height = s.nextDouble();
		width = s.nextDouble();
		Cube c= new Cube(lenght, height, width);
		return (2*(c.lenght*c.width + c.lenght*c.height + c.width*c.height));
	}

	@Override
	public double volume() {
		return (lenght*width*height);		
	}

	

}
