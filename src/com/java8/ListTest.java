package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args){
		String arr[]={"Sunday","Monday","Tuesday","Thursday","Friday","Saturday"};
		List<String> list = new ArrayList<>();
		
		
		
		for(String s :arr){
			if(s.startsWith("T")){
				System.out.println(s);
			}
		}
		// repeated characters
		
		String name = "abcdefaa";
		for(int i=1;i<name.length();i++ ){
			char c= name.charAt(i);
			
		}
		
	}

}
