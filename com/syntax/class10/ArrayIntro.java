package com.syntax.class10;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {

		// Array is a tray of tea cups

		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		// Declare and initialize one array of integers
		// Scanner scan=new Scanner(System.in);

		int[] numbers = new int[4];

		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		// this is wrong --> numbers[4]

		// access elements from the array
		System.out.println(numbers[3]);

		// if the array is storing integers
		// when I get one element I will get one int
		int element0 = numbers[0];

		// We are just declaring, not initializing
		String[] carArray; // Preferred way
		String carArray1[];// works but not preferred

		// we are creating/initializing the array
		carArray = new String[3]; // the size is 3--> 0, 1, 2
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		// carArray[3]="Tesla"; // Will give runtime-error

		String car = carArray[2];
		System.out.println(car);

		System.out.println("------");

		char[] letters = new char[5];

		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'F';
		System.out.println("printing before re-assingning " + letters[3]);

		// re-assigning another letter into spot with index 2
		letters[3] = 'K';
		System.out.println("printing after re-assingning " + letters[3]);

	}

}
