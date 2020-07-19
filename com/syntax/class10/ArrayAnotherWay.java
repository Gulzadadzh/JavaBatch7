package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		
		// we created an array and stored the initial values
		String[] weekdays= {"Monday","Tuesday","Wednesday","Thursda", "Friday"};
		
		//Let us print the element with index 3
		System.out.println(weekdays[3]);
		
		weekdays[3]="Thursday";
		System.out.println(weekdays[3]);
		
		//we cannot add elements to the array
		// weekdays[5]="Saturday"; // runtime error
		
		
		System.out.println("--------");
		
		//Add more
		
		
		// 1 way
		double[] balances= {1000, 23.50, 5540.5};
		System.out.println("total:"+ (balances[0]+balances[1]+balances[2]));
		
		//2 way
		int total=(int)balances[0]+(int)balances[1]+(int)balances[2];
		System.out.println("total:"+total);
		
		//3rd way
		
		int total2=(int)(balances[0]+balances[1]+balances[2]);
		System.out.println("total:"+total2);
		

		// do not ever create an array with 0 elements
		//because you cannot add elements later
		int[] numbers1;
		
		
		int[] numbers2= {};
		numbers2[0]=5;
		System.out.println(numbers2[0]);
		
		
		
		
		
		
		
	}

}
