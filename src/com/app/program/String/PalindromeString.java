package com.app.program.String;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "kayak";
		String s = "" ;
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		System.out.println(s);
		if(str.equals(s)) {
			System.out.println("String is palindrome.");
		}
	}
}
