package com.syntax.class14;

public class StringMethodsContinue {
	public static void main(String[] args) {
		
		System.out.println("-------------.contains() method----------");
		//checks is String another sequence of specified characters
		String str="Good afternoon All";
		
		boolean contains=str.contains("afternoon");
		System.out.println(contains);
		
		String searchValue="good";
		
		boolean isItThere=str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("A"));
		System.out.println("after");
		
		System.out.println("-------------.startsWith() method----------");
		
		String drink="Welcome students";
		boolean starts=str.startsWith("Welcome");
		System.out.println(starts);
		
		System.out.println("-------------.endWith() method----------");
		
		boolean ends=drink.endsWith("a");
		System.out.println(ends);
		
		//drimk.startWith('w'); CE: we need to check if it starsts with specified String, cannot be just char
		String str1="Hello Muhammad";
		String str2="Hello Bulat";
		
		System.out.println("String " + str1 + str1.startsWith("Hello"));
		System.out.println(str2.endsWith("Bulat"));
		
		System.out.println("-------------.equals() method----------");
		
		String string1="Saturday";
		String string2="saturday";
		
		boolean equality=string1.equals(string2);
		System.out.println(equality);
		
		
		System.out.println("-------------.equalsIgnoreCase() method----------");
		
		boolean equalityNoCase=string1.equalsIgnoreCase(string2);
		System.out.println(equalityNoCase);
		
		String expected="Password cannot be empty";
		String actual="Password can not be empty";
		
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("Test pass");
			
		}else { 
			System.out.println("Test fail");
		
		
		System.out.println("-------------Real example of equalsIgnoreCase() method----------");
		
		String expectedBrowser="Chrome";
		if (expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}else {
			System.out.println("Test executed not on chrome browser");
			
			
			
			
			
		
		}
		}
		
	}

}
