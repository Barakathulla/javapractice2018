package com.javapractice2018.java8;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args){
		
		HashMap<String,String> map= new HashMap<String,String>();
		
		map.put("k1","value");
		map.put("k1", "value2");
		
		System.out.println(map);
		
	}
	
	
}
