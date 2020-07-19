package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee= true;
		
		
		
		
		if(!allergies) {
			//no allegy
			System.out.println("You are healthy");
		}else {
			//we have to check which allergy
			
		if (peanut) {
	
			System.out.println("do not eat peanut!");
		}
			if (lactose) {
			System.out.println("Do not drink milk");
		}
			if (bee) {
			System.out.println("Do not mess with bees");
			}
		}
			System.out.println("Vika has no quastions");
		}
		
		
		}
