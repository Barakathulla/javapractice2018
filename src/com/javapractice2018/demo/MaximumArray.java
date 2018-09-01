package com.javapractice2018.demo;


public class MaximumArray {

	static int maxDifference(int[] a) {

		int max_diff = a[1] - a[0];
		int i, j;
		if (max_diff > 0) {
			for (i = 0; i < a.length; i++) {
				for (j = i + 1; j < a.length; j++) {
					if (a[j] - a[i] > max_diff)
						max_diff = a[j] - a[i];
				}
			}
			return max_diff;
		} else
			return -1;
	}

	public static void main(String[] args) {

		MaximumArray maxdif = new MaximumArray();
		int arr[] = { 1, 1, 0, -9, 0 };
		System.out.println("Maximum differnce is " + maxdif.maxDifference(arr));

	}

}
