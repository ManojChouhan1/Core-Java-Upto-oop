package com.rays.classes.oop;

public class D2Ag29Constructor {
	
	private String color ;
	private int borderWidth;
	private static final float PI = 3.14f;

	public D2Ag29Constructor() {
		
//		System.out.println("Constructor");
//		class and constructor name same 
	}

	public D2Ag29Constructor(String c ,int b) {
//		parameter constructor
		color = c;
		borderWidth = b;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public static float getPI() {
		return PI;
	}
	
	
}
