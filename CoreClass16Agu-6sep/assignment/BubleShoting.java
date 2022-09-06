package com.rays.assignment;

public class BubleShoting {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 9, 10, 7 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int a;

					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;

				}

			}
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
}
