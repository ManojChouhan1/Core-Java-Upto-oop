package com.rays.classes.oop;

public class D1Ag29TestSetGetColorBw {
	
	public static void main(String[] args) {
		
		D1Ag29SetterGetter s = new D1Ag29SetterGetter();
		
		 s.setcolor("LAL");
		 
		 String s1 = s.getcolor();
		 
		 System.out.println(s1);
		 
		 s.setBorderWidth(101);
		 
		 int i = s.getBorderWidth();
		 
		 System.out.println(i);
	}

}
