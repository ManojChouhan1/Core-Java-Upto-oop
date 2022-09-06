package com.rays.classes.oop;

import java.util.Date;

public class D1Ag29ConsPersonTest {
	public static void main(String[] args) {
		Date d = new Date();
		D1Ag29ConsPerson contp = new D1Ag29ConsPerson("Manoj singh","Lakhnoti",d );
		
		String s1 = contp.getName();
		String s2 = contp.getAddress();
		Date dd = contp.getDob();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(dd);
		
	}

}
