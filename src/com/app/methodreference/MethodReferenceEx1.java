package com.app.methodreference;

public class MethodReferenceEx1 {

	public static void ThreadStatus() {
		System.out.println("Thread is runnig...");
	}

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceEx1::ThreadStatus);
		thread.start();
	}
}
