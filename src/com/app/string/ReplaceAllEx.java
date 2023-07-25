package com.app.string;

public class ReplaceAllEx {

	public static void main(String[] args) {
		String str = "javatpoint is a very good website";
		
		String str1 = str.replaceAll("t", "tt");
	
		System.out.println(str1);
		
		String str2 = "My name is Khan. My name is Bob. My name is Sonoo.";
		
		String str3 = str2.replaceAll("is", "was");
	
		System.out.println(str3);
		
		String str4 = "javatpoint";
		
		String str5 = str4.replaceAll("", " ");
	
		System.out.println(str5);
	}
}
