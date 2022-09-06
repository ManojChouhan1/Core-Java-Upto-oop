package com.rays.usedforyou;

public class Shape {

	private String color;
	private int Bandwidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBandwidth() {
		return Bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		Bandwidth = bandwidth;
	}

	public double area() {
		return 0;
	}

	public Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Ractangle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return null;

	}
}
