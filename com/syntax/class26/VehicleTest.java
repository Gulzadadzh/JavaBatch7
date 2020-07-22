package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {
	
		//Vehicle v=new Vehicle(); --> CE: cannot Abstract class		
		
		Vehicle lambo=new Lamborgini("jhgfxcgvhbjko76543wdfghjk");
		lambo.drive();
		lambo.start();
		lambo.start();
		lambo.openTrunk();
	
		int total =Vehicle.getTotal();
		System.out.println(total);
		
		
		System.out.println("----Second object----");
		
		Car car=new Lamborgini("hgfdfgvfdfgh");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();

		total=Car.getTotal();
		System.out.println(total);
				
	}

}
