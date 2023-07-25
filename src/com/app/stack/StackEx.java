package com.app.stack;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400);
		stack.add(500);
		stack.add(600);
		stack.add(700);
		stack.add(800);

		for (Integer i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();

		boolean b = stack.isEmpty();
	
		System.out.println(b);
		
		
	}
}
