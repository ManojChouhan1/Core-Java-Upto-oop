package com.rays.exercise;

public class Ex10 {
	public static void main(String[] args) {
//		Q10 write a program to find whether the given number is Armstrong or not?
//		371=3^3+7^3+1^3 
		
		int n=123;
		
		int sum = 0;
		
		int l = n;
		
		while(l != 0) {
			
			int r = l%10;
		
			int	j = r*r*r;
			
		    sum =  sum + j ;
			
			int k = l/10;
			    
			    l = k;
//		                 System.out.println("3^3+7^3+1^3 = "+sum);
			    }
		
		if(n==sum ) {
			         System.out.println("This is Armstrong number");
		}
		else {
			System.out.println("This is NOT Armstrong number");
	
		}
	}
}

