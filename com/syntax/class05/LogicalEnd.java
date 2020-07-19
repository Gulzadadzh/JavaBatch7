package com.syntax.class05;

public class LogicalEnd {
	public static void main(String[] args) {
	
		int num =194;
		
		if (num>=1 && num<=10) {
		
			System.out.println(num +" is a small number");
		
		}else if (num >10 && num<=100) {
		
			System.out.println(num +"is medium number");
			
	    }else if (num>100 && num <=1000) {
		
	    	System.out.println(num + " is large number");
		
	    }else {

	    	System.out.println(num + " is out of range");
		}
}
}
