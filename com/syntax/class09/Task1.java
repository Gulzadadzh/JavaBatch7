package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		
		for(int i=1;  i<=5; i++) {
		for(int n=1;  n<=i; n++) {	
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		System.out.println("---------------");
		int num1 = 5;
		while(num1 > 0)
		{
			for(int num2=1; num2<=num1; num2++)
			{
					System.out.print(num2);
				}
				System.out.println();
				num1 --;
			}
}
}