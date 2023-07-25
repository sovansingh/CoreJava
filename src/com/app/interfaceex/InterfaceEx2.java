package com.app.interfaceex;

interface Printable2{
	void print();
}

interface Showable2 extends Printable2{
	void show();
}

class A8 implements Showable2{

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void show() {
		System.out.println("show");
	}
	
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		A8 a8 = new A8();
		a8.print();
		a8.show();
	}
}
