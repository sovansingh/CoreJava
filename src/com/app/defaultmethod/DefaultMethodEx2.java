package com.app.defaultmethod;
abstract class AbstractClass{
	public AbstractClass() {
		System.out.println("You can create constructor in abstract class");
	}
	
	abstract int add(int a,int b);
	
	int sub(int a,int b) {
		return a-b;
	}
	
	static int multiply(int a,int b) {
		return a*b;
	}
}
public class DefaultMethodEx2 extends AbstractClass{

	public static void main(String[] args) {
		DefaultMethodEx2 defaultMethodEx2 = new DefaultMethodEx2();
		int result = defaultMethodEx2.add(12, 21);
		System.out.println(result);
		int result1 = defaultMethodEx2.sub(22, 32);
		System.out.println(result1);
		int result2 = AbstractClass.multiply(901341, 99);
		System.out.println(result2);
	}

	@Override
	int add(int a, int b) {
		return a+b;
	}
}
