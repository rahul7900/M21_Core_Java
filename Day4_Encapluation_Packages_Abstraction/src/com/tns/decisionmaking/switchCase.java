package com.tns.decisionmaking;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("How are you?");
			break;
		case 3:
			System.out.println("Bye");
			break;
		default:
			System.out.println("Input Invalid");
			s.close();
		}
//		System.out.println();
	}

}
