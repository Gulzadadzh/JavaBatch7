package com.syntax.class20;

public class ConstructorType {
	ConstructorType(){ //non argument parameter
		System.out.println("I am constructor");
	}
	ConstructorType(String str){//parameterized constructor
		System.out.println("I'm a constructer with 1 parameter");
	}
	ConstructorType(int num){
		System.out.println("I'm a constructor with 1 int parameter "+num);
	}
	ConstructorType(double num){
		System.out.println("I'm a constructor with 1 int parameter "+num);
	}

	ConstructorType(String name, int age){
		System.out.println("I'm a constructor with 1 int parameter "+name+" "+age);
	}
	
	public static void main(String[] args) {
		
		ConstructorType	obj=new ConstructorType("Gulzada", 26);
		
		System.out.println("I am a code inside main method");
		
		speak("Hello Class");
	}
	static void speak(String str) {
		System.out.println(str);
	}
}
