package com.app.defaultmethod;
interface Sayable{
	default void say() {
		System.out.println("Default Method Call.");
	}
	void sayMore(String msg);
}
public class DefaultMethodEx implements Sayable{

	public static void main(String[] args) {
		DefaultMethodEx defaultMethodEx = new DefaultMethodEx();
		defaultMethodEx.say();
		defaultMethodEx.sayMore("sovanlipsa");
	}

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}
}
