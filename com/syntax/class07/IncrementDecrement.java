package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x = 10;
		x=x+1;
		x+=1;
		
		//the another way to add 1 into
		x++; // Post -increment
		++x; // Pre-increment
		
		int y=50;
		y=y-50;
		y-=1;
		y--;
		
		System.out.println(y);
		
		System.out.println(--y);
		
		//3++; //compiler error
		//3--; //compiler error
		
		int z=5; //pre encrement
		if(++z ==6) {
			System.out.println("Hi there");
		}
		System.out.println(z);
		
		int k=10; //post increment
		if (k++ ==11) {
			System.out.println("Nail was here");
		}
		System.out.println(k);
		
		//What if I want to increase by 2?
		int m=5;
		//m++2; //compiler error
		m +=2;
		
		
		
	}

}
