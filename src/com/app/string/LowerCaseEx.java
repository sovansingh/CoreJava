package com.app.string;

import java.util.Locale;

public class LowerCaseEx {

	public static void main(String[] args) {
		String str1 = "JAVATPOINT HELLO stRIng";
		str1 = str1.toLowerCase();
		System.out.println(str1);
		
		str1 = str1.toLowerCase(Locale.JAPAN);
		System.out.println(str1);
		str1 = str1.toLowerCase(Locale.CHINESE);
		System.out.println(str1);
	}
}
