package com.rays.classes.oop.interfacee;

public class BuisnessMan extends Person implements Richman , SocialWorker  {

	@Override
	public void helpToOther() {
		System.out.println("Help to other");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("Earnmoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
	
	
	

}
