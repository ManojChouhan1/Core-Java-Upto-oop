package com.rays.exercise;

public class Ex8 {
	public static void main(String[] args) {
//		Q8 Write the program to create the display 2 diamentional aaray
//		that contain table from 2 to 10 (9row 10 columns) 
		
		int n=10;
		
		for(int i=2; i<=n; i++) {
			
			for(int j=1; j<=10; j++) {
				
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
