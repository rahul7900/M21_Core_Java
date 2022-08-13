package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
//		Set <Integer>obj= new HashSet<Integer>();
		Set <Object>obj= new HashSet<Object>();
		obj.add("Rahul");
		obj.add("r");
		obj.add(7.5);
		obj.add(65);
		System.out.println(obj);
	}

}
