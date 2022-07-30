package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {
	public static void main(String[] args) {

		ArrayList<String> flowers = new ArrayList<>();
		flowers.add("rose");
		flowers.add("pione");
		flowers.add("hibiscuss");

		String f = flowers.get(2);
		System.out.println(f);
		flowers.set(0, "Carnation");
		System.out.println(flowers);

		for (String f1 : flowers) {
			System.out.print(f1 + ", ");
		}
		System.out.println();
		System.out.println("---------");
		for (int i = flowers.size() - 1; i >= 0; i--) {
			String f2 = flowers.get(i);
			System.out.print(f2 + " ");
		}
		System.out.println();
		System.out.println("---------");

		Iterator<String> f3 = flowers.iterator();
		String ss = f3.next();
		System.out.println(ss);

		String ss1 = f3.next();
		System.out.println(ss1);
		flowers.add("Dahlia");

		System.out.println(flowers);

		System.out.println();
		System.out.println("-----");

		// while (f3.hasNext()) {
		// System.out.println(f3.next());

		// }

		System.out.println("--------");
		ArrayList<Double> num = new ArrayList<>();
		num.add(10.54);
		num.add(7.54);
		num.add(9.54);
		num.add(3.54);

		Iterator<Double> n = num.iterator();

	//	while (n.hasNext()) {
	//		System.out.print(n.next() + " ");
	//	}

		System.out.println();
		System.out.println("--------");

		while (n.hasNext()) {
			double n1 = n.next();
			if (n1 < 5) {
				n.remove();
				System.out.println(n);
			}
			
		}


	}

}
