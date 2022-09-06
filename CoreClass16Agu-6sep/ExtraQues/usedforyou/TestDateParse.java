package com.rays.usedforyou;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateParse {
	public static void main(String[] args) throws ParseException {
		
		String d="22/11/2011";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d1=sdf.parse(d);
		System.out.println(d1);
	}

}
