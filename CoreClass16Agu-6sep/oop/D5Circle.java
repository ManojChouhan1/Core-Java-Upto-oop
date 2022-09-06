package com.rays.classes.oop;

public class D5Circle extends D5ShapePoly{
	private int radius;
	public static final double  PI = 3.14;
	
	public D5Circle() {
		
	}
	public D5Circle(int radius) {
		this.radius = radius;
	}
	public double pArea() {
		double cArea = PI * radius *radius;
		return cArea;
	}

}
