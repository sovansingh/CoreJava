package com.app.lambda;
@FunctionalInterface
interface Sayable{
	public String say();
}
public class LambdaEx1 {

	public static void main(String[] args) {
		Sayable sayable = () -> { return "I have nothing to say";};
		System.out.println(sayable.say());
	}
}
