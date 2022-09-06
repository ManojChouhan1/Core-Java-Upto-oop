package com.rays.classs.basic;

public class D6Ag22StringBuffer {

	public static void main(String[] args) {
		String str="java";     //Literal
	
		String s =new String("javaa");   // New keyword
		System.out.println(str);
		System.out.println(s);
//	.................................    //
//		              Replace
		System.out.println("......Replace......");
	
		String s1=str.replace("a", "@");
		String s2=str.replaceAll("[a-z]","a");
		System.out.println(s1);
		System.out.println(s2);
	}
}
