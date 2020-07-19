package com.syntax.class17;

public class TaskTest {

	public static void main(String[] args) {
	
		Task t=new Task();
	
		String email=t.createEmail("Jane", "Smith", "yahoo");
		System.out.println(email);
		
		
		//boolean prime=t.isPrime(2);
		//System.out.println(prime);

		Student student =new Student();
		
		char grade=student.getGrade(76);
		
		System.out.println("Value of grade="+grade);
		
		
	}

}
