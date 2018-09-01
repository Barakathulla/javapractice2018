package com.javapractice2018.java8;

public class SingletonTest extends Thread {

	private final static long serialversion_id = -9989898l;

	private static SingletonTest singletonTest = null;

	private SingletonTest() {

	}

	public static synchronized SingletonTest getInstance() {

		if (singletonTest == null) {

			synchronized (SingletonTest.class) {

				if (singletonTest == null)
					singletonTest = new SingletonTest();

			}
		}
		return singletonTest;

	}

	@Override
	public void run() {
		System.out.println("Current Thread name" + Thread.currentThread());
		SingletonTest obj = SingletonTest.getInstance();
		SingletonTest obj1 = SingletonTest.getInstance();

		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}

	public static void main(String[] args) {

		SingletonTest t1 = new SingletonTest();
		SingletonTest t2 = new SingletonTest();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

}
