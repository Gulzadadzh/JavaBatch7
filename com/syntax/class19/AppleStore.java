package com.syntax.class19;

public class AppleStore {

	public static void main(String[] args) {

		
		//IPHone.touchScreen=false;
		
		IPHone phone1=new IPHone();
		phone1.model="11 Pro";
		phone1.memory=256;
		phone1.color="Blue";
		phone1.price=1000;
		phone1.displayDetails();
		//phone1.displayInfo();--> possible but not preffereble way
		IPHone.displayInfo();//calling static variable
		
		IPHone.touchScreen=false;// accessing static variables
		System.out.println("--2 iPhone object ------");
		
		
		IPHone phone2=new IPHone();
		phone2.model="11";
		phone2.memory=64;
		phone2.color="Pink";
		phone2.price=900;
		phone2.displayDetails();
		phone2.displayInfo();
		
		
		System.out.println("--Calling info method again ------");
		phone1.displayInfo();
		
		
		
		
		
		
		

	}

}
