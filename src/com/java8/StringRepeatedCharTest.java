package com.java8;

public class StringRepeatedCharTest {

	public static void main(String[] args) {

		String message = "Barakathulla";
		// getRepeatedCharCount(message);

		String number = "123";
		System.out.println(reverseNumber(number));

	}

	public static String reverseNumber(String number) {
		String temp = "";
		if (number != null) {
			for (int i = number.length() - 1; i >= 0; i--) {
				temp += number.charAt(i);
			}
			System.out.println(number.length());
		}
		return temp;
	}

	public static void getRepeatedCharCount(String message) {

		if (message == null) {
			System.out
					.println(" give message are empty please provide valide data");
		}

	}

}
