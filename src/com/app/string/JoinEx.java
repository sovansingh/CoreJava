package com.app.string;

public class JoinEx {

	public static void main(String[] args) {
		String str = String.join("-","welcome","to","javatpoint");
		System.out.println(str);
		
		String date = String.join("/", "25","06","1995");
		System.out.println(date);
		
		String date1 = String.join(":", "25","06","1995");
		System.out.println(date1);

		String str1 = String.join("-", null,"Welome","to","javatpoint");
		System.out.println(str1);
	}
}
