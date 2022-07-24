package com.cg.pack4;

import com.cg.pack3.HDFC;

public class Encapluation {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setATM_PIN(7900);
		System.out.println("ATM PIN is "+ h.getATM_PIN());
	}
	

}
