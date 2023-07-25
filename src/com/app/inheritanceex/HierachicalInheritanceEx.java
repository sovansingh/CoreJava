package com.app.inheritanceex;
class Animal2{
	void eat() {
		System.out.println("eating...");
	}
}

class Dog2 extends Animal2{
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal2{
	void meow() {
		System.out.println("Meowing...");
	}
}
public class HierachicalInheritanceEx{

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
	}
}
