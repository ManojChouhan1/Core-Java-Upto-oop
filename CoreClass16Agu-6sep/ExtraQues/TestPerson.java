package com.rays.datee;
import java.text.ParseException;
public class TestPerson {
	public static void main(String[]args) {
		Person p = new Person();
		String s = "30/07/1990";
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		
	
		p.setName("Rajesh");
		p.setAddress("Lal Chowki");
		p.setDob(sdf.parse(s));
		
		
		System.out.println("Name: " +p.getName());
		System.out.println("Address: " +p.getAddress());
		System.out.println("DoB: " +sdf.format(p.getDoB()));
		
	

}
}