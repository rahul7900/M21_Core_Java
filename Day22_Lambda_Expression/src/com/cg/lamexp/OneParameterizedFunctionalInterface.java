package com.cg.lamexp;
//Functional Interface=which contains only one abstract method
interface B
{
	//One-Parameterized abstract method
	String print(String str);
}
public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//Lambda Expresssion
		B obj=(String str)->
		{
			
			return str;
		};
		System.out.println(obj.print("Lambda Expresssion"));
		

	}

}