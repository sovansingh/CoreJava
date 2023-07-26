package com.app.interfaceexample;
interface Printable{
	void print();
}

class A implements Printable{

	@Override
	public void print() {
		System.out.println("Printing...");
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		A a =new A();
		a.print();
	}
}
