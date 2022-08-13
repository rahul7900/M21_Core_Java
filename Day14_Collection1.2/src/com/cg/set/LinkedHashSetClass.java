package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set <Object>obj= new LinkedHashSet<Object>();
		obj.add("Rahul");
		obj.add(2);
		obj.add(8.9f);
		System.out.println(obj);
		Object[] arr= obj.toArray();
//		for (int i =0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(Object itr:arr) {
			System.out.println(itr);
		}
	}

}
