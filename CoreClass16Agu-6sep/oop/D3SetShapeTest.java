package com.rays.classes.oop;

public class D3SetShapeTest {
	public static void main(String[] args) {
		
		D3Sep1Shape sh = new D3Sep1Shape();
		
		sh.setBandWidth(5);
		sh.setColor("Blue");
		
		System.out.println("BandWidth:- "+sh.getBandWidth());
		System.out.println("color:- "+sh.getColor());
	}

}
