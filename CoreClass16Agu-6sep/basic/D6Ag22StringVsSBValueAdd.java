package com.rays.classs.basic;

public class D6Ag22StringVsSBValueAdd {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println("value 8-8 byte: "+s1.equals(s2));  //value 8bytes same
		System.out.println(s1==s2);                           //Address 2byts same
		
//		......String new keyword.......    //
		System.out.println("...New keyword..."); 
		String s3=new String("java");
		String s4=new String("java");
		System.out.println("value 8-8 byte: "+s3.contentEquals(s4)); //value 8bytes same
		System.out.println(s3==s4);                                  //Address 2byts Notsame
	}

}
