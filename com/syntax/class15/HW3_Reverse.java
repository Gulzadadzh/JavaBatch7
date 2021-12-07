package com.syntax.class15;

public class HW3_Reverse {

	public static void main(String[] args) {

		/**
		 * Create a String and print it n reverse order (Sunday - yadnuS).
		 */

		String day = "Sunday";
		
		String newString = "";

		for (int i = day.length() - 1; i >= 0; i--) {

			newString += day.charAt(i);

			System.out.print(newString);
		}

	}

}
