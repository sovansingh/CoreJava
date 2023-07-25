package com.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class LambdaFilterEx {

	public static void main(String[] args) {
		List<Product1> list = new ArrayList<>();
		list.add(new Product1(1, "sovan singh", 1000f));
		list.add(new Product1(1, "suman singh", 2000f));
		list.add(new Product1(1, "sanjukta singh", 3000f));
		list.add(new Product1(1, "sujata singh", 4000f));
		list.add(new Product1(1, "sasmita singh", 5000f));
		list.add(new Product1(1, "santosh singh", 6000f));
		list.add(new Product1(1, "subrat singh", 7000f));
		
		Stream<Product1> stream = list.stream().filter(f -> f.price > 1000f);
		
		stream.forEach(f -> System.out.println(f.id+" "+f.name));
		
	}
}
