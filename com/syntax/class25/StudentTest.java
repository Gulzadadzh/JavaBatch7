package com.syntax.class25;

public class StudentTest {

	public static void main(String[] args) {
		
		SyntaxStudent syntax =new SyntaxStudent();
		syntax.study();
		syntax.sleepy();
		syntax.inLoveWithJava();
		
		
		System.out.println("---Creating an object of CollegeStudent---");
		CollegeStudent col= new CollegeStudent();
		col.read();
		col.study();
		col.sleepy();
		

		
		System.out.println("-----Creating an object of student");
		
		Student stu=new Student();
		stu.sleepy();
		stu.study();
		
		
		Student obj=new CollegeStudent();
		obj.sleepy();
		obj.sleepy();
		
		System.out.println("-----Creating an object of college student but give refference to Student");
		
		Student ss =new SyntaxStudent();
		ss.sleepy();//runtime polymorphism
		ss.study();//runtime polymorphism
		
		System.out.println("----------");
		Human obj1=new SchoolStudent();
		obj1.happy();
		obj1.study();//runtime polymorphism
		
		
	}

}
