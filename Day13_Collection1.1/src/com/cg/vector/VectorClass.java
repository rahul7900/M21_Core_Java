package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		//v.add(11);
		//v.add("Rahul");
		//v.add(34.6f);
		v.add(0, "Raj");
		v.add(1, 'R');
		v.add(2,45);
		System.out.println(v);
		System.out.println(v.set(1,'a'));
		

		//copying all the elements of vector into arrayList using addAll method
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		a.clear();
		System.out.println(a);

	

		

	}

}