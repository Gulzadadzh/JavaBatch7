package com.syntax.class29;

public class MarkTest {
	
	public static void main(String[] args) {
		
	Marks studentA =new A(70, 90, 80);
	int avaregeA=studentA.getPercentage();
	System.out.println("The average of marks student A is: " + avaregeA +"%");
	
	Marks studentB=new B(100, 77, 86, 97);
	int averageB=studentB.getPercentage();
	System.out.println("The average of marks student B is: " + averageB +"%");
	}
}
