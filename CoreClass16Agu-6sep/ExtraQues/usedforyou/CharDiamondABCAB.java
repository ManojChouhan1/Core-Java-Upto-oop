package com.rays.usedforyou;

public class CharDiamondABCAB {
	
	public static void main(String[] args) {
		
		for (char i = 'A'; i <= 'E'; i++) {
			
			for (char j = i; j <= 'E'; j++) {
				System.out.print(" ");
			}
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			for(char k = 'A'; k <i; k++) {
				System.out.print(k);
			}
			System.out.println();
			
		}
	for (char i = 'A'; i <= 'E'; i++) {
		
		for (char j = 'A'; j <= i+1; j++) {
			System.out.print(" ");
		}
		char n='A';
		for (char j = i; j <= 'D'; j++) {
			 
			System.out.print(n);n++;
		}char m='A';
		for(char k = i; k <'D'; k++) { 
			 
			System.out.print(m);n++;
		}
		System.out.println();
	}
	}
}