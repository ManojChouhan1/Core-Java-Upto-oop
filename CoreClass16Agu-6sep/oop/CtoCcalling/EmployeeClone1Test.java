package com.rays.opp.CtoCcalling;

public class EmployeeClone1Test implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		AddressClone1 a = new AddressClone1();
		a.setStreet("patnipura");
		a.setCity("indore");
		a.setState("m.p.");
		
		EmployeeClone1 e = new EmployeeClone1();
		e.setId(2012);
		e.setFirstName("Mohan");
		e.setLastName("Chouham");
		e.AddressClone1(a);
		
		System.out.println(e.getId());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getAddr().getCity());
		System.out.println(e.getAddr().getStreet());
		System.out.println(e.getAddr().getState());
		
		System.out.println("<<<<<<<<<............>>>>>>>>>");
		
		EmployeeClone1 e1 = (EmployeeClone1) e.clone();
		
		System.out.println(e1.getId());
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getState());
	}
}
