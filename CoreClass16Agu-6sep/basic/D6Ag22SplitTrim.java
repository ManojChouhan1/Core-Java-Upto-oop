package com.rays.classs.basic;

public class D6Ag22SplitTrim {
	public static void main(String[] args) {
		
		String name=" Vijay Dinanath Chouhan ";
		String[] s1= name.split(" ");         //Array foreach me hold then print
		for(String s:s1)
		System.out.println("name.split: "+s);     //space pass se break karega
//		System.out.println(s1);
		
		System.out.println("Name:"+name);
		System.out.println("name.trim:"+name.trim());  //aage piche ki space hatata hai
	}

}
