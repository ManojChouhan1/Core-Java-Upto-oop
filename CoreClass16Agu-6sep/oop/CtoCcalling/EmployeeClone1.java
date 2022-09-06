package com.rays.opp.CtoCcalling;

public class EmployeeClone1 implements Cloneable{
	
	private int id;
	private String FirstName;
	private String LastName;
	public AddressClone1 addr;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public AddressClone1 getAddr() {
		return addr;
	}
	public void setAddr(AddressClone1 addr) {
		this.addr = addr;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	public AddressClone1 AddressClone1(AddressClone1 a) {
		addr =a;
		return addr;
		
	}
	
	
	
	
}
