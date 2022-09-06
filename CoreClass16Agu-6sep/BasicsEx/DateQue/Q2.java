package com.rays.DateQue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q2 {
	
//	Q2 maintance calender
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/mm/yyyy");
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		for (int i = 0; i <= 12; i++) {
			
			cal.add(Calendar.DATE, 30);
			
			Date Today =cal.getTime();
			
			String s = sdf.format(Today);
			
			System.out.println("Maintanance Date = "+s);
			
		}
	}


}
