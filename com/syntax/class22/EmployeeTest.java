package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		
	
	ScrumTeam obj1=new ScrumTeam();
	ScrumTeam.companyName="Facebook";
	obj1.salary=70000;
	obj1.work();
	obj1.getPaid();
	
	obj1.ceremonies="Srum meetings";
	obj1.attendMeetings();
	obj1.workBuildingSoft();
	
	ProductOwner obj2=new ProductOwner();
	//ProductOwner.companyName have an access TOO
	obj2.salary=34567890;
	obj2.getPaid();
	obj2.work();
	
	//obj2.ceremonies="Srum meetings";
	//obj2.attendMeetings();
	//obj2.workBuildingSoft();
	
	obj2.communicate();
	
	
}
}