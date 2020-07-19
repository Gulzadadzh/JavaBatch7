package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		double d1 = 12.99;
		double d2 = 11.99;
		
		if (d1 > d2) {
		System.out.println("Double value " + d1 + " is larger than " + d2);
		}else {
		System.out.println("Double value " + d2 + "is larger than " + d1);
		}
		
		System.out.println("==========");
		
		double temp = 22;
		if (temp < 32) {
			System.out.println("Water will freeze with temputure  " + temp);
		}	else {
			System.out.println("Woter will NOT freeze with temputure " + temp);
		}
		
		

	}

}
