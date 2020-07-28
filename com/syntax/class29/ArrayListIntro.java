package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<>();
		//to add values to the arrayList
		arrayList.add("Hello");//0
		arrayList.add("Wellcome");//1
		arrayList.add("How are you"); //2
		
		//how many elements inside my ArrayList
		int arrayListSize=arrayList.size();
		System.out.println(arrayListSize);

		//how to access elements from ArrayList
		String elementIndex2=arrayList.get(2);
		System.out.println(elementIndex2);
		
		//I would like to add more Objects into ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println(arrayList.size());
		
		//Let's remove "hello";
		arrayList.remove(0);
		
		System.out.println("size of arraylist after removing Object "+arrayList.size());
		
		//I want to update value "Good Bye"-->"Bye"
		arrayList.set(2, "Bye");
		System.out.println(arrayList);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
