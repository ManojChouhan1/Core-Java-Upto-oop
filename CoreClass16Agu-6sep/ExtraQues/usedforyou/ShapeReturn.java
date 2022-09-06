package com.rays.usedforyou;

public class ShapeReturn {

	public static void main(String[] args) {
		Shape s = new Shape();

		Circle c = (Circle) s.getShape(1);
		c.setRadius(5);

		Ractangle r = (Ractangle) s.getShape(2);
		r.setLength(10);
		r.setWidth(10);

		Triangle t = (Triangle) s.getShape(3);
		t.setBase(10);
		t.setHeight(10);

		c.area();
		r.area();
		t.area();

	}

}
