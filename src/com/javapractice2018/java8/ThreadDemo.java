package com.javapractice2018.java8;

import java.io.IOException;

public class ThreadDemo implements Runnable {

	public ThreadDemo() {
		super();

	}

	final public void Demo() throws RuntimeException {

		throw new RuntimeException();

	}

	final public void Demo(int a) {

	}

	public static void main(String[] args){
		try {
			ThreadDemo td = new ThreadDemo();
			td.Demo();
			Thread t1 = new Thread(new ThreadDemo());
			t1.start();
			t1.start();
			// throw new IllegalThreadStateException();

		} finally {
			System.out.println(" finally block");

		}
		/*
		 * Thread t2 = new Thread(new ThreadDemo()); t2.start();
		 */

	}

	@Override
	public void run() {
		System.out.println(" Run method");

	}

}
