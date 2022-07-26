package com.syntax.class29;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Anna");
		names.add("Katya");
		names.add("Sara");
		names.add("Asya");
		names.add("Dana");
		
		if(names.isEmpty()) {
			System.out.println("Is empty");
		}else {
			System.out.println("Good to go");
		}
		
		boolean name=names.contains("Anna");
		System.out.println(name);
		
		int numNames=names.size();
		System.out.println(numNames);
		
	}
}
