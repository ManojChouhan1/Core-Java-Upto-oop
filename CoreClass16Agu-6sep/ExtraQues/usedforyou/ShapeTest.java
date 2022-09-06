package com.rays.usedforyou;

public class ShapeTest {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Ractangle();
		s[2] = new Triangle();
		
	
		Circle c = (Circle) s[0];
		c.setRadius(5);

		Ractangle r = (Ractangle) s[1];
		r.setLength(10);
		r.setWidth(10);

		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(10);

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}

		System.out.println("Total Area = " + totalArea);

	}

}
