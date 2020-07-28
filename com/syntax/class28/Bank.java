package com.syntax.class28;

public class Bank {
	
	private long accauntNumber;
	private double balance;
	
	//setter
	public void setAccauntNumber(long accauntNumber) {
		//here can be some validation points
		this.accauntNumber=accauntNumber;
	}
	
	//getter 
	public long getAccauntNumber() {
		//here can be some validation points
		return accauntNumber;
	}
	
	public void setBalance(double balance) {
		//here can be many validation points
		this.balance=balance;
	}
	
	public double getBalance() {
		//here can be many validation points
		return balance;
	}

}
