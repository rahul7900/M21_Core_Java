package operator;

import java.util.Scanner;

public class Assignment_Operator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a*=b;
		System.out.println(a);
		s.close();
	
	}

}
