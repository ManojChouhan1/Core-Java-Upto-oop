package com.rays.classes.oop;

public class D3CircleTest {
	
	public static void main(String[] args) {
		D3Circle c = new D3Circle();
		
		c.setRadius(10);
		double area = c.getArea();
		
		System.out.println("Area of circle:- "+area);
	}

}
