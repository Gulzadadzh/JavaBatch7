package com.syntax.class19;

public class IPHone {

	static String brand="Apple";
	static String OS="iOS";
	static boolean touchScreen=true;
	
	String model;
	int memory;
	double price;
	String color;
	
	static void displayInfo() { //static works only with static
		System.out.println("iPhone belongs to  brand "+ brand + " and it has OS as "+ OS +" and all iPhones have touchScreen = " 
	+ touchScreen);
	}
	void displayDetails() {
		System.out.println("We build iPhone "+ model+" with memory ="+memory+" in  color "+ color+ "color for price =$"+ price);
	}
}
