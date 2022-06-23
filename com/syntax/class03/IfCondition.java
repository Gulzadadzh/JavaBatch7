package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		// Declare a number a compare if the larger than 100
		// if it is larger than 100. I will print --> My number is Larger

		int num = 178;

		boolean result = num > 100;

		System.out.println("Let us check");

		if (num > 100) {
			System.out.println("My number is large");
		} else {
			System.out.println("My number is small");
		}
		System.out.println("The check is complete");

		// boolean result = num > 100;
		// if (result) { // (result == true)

		// System.out.println("The result is true");
		// }

		System.out.println("---------------");

		int expectedHours = 15;
		int actualHours = 15;

		if (expectedHours >= actualHours) {
			System.out.println("I will love Java");

		} else {
			System.out.println("I will not love Java");
		}

		System.out.println("---------------");
		
		
		double  budget =10000;
		
		double carPrice =15000;
		
		if (budget > carPrice){
			System.out.println("I will buy this car");
		}else {
			System.out.println("I will NOT buy this car");
		}
		
		
		

	}

}
