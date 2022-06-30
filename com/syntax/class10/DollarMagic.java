package com.syntax.class10;

public class DollarMagic {

	public static void main(String[] args) {
		//Let's print The Dollar
		//$$$$
		//$  $
		//$  $
		//$  $
		//$$$$
		
		
		for(int i=1; i<=5; i++){  //The outer loop controls the row
			
		      for (int j=1; j<=4; j++){ //The inner loop controls the columns
		    	  
		        if(i==1 || i==5){    //in the first or last row print everything 
		        	
		           System.out.print("$");
		           
		        }else {  //in the other rows
		        	
		          if(j==1||j==4){  // in the first or last column print $
		        	  
		             System.out.print("$");
		             
		          }else { //in the other columns print " "
		            System.out.print(" ");
		        }
		        }
		     
		      }
		    
		    System.out.println();
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
