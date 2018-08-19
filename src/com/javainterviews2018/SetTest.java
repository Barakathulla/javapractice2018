package com.javainterviews2018;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		Set set = new TreeSet<>();
		set.add(5);
		set.add(3);
		set.add(2);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
