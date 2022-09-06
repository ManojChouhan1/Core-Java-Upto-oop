package com.rays.exercise;

public class Ex15FindLargeNoinArray {

	public static void main(String[] args) {

		int[] arr = { 50, 20, 30, 70, 1000, 40, 80, 60, 90, 10, 5 };

		int i = 0;
		int x = 0;
		int a = 0;

		for (i = 0; i < arr.length; i++) {

			if (arr[i] > x) {

				a = arr[i];

				x = a;
			}

		}
		System.out.println("Large value print in array:- " + x);
	}

}
