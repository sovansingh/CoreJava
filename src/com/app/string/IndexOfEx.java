package com.app.string;

public class IndexOfEx {

	public static void main(String[] args) {
		String str = "this is index of example";
	
		int i = str.indexOf("is");
		int i1 = str.indexOf("index");
	
		System.out.println(i+" "+i1);
	
		int i2 = str.indexOf("is",4);
		int i3 = str.indexOf("s");
		System.out.println(i2+" "+i3);
	}
}
