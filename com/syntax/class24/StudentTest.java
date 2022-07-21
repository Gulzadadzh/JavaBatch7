package com.syntax.class24;

public class StudentTest {
	public static void main(String[] args) {

		System.out.println("----Student----");
		Student st = new Student();
		st.study();
		st.enjoi();

		System.out.println("----SyntaxStudent----");
		Student st1 = new SyntaxStudent();
		st1.study();

		// st1.learnJava();
		

		System.out.println("----CollegeStudent----");
		Student st2 = new CollegeStudent();
		st2.study();
		// st2.books();

		System.out.println("----SchoolStudent----");
		Student st3 = new SchoolStudent();
		st3.study();
		// ss.enjoi();

		System.out.println("--------");
		SyntaxStudent ss = new SyntaxStudent();
		ss.enjoi();
		ss.learnJava();
		ss.study();

	}

}
