package com.app.string;

public class ReplaceEx {

	public static void main(String[] args) {
		String str = "javatpoint is a very good website";
		
		String str1 = str.replace("t", "b");
		
		System.out.println(str1);
		
		String str2 = "my name is khan my name is java";
		String str3 = str2.replace("is", "was");
		System.out.println(str3);
	}
}
