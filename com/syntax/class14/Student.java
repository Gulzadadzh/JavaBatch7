package com.syntax.class14;

public class Student {
	
	String name, lastName, school;
	char grade; // name of the variable  often is noun
	int studentId;
	
	// name of the method often is a verb
	void study() {
		System.out.println(name + " "+ lastName+ " Student is studying");
		
	}
	void doHomework() {
		System.out.println(name+" student is doing hw");
	}
}
