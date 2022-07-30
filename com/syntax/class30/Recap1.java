package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap1 {

	public static void main(String[] args) {

		ArrayList<Double> number = new ArrayList<>();
		number.add(3.99);
		number.add(9.99);
		number.add(1.99);
		number.add(4.99);
		number.add(6.99);
		number.add(10.99);

		double num = number.get(0);
		double num1 = number.get(5);
		System.out.println(num + "\n" + num1);

		System.out.println("---------");
		for (Double n : number) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("-------");
		for (int i = number.size() - 1; i >= 0; i--) {
			double myNum = number.get(i);
			System.out.print(myNum + " ");
		}
		System.out.println();
		System.out.println("-------");
		Iterator<Double> it = number.iterator();
		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println("\n"+"---------");
		
		Iterator<Double> doubleIT = number.iterator();

		while (doubleIT.hasNext()) {
			double element = doubleIT.next();// unboxing
			if (element < 9) {
				doubleIT.remove();// removing element from collection
			}

			System.out.println(number);
		}
	}

}
