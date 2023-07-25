package com.app.stringjoinerex;

import java.util.StringJoiner;

public class StringJoinerEx3 {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",");
		
		System.out.println(stringJoiner);
		
		stringJoiner.setEmptyValue("It is empty.");
		System.out.println(stringJoiner);
		
		stringJoiner.add("Rahul");
		stringJoiner.add("Raju");
		System.out.println(stringJoiner);
		
		int i = stringJoiner.length();
		System.out.println(i);
		
		String str = stringJoiner.toString();
		System.out.println(str);
		
		char c = str.charAt(3);
		System.out.println("Character at index 3 : "+c);
		
		stringJoiner.add("i want to die");
		System.out.println(stringJoiner);
		
		int i2 = stringJoiner.length();
		System.out.println(i2);
	}
}
