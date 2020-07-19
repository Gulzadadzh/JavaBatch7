package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {
		
		String me="I am a good tester. I am a good person";
		
		String str="Hello";
		
		str=str.replace('e', 'E');
		System.out.println(str);
		
		me=me.replace("good", "great");
		System.out.println(me);
		
		me=me.replace("we", "us"); // if it find it --> replace if it will not --> does nothing
		System.out.println(me);
		
		String fromApplication="Phone number is 1234567890";
		fromApplication=fromApplication.replaceAll("[A-Z]", "" );
		System.out.println(fromApplication);
		
		String anotherWay="HellodRTYHBVFNBGHJNBG876544567";
		anotherWay=anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println(anotherWay);
		
		//replacing all numbers [0-9] from the String, if specific [0-5] 
		String mix="Hello friends 987654323456789";
		mix=mix.replaceAll("[0-9]", "");
		System.out.println(mix);
		
		//replacing all special characters
		String mix1="Hello *&^%$%^&*";
		mix1=mix1.replaceAll("[^A-Za-z0-9]", "  Syntax");
		System.out.println(mix1);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
