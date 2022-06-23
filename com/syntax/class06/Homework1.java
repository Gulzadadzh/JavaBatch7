package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter birth of your month");
		String month = scan.nextLine();
		
		String season;
		
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";

		} else if (month.equals("September") || month.equals("Ocober") || month.equals("November")) {
			season = "Autumn";

		}else {
			season= "unknown";
		}
		
		System.out.println("You were born in " + season);

	}
}
