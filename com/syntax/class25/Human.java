package com.syntax.class25;

public class Human {
	
	public void happy() {
		System.out.println("Humans are happy");
	}
	public void study() {
		System.out.println("Humans should study");
	}
}
public class Student extends Human{
	
	
	public  void study() {
		System.out.println("All students are study");
		
	}
	
	public void sleepy() {
		System.out.println("Strudents are always sleepy");
	}
}
class SyntaxStudent extends Student {
	
	public void read() {
		System.out.println("Syntax students love Java");
	}
}
class SchoolStudent extends Student {
	public void study() {
		System.out.println("School time -best time ever");
	}
}
