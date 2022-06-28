package com.syntax.class08;

import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String[] args) {

		/**
		 * //Create a program that will be asking user to apply for a credit card 10
		 * times. //As soon you get an “yes” from a user program should stop asking.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * for(int i = 1; i<=10; i++) {
		 * 
		 * System.out.println("Would you like to apply for a CC?");
		 * 
		 * String yes = scan.nextLine();
		 * 
		 * if(yes.equals("yes")) {
		 * 
		 * break; } }
		 */

		// We are counting 1-10
		// We want to stop the loop when reach 4

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("I am stopping the loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("We are outside of the loop");
		

		System.out.println("----CONTINUE-----");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I am skipping");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("We are outside of the loop");
		
		
		System.out.println("Skipping numbers 5 6 7");

		for (int i = 1; i <= 10; i++) {

			if (i == 4 || i ==5 || i ==8) {
				//System.out.println("I am skipping");
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Skipping number from 35-55");
		
		for (int i = 1; i <= 100; i++) {

			if (i >= 35 && i<=55) {
				//System.out.println("I am skipping");
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
