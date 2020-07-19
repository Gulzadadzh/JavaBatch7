package com.syntax.class18;

public class InstanceVariable {
	
	String name="Yuriy"; //instance variable
	
	public static void main(String[] args) {
		String name="Kristina"; //local variable
		System.out.println(name);//Kristina
		
		//we create an Object or we instantiate a class -->InstanceVariable
		
		InstanceVariable obj=new InstanceVariable();
		obj.name="Jane";
		System.out.println(obj.name);  //Jane
		
		//would like to change value from Kristina to Castro --> changing value of the local variable 
		name="Castro";
		System.out.println("New value of the local variable"+name);
		
		//would like to change value from Jane to Ed --> changing value of the instance variable 
		obj.name="Ed";
		System.out.println("New value of the instance variable"+name);
		
		
		System.out.println("Printing value of name using 2 instance");
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);
		

	}

}
