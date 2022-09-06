package com.rays.basics;

public class StringBufferClass {
	
	public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer("Vijay");
	sb.append(" Dinanath Chouhan");
	
	System.out.println("Lenght:- "+sb.length());
	System.out.println("Capacity:-"+sb.capacity());
	System.out.println("charAt:-"+sb.charAt(2));
	System.out.println("Index of:- "+sb.indexOf("Dinanath"));
	System.out.println("Replace of:- "+sb.replace(0,5,"jay"));
	System.out.println("Reverse:- " +sb.reverse());
	
	}

}
