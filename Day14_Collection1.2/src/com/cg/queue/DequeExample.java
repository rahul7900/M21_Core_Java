package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d = new ArrayDeque<Object>();
		d.add(10);
		d.add(17);
		d.add("Rahul");
		d.add("Beauty");
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		
	}

}
