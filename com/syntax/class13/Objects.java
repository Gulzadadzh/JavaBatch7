package com.syntax.class13;

public class Objects {
	public static void main(String[] args) {
		
	
	 Car car1=new Car();
	 car1.make="Tesla";
	 car1.model="X";
	 car1.color="Blue";
	 car1.year=2020;
	 car1.speed=200;
	 System.out.println("Make of 1 car is "+car1.make +" and model is "+ car1.model
			 +" and it is in "+car1.color +"color");
	
	 car1.drive();
	 car1.reverse();
	 car1.transportPeople();
	 
	 
	 // building object of the car
	 Car car2=new Car();
	 car2.make="BMW";
	 car2.model="m5";
	 car2.color="Black";
	 car2.year=2012;
	 car2.speed=400;
	 System.out.println(car2.make);
	 System.out.println("Make if 2 car is " +car2.make);
	

	 car2.drive();
	 car2.reverse();
	 car2.transportPeople();
	 
	// new Bus() compare  will give an error	
	// Because we never created bus class;
	
	//Create two more car objects, assign futures and print them  
	
	 
	 Car car3=new Car();
	 car3.make="Toyota";
	 car3.model="camry";
	 car3.color="White";
	 car3.year=2016;
	 car3.speed=800;
	 System.out.println(car3.make+" "+ car3.color);
	 

	 car3.drive();
	 car3.reverse();
	 car3.transportPeople();
	 
	 
	 
	 
	 Car car4=new Car();
	 car4.make="Nissa";
	 car4.model="sv";
	 car4.color="Silver";
	 car4.year=2018;
	 car4.speed=100;
	 System.out.println(car4.make+" "+ car4.color);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}	
	

