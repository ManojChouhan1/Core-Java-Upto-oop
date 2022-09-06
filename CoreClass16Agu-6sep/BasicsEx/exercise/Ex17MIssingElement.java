package com.rays.exercise;

public class Ex17MIssingElement {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		int[] b = {10,20,30,40};
		
		missingElement(a,b);
	}

	private static void missingElement(int[] a, int[] b) {
		
		int c = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a.length>b.length) {
					
					c = a[i];
				}
			}
			
		}
		System.out.println(c);
	}
}


