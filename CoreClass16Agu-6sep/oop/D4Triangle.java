package com.rays.classes.oop;

public class D4Triangle extends D4Shape2 {

	public int base;
	public int height;

	public D4Triangle() {

	}

	public D4Triangle(int b, int h) {
		base = b;
		height = h;

	}

	public double area() {
		double triArea = (base * height) / 2;
		System.out.println("Triangle Area = " + triArea);
		return triArea;
	}
}
