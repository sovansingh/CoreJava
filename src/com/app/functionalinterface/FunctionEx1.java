package com.app.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx1 {

	public static Integer addList(List<Integer> value) {
		int result = value.stream().mapToInt(Integer::intValue).sum();
		return result;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Function<List<Integer>, Integer> function = FunctionEx1::addList;
		int result = function.apply(list);
	
		System.out.println("The sum of result "+result);
	}
}
