package com.app.functionalinterface;

import java.util.function.Function;

public class FuntionEx {

	public static String show(String name) {
		return "Hello "+name;
	}
	public static void main(String[] args) {
		Function<String, String> function = FuntionEx::show;
		System.out.println(function.apply("sovan"));
	}
}
