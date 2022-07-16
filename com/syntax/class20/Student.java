package com.syntax.class20;

public class Student {

	String name ;
	int mathGrade, scinceGrade, historyGrade;
	
	Student (String studentName, int studentMathGrade, int studentScinceGrade, int studentHistoryGrade){
	name=studentName;
	mathGrade=studentMathGrade;
	scinceGrade=studentScinceGrade;
	historyGrade=studentHistoryGrade;
	}

	int calculateAvarageGrade() {
		int avarage =mathGrade, scinceGrade, historyGrade;
		return avarage;
	}
}
