package com.rays.datee;

public class ForeachLoop {
	public static void main(String[]args) {
//		int a = 5;
//		System.out.println(a);
	
	//	System.out.println("Array....");
	int[]arr = {5,10,15,20,25,30,35,40,45,50};
	//System.out.println(arr [6] );

	System.out.println("...forloop...");
	for (int i=0;i<=9;i++) {
		System.out.println(arr[i]);
		
		System.out.println("...foreach...");
		for (int v:arr) {
			System.out.println(v);
		}
	}
	

	}
}


