package com.rays.usedforyou;

public class Ractangle extends Shape {

	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		double rarea = length * width;
		System.out.println("Rectangle Area = " + rarea);
		return rarea;
	}

}
