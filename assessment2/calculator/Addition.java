package com.deloittetraining.assessment2.calculator;

public class Addition extends Arithmetic {
	
	public Addition() {
	}
	
	public Addition(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calculate() {
		display(num1+num2);
	}
	
}
