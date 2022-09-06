package com.rays.classes.oop;

public class D3Ractangle extends D3Sep1Shape {
	
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//Method
	public double getArea() {
		double area = length*width;
		return area;
	}
	

}
