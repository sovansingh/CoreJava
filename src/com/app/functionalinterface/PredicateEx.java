package com.app.functionalinterface;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> pr = a -> (a>18);
		System.out.println(pr.test(21));
	}
}
