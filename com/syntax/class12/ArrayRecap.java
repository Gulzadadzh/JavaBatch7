package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {

		String[] colors = new String[3];
		colors[0] = "blue";
		colors[1] = "yellow";
		colors[2] = "red";

		System.out.println(colors.length);

		String color = null;
		
		for (int i = 0; i < colors.length; i++) {
			 color = colors[i];
		}
		System.out.println(color);

		System.out.println("-------");

		for (int i = 0; i < colors.length; i++) {
			String color1 = colors[i];
			System.out.println(color1);
			
			System.out.println("-------");

		}

		for (String c : colors) {
			System.out.println(c);
		}

	}

}
