package com.app.string;

public class ToCharArrayEX {

	public static void main(String[] args) {
		String str = "welcome to javatpoint";
		char[] ch = str.toCharArray();
		for(char c : ch) {
			System.out.print(c+" ");
		}
	}
}
