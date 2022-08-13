package com.cg.set;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set <Object>obj= new LinkedHashSet<Object>();
		obj.add("Rahul");
		obj.add("r");
		obj.add(7.5);
		obj.add(65);
		obj.add(null);
		System.out.println(obj);
	}	

}
