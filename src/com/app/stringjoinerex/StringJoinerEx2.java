package com.app.stringjoinerex;

import java.util.StringJoiner;

public class StringJoinerEx2 {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",","[","]");
		stringJoiner.add("sovan singh");
		stringJoiner.add("lipsa mohanty");
		
		StringJoiner stringJoiner2 = new StringJoiner(":","[","]");
		stringJoiner2.add("Rahul Singh");
		stringJoiner2.add("Sonam Singh");
		
		StringJoiner str = stringJoiner.merge(stringJoiner2);
	
		System.out.println(str);
	}
}
