package Recap;

public class CarFactory {
	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.make="Tesla";
		car1.model="x";
		car1.color="red";
		car1.year=2020;
		car1.speed=200;
		
		System.out.println(car1.make);
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.color="blue";
		car2.year=2019;
		car2.speed=240;
		
		System.out.println(car2.make);

		car2.drive();
		car2.transportPeople();
		car2.reverse();
		
		
		
		
		
		
	}

}
