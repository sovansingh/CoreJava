package com.app.defaultmethod;
interface Sayable1{
	default void say() {
		System.out.println("Default method.");
	}
	void sayMore(String msg);
	
	static void sayLouder(String msg) {
		System.out.println("Lipsa mohanty i love you.");
	}
}
public class DafaultMethodEx1 {

	public static void main(String[] args) {
		DefaultMethodEx defaultMethodEx = new DefaultMethodEx();
		defaultMethodEx.say();
		defaultMethodEx.sayMore("sovan");
		Sayable1.sayLouder("Lipsa mohanty");
	}
}
