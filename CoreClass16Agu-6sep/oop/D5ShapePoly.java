package com.rays.classes.oop;


public class D5ShapePoly {

	private String color;
	private int bandWidth;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBandWidth() {
		return bandWidth;
	}
	public void setBandWidth(int bandWidth) {
		this.bandWidth = bandWidth;
	}
	public double pArea() {
		return 0;
	}
	public D5ShapePoly getD5ShapePoly(int i) {
		
		if (i == 1) {
			return new D5Circle();
		}
		if (i == 2) {
			return new D5Ractangle();
		}
		if (i == 3) {
			return new D5Triangle();
		}
		return null;

	}
	
}
