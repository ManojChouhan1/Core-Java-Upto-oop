package com.rays.classs.basic;

public class D5Ag21StringMethod {

public static void main(String[] args) {
		
		String name= "Vijay Dinanath Chouhan";
		
		System.out.println("Name:- "+name);
		System.out.println("name.lenght():- "+name.length());
		System.out.println("name.CharAt Index(3):- "+name.charAt(3));
		System.out.println("name.indexOf(i) :- "+name.indexOf("i"));
		System.out.println("Index of last i:- "+name.lastIndexOf("i"));
		System.out.println("Dina index:- "+name.indexOf("Dina"));
		System.out.println("a replace by b:- "+name.replace("a", "b"));
		System.out.println("Lower case:- "+name.toLowerCase());
		System.out.println("Upper case:- "+name.toUpperCase());
		System.out.println("Starting:- "+name.startsWith("Vijay"));
		System.out.println("endsWith:- "+name.endsWith("han"));
		System.out.println("subString:- "+name.substring(7));
		
		String s=name.replaceAll("[a-z]", "@");         //regular exercise=regex
		System.out.println("replace all by @:- "+s);

		
	}

}


