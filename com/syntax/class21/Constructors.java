package com.syntax.class21;

public class Constructors{
	
	String word;
	
	public Constructors() {
		System.out.println("I am a non argument constructor");
	}

	public Constructors(String word) {
		this(12);  // IF NEED TO MAKE A CALL MUST BE A 1 STATEMENT INSIDE THE CONSTRUCTOR 
		this.word=word;
		System.out.println("I am a parameterized constructor with str= "+word);
		// this() 
		}
	
	public Constructors(int num){
		System.out.println("I am constructor with 1 parameter = "+num);
		
	}
	public Constructors(int num, String word){
		System.out.println("I am constructor with 2 parameter = "+num+" and "+word);
	}
	
	
	public static void main(String[] args) {
		Constructors obj= new Constructors("Java");
		System.out.println(obj.word);
		
	}
	void hello() {
		
	}
}
