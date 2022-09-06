package com.rays.classes.oop;

public class D4Ractangle extends D4Shape2 {

	public int length;
	public int width;

	public D4Ractangle() {

	}

	public D4Ractangle(int l, int w) {
		length = l;
		width = w;
	}

	public double area() {
		double area = length * width;
		System.out.println("Rectangle Area = " + area);
		return area;
	}
}
