package com.app.abstractex;
abstract class Bike1{
	Bike1(){
		System.out.println("Bike Created.");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear changed.");
	}
}

class Honde extends Bike1{

	@Override
	void run() {
		System.out.println("running safely.");
	}
	
}
public class AbstractEX3 {

	public static void main(String[] args) {
		Bike1 bike = new Honde();
		bike.run();
		bike.changeGear();
	}
}
