package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
//		1.Compile-Time checking and type safe
//		obj.add("12");
		System.out.println(obj);
//		Typecasting not requried in generics
		List<String>obj1=new LinkedList<String>();
		obj1.add("Rahul");
		obj1.add("Shiro");
		String str=obj1.get(1);
		System.out.println(str);
		
//		Typecasting method
//		List obj2=new LinkedList();
//		obj2.add("Rahul");
//		obj2.add("Shiro");
//		String str1=(String)obj2.get(1);
//		System.out.println(str1);
		
	}

}
