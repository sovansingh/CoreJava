package com.app.string;

public class IsEmptyEx {

	public static void main(String[] args) {
		String str = "";
		String str1 = "welcome to javatpoint";
		
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		
		if(str.length() == 0 && str.isEmpty()) {
			System.out.println("String 1 is empty");
		}else {
			System.out.println(str);
		}
		
		if(str1.length() == 0 && str1.isEmpty()) {
			System.out.println("String 2 is empty");
		}else {
			System.out.println(str1);
		}
	}
}
