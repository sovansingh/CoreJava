package com.app.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("sovan");
		list.add("lipsa");
		list.add("teja");
		list.add("akankshya");
		
		list.forEach((l) -> System.out.println(l));
	}
}
