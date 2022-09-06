package com.rays.assignment;

public class DiamondPatturn54321 {
	public static void main(String[] args) {

		for (int i = 5; i > 2; i--) {

			for (int j = i; j > 2; j--) {

				System.out.print(" ");
			}

			for (int k = i; k < 6; k++) {

				System.out.print(" ");
				System.out.print(i);
			}

			System.out.println();
		}

		for (int i = 2; i > 0; i--) {

			for (int j = 4; j > i; j--) {

				System.out.print(" ");

			}
			for (int k = 0; k < i; k++) {

				System.out.print(" ");
				System.out.print(i);
			}

			System.out.println();
		}
	}

}
