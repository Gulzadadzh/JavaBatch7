package com.syntax.class17;

public class Student {
	//Create  class Student that will have a method getGrade. 
    //Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score >80 - B
//		score >70 - C
//		score > 50 - D
//		anything else - F
//		Collapse
//		white_check_markeyesraised_hands

	char getGrade(int a) {
		
		char score;
		if(a>90) {
			score='A';
			
		}else if(a<=90 && a>80) {
			score='B';
			
		}else if (a<=80 && a>70){
			score='C';
			
		}else if (a<=70 && a>50){
			score='D';
			
		}else {
			score='F';
		}
		return score;
	}
}
