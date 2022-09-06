package com.rays.assignment;

public class DiamondShap {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");

			}
			System.out.println("");

		}

		for (int i = 6; i > 1; i--) {
			for (int j = 7 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k > 2; k--) {
				System.out.print("*");

			}
			for (int k = i; k > 3; k--) {
				System.out.print("*");

			}
			System.out.println("");

		}
	}
}
