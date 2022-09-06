package com.rays.basics;

public class WhileLoop {

	public static void main(String[] args) {

		boolean a = true;
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			System.out.println(i);
			sum = sum + i;
			i++;
			if (i > 10) {
				a = false;
				
			}
			
		}
		
		System.out.println("Sum = " + sum);	
	}

}
