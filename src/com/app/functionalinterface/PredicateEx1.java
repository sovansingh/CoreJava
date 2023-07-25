package com.app.functionalinterface;

import java.util.function.Predicate;

public class PredicateEx1 {

	public static Boolean checkAge(int age) {
		if (age > 17) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = PredicateEx1::checkAge;
		Boolean result = predicate.test(21);
		System.out.println(result);

	}
}
