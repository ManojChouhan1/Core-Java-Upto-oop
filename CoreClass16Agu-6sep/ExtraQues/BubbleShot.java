package com.rays.datee;

public class BubbleShot {
	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				while(arr[i]>arr[j]) {
					System.out.print(arr[j]);
					i++;
				int 	a=arr[i];
//				System.out.print(a);
				}
			}
		}
	}
}
