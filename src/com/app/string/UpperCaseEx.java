package com.app.string;

import java.util.Locale;

public class UpperCaseEx {

	public static void main(String[] args) {
		String str = "hello String";
		
		str = str.toUpperCase();
		System.out.println(str);
		
		String str1 = str.toUpperCase(Locale.forLanguageTag("tr"));
		String str2 = str.toUpperCase(Locale.forLanguageTag("en"));
		System.out.println(str1);
		System.out.println(str2);
	}
}
