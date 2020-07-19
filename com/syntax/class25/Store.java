package com.syntax.class25;

public class Store {

	String name, location;
	

	public Store(String name, String location) {

		this.name=name;
		this.location=location;
		
	}
	public void openHours() {
		System.out.println("Store are open from 8 am - 8pm in "+location);
	}
	public void sell() {
		System.out.println("All Strores sale item");
	}
}

class Macys extends Store{
	
	public Macys(String name, String location) {
		super(name, location);
		
	}
	public void openHour() {
		System.out.println(name+" is open from 8 am - 12 am in " +location);
	}
}
class Sturbucks extends Store{
	public Sturbucks (String name, String location) {
		super(name, location);
		
	}
	public void openHours() {
		System.out.println(name+" is open everyday from 6 till 8 pm in "+ location);
	}
	public void sellDrinks() {
		System.out.println(name+" sells different type of drinks");
	}
}

class Nike extends Store{
	public Nike(String name, String location) {
		super(name, location);
	}
}









