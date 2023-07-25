package com.app.methodreference;

import java.util.function.BiFunction;

class Arithmetic11{
	public int add(int a,int b) {
		return a+b;
	}
}
public class MethodRefenceEx6 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = new Arithmetic11()::add;
		int result = biFunction.apply(23, 21);
		System.out.println(result);
	}
}
