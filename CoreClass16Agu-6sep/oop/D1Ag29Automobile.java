package com.rays.classes.oop;

public class D1Ag29Automobile {
	
	private String color;
	private int speed;
	private String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	//Method
	
	public void breakk(int spd) {
		int speed = getSpeed()-spd;
		setSpeed(speed);
		
	}
	public void accelerator(int spd) {
		int speed = getSpeed()+spd;
		setSpeed(speed);
		
	}
	
	public void changeGear(int gear) {
		if(gear==1) {
			speed=10;
			}
		if(gear==2) {
				speed=20;
		}
		if(gear==3) {
			speed=40;
	}
		if(gear==4) {
			speed=60;
	}
		if(gear==0) {
			speed=0;
	}
		
	}
}
