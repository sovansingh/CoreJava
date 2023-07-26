package com.app.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAPIEX2 {

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
		
		boolean b = list.stream().anyMatch(m -> m.startsWith("s"));
		System.out.println(b);
		
		boolean b1 = list.stream().allMatch(m -> m.startsWith("s"));
		System.out.println(b1);
		
		boolean b2 = list.stream().noneMatch(m -> m.startsWith("A"));
		System.out.println(b2);
		
		long l = list.stream().filter(p -> p.startsWith("s")).count();
		System.out.println(l);
		
		Optional<String> reduced = list.stream().reduce((s1,s2) -> s1+"#"+s2);
		reduced.ifPresent(System.out::println);
	
		String str1 =  list.stream().filter((s) -> s.startsWith("s")).findFirst().get();
		System.out.println(str1);
	}
}
