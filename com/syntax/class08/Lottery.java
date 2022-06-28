package com.syntax.class08;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		int lucky = 17;

		// If I use while loop, I have to ask two times
		
		/**
		System.out.println("Please enter a number 1-20: ");
		num = scan.nextInt();
		
		while (num != lucky);

			System.out.println("Please enter a number 1-20: ");
			num = scan.nextInt();
		*/

		// If I use do while loop, I have to ask one times

		do {
			System.out.println("Please enter a number 1-20: ");
			num = scan.nextInt();
		} while (num != lucky);

		System.out.println("Congrats, you won!");

	}

}
