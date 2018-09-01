package com.javapractice2018.java8;

class B extends A {

	void methodB() {
		System.out.println(" Method from B");
	}

}

public class A {

	public void method(A obj) {
		try {
			System.out.println(" Entered");
			System.exit(1);
			System.out.println(obj
					+ " Method which Object as a Parameter get Called");

		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.out.println(" Finally block");
		}

	}

	public void method(String msg) {
		System.out.println(msg
				+ " Method which String as  a Parameter get Called");

	}

	public static void main(String[] args) {
		A obj = new A(); // instantiating Object of Class A
		obj.method("null");

		A obj1 = new B();
		obj1.method(obj1);
	}
}
