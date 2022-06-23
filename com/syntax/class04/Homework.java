package com.syntax.class04;

public class Homework {
	public static void main(String[] args) {

		// 1st way

		int num = 65;
		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num < 0) {
			System.out.println("Number is negotive");

		} else {
			System.out.println("Number is zero");
		}

		System.out.println("===========");
		// 2nd way

		if (num > 0) {
			System.out.println("Number is positive!");
		} else if (num == 0) {
			System.out.println("Number i zero!");
		} else {
			System.out.println("Number is negotive!");
		}

		System.out.println("===========");

		// task:3 Check whether the number is odd or even

		int num3 = 123;
		int remainder = num3 % 2;

		if (remainder == 0) {
			System.out.println(num3 + " is even");
		} else {
			System.out.println(num3 + " is odd");
		}

	}

}
