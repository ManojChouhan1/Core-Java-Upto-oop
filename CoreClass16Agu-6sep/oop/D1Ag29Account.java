package com.rays.classes.oop;

public class D1Ag29Account {
	
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void withdrawal(double Amount) {
		double Total = getBalance() - Amount;
		setBalance(Total);
		System.out.println("Balance after Withdrawal:- "+Total);
	}
	
	public void deposit(double Amount) {
		double Total = getBalance() + Amount;
		setBalance(Total);
		System.out.println("Balance after Deposite:- "+Total);
	}
	public void paybill(double Amount) {
		double Total = getBalance() - Amount;
		setBalance(Total);
		System.out.println("Balnce after Paybill:- "+Total);
	}
	public void fundtranster(double Amount) {
		double Total = getBalance() - Amount;
		System.out.println("Balance after fundtransfer:- "+Total);
		
	}
}
