package com.app.program.String;

public class MaxMinStringEx {

	public static void main(String[] args) {
		String str = "sovan lipsa never be together forever";
		String[] s = str.split(" ");
		for(String s1 : s) {
			System.out.println(s1);	
		}
		String min = s[0];
		String max = s[0];
		for(int i=0;i<s.length;i++) {
			System.out.println(i + " "+s[i]);
			if(min.length() > s[i].length()) {
				min = s[i];
			}else if (max.length() < s[i].length()) {
				max = s[i];
			}
			
		}
		System.out.println("min : "+min+" and Max : "+max);
		
	}
}
