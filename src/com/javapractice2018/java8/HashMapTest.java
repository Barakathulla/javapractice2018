package com.javapractice2018.java8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, String> map1 = new Hashtable();
		map1.put(null, "value");
		// System.out.println(map1.toString());
		// System.out.println("null");

		for (String message : map1.keySet()) {
			System.out.println(""+message);

		}
		
	

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("k1", "value");
		map.put("k1", "value2");
		map.put(null, "hello");
		System.out.println(map);
		for (String set : map.keySet()) {
			System.out.println(map.get(set));

		}

	}

}
