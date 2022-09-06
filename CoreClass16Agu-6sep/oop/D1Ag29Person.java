package com.rays.classes.oop;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D1Ag29Person {
	
	private String name;
	private Date Dob;
	private String Add;
	
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	public void setName(String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	public void setDob(Date Dob) throws ParseException{
		//Date d = sdf.parse(Dob);
		this.Dob = Dob;
		
	}
	public Date getDob() {
		return Dob;
	}
	
	public void setAddress(String Add){
		this.Add = Add;
	}
	public String getAddress() {
		return Add;
	}
	
}
