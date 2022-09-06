package com.rays.classes.oop.interfacee;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new BuisnessMan();
		SocialWorker s = new BuisnessMan();
		Richman r = new BuisnessMan();
		
		p.setName("Manoj Singh");
		p.setAddress("Khandwa");
		
		s.helpToOther();
		
		r.earnmoney();
		r.party();
		r.donation();
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
	
	}
	
	

}
