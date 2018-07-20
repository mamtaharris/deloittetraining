package com.javatraining.deloitte.assessment1;

public class CalculateAreaVolume {
	public static void main(String[] args) {
		Shape s;
		System.out.println("Enter the dimensions of a cube :");
		s = new Cube();
		System.out.println("Area of cube : "+s.area());
		System.out.println("Volume of cube : "+s.volume());
		
		System.out.println("Enter the dimensions of a rectangle :");
		s = new Rectangle();
		System.out.println("Area of rectangle : "+s.area());
		
		System.out.println("Enter the dimensions of a triangle :");
		s = new Triangle();
		System.out.println("Area of triangle : "+s.area());
		
		System.out.println("Enter the dimensions of a sphere :");
		s = new Sphere();
		System.out.println("Area of sphere : "+s.area());
		System.out.println("Volume of sphere : "+s.volume());
	}
}
