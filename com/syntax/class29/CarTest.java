package com.syntax.class29;

public class CarTest {

	public static void main(String[] args) {
		
		Car truck=new Truck(35000.0,"White", 160000.0);
		System.out.println("The  price of Truck with discaunt is "+truck.calculateSalePrice());

		Car sedan=new Sedan(3500.0, "Purple", 177.2);
		System.out.println("The  price of Truck with discaunt is "+sedan.calculateSalePrice());
	}

}
