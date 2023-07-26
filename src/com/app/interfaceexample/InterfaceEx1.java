package com.app.interfaceexample;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing rectangle.");
	}
	
}
class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing Cirlce.");
	}
	
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Drawable drawable = new Rectangle();
		drawable.draw();
		Drawable drawable2 = new Circle();
		drawable2.draw();
	}
}
