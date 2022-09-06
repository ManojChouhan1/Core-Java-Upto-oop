package com.rays.classes.oop;

public class D1Ag29TestAccount {

	public static void main(String[] args) {
		
		D1Ag29Account money = new D1Ag29Account();
		
		money.setAccountType("Saving");
		
		money.setNumber("9669798620");
		
		money.setBalance(500000.50006);
		
		System.out.println(money.getAccountType());
		
		System.out.println(money.getNumber());
		
		System.out.println(money.getBalance());
		
		money.deposit(80000);
		money.withdrawal(300000.30003);
		money.paybill(0.10001);
		money.fundtranster(100000);
	}
}
