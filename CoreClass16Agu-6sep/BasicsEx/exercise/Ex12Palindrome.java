package com.rays.exercise;

public class Ex12Palindrome {
//Q12 write a program to find whether the given number is palindrome or not?

	public static void main(String[] args) {
		
		int Number =12321;
		
		
		int n = Number;
		int Return = 0;
		
		while(n != 0) {
			
			int reminder = n%10;
			
			Return = Return *10 + reminder;
			
			int i = n/10;
			
			n = i;
			
		}
		
		System.out.println();
		if(Return==Number) {
			
			System.out.println("Given number is polidrome number");
		}else {
			System.out.println("Given number is NOT polidrome number");

		}
	}
}
