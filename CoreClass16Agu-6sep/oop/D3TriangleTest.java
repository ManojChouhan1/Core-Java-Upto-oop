package com.rays.classes.oop;

public class D3TriangleTest {
	
	public static void main(String[] args) {
		
		D3Triangle t = new D3Triangle();
		
		t.setBase(5);
		t.setHeight(10);
		double A = t.area();
		System.out.println(A);
	}
	


}
