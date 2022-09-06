package com.rays.exercise;

public class Ex4 {
	public static void main(String[] args) {
//		Q4 Write a program to find factorial of given number?
		
		int i=1;
		int fact = 1;
		
		for ( i =1; i <=10; i++) {

			fact = fact * i ;
			
			System.out.println(i+"!:- "+fact);
		}
	}

}
