package com.javapractice2018.java8;

public class MinMaxArrayTest {

	public static void main(String[] args) {
		int array[] = { -0,8587744, 2, 85, 7, 1, 0,-99 };
		findMinMax(array);

	}

	public static void findMinMax(int[] array) {

		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(" Min " + min + " Max" + max);

	}
}
