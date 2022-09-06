package com.rays.classes.oop;

public class D1Ag29TestAutomobile {
	public static void main(String[] args) {
		
		D1Ag29Automobile bike = new D1Ag29Automobile();
		
		bike.setColor("Gray");
		bike.setMake("Tesla");
		bike.setSpeed(100);
		
		System.out.println("color :- "+bike.getColor());
		System.out.println("MAKE by:- "+bike.getMake());
		System.out.println("Default SPEED:- "+bike.getSpeed());
		
		
		System.out.println("..........Start Now..........");
//		Picture start from here
		
		bike.accelerator(20);
		System.out.println("Accelerator presed Speed is:- "+bike.getSpeed());
		
		
		bike.changeGear(5);
		System.out.println("SPEED:- "+bike.getSpeed());

		
		bike.breakk(20);
		
		System.out.println("Break presed Speed is:- "+bike.getSpeed());
		
		
		
		
		
	}

}
