package com.syntax.class26;

public abstract class Monkey {  //0% abstraction
	
	private void jumps() { //can have but compiler gives warning since no one can access this method
		System.out.println("Monkey jump"); 
	}

}
abstract class Mouse { //50%
	
	public void run() {
		System.out.println("All mauses can run");
	}
	
	public abstract void eat(); 
			
}
abstract class Human{ //100%
	public abstract void eat();
	
	public abstract void work();
	
	public abstract void sleep();
	
}