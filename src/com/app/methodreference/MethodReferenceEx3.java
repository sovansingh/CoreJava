package com.app.methodreference;

import java.util.function.BiFunction;

class Arithmetic1 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a,float b) {
		return a+b;
	}
	
	public static float add(float a,float b) {
		return a+b;
	}
}

public class MethodReferenceEx3 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction1 = Arithmetic1::add;
	
		int result1 = biFunction1.apply(2, 3);
		System.out.println(result1);
		
		BiFunction<Integer, Float, Float> biFunction2 = Arithmetic1::add;
		float result2 = biFunction2.apply(34, 89f);
		System.out.println(result2);
		
		BiFunction<Float, Float, Float> biFunction3 = Arithmetic1::add;
		float result3 = biFunction3.apply(21f, 98f);
		System.out.println(result3);
	}
}
