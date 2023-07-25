package com.app.lambda;
@FunctionalInterface
interface Sayable1{
	public String say(String name);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		Sayable1 sayable1 = (name) -> {return "Hello, "+name;};
		
		System.out.println(sayable1.say("soavan"));
		
		Sayable1 sayable2 = (name) -> {return "Hello, "+name;};
		System.out.println(sayable2.say("lipsa"));
	}
}
