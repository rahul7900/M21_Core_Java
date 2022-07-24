package com.tns.decisionmaking;

public class cascaded_ifelse {

	public static void main(String[] args) {
		int a=1,b=7,c=22;
		if(a>b && a>c)
		{
			System.out.println(a);
	}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}
