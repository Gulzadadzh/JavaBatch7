package com.syntax.class25;

public class FinalKeyword {

	public static String str="Hello";
	
	public static final String USERNAME ="Admin";
	
	public final String PASSWORD ="Admin 123";
	
	public static void main(String[] args) {
		
		System.out.println(str);
		str="Hi";
		System.out.println(str);
		
		System.out.println(USERNAME);
		//username="username123"; CE: variable is final and we cannot change it is value
		
		FinalKeyword fk=new FinalKeyword();
		//fk.PASSWORD ="user123"; CE: variable is final
		
		System.out.println(fk.PASSWORD);
		
	}
	public void hello() {
		System.out.println("last hello of today");
	}
	class FinalBaby extends FinalKeyword{
		
		//FINAL METHODS CANNOT OVERRIDDEN
		//public void hello(){ CE
		//	System.out.println("Sorry it not last hello");
	    //}
	}
}
