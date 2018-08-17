package com.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FuntionalDemo {

	public void abstractDemo();

	public abstract void demo();

}

public class Java8Demo {

	public static void main(String[] args) {

		new Java8Demo() {

		};

		List<String> names = new ArrayList<>();
		names.add("shaik");
		names.add("nisar");
		System.out.println(names);

	}

}
