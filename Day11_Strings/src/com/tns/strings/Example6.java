package com.tns.strings;

import java.util.StringTokenizer;

public class Example6 {

	public static void main(String[] args) {
			StringTokenizer st = new StringTokenizer("Lets do this");
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
	}

}
