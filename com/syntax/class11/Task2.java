package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {

		String[] cars = { "Mers", "BMW", "Ford", "Tesla", "Nissan", "Volvo" };

		for (int i = 0; i < cars.length; i++) {

			System.out.println(cars[i]);

		}
		System.out.println("--------------");

		int[] numbers = { 11, 12, 13, 14, 15, 16 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		System.out.println("The sum of elements:" + sum);

		System.out.println("----Using for loop");
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			total += num;
		}
		System.out.println("The total of all numbers is: " + total);

	}

}
