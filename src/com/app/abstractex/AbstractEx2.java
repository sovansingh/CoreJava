package com.app.abstractex;
abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{

	@Override
	int getRateOfInterest() {
		return 7;
	}
	
}
class PNB extends Bank{

	@Override
	int getRateOfInterest() {
		return 8;
	}
	
}
public class AbstractEx2 {

	public static void main(String[] args) {
		Bank bank = new SBI();
		int result = bank.getRateOfInterest();
		Bank bank2 = new PNB();
		int result1 = bank2.getRateOfInterest();

		System.out.println(result+" "+result1);
	}
}
