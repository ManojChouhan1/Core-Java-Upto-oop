package com.rays.datee;

public class table6 {
public static void main(String[] args) {
	int j=0;
	int a=0;
	for(int i=1;i<=5;i++) {
		for( j=1;j<=5;j++) {
			System.out.print(a+j+"\t");
		}a=a+j-1;
		System.out.println();
	}
}
}