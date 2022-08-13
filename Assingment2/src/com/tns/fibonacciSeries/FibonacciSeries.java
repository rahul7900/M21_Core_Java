package com.tns.fibonacciSeries;

public class FibonacciSeries {
	  public static int fibRecursion(int a) {
		    if (a == 0) {
		      return 0;
		    }

		    if (a == 1 || a == 2) {
		      return 1;
		    }

		    return fibRecursion(a - 1) + fibRecursion(a - 2);
		  }
	public static void main(String[] args) {
//		int a =0,b=1;
//		System.out.print(a+" "+b);
//		for(int i = 2;i<10;++i) {
//			int c=a+b;
//			System.out.print(" "+ c);
//			a=b;
//			b=c;
//		}
	    int n = 9;
	    for (int i = 0; i < n; i++) {
	      System.out.print(fibRecursion(i) + " ");
	    }
	}

}
