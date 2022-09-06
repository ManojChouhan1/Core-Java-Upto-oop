package com.rays.classes.oop;

import java.util.Date;

public class D1Ag29ConsPerson {

	private String name;
	private Date Dob;
	private String Add;
	
	D1Ag29ConsPerson(String name,String Add, Date Dob){
		
		this.name = name;
		this.Add = Add;
		this.Dob = Dob;
	}

	public String getName () {
		return name;
	}

	public Date getDob() {
		return Dob;
	}
	public String getAddress() {
		return Add;
	}
}
