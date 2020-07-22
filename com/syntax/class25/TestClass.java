package com.syntax.class25;

public class TestClass {

	public static void main(String[] args) {
		
		SuperClass c =new Subclass();
		c.enjoy();//static method parent class will get executed, enjoy from child will be hidden

		
		SuperClass.enjoy();
		Subclass.enjoy();//cannot see parent method only your own static method
	}

}
