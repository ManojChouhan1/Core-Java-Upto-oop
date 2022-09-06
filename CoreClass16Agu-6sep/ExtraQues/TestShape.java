package com.rays.datee;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.setColor("Red");
		s.setBorderWidth(101);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}

}
