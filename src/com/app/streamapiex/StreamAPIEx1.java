package com.app.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("sovan");
		list.add("BIcky");
		list.add("Sonu");
		list.add("Bunty");
		list.add("Jindal");
		list.add("Priya");
		list.add("Lipsa");
		list.add("Teja");
		list.add("Sabhnam");
		
		List<String> list2 = list.stream().filter(s -> s.toLowerCase().startsWith("s")).collect(Collectors.toList());
		for(String str : list2) {
			System.out.println(str);
		}
		
		System.out.println();
		
		list.stream().filter(s -> s.startsWith("B")).map(p -> p.toUpperCase()).forEach(System.out::println);
	
		System.out.println();
		
		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(System.out::println);

		List<String> list3 = list.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		list3.forEach(System.out::println);
	}
}
