package com.java8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Country {
	private String name;

	public Country(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return name;
	}
}

public class CollectionTest {

	public static void main(String[] args) {

		String s1 = new String("India");
		String s2 = new String("India");

		if (s1 == s2) {
			System.out.println(" both are share same memroy location");
		}
		Country s3 = new Country("France");
		Country s4 = new Country("France");
		
		// Set set = new HashSet(); // Does not follow the insertion order 

		Set set = new LinkedHashSet();   // follow insertion order 
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);

		System.out.println(set);
	}

}
