package com.app.methodreference;

import java.util.function.BiFunction;

class Arithmetic{
	public static int add(int a,int b) {
		return a+b;
	}
}
public class MethodReferenceEx2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = Arithmetic::add;
		int c = biFunction.apply(3, 6);
		System.out.println(c);
	}
}
