 package com.syntax.class24;

public class Bank {
	
	double money, fee;
	public Bank(double money) {
		this.money=money;
	}
	
	double chargeFee() {
		if(money<1000) {
			return money*0.01;
		}else {
			return 0;
		}
	}

}
class BOA extends Bank{
	
	public BOA(double money) {
		super(money);
}
}
class PNC extends Bank{
	public PNC(double money) {
		super(money);
	}
	@Override
	double chargeFee() {//overridding
		if(money<1000) {
			return money*0.02;
		}else {
			return 0;
		}
	}
}
class Citi extends Bank{
	
	public Citi(double money) {
		super(money);
}
}






