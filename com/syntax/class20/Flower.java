package com.syntax.class20;

public class Flower {

	String type;
	
	/**  If you not going to create a constructor, --> Compiler WILL create 1 for you
	Flower(){ // default non argument
		
	}
	*/
	
	//Flower(){
	//	System.out.println("I am pointless constructor");
	//}
	
	// If you create a Constructor then compiler WILL not CREATE  any other constructor for you
	private Flower(String flowerType){
		type=flowerType;
	}
	
	public static void main(String[] args) {
		
		//Flower flower= new Flower(); CE: since we dont have non argument constructor
		//System.out.println(flower.type);
		
		Flower flower2=new Flower("Tulip");
		System.out.println(flower2.type);
	}
	 
}
