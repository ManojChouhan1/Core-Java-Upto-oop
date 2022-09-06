package com.rays.classes.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class D1Ag29TestPerson {

	public static void main(String[] args) throws ParseException {
		D1Ag29Person p = new D1Ag29Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		p.setName("Manoj Singh");
		System.out.println(p.getName());

		p.setAddress("Jila Gajiyabad sultanpur site khadri gali ");
		System.out.println(p.getAddress());
		p.setDob(sdf.parse("30/07/1995"));
		String s1 = sdf.format(p.getDob());

		System.out.println(p.getDob());

		System.out.println(s1);
	}
}
