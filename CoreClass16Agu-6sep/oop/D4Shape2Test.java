package com.rays.classes.oop;

public class D4Shape2Test {

	public static void main(String[] args) {

		D4Shape2[] s = new D4Shape2[3];

		s[0] = new D4Circle(10);
		s[1] = new D4Ractangle(5, 10);
		s[2] = new D4Triangle(10, 20);

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea = totalArea + s[i].area();

		}

		System.out.println("Total Area = " + totalArea);

	}

}
