package com.syntax.class12;



public class Task {
	
	public static void main(String[] args) {
		
		String[][] foods= {
				{"borsh", "kotleta", "vareniki"},
				{"samsa", "plov", "nan"},
				};
		
		for (int i = 0; i < foods.length; i++) {
			for (int j = 0; j < foods[i].length; j++) {
				String food=foods[i][j];
				System.out.print(food+" ");
			}
			System.out.println();
			
		}
		System.out.println("=======");
		
		for (String[] food : foods) {
			for (String f : food) {
				System.out.print(f +" ");
			}
			System.out.println();
			
		}
	}

}
