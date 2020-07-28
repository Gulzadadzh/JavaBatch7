package com.syntax.class27;

public interface Trustable {
	
	void trust();
		
	}
interface Bank extends Trustable{
	
	boolean MONEY=true; // public static final
	
	void deposit();//public abstact
	void withdraw();
	
	//from java 8 inside interface we can have default methods and static
	default void transferMoney() {
		System.out.println("All banks must do transfer");
	}
	
	static void checkCreditScore() {
		System.out.println("All banks must check credit score");
	}
	
}
class PNC extends Mortgage implements Bank {
	
	public void deposit() {
	System.out.println("PNC Bank takes deposit");
	
	}
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}
	public void givesLoan() {
		System.out.println("You can take a loan in BOA");
	}
	public void giveMortagage() {
		System.out.println("PNC gives mortgage");
	}
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}
class BOA implements Bank, Investments{
	
		public void deposit() {
		System.out.println("BOA takes deposit");
		
		}
		public void withdraw() {
			System.out.println("BOA gives you your money");
		}
		public void trust() {
			System.out.println("You can trust BOA with your money");
		}
		public void givesLoan() {
			System.out.println("You can take a loan in BOA");
		}
		public void doInvestments() {
			System.out.println("You can invest your money with BOA");
		}
}