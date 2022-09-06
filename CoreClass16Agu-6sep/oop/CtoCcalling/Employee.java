package com.rays.opp.CtoCcalling;

public class Employee extends Person {
//	constructor to constructor calling
	private String designation;
	
	public Employee() {
		System.out.println("Defaut constructor");
	}
	public Employee(String fn, String ln, String addrd,String deg ) {
	super(fn,ln,addrd);
	designation = deg;
		
		System.out.println("4 parameter  "+FirstName+" "+LastName+" "+Address+" "+designation);
	}
	//method
	public void changeAddress() {
		System.out.println("*********");
		super.changeAddress();
		System.out.println("Employee change Address");
	}
	
	
	
	public static void main(String[] args) {
		
		Person p1 = new Employee("jeevan","Singh","khandwa","Manager");
		
		p1.changeAddress();
		
		
	}

}
