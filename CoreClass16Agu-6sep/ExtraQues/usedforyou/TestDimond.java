package com.rays.usedforyou;

public class TestDimond {
	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
				}
			for (int k = 1; k <= i; k++) {
				//System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
//		
//		for(int i=5; i>1; i--) {
//			for (int j = i; j < 7; j++) {
//				System.out.print(" ");
//				}
//			for (int k = i; k > 2; k--) {
//				System.out.print(" ");
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
