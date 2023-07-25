package com.app.string;

public class SplitEx {

	public static void main(String[] args) {
		String str = "java string split method by javatpoint";
		
		String[] str1 = str.split("\\s");
		
		for(String s : str1) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		String str2 = "javatpointt";
		
		String[] str3 = str2.split("t",0);
		
		for(String s : str3) {
			System.out.println(s);
		}
	}
}
