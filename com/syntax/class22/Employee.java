package com.syntax.class22;

public class Employee {
	
	static String companyName;
	protected String FullName;
	double salary;
	private long ssn;
	
	void work() {
		System.out.println("Employee works");
	}
	void getPaid() {
		System.out.println("Employee gets paid");
	}

}
class ScrumTeam extends Employee{
	
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("attends meetings");
	}
	void workBuildingSoft() {
		System.out.println("works on building software");
	}
}
class ProductOwner extends Employee{
	
	void communicate() {
		System.out.println("gets requirements form BA");
	}
	void prioritizePb() {
		System.out.println("prioritizes product backlog");
	}

}
class ScrumMuster extends ScrumTeam{
	String quality;
	
	void shieldTeam() {
		System.out.println("All team shieldes");
	}
}