package com.syntax.class30;

import java.util.ArrayList;

public class Recap1 {
	
	public static void main(String[] args) {
		
		ArrayList<Double> number=new ArrayList<>();
		number.add(3.99);
		number.add(9.99);
		number.add(1.99);
		number.add(4.99);
		number.add(6.99);
		number.add(10.99);
		
		
		double num=number.get(0);
		double num1=number.get(5);
		System.out.println(num + "\n"+ num1);
		
		
		
	}

}
