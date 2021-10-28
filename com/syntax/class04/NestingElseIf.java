package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		boolean completed = true;
		int score =82;
		
	
		if (completed) {
			//Let is check the score
			
			if (score >= 90) {
				System.out.println("A, Great job!");
			} else if (score >=80) {
				System.out.println("B, well done!");
			}else if (score>=70) {
			   }System.out.println("C, You just passed!");
			}else {
				System.out.println("F, You failed!");
			}
			
			//}else {
				System.out.println("Please finish your quiz");
			
			}

	  }
  //}
