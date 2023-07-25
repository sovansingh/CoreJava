package com.app.functionalinterface;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void pringMessage(String name) {
		System.out.println("Hello "+name);
	}
	public static void printValue(int val) {
		System.out.println(val);
	}
	public static void main(String[] args) {
		
		Consumer<String> consumer1 = ConsumerEx::pringMessage;
		consumer1.accept("sovan");
		
		Consumer<Integer> consumer2 = ConsumerEx::printValue;
		consumer2.accept(10);
	}
}
