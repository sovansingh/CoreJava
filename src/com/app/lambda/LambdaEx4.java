package com.app.lambda;

@FunctionalInterface
interface Sayable2{
	String say(String msg);
}

public class LambdaEx4 {

	public static void main(String[] args) {
		Sayable2 sayable = (msg) -> {
			String str = "sovan";
			String str1 = "Hello, "+str;
			return str1;
		};
		String s = sayable.say("sovan");
		System.out.println(s);
	}
}
