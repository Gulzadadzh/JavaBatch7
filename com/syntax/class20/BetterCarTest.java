package com.syntax.class20;

public class BetterCarTest {
	public static void main(String[] args) {
		BetterCar car=new BetterCar("x5", "Red", 2020, 80000);
		car.displayInfo();
		
		
		BetterCar car1=new BetterCar("Model 5", "Silver", 2021, 76000);
		car1.displayInfo();
		
		//new BetterCar(); CE: because we don't have a non argument constructor inside
		//BetterCar
	}

}
