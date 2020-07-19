package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
			System.out.println("Please enter a number.");
		
		int day = scan.nextInt();
		
			System.out.println("----Using AND----");
		
		if (day>=1 && day <=5) {
			System.out.println("It is weekday.");
		
		}else if (day >=6 && day <=7) {
			System.out.println("It is weekend");
	
		}else { 
			System.out.println("Invalid day");
		}
		
		System.out.println("-Using OR------");
		
		if (day >= 1 && day <=5) {
			System.out.println("It is a weekday");
		
		}else if (day ==6 || day == 7) {
			
			System.out.println("It is weekend");
		}else{
			System.out.println("Invalid day");
		}
		
		
		}
		
		
	}


