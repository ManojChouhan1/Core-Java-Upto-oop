package com.rays.assignment;

public class GradingSystem {
	
	public static void main(String[] args) {
		
		int mark=61;
		
		if(mark>90 ) {
			System.out.println("Grading: A++");
			
		}else if(mark>80 && mark<=90) {
			System.out.println("Grading: A");
		}else if(mark>70 && mark<=80) {
			System.out.println("Grading: B++");
		}else if(mark>60 && mark<=70) {
			System.out.println("Grading: B");
		}else if(mark>50 && mark<=60) {
			System.out.println("Grading: C++");
		}else if(mark>40 && mark<=50) {
			System.out.println("Grading: C");
		}else if(mark>=33 && mark<=40) {
			System.out.println("Grading: D");
		}else {
			System.out.println("Grading: F");
		}
	}

}
