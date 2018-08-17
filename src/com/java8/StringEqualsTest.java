package com.java8;

public class StringEqualsTest {
	
	public static void main(String[] args){
		
		String s1="abc";
		String s2=s1;
		String s3= new String("abc");
		String s4=s1;
		String s5=new String("abc");
		String s6=s5;
		
		
		if(s3== s1){
			System.out.println(" equals");
		}else {
			System.out.println(false);
		}
		
		if(s1== s2){
			System.out.println(" reference Check");
		}
		if(s1.equals(s2)){
			System.out.println(" equality check");
		}
		
		
	}

}
