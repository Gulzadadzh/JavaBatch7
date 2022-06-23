 package com.syntax.class03;

public class ElseIfCondition {

	private static final char[] Thursday = null;

	public static void main(String[] args) {
		double num1 = 10.7;
		double num2 = 10.7;

		if (num1 > num2) {
			System.out.println("number1 is larger than mnumber 1");
		} else if (num1 < num2) {
			System.out.println("number1 is smoller than number2");

		} else {
			System.out.println("Numbers are equal");
		}

		System.out.println("We are done");

		System.out.println("-------------------------");

		if (num1 > num2) {
			System.out.println("number1 is larger than number2");

		} else if (num1 < num2) {
			System.out.println("number1 is smaller than number2");
		} else if (num1 == num2) {
			System.out.println("Numbers are equal");
		}
		System.out.println("You will newer come here");

		System.out.println("-------------");
		// if it is none of them (example when day = 10
		// print "invalid day"

		int day = 6;

		if (day == 1) {
			System.out.println("Monday");

		} else if (day == 2) {
			System.out.println("Tuesday");

		} else if (day == 3) {
			System.out.println("Wednesday");

		} else if (day == 4) {
			System.out.println("Thursday");

		} else if (day == 5) {
			System.out.println("Friday");

		} else if (day == 6) {
			System.out.println("Saturday");

		} else if (day == 7) {
			System.out.println("Sunday");

		}

	}
}
