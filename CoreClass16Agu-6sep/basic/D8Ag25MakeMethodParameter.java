package com.rays.classs.basic;

public class D8Ag25MakeMethodParameter {

//AM  ReturnType method Parameter	
public void      add   (int a, int b) {
		System.out.println(a + b);
	}

//	REturn type value put int, double, long, float, etc.

	private void sout() {
		System.out.println("Put return type value");
	}

	public int mult(int x, int y) {
		int z = x * y;
		return z;

	}

	public static void main(String[] args) {
		D8Ag25MakeMethodParameter a = new D8Ag25MakeMethodParameter();

		a.add(5, 20);
		a.sout();
		int p = a.mult(10, 50);
		System.out.println("Hold: "+p);
		
		System.out.println("DirectPut: "+a.mult(10, 60));	
		
	}

}
