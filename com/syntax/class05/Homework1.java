package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean cc = false;

		System.out.println("Do you have a Credit card? (true or false)");

		if (cc) {
			System.out.println("What is your Credit card balance?");

			double balance = scan.nextDouble();

			if (balance > 1000) {
				System.out.println("Please pay off immediatly!");
			} else {
				System.out.println("You can spend more");

			}
		} else {
			System.out.println("Let me offer you our best credit card");
		}
	}

}
