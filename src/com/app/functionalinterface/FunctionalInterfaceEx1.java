package com.app.functionalinterface;

interface Doable{
	default void doIt() {
		System.out.println("do it");
	}
}

@FunctionalInterface
interface Sayable1{
	void say(String msg);
}
public class FunctionalInterfaceEx1 implements Sayable1{

	
	public static void main(String[] args) {
		FunctionalInterfaceEx1 functionalInterfaceEx1 = new FunctionalInterfaceEx1();
		functionalInterfaceEx1.say("hello there");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}
}
