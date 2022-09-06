package com.rays.usedforyou;

public class Triangle extends Shape {

	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area() {
		double tarea = (base * height) / 2;
		System.out.println("Triangle Area = " + tarea);
		return tarea;
	}
}
