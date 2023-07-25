package com.app.inheritanceex;

class Animal1{
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Barking...");
	}
}
class BabyDog extends Dog1{
	void weep() {
		System.out.println("weeping...");
	}
}
public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();
	}
}
