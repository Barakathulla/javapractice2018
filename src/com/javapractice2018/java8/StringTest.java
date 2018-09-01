package com.javapractice2018.java8;

public class StringTest {

	public static void main(String[] args){
		String name = "Khasim";
		String name1= new String ("Khasim");
		
		if(name == name1){
			System.out.println(" == ");
		}
		if(name.equals(name1)){
			System.out.println(" equals");
		}
	}
	
	
}
