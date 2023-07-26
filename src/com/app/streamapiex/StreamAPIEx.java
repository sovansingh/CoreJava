package com.app.streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream2.forEach(System.out::print);
	
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		System.out.println();
		
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(System.out::print);
	
		System.out.println();
		
		Stream<Integer> stream4 = Stream.generate(() -> (new Random().nextInt()));
		stream4.limit(2).forEach(System.out::println);
	}
}
