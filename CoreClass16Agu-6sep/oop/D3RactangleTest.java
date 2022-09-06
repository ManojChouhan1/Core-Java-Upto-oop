package com.rays.classes.oop;

public class D3RactangleTest{
	
	public static void main(String[] args) {
		
		D3Ractangle ract = new D3Ractangle();
		
		ract.setColor("Color parrent:- "+"Red");
		ract.setBandWidth(10);
		System.out.println(ract.getColor());
		System.out.print("BandWidth parrant:- ");
		System.out.println(ract.getBandWidth());
		
		ract.setLength(10);
		ract.setWidth(23);
		double A = ract.getArea();
		System.out.println("Ractangle Area:- "+A);
	}

}
