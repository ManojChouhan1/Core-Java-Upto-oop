package com.rays.exercise;

public class Ex6Fibonancci {
	public static void main(String[] args) {
//		Q6 Write a progra to find Fibonancci series  of a given number?
		int i=0;
		int a=0;
		int b=1;
		while(i<11 ) {
			System.out.println(a);
			i++;
			int c=a+b;
			a=b;
			b=c;
		}
		
	}

}
