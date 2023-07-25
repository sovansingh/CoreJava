package com.app.program.String;

public class StringReplaceEx {

	public static void main(String[] args) {
		String str = "once in a blue moon";

		str = str.replace(" ", "-");
		System.out.println(str);
//		String reverseString = "";
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i)+"");
		}
		
		String str1 = "sovan";
		String str2 = "lipsa";
		
		System.out.println();
		str1 = str1.concat(str2);
		System.out.println(str1);
		str2 = str1.substring(0, str2.length());
		System.out.println(str2);
		str1 = str1.substring(str1.length()-str2.length(), str1.length());
		System.out.println(str1);
	}
}
