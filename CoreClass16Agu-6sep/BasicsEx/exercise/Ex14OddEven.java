package com.rays.exercise;

public class Ex14OddEven {

	public static void main(String[] args) {
		
//		Q14 write a program to find average of consecutive even and odd number sepratly in Array? 
		
		int a=0;
		int b=0;
		int y=0;
		int x=0;
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 

		for (int i = 0; i < arr.length; i++) {
			
		if (arr[i]%2 == 0) {

			++x;
			System.out.println("Even number:- "+arr[i]);
			a=a+arr[i];
		}

		else {

			System.out.println("Odd number:- "+arr[i]);
			b=b+arr[i];
			
			++y;
		}
	}
		

		System.out.println("Avrage of EVEN number :- "+(a/x));
		System.out.println("Avrage of ODD number :- "+(b/y));

}
}

