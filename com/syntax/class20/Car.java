 package com.syntax.class20;

public class Car {
	public static String make;
	protected String model;
	int year;
	private double price;
	
	public void DisplayInfo() {
		System.out.println("We build "+year+" "+  make +" "+ model+" for price = $"+ price);
	}
	Car(){
		System.out.println("I am a canstructor.I have not return type and my name is same as class");
	}

	public static void main(String[] args) {
	Car car=new Car();
	/*
	 * car--> class name
	 * car-->reference variable
	 * new-->keyword
	 * Car();-->calling Constructor
	 */
	
	car.DisplayInfo();
	System.out.println(car.model);
	
	//static String driver; --> local variables CONNOT BE STATIC
	//System.out.println(driver);
	
}
}
