package com.app.lambda;

public class RunnableEx {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 is running...");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		Runnable runnable2 = () -> {
			System.out.println("Thread2 is running...");
		};
		
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}
}
