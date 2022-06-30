package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();

		System.out.println("How many rooms in each floor? ");
		int rooms = scan.nextInt();

		for (int i = 1; i <= floors; i++) {
			// We just moved to a new floor

			System.out.print("We are in floors # " + i + "-->");
			// we are iterating the rooms
			for (int k = 1; k <= rooms; k++) {

				System.out.print(k + "." + i + " ");
			}
			// The stairs to the next floor
			System.out.println();
		}

	}
}
