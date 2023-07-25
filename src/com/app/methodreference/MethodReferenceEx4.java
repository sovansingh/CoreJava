package com.app.methodreference;
interface Sayable{
	void say();
}
public class MethodReferenceEx4 {

	public void saySomething() {
		System.out.println("Hello, This is non-static method.");
	}
	public static void main(String[] args) {
		MethodReferenceEx4 methodReferenceEx4  = new MethodReferenceEx4();
		Sayable sayable = methodReferenceEx4::saySomething;
	
		sayable.say();
		
		Sayable sayable2 = new MethodReferenceEx4()::saySomething;
		sayable2.say();
	}
}
