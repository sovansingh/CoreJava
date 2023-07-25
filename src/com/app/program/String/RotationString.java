package com.app.program.String;

public class RotationString {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "deabc";
		
		s1=s1.concat(s1);
		
		if(s1.indexOf(s2) != -1) {
			System.out.println("Rotation String.");
		}
		
		if(s1.contains(s2)) {
			System.out.println("Rotation String1.");
		}
	}
}
