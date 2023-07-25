package com.app.string;

public class InternEx {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str1 = "hello";
		String str2 = str1.intern();
		
		System.out.println(str == str1);
		System.out.println(str1 == str2);
	}
}
