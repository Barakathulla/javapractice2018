package com.javapractice2018.java8;

import java.io.IOException;

public class ExceptionTest extends RuntimeException {

	public ExceptionTest(){
		
	}
	
	public ExceptionTest(String message) {
		super(message);
	}

	public void demoMethod() throws ExceptionTest{
		
		
	try{
		throw new ExceptionTest("Custome Exception");
	}finally{
		
	}
	
	
	}
	
	public static void main(String[] args){
		
		
		ExceptionTest obj = new ExceptionTest();
		obj.demoMethod();
		
		
	}
	
}
