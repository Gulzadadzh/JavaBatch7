package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your country");
		String language;
		
		String country=scan.nextLine();
		
		
		switch (country) {
		
		case "Kyrgyzstan":
			language = "Kyrgyz";
		break;
		case "Kazakstan":
			language = "Kazak";
		break;
		case "Uzbekstan":
			language = "Uzbek";
		break;
		case "Tadjikstan":
			language = "Tadjik";
		break;
		
		default:
			language = "unknown";
		
		}
	System.out.println("You speak in " + language + " language");
		
	}
}
