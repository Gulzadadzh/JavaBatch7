package com.syntax.class03;

public class CompaudOperator {

	public static void main(String[] args) {
		int num = 100;
		num = num + 100; //200
		System.out.println(num);
	
	
	num = num + 100;
	System.out.println(num);
	
	//We can use Compound operators which are shorter 
	num += 100;
	System.out.println(num);
	
	
	//long way 
	//num = num - 50;
	
	//short way 
	num-= 50;
	System.out.println(num); //350
	
	num /=7;
	System.out.println(num); //50
	
	//num = num * 2;
	num *= 2;
	System.out.println(num); //100
	
	//num = num % 9;
	num %= 9;
	System.out.println(num);
	
	System.out.println("=======");
	
	
	
	
	
	
	
	int num1 = 99;
	num1 += 99;
	System.out.println(num1);
	
	int nuM = 999;
	nuM -= 67;
	System.out.println(nuM);
	
	
	double cakePiace =11;
	int cakePiece = 4;
	System.out.println(cakePiece);
	
	cakePiece = 25;
	cakePiece %= 7;
	
	System.out.println(cakePiece);



	
	
	}
	
	
	
}
