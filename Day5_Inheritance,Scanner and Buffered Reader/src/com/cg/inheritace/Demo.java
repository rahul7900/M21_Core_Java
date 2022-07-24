package com.cg.inheritace;
class Mother
{
	static int val=5;
	static int display()
	{
		return val;
		//System.out.println("My Mother name is: Geeta");
		
	}
}
class Daughter extends Mother
{
//	static int val;
	static int display()
	{
		return val;
		//System.out.println("My Father name is: Rajkumar");
	}
}

public class Demo {
	public static void main(String[] args)
	{
		
		Daughter d=new Daughter();
		System.out.println(d.display());
		
		

	}

}
