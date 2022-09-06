package com.rays.DateQue;

import java.time.LocalDate;
import java.time.Period;


public class Q1EmployeeDob {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate birthday = LocalDate.of(1965, 07, 30);
		
		Period period = Period.between(birthday, today);
		
		System.out.println("Day = "+period.getDays());
		System.out.println("month = "+period.getMonths());
		System.out.println("year = "+period.getYears());

	}

}
