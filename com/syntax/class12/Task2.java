package com.syntax.class12;

public class Task2 {
	public static void main(String[] args) {
		
		int[][] numbers= {
				{10, 23, 56, 47},
				{33, 668, 89},
				{1, 9, 0},
				};
		
		//regular for loop
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				
				int element=numbers[i][j];
				if(element%2!=0) {
					sum+=element;
					
				}
			}
			System.out.println(sum);
		}
		
		
	}

}
