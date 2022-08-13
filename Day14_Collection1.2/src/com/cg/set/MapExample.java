package com.cg.set;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> obj = new HashMap<Integer,String>();
//		Map<Integer,String> obj = new LinkedHashMap<Integer,String>();
		obj.put(6, "Rahul");
		obj.put(2, "Beauty");
		System.out.println(obj);
		System.out.println(obj.get(1));
	}

}
