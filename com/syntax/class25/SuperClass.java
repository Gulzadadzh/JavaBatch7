package com.syntax.class25;

public class SuperClass {
	
	protected static void enjoy() {
		System.out.println("I enjoy Sunday");
	}
}

class Subclass extends SuperClass{
	
	
	//this process called method hiding
	//@Override --> confirms that we are overriding 
	protected  static void enjoy() {
		System.out.println("I anjoy everyday");
	}
}