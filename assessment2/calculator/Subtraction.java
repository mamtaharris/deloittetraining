package com.deloittetraining.assessment2.calculator;

public class Subtraction extends Arithmetic {
	
	public Subtraction() {
	}
	
	public Subtraction(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calculate() {
		display(num1-num2);
	}
	
}
