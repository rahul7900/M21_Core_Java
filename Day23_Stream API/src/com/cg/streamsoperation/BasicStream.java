package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream<String>obj=Stream.of("Shabnam","Ashlesha","Shubham","Vaibhav");
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		//stream can be accquired from array or collections
		List<String>obj1=Arrays.asList(new String[] {"Mumbai","Pune","Nagpur","Nashik"});
		obj=obj1.stream();
		//obj.forEach((i)->System.out.print(i));
		obj.forEach(System.out::println);

	}

}