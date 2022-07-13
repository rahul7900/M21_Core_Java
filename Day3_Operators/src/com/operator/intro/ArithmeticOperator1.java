package com.operator.intro;

import java.util.Scanner;

public class ArithmeticOperator1 {

	public static void main(String[] args) {
		System.out.println("Enter Your Number : ");
		Scanner a = new Scanner(System.in);
		int X = a.nextInt();
		int Y = 9999;
//		Addition
		int z = X+Y;
		System.out.println(z);
//		Subtraction
		int w = X-Y;
		System.out.println(w);
//		Multiplication
		int r = X*Y;
		System.out.println(r);
//		Division
		int c = X/Y;
		System.out.println(c);
		a.close();
		
		
	}

}
