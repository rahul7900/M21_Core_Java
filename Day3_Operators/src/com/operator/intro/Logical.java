package com.operator.intro;

public class Logical {

	public static void main(String[] args) {
		int a=7,b=9;
		boolean res=(a<b && b>10);
		boolean res1=(a<b || b>10);
		boolean res2=!(a<b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
