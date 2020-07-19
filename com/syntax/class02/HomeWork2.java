package com.syntax.class02;

public class HomeWork2 {
	
	public static void main(String[] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
		double num1 = 1.6;
		double num2 = 4.7;
		
		double add = num1 + num2;
		double sub = num1 - num2;
		double mult =num1 * num2;
		double div = num1 / num2;
		
		System.out.println("The additional of 2 numbers " + num1 + " and " + num2 + " is equal to " + add);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is aqual to " + mult);
		System.out.println("The devision of 2 numbers " + num1 + " and " + num2 + " is aqual " + div);
		

        //Write a program to find the square of the number 3.9. 
		//You program should say "The square of the ____ is ____ "
		
		double g1 = 3.9;
		double square = num1 * num2;
		
		System.out.println("The square of the " + num1 + " is " + square);
		

		
		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
//Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		
		int width = 5;
		int height = 8;
		
		System.out.println("The perimeter of rectangle with width " + width + " and height " + height + " is equal to " + 
		+ (width + height)*2 + " and the area is " + width*height);
		
	}

}
