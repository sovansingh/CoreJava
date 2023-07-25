package com.app.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) {
		Stack<String> str = new Stack<>();
		str.push("apple");
		str.push("orange");
		str.push("green");
		str.push("banana");
		
//		System.out.println(str);
//		
//		System.out.println(str.peek());
//		
//		System.out.println(str.search("orange"));
//		System.out.println(str.isEmpty());
//		System.out.println(str.size());

		Iterator<String> itr = str.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		str.forEach(p -> {System.out.print(p+" ");});
		System.out.println();
		
		ListIterator<String> str1 = str.listIterator();
		while(str1.hasNext()) {
			System.out.print(str1.next()+" ");
		}
	}
}
