package com.app.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	float price;
	public Student(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class CollectorsEx {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "sovan singh", 1000f));
		students.add(new Student(2, "suman singh", 2000f));
		students.add(new Student(3, "subrat singh", 3000f));
		students.add(new Student(4, "suvam singh", 4000f));
		students.add(new Student(5, "sanjukta singh", 5000f));
		students.add(new Student(6, "subnam singh", 6000f));
		
		List<Float> prices = students.stream().map(p -> p.price).collect(Collectors.toList());
		for(float f : prices) {
			System.out.print(f+" ");
		}
		System.out.println();
		
		Set<Float> students2 = students.stream().map(p -> p.price).collect(Collectors.toSet());
	
		for(float f : students2) {
			System.out.print(f+" ");
		}
		System.out.println();
		
		double d =  students.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println(d);
		
		int i = students.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println(i);

		double d1 = students.stream().collect(Collectors.averagingDouble(x -> x.price));
		System.out.println(d1);

		long count = students.stream().collect(Collectors.counting());
		System.out.println(count);
	}
}
