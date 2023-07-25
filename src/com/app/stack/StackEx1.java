package com.app.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack);
		pushelmnt(stack, 230);
		pushelmnt(stack, 240);
		pushelmnt(stack, 250);
		pushelmnt(stack, 260);
		pushelmnt(stack, 270);
		pushelmnt(stack, 280);
		
		popelmnt(stack);
		popelmnt(stack);
		popelmnt(stack);
		
		try {
			popelmnt(stack);
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		
	}
	
	static void pushelmnt(Stack<Integer> stk,int x) {
		stk.push(new Integer(x));
		System.out.println("push -> "+x);
		System.out.println("stack: "+stk);
	}
	static void popelmnt(Stack<Integer> stk) {
		Integer i =(Integer) stk.pop();
	
		System.out.println("pop -> "+i);
		System.out.println("stack: "+stk);
	}
}
