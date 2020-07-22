package com.syntax.class20;

public class StudentTest {

	String name ;
	int mathGrade, scinceGrade, historyGrade;
	
	StudentTest (String studentName, int studentMathGrade, int studentScinceGrade, int studentHistoryGrade){
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
