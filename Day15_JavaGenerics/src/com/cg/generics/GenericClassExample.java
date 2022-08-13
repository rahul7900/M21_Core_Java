package com.cg.generics;


public class GenericClassExample <T>{
	T num;
	public void display() {
		System.out.println(num.getClass().getName());
		
	}

	public static void main(String[] args) {
		GenericClassExample<Integer> obj = new GenericClassExample<Integer>();
		obj.num=15;
		obj.display();
		
			
	}

}
