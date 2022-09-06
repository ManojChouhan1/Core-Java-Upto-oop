package com.rays.classes.oop;

public class D5MethodOverloading {
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("Add two parameter: "+c);
	}
	
	public void add(double a, double b) {
		double c = a+b;
		System.out.println("double: "+c);
	}
	public void add (String s, int b) {
		String c = s + b;
		System.out.println("Str+int: "+c);
	}
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Without parameter: " + c);
	}
	public double add(int a,int b,float c, double d) {
		double t = a+b+c+d;
		return t;
	}

}
