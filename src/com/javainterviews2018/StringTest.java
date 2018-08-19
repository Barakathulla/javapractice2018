package com.javainterviews2018;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = s1;

		String s3 = new String("abc");
		/*System.out.println(s1 == s2);
		System.out.println(s1 == s3);*/
		
		String s4=new String("abc");
		
		
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}
}
