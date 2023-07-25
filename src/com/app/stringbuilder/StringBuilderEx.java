package com.app.stringbuilder;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append("lipsa");
		System.out.println(stringBuilder);
		stringBuilder.insert(1, "java");
		System.out.println(stringBuilder);
		stringBuilder.replace(5, 8, "java");
		System.out.println(stringBuilder);
		stringBuilder.delete(1, 5);
		System.out.println(stringBuilder);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.capacity());
		stringBuilder.ensureCapacity(50);
		System.out.println(stringBuilder.capacity());
	}
}
