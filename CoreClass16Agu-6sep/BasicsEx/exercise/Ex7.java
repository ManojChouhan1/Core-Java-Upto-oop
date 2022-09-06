package com.rays.exercise;

public class Ex7 {
	public static void main(String[] args) {
//		Q7 Write a program to find sum of all integer between 100 and less then 200 that all divisible by 7.?
//		int a=0;
		int b=0;
		for(int i=100;i<200;i++) {
			if(i%7==0) {
				System.out.println(i);
				
				b = b+i;
			}
		}
		System.out.println("Total integer sum: "+b);
	}

}
