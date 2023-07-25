package com.app.program.String;

public class lowerUpperViceversaEx {

	public static void main(String[] args) {
		String str = "Great Place";
		StringBuffer stringBuffer = new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				stringBuffer.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			if(Character.isUpperCase(str.charAt(i))) {
				stringBuffer.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(str);
		System.out.println(stringBuffer);
	}
}
