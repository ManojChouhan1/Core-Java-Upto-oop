package com.rays.exercise;

public class Ex11PrimeOrNot {
//Q11 write a program to find whether the given number is prime or not?
	
	public static void main(String[] args) {
		
		int Number= 9;
		
		int prime =0;
		//int nonPrime =0;
		
		int n;
		n = Number;
		
		for(int i = 2; i < n; i++) {
			
			if(n%i==0) {
				//System.out.println("Given number is Composite");
				++prime;
			}
			
			else {
				//System.out.println("Given number is prime");
				//++nonPrime;
			}
		}
		
		if(prime>0) {System.out.println("Given number is Composite");
	}
		else {System.out.println("Given number is prime");

			
		}
  }
}
