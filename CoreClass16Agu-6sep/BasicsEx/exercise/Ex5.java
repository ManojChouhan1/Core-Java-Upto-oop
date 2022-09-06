package com.rays.exercise;

public class Ex5 {
	public static void main(String[] args) {
//		Q5 Write a program to reverse digit of a given number ?
		int i = 0;
		int n = 123;
		int a = 0;
		while(i < n) {
			
			int r = n%10;
			
			System.out.print(r);
			
			n = n/10;
			
			a=r;
		}System.out.println("a"+a);
	}

}
