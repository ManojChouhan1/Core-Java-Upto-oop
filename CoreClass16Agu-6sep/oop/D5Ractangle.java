package com.rays.classes.oop;

public class D5Ractangle extends D5ShapePoly{
	
	private int length;
	private int width;
	
	public D5Ractangle() {
		
	}

	public D5Ractangle(int a, int b) {
		length =a;
		width =b;
	}
	
	public double pArea() {
		double rArea = length*width;
		return rArea;
	}
}
