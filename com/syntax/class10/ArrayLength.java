package com.syntax.class10;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		String[] names=new String[5];
		
		names[0]="Kamila";
		names[1]="Anna";
		names[2]="Olga";
		names[3]="Roman";
		
		System.out.println(names[1]);
		System.out.println(names[4]);
		
		int arrLength=names.length;
		System.out.println("The length of the array is:" + arrLength);
		
		System.out.println("---------");
		
		
		
		String[] group2 = { "Ali", "Ksenia", "Olga", "Castro" };
		System.out.println("The size of group 2 is: " + group2.length);

		// HW create an array of 4 integers and see the default values.

		
		
		
		
		
	}

}
