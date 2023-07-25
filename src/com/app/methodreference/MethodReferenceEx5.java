package com.app.methodreference;

public class MethodReferenceEx5 {

	public void printMsg() {
		System.out.println("Hello, this is instance method.");
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new MethodReferenceEx5()::printMsg);
		thread.start();
	}
}
