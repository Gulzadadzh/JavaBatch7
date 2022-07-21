package com.syntax.class24;

public class Student {

	public void study() {
		System.out.println("Studing very hard Student ");
	}
	
	public void enjoi() {
		System.out.println("They are enjoing the life");
	}

}
class SyntaxStudent extends Student {

	public void learnJava() {
		System.out.println("Learning Java");
	}

	public void study() {
		System.out.println("Studing very hard but sleepy SyntaxStudent");
	}

}

class CollegeStudent extends Student {

	public void books() {

		System.out.println("Reading books");
	}

	public void study() {
		System.out.println("Studing very hard but hungry CollegeStudent");
	}

}

class SchoolStudent extends Student {

	public void study() {
		System.out.println("Studing very hard sometimes");
	}

}
