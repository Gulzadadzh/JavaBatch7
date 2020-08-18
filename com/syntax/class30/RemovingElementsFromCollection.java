package com.syntax.class30;
import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {

		// create an arraylist of city names
		ArrayList<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("DC");
		cities.add("Istanbul");
		cities.add("LA");

		System.out.println("original arrayList === " + cities);
		// remove cities LA, DC

		System.out.println(" -------- Removing Objects from ArrayList using for loop -------- ");
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i);
				System.out.println(cities);
			}
		}

		System.out.println("final arraylist === " + cities);

		System.out.println(" -------- Removing Objects from ArrayList using enhanced loop -------- ");
//
//		for(String city:cities ) {
//			if(city.equals("New York")) {
//				cities.remove(city);
//			}
//		}
		System.out.println(cities);

		System.out.println(" -------- Removing Objects from ArrayList using iterator -------- ");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");

		System.out.println("-----  Collection before using iterator = "+cities);

		Iterator<String> citiesIt = cities.iterator();
		//lets remove New York and LA objects
		
		while(citiesIt.hasNext()) {
			String ci=citiesIt.next();
			if (ci.equals("LA") || ci.equals("New York")){
				citiesIt.remove();
			}
		}
		System.out.println("ArraList after modifications from Iterator: "+cities);
	}

}
