package com.app.string;

public class TrimEx {

	public static void main(String[] args) {
		String str = " welcome to javatpoint ";
		
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println();
		
		String str1 = " Hello   java   Sting ";
		
		System.out.println(str1.length());
		System.out.println(str1);
		System.out.println();
		str1 = str1.trim();
		System.out.println(str1.length());
		System.out.println(str1);
		
		String str2 = " xyz ";
		String str3 = " abc ";
		
		String str4 = str2.trim();
		String str5 = str3.trim();
		
		System.out.println(str2.hashCode());
		System.out.println(str4.hashCode()+"\n");
		System.out.println(str3.hashCode());
		System.out.println(str5.hashCode()+"\n");
	}
}
