package com.app.interfaceex;
interface Printable{
	void print();
}

interface showable{
	void show();
}

class A7 implements Printable,showable{

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void print() {
		System.out.println("print");
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		A7 a7 = new A7();
		a7.print();
		a7.show();
	}
}
