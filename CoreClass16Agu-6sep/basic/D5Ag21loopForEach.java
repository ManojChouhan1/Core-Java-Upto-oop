package com.rays.classs.basic;

public class D5Ag21loopForEach {
public static void main(String[] args) {
		
		int var=0;    // variable
		System.out.println("varriable:- "+var);
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};   //Array;- print index value
//		IndexofArray: 0  1    2   3   4   5   6   7   8   9
		System.out.println("Array:- "+arr[9]);
		
		
		System.out.print("ArrayAll:- ");          //for:- all Array print
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+",  ");
		}
	System.out.println(" ");
	
	
	  System.out.print("for Each:- ");             //for each loop
	  for( int j: arr){
	  System.out.print(j+",  ");
	  }
}

    
}
