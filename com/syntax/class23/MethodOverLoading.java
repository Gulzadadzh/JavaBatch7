package com.syntax.class23;

public class MethodOverLoading {
	
	//1. by changing  number of parameters
	public int sum(int num1, int num2) {
		
	return num1+num2;
	}
	
	//CE: we cannot overload method by changing return type ONLY
	//public int sum(int num1, int num2) {
	
	//return num1+num2;
	
	
	public int sum(int num1, int num2, int num3) {
		
		return num1+num2+num3;
	
	}
	//2.way by changing type of parameters
	
	public double sum(double num1,double num2) {
		
		return num1+num2;
	}
	public double sum(double num1,double num2, double num3) {
			
			return num1+num2+num3;
	}
}
