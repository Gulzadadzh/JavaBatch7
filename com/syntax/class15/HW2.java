package com.syntax.class15;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter father's name: ");
		String name1=scan.nextLine();
		
		System.out.println("Please enter mothers name: ");
		String name2=scan.nextLine();
		
		System.out.println("It is boy or girl");
		
		String gender =scan.nextLine();
		
		String babyName;
		
		if(gender.equals("boy")) {
			System.out.println("Congratulations, It is a boy");
			babyName=name1.substring(0, 3)+ name2.substring(0,  2);
			
		}else if (gender.contentEquals("girl")){
			System.out.println("Congratulations, It is a girl ");
			babyName=name2.substring(0, name2.length()/2) + name1.substring(name1.length(), 2);
			
		}else {
			babyName="unknown";
			
		}
		System.out.println(babyName.toUpperCase());
		scan.close();
		

	}

}
