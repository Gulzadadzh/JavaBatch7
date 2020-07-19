package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		String[] countries= {"Kyrgyzstan", "Uzbekistan", "Tadjikistan", "Kazakstan", "China"};
		//Ellion way
		String[] capitalCities= {"Bishkek","Tashkent","Dushanbe","Astana","China"};
		
		for (int i=0; i<countries.length; i++)  {
		String country=countries[i];
		String city=capitalCities[i];
		System.out.println("The capital city of "+ country + " is "+ city);
			
			
			
			
		}
//		for (int i=0; i<countries.length; i++)  {
//		
//			switch (countries[i]) {
//			case "Kyrgyzstan":
//				System.out.println("Bishkek");
//				break;
//			case "Uzbekistan":
//				System.out.println("Tashkent");
//				break;
//			case "Tadjikistan":
//				System.out.println("Dushanbe");
//				break;
//			case "Kazakstan":
//				System.out.println("Astana");
//				break;
//			case "China":
//				System.out.println("Pekin");
//				break;
//				default;
//				System.out.println("Not in my list");
//			}
//			
//			System.out.println("The capital of " + countries);	
//	
//	}
//		
//			System.out.println("-----------");
//		
//			String[] countries1= {"Kyrgyzstan", "Uzbekistan", "Tadjikistan", "Kazakstan", "China"};
//			
//			for(String country : countries1) {
//				
//				if(country.equals("Kyrgyzstan")) {
//					System.out.println("Bishkek");
//				}else if(country.equals("Uzbekistan")) {
//					System.out.println("Tashkent");
//				}else if(country.equals("Tadjikistan")) {
//					System.out.println("Dushanbe");
//				}else if(country.equals("Kazakstan")) {
//					System.out.println("Astana");
//				}else if(country.equals("China")) {
//					System.out.println("Pekin");
//				
//				}else {
//				System.out.println("The country " +country +" is not in my list"); 
//				}
//			}
//		
//		
//		
		
		
	}

}
