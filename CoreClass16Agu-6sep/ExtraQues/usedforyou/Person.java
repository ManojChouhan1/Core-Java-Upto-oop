package com.rays.usedforyou;

import java.util.Date;

public class Person {
	
	private String name;
	private String Add;
	private Date Dob;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Add;
}
public void setAddress( String add) {
	Add = add;
}
public Date getDateOfBirth() {
	
	return Dob;
}
public void setDateOfBirth(Date dob) {
	Date d = new Date();
	this.Dob = dob;
}
}
