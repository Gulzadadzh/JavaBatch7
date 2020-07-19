package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter birth of your month");
		
		String month = scan.next();
		String season;
		
		switch (month.toLowerCase()) {  //.toLowerCase() converts DECember --> december
		
		case"december":
		case"january":
		case"february":
			season = "Winter";
			break;
			
		case"march":
		case"april":
		case"may":
			season = "Spring";
			break;
			
		case "june":
		case"july":
		case"augest":
			season = "Summer";
			break;
			
		case "september":
		case"october":
		case"november":
			season = "Fall";
			break;
			
			default:
				season ="unknown";
		}
		
		System.out.println("You were born in " + season);
			
			
	}
}
