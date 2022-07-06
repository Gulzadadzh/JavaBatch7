package Recap;

public class Car {

	String make;
	String model;
	String color;
	int year;
	int speed;
	
	public static void main(String[] args) {
		Car c1=new Car();
		c1.make="Toyota";
		c1.model="Camry";
		c1.color="Yellow";
		c1.year=2020;
		c1.speed=180;
		
		c1.drive();
		c1.reverse();
		c1.transportPeople();
		c1.stop();
		
		
	}
	
	void drive() {
		System.out.println(make+" can drive");
	}
	void reverse() {
		System.out.println(make+" can reverse");
	}

	void transportPeople() {
		System.out.println(make+" can transport people");
	}
	void stop() {
		System.out.println(make+" stop when push break");
		System.out.println(make+" stop");
	}
}
