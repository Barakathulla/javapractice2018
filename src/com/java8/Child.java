package com.java8;

class Parent{
	
	public void method(){
		System.out.println(" Parent");
	}
}


public class Child extends Parent{
	
	@Override
	public String toString() {
		return "Child [hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public void method(){
		
		System.out.println("Child");
	}
	

	public void methodChild(){
		
		System.out.println("Child mehtod");
	}

	public static void main(String[] args) {
		
		
		Parent p= new Child();   
		p.method();
		System.out.println(p);
		Object obj = new Object();
		System.out.println(obj);
		
	}
	
	
}