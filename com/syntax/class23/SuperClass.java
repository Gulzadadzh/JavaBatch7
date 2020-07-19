package com.syntax.class23;

public class SuperClass {
	
	String name="Kamila";
	
	public void prinHello() {
		System.out.println("Hello");
	}
	
}
class SubClass extends SuperClass{
	
	String name="Mina";
	
	public void displayName() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
	public void printHello() {
		System.out.println("Hello from child class");
	}
	
	public void collingParentMethod() {
		prinHello();//this.printHello();
		
		}
	
}



