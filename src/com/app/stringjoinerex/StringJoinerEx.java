package com.app.stringjoinerex;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("sovan");
		stringJoiner.add("lipsa");
		
		System.out.println(stringJoiner);
	}
}
