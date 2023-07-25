package com.app.interfaceex;

interface Printable1{
	void print();
}

interface Showable1{
	void print();
}


public class InterfaceEx1 implements Printable1,Showable1{

	public static void main(String[] args) {
		InterfaceEx1 interfaceEx1 = new InterfaceEx1();
		interfaceEx1.print();
	}

	@Override
	public void print() {
		System.out.println("print");
	}
}
