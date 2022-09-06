package com.rays.classes.oop;

public abstract class D6ShapeAbst {

	public String color;
	public int bw;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBw() {
		
		return bw;
	}
	public void setBw(int bw) {
		this.bw = bw;
	}
	
public abstract double area();

}