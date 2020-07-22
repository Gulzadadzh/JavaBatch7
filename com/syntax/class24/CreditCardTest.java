package com.syntax.class24;

public class CreditCardTest {

	public static void main(String[] args) {
		
		Visa visa=new Visa(100);
		double interest=visa.dailyInterest();
		System.out.println(interest);
		
		
		AX ax=new AX(100);
		double intr=ax.dailyInterest();
		System.out.println(intr);
		
		
		
		

	}

}
