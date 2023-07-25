package com.app.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx2 {

	public static void addList(List<Integer> list) {
		int result = list.stream().mapToInt(Integer::intValue).sum();
	
		System.out.println("The sum of the result : "+result);
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(33);
		list.add(43);
		list.add(53);
		list.add(63);
		list.add(273);
		Consumer<List<Integer>> consumer = ConsumerEx2::addList;
		consumer.accept(list);
	}
}
