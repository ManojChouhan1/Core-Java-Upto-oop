package com.rays.classes.oop;

public class D3Circle extends D3Sep1Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public  double getArea() {
		double area = PI * radius*radius;
		return area;
	}

}
