package com.app.functionalinterface;
@FunctionalInterface
interface Sayable{
	public void say();
	
//	int hashCode();
//	String toString();
//	boolean equals();
}
public class FunctionalInterfaceEx implements Sayable {

	@Override
	public void say() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		FunctionalInterfaceEx functionalInterfaceEx = new FunctionalInterfaceEx();
		functionalInterfaceEx.say();
	}

}
