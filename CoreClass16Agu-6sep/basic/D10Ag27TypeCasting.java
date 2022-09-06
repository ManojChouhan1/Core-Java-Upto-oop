package com.rays.classs.basic;

public class D10Ag27TypeCasting {

	public static void main(String[] args) {

		int i = 25;
		int j = 10;
		float res = i / j;

		System.out.println(res); // primitive typecasting

		float ress = (float) i / j;

		System.out.println("type cast;- " + ress);
		
		int a = 90;                 //97 to 122--> a-z
		char c = (char) a;         //65 to 90 --> A-Z
		System.out.println(c);

//	shorthand oprator slide 27

		int k = 0;
		k = k + 5;
		System.out.println(k);
	}
}

             // impliset Typecasting \\


//  int i=5  --> short s=(short) i; or  float f=(float) i;
//  