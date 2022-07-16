package com.syntax.class21;

public class AnimalsTest1 {
	
	public static void main(String[] args) {
		
	Animal1 a =new Animal1();
	
	a.breed="Something";
	a.color="grey";
	a.paws=4;
	
	a.sleep();
	a.eat();
	
	Dog1 dog=new Dog1();
	dog.breed="Hasky";
	dog.color="White";
	dog.paws=4;
	dog.tail=true;
	
	a.sleep();
	dog.bark();
	dog.eat();
	
	Cat1 cat=new Cat1();
	cat.breed="Scottish Fold ";
	cat.color="black";
	cat.paws=4;
	cat.fur="Soft";
	cat.tail=true;
	
	cat.purr();
	cat.eat();
	cat.sleep();
	
	Kitten k=new Kitten();
	
	System.out.println(k.loveToyes="mouse");
	k.old=2;
	k.play();
	

	
	
	}
}
