package com.cg.lamexp;
interface D
{
	String show(String str1,String str2);
}
public class LambdaExp {

	public static void main(String[] args) {
		/*D obj=(String str1,String str2)->
		{
			//concat the two string
			return str1+str2;
		};*/
		D obj=(String a,String b)->(a+b);

		System.out.println("Strings are: "+obj.show("Shiwani"," "+ "Nia"));

	}

}