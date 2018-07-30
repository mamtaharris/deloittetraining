package com.deloittetraining.assessment2.calculator;

import java.util.Scanner;

public class ArithmeticMain {
	public static void main(String[] args) {
		Arithmetic arithmetic[] = new Arithmetic[4];
		arithmetic[0] = new Addition();
		arithmetic[1] = new Subtraction();
		arithmetic[2] = new Multiplication();
		arithmetic[3] = new Divide();
		int choice;
		do {
			System.out.println("1. Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
		} while (choice > 4);
		arithmetic[choice-1].read();
		arithmetic[choice-1].calculate();
	}
}
