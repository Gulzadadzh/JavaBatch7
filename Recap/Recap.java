package Recap;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a user name");
		String userName = scan.nextLine();

		System.out.println("Please enter password");
		String password = scan.nextLine();

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else {

			if (password.length() > 8) {
				if (password.contains(userName)) {
					System.out.println("");
				} else {
					System.out.println("Password is too short");

				}
			}

		}
	}
}