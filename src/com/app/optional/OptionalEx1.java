package com.app.optional;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "sovanlipsa";
		Optional<String> optional = Optional.ofNullable(str[5]);
		
		if(optional.isPresent()) {
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}else {
			System.out.println("String value os not present.");
		}
	}
}
