package com.syntax.class11;

public class RetrievingValuesFromTwoArrays {

	public static void main(String[] args) {
		

		String[][] months= {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June","July","August"},
				{"September", "October","November"}
		};
		
		int rows=months.length; //how many arrays/rows are inside?
		
		System.out.println(rows + " rows");
		
		int winterLerligth =months[0].length; //how many elements/columns are in row with index 0?
		
		System.out.println(winterLerligth + " moths in winter/row0");
		
		
		int lastRowSize=months[rows - 1].length;
		
		
		//Nested loops are married(joke) to 2d Arrays
		
		for(int i=0; i < months[i].length; i++) { //iterating over columns
			
			
			for(int j=0; j < months[i].length; i++) {
				System.out.println(months[i][j]);
			}
		}
		
		
		
		
		

	}

}
