package com.tns.sumRecursion;

public class sumOfDigits {
	static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
 
    
    public static void main(String args[])
    {
        int a = 12345;
        int b = sum_of_digit(a);
        System.out.println("Sum of digits in " +
                           a + " is " + b);
    }
	
		
		 
	}


