package com.app.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "sovan", 28));
		list.add(new Product(2, "lipsa", 27));
		list.add(new Product(3, "teja", 28));
		list.add(new Product(4, "akankshya", 26));
		list.add(new Product(5, "jeeban", 27));
		
		Collections.sort(list, (p1,p2) ->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Product product : list) {
			System.out.println(product.toString());
		}
	}
}
