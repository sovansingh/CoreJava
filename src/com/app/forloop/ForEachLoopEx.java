package com.app.forloop;

public class ForEachLoopEx {

	public static void main(String[] args) {
		String[] names = {"Java","C","C++","Python","Javascript"};
		
		System.out.println("Printing the content of array name:\n");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
