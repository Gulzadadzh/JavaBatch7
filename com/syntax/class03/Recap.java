package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		int num1 = 10 + 10 * 10;
		System.out.println(num1);

		int num2 = (10 + 10) * 10;
		System.out.println(num2);

		int num3 = 10 * 10 + 10 / 10;
		System.out.println(num3);

		System.out.println("==========");

		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sanday";
		System.out.println(a + b + x + y); // 30 JavaSunday
		System.out.println(a + b + y + b); // 10 JavaSunday20
		System.out.println(x + y + a + b); // JavaSanday 1020
		System.out.println(x + y + (a + b));

		// If I want 1020JavaSunday
		System.out.println(a + "" + x + y);
		System.out.println("" + a + b + x + y);
		System.out.println(a + (b + x + y));

	}

}
