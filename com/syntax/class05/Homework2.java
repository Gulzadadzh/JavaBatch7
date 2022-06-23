package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your number of working year!");

		int years = scan.nextInt();

		if (years >= 5) {
			System.out.println("You are elligible for the bonus!");

			System.out.println("Please enter your annual salary!");

			double salary = scan.nextDouble();

			if (salary > 50000) {

			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {

			System.out.println("You not eligible for the bonus");
		}
	}

}
