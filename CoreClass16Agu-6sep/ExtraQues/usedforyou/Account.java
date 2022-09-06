package com.rays.usedforyou;

public class Account {
	private String number;
	private String account;
	private double balance;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public void deposit(double amount) {
		double t = getBalance() + amount;
		setBalance(t);
		
		System.out.println("Balance after deposit:- "+t);
	}
	public void withdrawal(double amount) {
		double to = getBalance() - amount;
		setBalance(to);
		System.out.println("Balance after withdrawal:- "+to);

	}
	public void fundtranster(double amount) {
		double tot = getBalance() - amount;
		setBalance(tot);
		System.out.println("Balance after fund transfer:- "+tot);

}
	public void billpay(double amount) {
		double tota = getBalance() - amount;
		setBalance(tota);
		System.out.println("Balance after fund billpay:- "+tota);

}
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setNumber("Account number and name:-"+"9669798620 "+"manoj singh chouhan");
		acc.setAccount("Account type:- "+"saving");
		acc.setBalance(1001);
		
		System.out.println(acc.getNumber());
		System.out.println(acc.getAccount());
		System.out.println("Account balance:- "+acc.getBalance());
		
		
		acc.withdrawal(0);
		acc.billpay(0);
		acc.fundtranster(0);
		acc.deposit(0);
		
	}
	
}
