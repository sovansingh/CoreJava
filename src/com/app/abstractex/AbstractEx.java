package com.app.abstractex;

abstract class Bike {
	abstract void run();
}

public class AbstractEx extends Bike {

	public static void main(String[] args) {
		Bike bike = new AbstractEx();
		bike.run();
	}

	@Override
	void run() {
		System.out.println("Running...");
	}
}
