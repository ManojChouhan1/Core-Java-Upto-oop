package com.rays.classes.oop;

public class D6Circle extends D6ShapeAbst{
	
	public int radius;
	
	public D6Circle(int r) {
		radius = r;
	}
	
public double area() {
	double c = 3.14*radius*radius;
	return c;
}
}
