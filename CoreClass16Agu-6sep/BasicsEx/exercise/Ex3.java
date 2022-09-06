package com.rays.exercise;

public class Ex3 {
	
//	Q3 write a program to genrate 5 random integer number between 1 to 100?
	
	public static void main(String[] args) {
		
		for(int i =1; i<=6;i++) {
		
			int MyNumber= (int) (Math.random()*10000);
		
			if(MyNumber>1000)
		
				System.out.println("one random no. : "+MyNumber);
			}
		}
	}
