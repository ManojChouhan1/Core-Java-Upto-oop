package com.rays.classes.oop;

public class D5Triangle extends D5ShapePoly{
	
	private int base;
	private int height;
	
	public D5Triangle(){
		
	}
	public D5Triangle(int b, int h){
		base = b;
		height = h;
	}
	
	public double pArea() {
		double tArea = ((base * height)/2);
		return tArea ;
	}
}
