package com.syntax.class29;

public interface Shape {
	
	void calculateArea(int a);
	
	void calculatePerimiter(int a);
	
}
class Circle implements Shape{
	
	public void calculateArea(int radius) {
		int diameter=radius * 2;
		double s=(3.14 * (diameter * diameter))/4;
		System.out.println("The area is "+s);
	}
	
	public void calculatePerimiter(int radius) {
		int diameter=radius * 2;
		double p=3.14 *diameter;
		System.out.println("The perimeter is "+p);
	}
}
class Square implements Shape{
	
	public void calculatePerimiter(int a) {
		System.out.println("The perimeter is "+(a*4));
	}
	public void calculateArea(int a) {
		System.out.println("The area is "+(a * a));
	}
}