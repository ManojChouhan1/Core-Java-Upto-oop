package com.rays.classs.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D9Ag26TestDate {

	public static void main(String[] args) throws ParseException{
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//		
//		String sd=sdf.format(d);
//		System.out.println("dd simple: "+sd);

//		SimpleDateFormat sdf1 =new SimpleDateFormat("DD/MMM/YYYY");
//		String sd1=sdf1.format(d);
//		System.out.println("sd1:Day= "+sd1);
//		
		String dd="30/07/1946 11:12:13";
		Date d1=sdf.parse(dd);   //change from string to date format
		System.out.println(d1);
		
	}
}
