package com.app.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICollectorsEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> list1 = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
	
		for(Integer i1 : list1) {
			System.out.print(i1);
		}
		
		System.out.println();
		
		Stream<Integer> stream1 = list.stream();
		
		Integer[] intArray =  stream1.filter(i -> i%2 == 0).toArray(Integer[]::new);
		for(Integer i: intArray) {
			System.out.print(i);
		}
	}
}
