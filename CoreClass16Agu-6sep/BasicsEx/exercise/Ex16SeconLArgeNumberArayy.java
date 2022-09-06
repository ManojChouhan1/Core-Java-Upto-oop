package com.rays.exercise;

public class Ex16SeconLArgeNumberArayy {
	
	public static void main(String[] args) {
		
		int[] arr = {10,50,20,40,60,30,15};
		
		int x = 0;
		int y = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
		if(arr[i]>x) {
			y=x;
			x=arr[i];
			
		}else if (arr[i]>y && arr[i]<x){
			y=arr[i];
			
			
		}
		}
		System.out.println("Second largest number:- "+y);
	}

}
