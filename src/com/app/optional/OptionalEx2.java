package com.app.optional;

import java.util.Optional;

public class OptionalEx2 {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "Java Optional Example";
		Optional<String> optional = Optional.ofNullable(str[5]);
		optional.ifPresent(System.out::println);
		System.out.println(optional.get());
		System.out.println(str[5].toLowerCase());
	}
}
