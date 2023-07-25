package com.app.stringjoinerex;

import java.util.StringJoiner;

public class StringJoinerEx1 {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",","[","]");
		stringJoiner.add("sovan singh");
		stringJoiner.add("lipsa mohnaty");
		stringJoiner.add("Rahul singh");
		stringJoiner.add("Sonam singh");
		
		System.out.println(stringJoiner);
	}
}
