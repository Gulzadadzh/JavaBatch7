package com.syntax.class26;

public class PhoneTest {
	public static void main(String[] args) {
		
		//new Phone(); CE: we cannot create an object of abstract class
		Phone iphone=new Iphone();
		iphone.navigate();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();
		
		System.out.println("-----");
		
		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.playMusic();
		samsung.sendText();
		samsung.navigate();
	}

}
