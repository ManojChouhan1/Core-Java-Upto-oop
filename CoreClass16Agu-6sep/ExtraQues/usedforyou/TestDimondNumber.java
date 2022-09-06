package com.rays.usedforyou;

import java.util.regex.Pattern;

public class TestDimondNumber {
	public static void main(String[] args) {
		
		for(char i='A'; i<='D'; i++) {
			
			for(char j=i; j<'E'; j++) {
				
				System.out.print(" ");
			}
			
			for(char k='A'; k<=i; k++) {
				
				System.out.print(" ");
				System.out.print(i);
			}
			
			System.out.println();
		}

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<..New Pattern..>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(char i='A'; i<='D'; i++) {
			
			char j;
			for(j=i; j<'E'; j++) {
				
				System.out.print(" ");
			}
			
			for(char k='A'; k<=i; k++) {
				
				System.out.print(" ");
				System.out.print(k);
			}
			
			System.out.println();

	}	
  }
}
