package com.syntax.class02;

public class DateTypesDemo1 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * simple if statement
		 */
		
		Boolean haveMoney=false;
		if(haveMoney) {
			System.out.println("I will take my umbrella");
			
		}
	//boolean isRaining=true;
		
		boolean isRaining=false;
		
		if(isRaining) {
			System.out.println("Take the umbrella");
			
		}else {
			System.out.println("Do not take umbrella");
			System.out.println("-------------");
		}
		
		//real time example
		
	boolean buttonIsEnabled=true;
	if (buttonIsEnabled) {
		System.out.println("Login Btn is enabaled");
		
	}else {
		System.out.println("Login Btn is disabled");
	}
		
		
		//if ele ladder. Alex, Malika, Ummar
	String name="Ummar";
	
	
	if(name.equals("Alex")) {
		System.out.println("Usser logged in as Alex");
		
	}else if (name.equals("Malika")) {
		System.out.println("Usser in as Ummar");
	}else {
		
		System.err.println("Unknown Usser");
		
	}

	}

}
