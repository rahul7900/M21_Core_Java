package com.cg.abstractclass;
//program for abstract class
abstract class Fruit
{
	//abstract method
	abstract void display();
}

class Apple extends Fruit
{
	//provide implementation for abstract method
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//we can't create the obj.for abstract class
//				Fruit f=new Fruit();
				Fruit f=new Apple();
//				Apple f=new Apple();
				f.display();
	}

}
