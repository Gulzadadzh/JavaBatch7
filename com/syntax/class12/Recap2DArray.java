package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
		
		String[][] animals= {
				{"cat", "dog","hamster"},  //first array or 1row
				{"tiger", "children", "bear"}  //second array or 2 row
				
		};
		int howMannyArrays=animals.length;  //how many rows
		System.out.println(howMannyArrays);
		
		int element1Array=animals[1].length;//how many col in 2 row
		System.out.println(element1Array);
	
		String element=animals[1][1];
		System.out.println(element);
		System.out.println("========");
		
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < animals[i].length; j++) {
				
			System.out.print(animals[i][j]+", ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
	}	
}
		
		
		
		
		

	

