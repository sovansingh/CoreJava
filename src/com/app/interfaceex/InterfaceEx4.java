package com.app.interfaceex;

interface Drawable1{
	void draw();
	static int cube(int x) {
		return x*x*x;
	}
}
public class InterfaceEx4 implements Drawable1{

	public static void main(String[] args) {
		Drawable1 drawable1 = new InterfaceEx4();
		drawable1.draw();
		System.out.println(Drawable1.cube(3));
		
	}

	@Override
	public void draw() {
		System.out.println("draw");
	}
}
