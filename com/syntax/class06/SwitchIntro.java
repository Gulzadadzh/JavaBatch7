package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		
		int day =4;
		String dayName;
		
		//if (day==1){
		//	dayName ="Monday";
		//else if (day ==2) {
		//	dayName = "Tuesday";
		//else if (day ==3) {
		//	dayName = "Wednesday";
		//else if (day ==4) {
		//	dayName = "Thursday";
		//else if (day ==5) {
		//	dayName = "Friday";
		//else if (day ==6) {
		//	dayName = "Saturday";
		//else if (day ==7) {
		//	dayName = "Sunday";
		//}
		//System.out.println("Today is " + dayName);
		
		
		System.out.println("---Using Switch Case__");
		
		switch (day) {
		
		case 1:
			dayName = "Monday";
		break;
		case 2:
			dayName = "Tuesday";
		break;
		case 3:
			dayName = "Wendsday";
		break;
		case 4:
			dayName = "Thursday";
		break;
		case 5:
			dayName = "Fraday";
		break;
		case 6:
			dayName = "Saturday";
		break;
		case 7:
			dayName = "Sunday";
		break;
		default:
			dayName = "Invalid";
		
		}
	System.out.println("Today is " + dayName);
	
	
	
	}
	
}
