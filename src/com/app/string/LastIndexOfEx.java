package com.app.string;

public class LastIndexOfEx {

	public static void main(String[] args) {
		String str = "this is index of example";
		
		int i = str.lastIndexOf("s");
	
		System.out.println(i);
		
		int i1 = str.lastIndexOf("s",5);
	
		System.out.println(i1);
		
		int i2 = str.lastIndexOf("of");

		System.out.println(i2);
	}
}
