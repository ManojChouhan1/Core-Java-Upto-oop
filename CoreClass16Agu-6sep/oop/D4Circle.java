package com.rays.classes.oop;

public class D4Circle extends D4Shape2 {

	private static final double PI = 3.14;
	private int radius;

	public D4Circle() {

	}

	public D4Circle(int r) {
		radius = r;
	}

	public double area() {

		double carea = PI * radius * radius;
		System.out.println("Circle Area = " + carea);
		return carea;
	}

}
