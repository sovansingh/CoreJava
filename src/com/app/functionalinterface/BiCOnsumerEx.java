package com.app.functionalinterface;

import java.util.function.BiConsumer;

public class BiCOnsumerEx {

	public static void showDetails(String name,int age) {
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		BiConsumer<String, Integer> biCon = BiCOnsumerEx::showDetails;
		biCon.accept("sovan", 28);
		biCon.accept("Lipsa", 27);
		BiConsumer<String, Integer> biCon1 = (name,age) -> System.out.println(name+" "+age);
		biCon1.accept("teja", 28);
	}
}
