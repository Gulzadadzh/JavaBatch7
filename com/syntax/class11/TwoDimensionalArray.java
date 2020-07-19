package com.syntax.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers=new int[3][4]; //[row][col]
		// 1st row
		numbers[0][0]=10;
		numbers[0][1]=15;
		numbers[0][2]=20;
		numbers[0][3]=25;
		
		//2nd row, row with index 1
		numbers[1][0]=10;
		numbers[1][1]=32;
		numbers[1][2]=36;
		numbers[1][3]=40;
		numbers[1][4]=44;
		//numbers[1][4]=44; // runtime error, OutOfBounds Exception
		
		//3rd way, row with index2
		numbers[2][0]=63;
		numbers[2][1]=66;
		numbers[2][2]=69;
		numbers[2][3]=72;
		
		System.out.println(numbers[0][2]);
		
		// if we know the values up front
		int[][]nums= {
				{10,15,20,25},
				{32, 36,40,44},
				{63,66,69,72},
	         	};
		
		
		System.out.println(nums[2][0]);
		
		
		
		
		
				

	}

}
