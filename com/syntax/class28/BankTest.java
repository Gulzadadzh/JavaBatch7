package com.syntax.class28;

public class BankTest {

	public static void main(String[] args) {
	
		
		Bank bank=new Bank();
		bank.setAccauntNumber(123456789);
		System.out.println(bank.getAccauntNumber());

		bank.setBalance(1000);
		System.out.println(bank.getBalance());
	}

}
