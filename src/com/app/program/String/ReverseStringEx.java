package com.app.program.String;

public class ReverseStringEx {

	public static void main(String[] args) {
		String str = "sovanlipsa";
		String str1 = "welcome to sovan weds lipsa wedding.";
		
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(i +" ");
			System.out.print(str.charAt(i));
			System.out.println();
		}
		
		String s = "" ;
		for(int i = str1.length()-1;i>=0;i--) {
			s+=str1.charAt(i);
		}
		System.out.println(s);
	}
}
