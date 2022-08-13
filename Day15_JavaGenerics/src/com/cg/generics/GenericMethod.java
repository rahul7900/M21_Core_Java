package com.cg.generics;

public class GenericMethod {

	public static void main(String[] args) {
		
		Integer arr[]= {11,22,33};
		Character ch[]= {'R','A','H','U','L'};
		System.out.println("Integer Array: ");
		print(arr);
		System.out.println("Character Array: ");
		print(ch);
	}
		
		
		
		
		
		
		
//		E is the element
		public static <E>void print(E[] elements){
			for(E elem:elements) {
				System.out.println(elem);
			}
			System.out.println();
			
			
		
	}

}
