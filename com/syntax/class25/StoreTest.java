package com.syntax.class25;

public class StoreTest {

	public static void main(String[] args) {
	
		Store macys =new Macys("Masys", "Tysons, Virginia");
		Store starbucks=new Sturbucks("Sturbucks", "NY");
		Store nike= new Nike("Nike", "LA");
		
		String[] array= {"Hello", "Hi"};
		Store[] myStore= {macys, starbucks, nike};
	    Store[] stores={new Macys("Masys", "Florida"), new Sturbucks("Sturbucks", "Texas"), new Nike("Nike", "Illinois")};
		int size=stores.length;
		System.out.println(size);
		
		for(Store s:stores) {
			s.openHours();
			s.sell();
			System.out.println("-----------");
		}
		
		System.out.println("---LOOPING MY STORES ARRAY----");
		
		
		for(int i=0; i<myStore.length; i++) {
			myStore[i].openHours();
			System.out.println("-----------");
		}
		
		
		
		
		
		
		
		

	}

}
