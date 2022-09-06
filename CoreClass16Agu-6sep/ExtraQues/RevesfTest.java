package com.rays.datee;

public class RevesfTest {
	public static void main(String[] args) {
		int n=1234;
		int a=0;
		for(int i=0;i<n;) {
			a=n%10; 
			n=n/10;
		 System.out.print(a);
		}
		
	}

}
