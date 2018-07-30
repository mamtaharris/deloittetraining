package com.deloittetraining.assessment2.checktripplets;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="null";
		System.out.println("Enter the array :");
		int l=sc.nextInt();
		int[] a = new int[l];
		for(int i=0;i<l;++i)
			a[i]=sc.nextInt();
		if(UserMainCode.checkTripplets(a))
			s="TRUE";
		else
			s="FALSE";
		System.out.println(s);
		sc.close();
	}
}
