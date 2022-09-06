package com.rays.classes.oop;

public class D5ShapePolyTest {
	
	public static void main(String[] args) {
		
		D5ShapePoly[] s = new D5ShapePoly[3];

		s[0] = new D5Circle(10);
		s[1] = new D5Ractangle(10, 5);
		s[2] = new D5Triangle(10, 20);
		
		for (int i = 0; i < s.length; i++) {
			
			
			System.out.println(s[i].pArea());
		}
	}
}
