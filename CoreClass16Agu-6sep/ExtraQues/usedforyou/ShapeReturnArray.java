package com.rays.usedforyou;

public class ShapeReturnArray {

	public static void main(String[] args) {

		Shape s1 = new Shape();

		Shape[] s2 = new Shape[3];

		s2[0] = s1.getShape(1);
		s2[1] = s1.getShape(2);
		s2[2] = s1.getShape(3);

		Circle c = (Circle) s2[0];
		c.setRadius(5);

		Ractangle r = (Ractangle) s2[1];
		r.setLength(10);
		r.setWidth(10);

		Triangle t = (Triangle) s2[2];
		t.setBase(10);
		t.setHeight(10);

		double totalArea = 0;

		for (int i = 0; i < s2.length; i++) {

			totalArea += s2[i].area();

		}

		System.out.println("Total Area = " + totalArea);

	}

}
