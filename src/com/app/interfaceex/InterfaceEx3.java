package com.app.interfaceex;

interface Drawable{
	void draw();
	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}
public class InterfaceEx3 extends Rectangle{

	public static void main(String[] args) {
		InterfaceEx3 interfaceEx3 = new InterfaceEx3();
		interfaceEx3.draw();
		interfaceEx3.msg();
	}
}
