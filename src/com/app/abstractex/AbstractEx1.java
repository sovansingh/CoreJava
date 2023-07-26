package com.app.abstractex;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle.");
	}
	
}
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Circle.");
	}

}
public class AbstractEx1 {

	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.draw();
		Shape shape2 = new Circle();
		shape2.draw();
	}
}
