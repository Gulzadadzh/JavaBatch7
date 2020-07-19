package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		
		String str="I want an ice cream";

		String[] array=str.split(" ");

		for(String s:array) {
			System.out.print(s+"|");
		}
		
		System.out.println();
		System.out.println("----------------");
		
		
		String str3= "My home address 6545 east str 15220 #$%";
		str3=str3.replaceAll("[A-Za-z]", "");
		System.out.println(str3.length());
		
		
		
		System.out.println("----------------");
		
		
		String a="Is it saturday? I it raining? Do we have a Java Class Today?";
		String[] array1 =a.split("[?]");
		
			int sentences=array1.length;
				System.out.println(sentences);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
