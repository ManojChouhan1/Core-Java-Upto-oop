package com.rays.opp.CtoCcalling;

public class Person {
	
	protected String FirstName;
	protected String LastName;
	protected String Address;
	
	public Person() {
		System.out.println("Defaut conctructor");
	}
	
	public Person(String fn, String ln) {
		FirstName = fn;
		LastName =ln;
		System.out.println("Parameter  2 "+FirstName +" " +LastName);
	}
	
	public Person(String fn, String ln, String addr) {
		this(fn, ln);
		Address = addr;
		System.out.println("Parameter 3 "+FirstName +" " +LastName+" "+Address);
	}
	//method
	
	public void changeAddress() {
		System.out.println("Person change Address");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Person p = new Person("manoj","Chouhan","indore");
		
	p.changeAddress();
	}

}
