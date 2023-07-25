package com.app.methodreference;
interface Sayable1{
	public void say();
}
public class MethodReferenceEx {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	
	public static void main(String[] args) {
		Sayable1 sayable1 = MethodReferenceEx::saySomething;
	
		sayable1.say();
	}
}
