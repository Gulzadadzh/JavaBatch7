package com.syntax.class21;

public class AnimalTest {
	public static void main(String[] args) {
		
		//Object of parent class has an access to all variables and methods of it is own class ONLY
		Animal a=new Animal();
		a.bread="Something";
		a.color="grey";
		a.paws=4;
		
		a.sleep();
		a.eat();
		
		//object of child class has an access to all var and methods of it is Parent and it is own
		Dog dog =new Dog();
		dog.bread="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
	}

}
