package com.app.functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx1 {

	public static void showDetails(Map<Integer, String> map,String mapName) {
		System.out.println("--------"+mapName+"-----------");
		map.forEach((key,value) -> System.out.println(key+" "+value));
	}
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sovan");
		map.put(2, "bicky");
		map.put(3, "lipsa");
		map.put(4, "Akankshya");
		
		BiConsumer<Map<Integer, String>, String> biConsumer = BiConsumerEx1::showDetails;
		biConsumer.accept(map, "Student");
	}
}
