package com.app.string;

public class InternEx1 {

	public static void main(String[] args) {
		String str = "JavaTPoint";
		String str1 = str.intern();
		String str2 = new String("JavaTPoint");
		String str3 = str2.intern();
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
	}
}
