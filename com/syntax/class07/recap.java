package com.syntax.class07;

import java.util.Scanner;

public class recap {
	public static void main(String[] args) {

		/**
		 * 
		 *
		 * boolean workDay = true;
		 * 
		 * int day = 1;
		 * 
		 * while (workDay) {
		 * 
		 * if (day < 6) {
		 * 
		 * System.out.println(" I need a day off"); day++;
		 * 
		 * } else {
		 * 
		 * System.out.println("I dont need a day off any more"); workDay=false; } }
		 */

		Scanner scan = new Scanner(System.in);

		int i = 1;

		do {
			System.out.println("Please enter youre name");
			String name1 = scan.nextLine();
			
			System.out.println("Good afternoon " + name1);
			i++;
			

		} while (i <= 5);


	}
}
