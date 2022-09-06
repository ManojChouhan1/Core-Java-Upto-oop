package com.rays.usedforyou;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double area() {
		double carea = 3.14*radius*radius;
		System.out.println("Circle Area = " + carea);
		return carea;
	}

}
