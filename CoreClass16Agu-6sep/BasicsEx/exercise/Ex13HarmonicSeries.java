package com.rays.exercise;

public class Ex13HarmonicSeries {
//Q13 Write a program to generate Harmonic series?
	
	public static void main(String[] args) {
		
	
	int n = 15;
	
	int j=0;
	
	System.out.print("Harmonic series is :- ");
	
	for(int i = 1; i < n; i++) {
		
		j=i+1;
	
		System.out.print(1+"/"+i+" + ");
	}
	     System.out.println("1/"+j);
	}
}