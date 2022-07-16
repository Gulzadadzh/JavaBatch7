package com.syntax.class20;

public class Task {

	String lastName, firstName;
	int age;

	Task(String TaskLastName, String TaskFirstName, int TaskAge) {
		lastName = TaskLastName;
		firstName = TaskFirstName;
		age = TaskAge;

	}

	Task() {
		System.out.println("I am not parametrized constructor");
	}

	void displayFacts() {
		System.out.println("This is " + firstName + " " + lastName + ", " + age);
	}

	public static void main(String[] args) {

		Task t = new Task("Gulzada", "Dzhusukeeva", 28);
		
		Task t1=new Task();

		t.displayFacts();
	}
}
