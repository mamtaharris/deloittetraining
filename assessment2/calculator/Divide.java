package com.deloittetraining.assessment2.calculator;

public class Divide extends Arithmetic {
	
	public Divide() {
	}
	
	public Divide(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calculate() {
		if (num2 != 0)
			display(num1/num2);
	}
	
}
