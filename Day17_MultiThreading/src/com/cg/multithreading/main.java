package com.cg.multithreading;

public class main extends Thread  {
	public void run() {
		System.out.println("Thread passed");
	}

	public static void main(String[] args) {
		main m= new main();
		m.start();
		m.start();
		
	}

}