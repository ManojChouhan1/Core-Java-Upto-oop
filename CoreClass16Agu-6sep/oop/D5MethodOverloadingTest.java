package com.rays.classes.oop;

public class D5MethodOverloadingTest {
	
	public static void main(String[] args) {
		
		D5MethodOverloading m = new D5MethodOverloading();
		
		m.add(10, 10);
		
		m.add(10.5, 10.5);
		
		m.add();
		
		m.add( "Ram ", 10);
		
		double x = m.add(10, 20, 30, 40);
		
		System.out.println("return type : "+x);
	}

}
