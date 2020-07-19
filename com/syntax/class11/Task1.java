package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

		 public static void main(String[] args){
			   int score;
			   char grade = 0;
			   
			    Scanner scan=new Scanner(System.in);
			   
			    System.out.println("Please enter your mark: ");
			 
			    score=scan.nextInt();
			   
			 
			    if (score >= 80) {
			      grade ='A';
			    } else if (60>=80) {
			      grade ='B';
			    } else if (50>=60) {
			      grade ='C';
			    } else if (45>=50) {
			      grade ='D';
			    } else if (25>=45) {
			      grade ='E';
			    } else if (1>=25) {
			      grade ='F';
			    }
			    System.out.println("Your grade is " + grade);
			    
			   
			  
			  
			
		
	}
}	    
		    
		    
		    

	